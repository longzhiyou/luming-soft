package com.lzy.controller

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.domain.AnalyzeResult
import com.lzy.repository.MatchRuleRepository
import com.lzy.rule.ChildrenRule
import com.lzy.rule.CoreRule
import com.lzy.rule.LanTaiMiaoXuanRule
import com.lzy.rule.LiangXiangRunRule
import com.lzy.rule.ReferenceRule
import com.lzy.rule.RiShiRule
import com.lzy.rule.RiYueRule
import com.lzy.rule.ShenShaRule
import com.lzy.rule.ShiZhanRule
import com.lzy.rule.WomanRule
import com.lzy.rule.WuXingJingJiRule
import com.lzy.rule.XuLeWuRule
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
    MatchRuleRepository matchRuleRepository

    final static def listRule = [new WuXingJingJiRule()]
    final static def mapRule = [


            "日时":new RiShiRule(),
            "兰台妙选":new LanTaiMiaoXuanRule(),
            "五行精纪":new WuXingJingJiRule(),
            "实务":new ShiZhanRule(),
            "日月":new RiYueRule(),
            "日柱":new ReferenceRule(),
//            "核心":new CoreRule(),
            "神煞":new ShenShaRule(),

            "女命":new WomanRule(),
            "子女":new ChildrenRule(),

            "梁湘润":new LiangXiangRunRule(),
            "徐乐吾":new XuLeWuRule()

    ]

    @RequestMapping(method= RequestMethod.GET)
    def index(@RequestParam String gender
              ,@RequestParam String niangan,@RequestParam String nianzhi
              ,@RequestParam String yuegan,@RequestParam String yuezhi
              ,@RequestParam String rigan,@RequestParam String rizhi
              ,@RequestParam String shigan,@RequestParam String shizhi

              ,@RequestParam String yungan,@RequestParam String yunzhi
              ,@RequestParam String liuniangan,@RequestParam String liunianzhi
              ,@RequestParam String taigan,@RequestParam String taizhi
              ,@RequestParam String xingniangan,@RequestParam String xingnianzhi) {
//        matchRuleRepository.count()
//        BaZi baZi = new BaZi("甲申","乙亥","丙辰","庚寅");


        def listResult=[]
        //check
        AnalyzeResult error = new AnalyzeResult()

        CommonAlgorithm commonAlgorithm = new CommonAlgorithm()
        if (null==commonAlgorithm.getJiaZiWuXing(niangan+nianzhi)) {
            error.setSubject("格式错误")
            error.setAnalyzeResult("年柱")
            listResult.add(error)
        }
        if (null==commonAlgorithm.getJiaZiWuXing(yuegan+yuezhi)) {
            error.setSubject("格式错误")
            error.setAnalyzeResult("月柱")
            listResult.add(error)
        }
        if (null==commonAlgorithm.getJiaZiWuXing(rigan+rizhi)) {
            error.setSubject("格式错误")
            error.setAnalyzeResult("日柱")
            listResult.add(error)
        }
        if (null==commonAlgorithm.getJiaZiWuXing(shigan+shizhi)) {
            error.setSubject("格式错误")
            error.setAnalyzeResult("时柱")
            listResult.add(error)
        }

        if (listResult.size()>0) {
            return listResult
        }

        BaZi baZi = new BaZi(niangan,nianzhi,
                yuegan,yuezhi,
                rigan,rizhi,
                shigan,shizhi)
        baZi.setGender(gender)
        baZi.setYun(yungan,yunzhi)
        baZi.setLiuNian(liuniangan,liunianzhi)
        baZi.setTaiZhu(taigan+taizhi)
        baZi.setXingnianan(xingniangan)
        baZi.setXingnianZhi(xingnianzhi)



        mapRule.each{key,value ->
            def result = value.matchRule(baZi, baZi.getCommonAlgorithm())

            AnalyzeResult analyzeResult = new AnalyzeResult()
            analyzeResult.setSubject(key)
            analyzeResult.setAnalyzeResult(result)
            listResult.add(analyzeResult)

        }

        return listResult
//        mapRule.keySet()
//        ["long","zhi",1,2]
    }
}
