package com.lzy.rule;

import com.lzy.demo.BaZi;
import com.lzy.demo.CommonAlgorithm;
import com.lzy.domain.AnalyzeResult;

/**
 *  五行精纪规则
 * Created by bukeyan on 2017/6/18.
 */
public class WuXingJingJiRule extends AnalyzeResult implements BaseRule{

    @Override
    public Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {
        def mapResult = [:]
        def mapRule = [:]
        def matchStr = ""
        def ruleValue ;

        def  nianGan = bazi.getNianGan()
        def nianZhi = bazi.getNianZhi()
        def nianZhu = bazi.getNianZhu()

        def yueGan = bazi.getYueGan()
        def yueZhi =bazi.getYueZhi()
        def yueZhu = bazi.getYueZhu()

        def riGan = bazi.getRiGan()
        def riZhi = bazi.getRiZhi()
        def riZhu = bazi.getRiZhu()

        def shiGan = bazi.getShiGan()
        def shiZhi = bazi.getShiZhi()
        def shiZhu = bazi.getShiZhu()

        def listMingGan = bazi.getListMingGan()
        def listMingZhi = bazi.getListMingZhi()
        def listMingZhu = bazi.getListMingZhu()

        def luZhi = commonAlgorithm.getLuZhi(nianGan);


        //荣神格
        matchStr = yueZhi+riGan+shiGan
        def rongshenge = [
                "寅甲乙","寅乙甲","卯甲乙","卯乙甲",
                "巳丙丁","巳丁丙","午丙丁","午丁丙",
                "申庚辛","申辛庚","酉庚辛","酉辛庚",
                "亥壬癸","亥癸壬","子壬癸","子癸壬",
                "辰戊己","辰己戊","戌戊己","戌己戊",
                "丑戊己","丑己戊","未戊己","未己戊"
        ]

        if (rongshenge.contains(matchStr)) {
            mapResult["荣神格"]="春甲乙日时、夏丙丁日时、秋庚辛日时、冬壬癸日时、四季戊己日时 主人心明，日时全见者足寿，富贵多权。（神白经）"
        }


        //【名位禄】
        def mingweilu = ["甲丙寅","乙丁卯","庚壬申","辛癸酉"]
        matchStr = nianGan+shiZhu
        if (mingweilu.contains(matchStr)) {
            mapResult["时柱【名位禄】"]="凡禄上带食神者是，如甲人见丙寅，谓之名位禄，皆为贵格，余仿此。（林开五命）"
        }
        matchStr = nianGan+riZhu
        if (mingweilu.contains(matchStr)) {
            mapResult["日柱【名位禄】"]="凡禄上带食神者是，如甲人见丙寅，谓之名位禄，皆为贵格，余仿此。（林开五命）"
        }

        //【生成禄】
        def shengchenglu = ["甲甲寅","乙乙卯","丙丁巳","丁戊午","戊丁巳","己戊午",
                            "庚庚申","辛辛酉","壬癸亥","癸壬子"]
        matchStr = nianGan+shiZhu
        if (shengchenglu.contains(matchStr)) {
            mapResult["时柱【生成禄】"]=matchStr
        }
        matchStr = nianGan+riZhu
        if (shengchenglu.contains(matchStr)) {
            mapResult["日柱【生成禄】"]=matchStr
        }

        //【真禄】五虎遁得到禄位天干,又得到此天干的禄位
        def zhenlu=["甲":"丙巳","乙":"己午","丙":"癸子","丁":"丙巳"
                    ,"戊":"丁午","己":"庚申",
                    "庚":"甲寅","辛":"丁午","壬":"辛酉","癸":"甲寅"]
        def zhenluValue = zhenlu.get(nianGan);
        if (listMingGan.contains(zhenluValue[0])&&listMingZhi.contains(zhenluValue[1])) {
            mapResult["【真禄】"]="更带福神，可作贵显科甲之格"+nianGan+zhenluValue
        }

        //【禄头财】
        mapRule=["甲":"戊寅","乙":"己卯","丙":"辛巳","丁":"庚午"
                    ,"戊":"癸巳","己":"壬午",
                    "庚":"甲申","辛":"乙酉","壬":"丁亥","癸":"丙子"]
        ruleValue= mapRule.get(nianGan);
        if (shiZhu==ruleValue) {
            mapResult["时柱【禄头财】"]="主人富有声望。古诗云：禄生于絪缛，因财反有名，君子荣显禄，常人主丰盈。"
        }
        if (riZhu==ruleValue) {
            mapResult["日柱【禄头财】"]="主人富有声望。古诗云：禄生于絪缛，因财反有名，君子荣显禄，常人主丰盈。"
        }


        //【禄头鬼】
        mapRule=["甲":"庚寅","乙":"辛卯","丙":"癸巳","丁":"壬午"
                 ,"戊":"乙巳","己":"甲午",
                 "庚":"丙申","辛":"丁酉","壬":"己亥","癸":"戊子"]
        ruleValue= mapRule.get(nianGan)
        if (shiZhu==ruleValue) {
            mapResult["时柱【禄头鬼】"]="又名赤舌杀，君子主甲科，常人口舌刑责，若别有贵救，主家世超越，三代富有，行年太岁遇之，主有灾。（广信录）"
        }
        if (riZhu==ruleValue) {
            mapResult["日柱【禄头鬼】"]="又名赤舌杀，君子主甲科，常人口舌刑责，若别有贵救，主家世超越，三代富有，行年太岁遇之，主有灾。（广信录）"
        }

        //【禄盈天府格】
        mapRule=["甲":"丙寅巳","乙":"己卯午","丙":"癸巳子","丁":"丙午巳"
                    ,"戊":"丁巳午","己":"庚午申",
                    "庚":"甲申寅","辛":"丁酉午","壬":"辛亥酉","癸":"甲子寅"]
        ruleValue= mapRule.get(nianGan)
        if (listMingZhu.contains(ruleValue[0,1])&&listMingZhi.contains(ruleValue[2])) {

            mapResult["【禄盈天府格】"]="福禄兼足,稍有福助之，五品之贵，一云重重福禄主富盛"
        }

        //【旬中禄格】
        if (listMingZhi.contains(luZhi)) {

            for(i in 0..3){
                if (luZhi==listMingZhi[i]&& commonAlgorithm.isYiXun(nianZhu,listMingZhu[i])) {
                    mapResult["【旬中禄格】"]="福禄兼足,稍有福助之，五品之贵，一云重重福禄主富盛"
                }
            }
        }



        mapResult;
    }
}