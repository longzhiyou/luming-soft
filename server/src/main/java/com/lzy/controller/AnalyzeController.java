package com.lzy.controller;

import com.lzy.demo.BaZi;
import com.lzy.demo.CommonAlgorithm;
import com.lzy.entity.MatchRule;
import com.lzy.repository.MatchRuleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.*;
import java.util.List;

/**
 * User: longzhiyou
 * Date: 2017/6/9
 * Time: 10:03
 */

@RestController
@RequestMapping(value ="/analyze")
public class AnalyzeController {

    private static final Logger logger = LoggerFactory.getLogger(AnalyzeController.class);

//    @Autowired
//    ScriptEngineManager scriptEngineManager;

    @Autowired
    ScriptEngine scriptEngine;

    @Autowired
    MatchRuleRepository matchRuleRepository;

    @RequestMapping(method= RequestMethod.GET)
    public String index(@RequestParam String niangan,@RequestParam String nianzhi
                        ,@RequestParam String yuegan,@RequestParam String yuezhi
                        ,@RequestParam String rigan,@RequestParam String rizhi
                        ,@RequestParam String shigan,@RequestParam String shizhi
    ) {


//        BaZi baZi = new BaZi(niangan,nianzhi,
//                yuegan,yuezhi,
//                rigan,rizhi,
//                shigan,shizhi);

        BaZi baZi = new BaZi("甲子","乙卯","甲子","辛卯");
        CommonAlgorithm commonAlgorithm = new CommonAlgorithm();

//        ScriptEngineManager factory = new ScriptEngineManager();
//        ScriptEngine engine = scriptEngineManager.getEngineByName("groovy");

        List<MatchRule> all = matchRuleRepository.findAll();
        for (MatchRule matchRule :all){
            parseRule(baZi,commonAlgorithm,scriptEngine,matchRule.getRule());
        }

        return "analyze:index";

    }

    public Object parseRule(BaZi baZi, CommonAlgorithm commonAlgorithm ,ScriptEngine engine,String rule) {


        Bindings binding = engine.createBindings();
        binding.put("baZi", baZi);
        binding.put("commonAlgorithm",commonAlgorithm);
        Object result = null;
        try {
            engine.eval(rule);
            Invocable inv = (Invocable) engine;

            try {
                result = inv.invokeFunction("matchRule",baZi,commonAlgorithm);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                logger.error("matchRule:NoSuchMethodException");
            }
        } catch (ScriptException e) {
            e.printStackTrace();
            logger.error("ScriptException:"+e.getMessage());
        }


        return result;


    }
}
