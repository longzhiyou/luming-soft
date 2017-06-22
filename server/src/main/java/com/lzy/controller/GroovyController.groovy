package com.lzy.controller

import com.google.common.collect.ImmutableMap
import com.lzy.demo.BaZi
import com.lzy.demo.CommonAlgorithm
import com.lzy.domain.AnalyzeResult
import com.lzy.repository.MatchRuleRepository
import com.lzy.rule.BaseRule
import com.lzy.rule.WuXingJingJiRule
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
@RequestMapping(value ="/groovy")
class GroovyController {
    @Autowired
    MatchRuleRepository matchRuleRepository;

    final static def listRule = [new WuXingJingJiRule()]
    final static def mapRule = ["五行精纪":new WuXingJingJiRule()]

    @RequestMapping(method= RequestMethod.GET)
    def index() {
//        matchRuleRepository.count()
        BaZi baZi = new BaZi("甲申","乙亥","丙辰","庚寅");
        CommonAlgorithm commonAlgorithm = new CommonAlgorithm();
        for( rule in listRule){
//            rule.matchRule(baZi,commonAlgorithm)
        }

        def analyzeResult=[:]
        mapRule.each{key,value ->
            def result = value.matchRule(baZi, commonAlgorithm)
            analyzeResult.put(key,result)

        }

        return analyzeResult;
//        mapRule.keySet()
//        ["long","zhi",1,2]
    }
}
