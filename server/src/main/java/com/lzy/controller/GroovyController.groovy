package com.lzy.controller

import com.google.common.collect.ImmutableMap
import com.lzy.demo.BaZi
import com.lzy.demo.CommonAlgorithm
import com.lzy.domain.AnalyzeResult
import com.lzy.repository.MatchRuleRepository
import com.lzy.rule.BaseRule
import com.lzy.rule.LiangXiangRunRule
import com.lzy.rule.WuXingJingJiRule
import com.lzy.rule.ZiPingZhenQuanRule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 *
 * User: longzhiyou 
 * Date: 2017/6/22 
 * Time: 11:05 
 */
@RestController
@RequestMapping(value ="/analyze")
class GroovyController {
    @Autowired
    MatchRuleRepository matchRuleRepository;

    final static def listRule = [new WuXingJingJiRule()]
    final static def mapRule = [
            "五行精纪":new WuXingJingJiRule(),
            "梁湘润":new LiangXiangRunRule()
    ]

    @RequestMapping(method= RequestMethod.GET)
    def index(@RequestParam String niangan,@RequestParam String nianzhi
              ,@RequestParam String yuegan,@RequestParam String yuezhi
              ,@RequestParam String rigan,@RequestParam String rizhi
              ,@RequestParam String shigan,@RequestParam String shizhi) {
//        matchRuleRepository.count()
//        BaZi baZi = new BaZi("甲申","乙亥","丙辰","庚寅");
        BaZi baZi = new BaZi(niangan,nianzhi,
                yuegan,yuezhi,
                rigan,rizhi,
                shigan,shizhi);

//        CommonAlgorithm commonAlgorithm = new CommonAlgorithm();

        def listResult=[]
        mapRule.each{key,value ->
            def result = value.matchRule(baZi, baZi.getCommonAlgorithm())

            AnalyzeResult analyzeResult = new AnalyzeResult()
            analyzeResult.setSubject(key)
            analyzeResult.setAnalyzeResult(result)
            listResult.add(analyzeResult)

        }

        return listResult;
//        mapRule.keySet()
//        ["long","zhi",1,2]
    }
}
