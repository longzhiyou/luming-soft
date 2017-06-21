package com.lzy.rule;

import com.lzy.demo.BaZi;
import com.lzy.demo.CommonAlgorithm;
import com.lzy.domain.AnalyzeResult;

/**
 *  五行精纪规则
 * Created by bukeyan on 2017/6/18.
 */
public class WuXingJingJiRule  implements BaseRule{

    @Override
    public Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {
        def mapResult = [:]
        def mapRule = [:]
        def matchStr = ""
        def ruleValue ;
        def tempShow=""

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

        //五虎遁禄干
        def mapDunLuGan=["甲":"丙","乙":"己","丙":"癸","丁":"丙"
                    ,"戊":"丁","己":"庚",
                    "庚":"甲","辛":"丁","壬":"辛","癸":"甲"]
        //天乙贵人
        def mapTianYi=["甲":"丑未" ,"戊":"丑未" ,"庚":"丑未",
                       "乙":"子申" ,"己":"子申" ,
                       "丙":"亥酉" ,"丁":"亥酉" ,
                       "壬":"巳卯" ,"癸":"巳卯" ,
                       "辛":"午寅"]
        //马
        def mapMa=[
                "寅":"申" ,"午":"申" ,"戌":"申",
                "申":"寅" ,"子":"寅" ,"辰":"寅",
                "巳":"亥" ,"酉":"亥" ,"丑":"亥",
                "亥":"巳" ,"卯":"巳" ,"未":"巳"]

        //截杀
        def mapJieSha=[
                "寅":"亥" ,"午":"亥" ,"戌":"亥",
                "申":"巳" ,"子":"巳" ,"辰":"巳",
                "巳":"寅" ,"酉":"寅" ,"丑":"寅",
                "亥":"申" ,"卯":"申" ,"未":"申"]



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


        //【相合禄】
        mapRule=["甲":"己亥","乙":"庚戌","丙":"辛巳","丁":"壬午"
                 ,"戊":"癸巳","己":"甲午",
                 "庚":"乙巳","辛":"丙辰","壬":"丁亥","癸":"戊子"]
        ruleValue= mapRule.get(nianGan);
        if (shiZhu==ruleValue) {
            mapResult["【相合禄】时柱"]="禄若会见则富贵，相合则奋迅"
        }
        if (riZhu==ruleValue) {
            mapResult["【禄头财】日柱"]="禄若会见则富贵，相合则奋迅"
        }

        //【食神带禄】
        mapRule=["甲":"己亥","乙":"庚戌","丙":"辛巳","丁":"壬午"
                 ,"戊":"癸巳","己":"甲午",
                 "庚":"乙巳","辛":"丙辰","壬":"甲寅","癸":"戊子"]
        ruleValue= mapRule.get(nianGan);
        if (shiZhu==ruleValue) {
            mapResult["【相合禄】时柱"]="禄若会见则富贵，相合则奋迅"
        }
        if (riZhu==ruleValue) {
            mapResult["【禄头财】日柱"]="禄若会见则富贵，相合则奋迅"
        }

        //【名位禄】
        def mingweilu = ["甲丙寅","乙丁卯","庚壬申","辛癸酉"]
        matchStr = nianGan+shiZhu
        if (mingweilu.contains(matchStr)) {
            mapResult["【名位禄】时柱"]="凡禄上带食神者是，如甲人见丙寅，谓之名位禄，皆为贵格，余仿此。（林开五命）"
        }
        matchStr = nianGan+riZhu
        if (mingweilu.contains(matchStr)) {
            mapResult["【名位禄】日柱"]="凡禄上带食神者是，如甲人见丙寅，谓之名位禄，皆为贵格，余仿此。（林开五命）"
        }

        //【生成禄】
        def shengchenglu = ["甲甲寅","乙乙卯","丙丁巳","丁戊午","戊丁巳","己戊午",
                            "庚庚申","辛辛酉","壬癸亥","癸壬子"]
        matchStr = nianGan+shiZhu
        if (shengchenglu.contains(matchStr)) {
            mapResult["【生成禄】时柱"]=matchStr
        }
        matchStr = nianGan+riZhu
        if (shengchenglu.contains(matchStr)) {
            mapResult["【生成禄】日柱"]=matchStr
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
            mapResult["【禄头财】时柱"]="主人富有声望。古诗云：禄生于絪缛，因财反有名，君子荣显禄，常人主丰盈。"
        }
        if (riZhu==ruleValue) {
            mapResult["【禄头财】日柱"]="主人富有声望。古诗云：禄生于絪缛，因财反有名，君子荣显禄，常人主丰盈。"
        }


        //【禄头鬼】
        mapRule=["甲":"庚寅","乙":"辛卯","丙":"癸巳","丁":"壬午"
                 ,"戊":"乙巳","己":"甲午",
                 "庚":"丙申","辛":"丁酉","壬":"己亥","癸":"戊子"]
        ruleValue= mapRule.get(nianGan)
        if (shiZhu==ruleValue) {
            mapResult["【禄头鬼】时柱"]="又名赤舌杀，君子主甲科，常人口舌刑责，若别有贵救，主家世超越，三代富有，行年太岁遇之，主有灾。（广信录）"
        }
        if (riZhu==ruleValue) {
            mapResult["【禄头鬼】日柱"]="又名赤舌杀，君子主甲科，常人口舌刑责，若别有贵救，主家世超越，三代富有，行年太岁遇之，主有灾。（广信录）"
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

        //【暗禄格】五虎遁禄双六合
        mapRule=["甲":"辛亥","乙":"甲戌","丙":"戊申","丁":"辛未"
                 ,"戊":"壬申","己":"乙未",
                 "庚":"己巳","辛":"壬辰","壬":"丙寅","癸":"己丑"]
        ruleValue= mapRule.get(nianGan)
        tempShow ="此是上清暗合禄，不因师指若何知。${nianGan}人${ruleValue}"
        if (shiZhu==ruleValue) {
            mapResult["【暗禄格】时柱"]=tempShow
        }
        if (riZhu==ruleValue) {
            mapResult["【暗禄格】日柱"]=tempShow
        }

        //【天雄禄】甲人数至戊是五数，不必求戊，戊禄在巳，见巳即名天雄禄，更正禄加之为入格。（马子才命格）
        mapRule=["甲":"巳","乙":"午","丙":"申","丁":"酉"
                 ,"戊":"亥","己":"子",
                 "庚":"寅","辛":"卯","壬":"巳","癸":"午"]
        ruleValue= mapRule.get(nianGan)
        if (listMingZhi.contains(ruleValue)&& listMingZhi.contains(luZhi)) {
            mapResult["【天雄禄】"]="甲人数至戊是五数，不必求戊，戊禄在巳，见巳即名天雄禄，更正禄加之为入格。（马子才命格）"
        }

        //【天禄贵神】太岁本干不见禄，取五虎元遁，至禄上看得何干，真干见天乙贵神，而贵人所坐之干，复得贵于禄上者是也
        def dunLuShangGan = mapDunLuGan.get(nianGan)
        if (listMingGan.contains(dunLuShangGan)) {

            def tianyi = mapTianYi.get(dunLuShangGan)
            for(i in 0..1){
                if (listMingZhi.contains(tianyi[i])) {
                    for(j in 0..3){
                        if (tianyi[i]==listMingZhi[j]) {
                            //获取贵人所坐之干
                            if (mapTianYi.get(listMingGan[j]).contains(luZhi)) {
                                mapResult["【天禄贵神】"]="如更入格，贵极一品，常格得之，不下三品。（玉霄宝鉴）"
                            }

                        }
                    }
                }
            }


        }

        //【禄堂】
        def lutang = ["甲甲戌","乙乙酉","丙丙申","丁丁未","戊戊午","己己巳","庚庚辰",
                      "辛辛卯","辛辛丑","壬壬寅","壬壬子","癸癸亥"]

        matchStr = nianGan+shiZhu
        if (lutang.contains(matchStr)) {
            mapResult["【禄堂】时柱"]="若更得诸位福神助发，必须大贵（李虚中书）"+ nianGan+"人"+shiZhu
        }
        matchStr = nianGan+riZhu
        if (lutang.contains(matchStr)) {
            mapResult["【禄堂】日柱"]="若更得诸位福神助发，必须大贵（李虚中书）"+ nianGan+"人"+riZhu
        }

        mapResult;
    }
}