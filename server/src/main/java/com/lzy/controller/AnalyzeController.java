package com.lzy.controller;

import com.lzy.demo.BaZi;
import com.lzy.entity.MatchRule;
import com.lzy.repository.MatchRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.List;

/**
 * User: longzhiyou
 * Date: 2017/6/9
 * Time: 10:03
 */

@RestController
@RequestMapping(value ="/analyze")
public class AnalyzeController {


    @Autowired
    MatchRuleRepository matchRuleRepository;

    @RequestMapping(method= RequestMethod.GET)
    public String index(@RequestParam String niangan,@RequestParam String nianzhi
                        ,@RequestParam String yuegan,@RequestParam String yuezhi
                        ,@RequestParam String rigan,@RequestParam String rizhi
                        ,@RequestParam String shigan,@RequestParam String shizhi
    ) {

        List<MatchRule> all = matchRuleRepository.findAll();
        BaZi baZi = new BaZi("甲","子","丙","子","丙","戌","辛","卯");

        return "analyze:index";

    }

    public void doScript(String rule) throws ScriptException {
        ScriptEngineManager factory = new ScriptEngineManager();//step 1
        ScriptEngine engine = factory.getEngineByName("JavaScript");//Step 2
        engine.eval("print('Hello, Scripting')");//Step 3

    }
}
