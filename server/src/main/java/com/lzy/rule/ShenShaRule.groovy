package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm
import com.lzy.core.ShenShaAlgorithm

/**
 *  神煞规则
 * Created by bukeyan on 2017/6/18.
 */
class ShenShaRule {

   def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

       def mapResult = [:]
       def mapRule = [:]
       def matchStr = ""
       def ruleValue ;
       def tempShow=""

       def gender = bazi.getGender()
       def nianGan = bazi.getNianGan()
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

       def yunGan = bazi.getYunGan()
       def yunZhi = bazi.getYunZhi()
       def yunZhu = bazi.getYunZhu()

       def liunianGan = bazi.getLiunianGan()
       def liunianZhi = bazi.getLiunianZhi()
       def liunianZhu = bazi.getLiunianZhu()

       def rishizhiList = [riZhi,shiZhi]

       /**
        * 天火煞
        *  天火煞。此煞取寅午戌全而天干有丙丁，五位中全不见水者是，有水则非。
        *  若年运至火气生旺处，当防火灾。
        *  诗曰：“寅午戌全号天火，不见丙丁犹自可；五位都无一水神，生旺临年灾厄火。”余命寅午戌全，月干有癸行戊午运，戊於化火，甲戌年、甲戌月遂遭火灾。
        * [2017-08-24 add by longzhiyou]
        */

       int count = listMingGan.count("丙")+listMingGan.count("丁")
       if (listMingZhi.contains("寅")&&listMingZhi.contains("午")&&listMingZhi.contains("戌")) {
           if ( (listMingGan.count("丙")+listMingGan.count("丁"))>1) {
               mapResult["【天火煞】"]="此煞取寅午戌全而天干有丙丁，五位中全不见水者是，有水则非。"
           }
       }

       /**
        *   戟锋煞
        *   正月起甲，二月在乙，三月在戊，四月在丙，五月在丁，六月在己， 七月在庚，八月在辛，九月在戌，十月在壬，
        *   十一月在癸，十二月在巳，逐月处于旺盛的天干加临，日柱、时柱带两重的，凶，此煞再与悬针相见，命主被判流 刑，伤残。
        * [2017-08-24 add by longzhiyou]
        */
       def jianfengsha=["寅甲甲","卯乙乙","辰戊戊"
                        ,"巳丙丙","午丁丁","未己己"
                        ,"申庚庚","酉辛辛","戌戊戊"
                        ,"亥壬壬","子癸癸","丑己己"]
       if (jianfengsha.contains(yueZhi+riGan+shiGan)) {
           mapResult["【戟锋煞-月支日干时干】"]=["命主后天意外伤害而伤残，大运流年忌讳【忌干】旺支。刑合之期"
                   ,"正月起甲，二月在乙，三月在戊，四月在丙，五月在丁，六月在己， 七月在庚，八月在辛，九月在戌，十月在壬，十一月在癸，十二月在巳，逐月处于旺盛的天干加临，日柱、时柱带两重的，凶，此煞再与悬针相见，命主被判流 刑，伤残。"
           ]
       }

       /**
        * 破煞
        * 年时结构
        * [2017-08-25 add by longzhiyou]
        */
       def posha=["卯午","丑辰","子酉","未戌"]
       if (posha.contains(nianZhi+shiZhi)) {
           mapResult["【破煞-年时地支】"]="少年多灾难，多指连累家属破财，如连年有病，增加家长无限忧虑。"
       }

       /**
        *   天刑煞
        *   年支时干组合
        * [2017-08-25 add by longzhiyou]
        */
       def tianxingsha=["子乙","丑乙","寅庚","卯辛"
                        ,"辰辛","巳壬","午癸","未癸"
                        ,"申丙","酉丁","戌丁","亥戊"]
       if (tianxingsha.contains(nianZhi+shiGan)) {
           mapResult["【天刑煞-年支时干组合】"]="体弱多病，一生多有疾病。常与医生交往，医药费比较高，但也年年过"
       }

       /**
        *   雷霆煞
        *   月支对时支组合
        *   正七二八子寅方，三九四十辰午当，五十一申六二戍，必主雷轰虎
        * [2017-08-25 add by longzhiyou]
        */
       def leitingsha = [ "寅":"子",
                          "申":"子",
                          "卯":"寅",
                          "酉":"寅",

                          "辰":"辰",
                          "戌":"辰",

                          "巳":"午",
                          "亥":"子",

                          "午":"申",
                          "子":"申",
                          "未":"戍",
                          "丑":"戍"
                        ]

       matchStr = leitingsha.get(yueZhi)
       if (matchStr==shiZhi) {
           mapResult["【雷霆煞-月支对时支】"]="忽然遇难,祸起萧墙。如游泳淹死，登山失足坠山，驾驶昏睡出车祸。"
       }

       /**
        *   病符起法：岁后一辰。即子年生见亥、丑年生见子，其余类推。命中及行运见之，主灾病。
        * [2017-08-25 add by longzhiyou]
        */
       def bingfu=["子":"亥","丑":"子","寅":"丑","卯":"寅",
                    "辰":"卯","巳":"辰","午":"巳","未":"午",
                    "申":"未","酉":"申","戌":"酉","亥":"戌"]
       matchStr = bingfu.get(nianZhi)
       if (listMingZhi.contains(matchStr)) {
           mapResult["【病符煞】"]="岁后一辰。即子年生见亥、丑年生见子，其余类推。命中及行运见之，主灾病。"
       }

       /**
        *   痼疾杀，死病符
        *   痼疾煞的起法：“岁后一辰，带冲者是”。比如子年生人，退后一个地支是亥，若八字里又带巳，即是带有痼疾的标志。
        *   命后一辰对冲于日时
        * [2017-08-25 add by longzhiyou]
        */
       def gujisha=["子":"亥巳","丑":"子午","寅":"丑未","卯":"寅申",
                    "辰":"卯酉","巳":"辰戌","午":"巳亥","未":"午子",
                    "申":"未丑","酉":"申寅","戌":"酉卯","亥":"戌辰"]
       matchStr = gujisha.get(nianZhi)

       if (listMingZhi.contains(matchStr[0])&&listMingZhi.contains(matchStr[1])) {
           mapResult["【痼疾煞-岁后一辰，带冲者是】"]="痼疾是一种令人烦心之疾病，与体弱多病不同。体弱多病，只是时常有病，甚至自己的病症，别人尚且不易发觉。" +
                   "[痼疾]则不同。病象在外，譬如：久年气喘，甚至血漏、痔疮等。"
       }

       /**
        *  官符煞-诉讼
        *   太岁前五辰落在日时
        * [2017-08-25 add by longzhiyou]
        */

       def guanfusha=["子":"巳","丑":"午","寅":"未","卯":"申",
                    "辰":"酉","巳":"戌","午":"亥","未":"子",
                    "申":"丑","酉":"寅","戌":"卯","亥":"辰"]
       matchStr = guanfusha.get(nianZhi)
       if (matchStr==riZhi) {
           mapResult["【官符煞-太岁前五辰落在日支】"]="此人容易有诉讼，无意中招惹是非因而受牵连,日柱则主要是自己，重点在流年.太岁前五辰落在日时。注意:天干是否也是过5,流年是否三合,大运是否是阳刃"
       }
       if (matchStr==shiZhi) {
           mapResult["【官符煞-太岁前五辰落在时支】"]="此人容易有诉讼，重点在流年.太岁前五辰落在日时。注意:天干是否也是过午,流年是否三合,大运是否是阳刃"
       }

       /**
        * 挂剑煞
        * 四柱：巳酉丑申
        * [2017-08-25 add by longzhiyou]
        */

       if (listMingZhi.contains("巳")&&listMingZhi.contains("酉")&&listMingZhi.contains("丑")&&listMingZhi.contains("申")) {
           mapResult["【挂剑煞-四柱：巳酉丑申】"]="开刀，流血。杀人或被杀。在四柱带有【官符、元辰、白虎】严重得多"
       }
       def zhuyunsui = listMingZhi+[yunZhi,liunianZhi]
       if (listMingZhi.contains("申")&&zhuyunsui.contains("巳")&&zhuyunsui.contains("酉")&&zhuyunsui.contains("丑")) {
           mapResult["【挂剑煞-柱运岁】"]="巳酉丑申-刀刃血光之灾难"
       }

       /**
        *  十恶大败
        *  玄黄经说：
        *  甲己年，戊辰月戊戌日、壬申月癸亥日、乙亥月丙申日，丙子月丁亥日
        *  乙庚年，辛巳月壬申日、甲戌月乙巳日
        *  丙辛年，壬辰月辛巳日、戊戌月庚辰日，已亥月甲辰日
        *  戊癸年，己未月己丑日
        *  丁壬年无
        *  http://blog.sina.com.cn/s/blog_12ba59b030101tdxu.html
        * [2017-08-28 add by longzhiyou]
        */

       def shiedabai = ["甲年戊辰月戊戌日","甲年壬申月癸亥日","甲年乙亥月丙申日","甲年丙子月丁亥日",
                        "己年戊辰月戊戌日","己年壬申月癸亥日","己年乙亥月丙申日","己年丙子月丁亥日",
                        "乙年辛巳月壬申日","乙年甲戌月乙巳日",
                        "庚年辛巳月壬申日","庚年甲戌月乙巳日",
               "丙年壬辰月辛巳日","丙年戊戌月庚辰日","丙年已亥月甲辰日",
               "辛年壬辰月辛巳日","辛年戊戌月庚辰日","辛年已亥月甲辰日",
               "戊年己未月己丑日",
               "癸年己未月己丑日"
       ]

       matchStr =nianGan+"年"+yueZhu+"月"+riZhu+"日"
       if (shiedabai.contains(matchStr)) {
           mapResult["【十恶大败日】"]=matchStr+"【《三命通会》:十恶者，譬如律法中人，犯十恶重罪，在所不赦。大败者，譬兵法中，与敌交战，大败无一生还，喻极凶也。若内有吉神相扶，贵气相辅，当为吉论】"
       }


       /**
        *   命局日柱为甲子日、庚午日、丁卯日、癸酉日即为裸体桃花。
        *   不可言：日干临败地。
        * [2017-08-30 add by longzhiyou]
        */
       def luotitaohua=["甲子","庚午","丁卯","癸酉"]
       if (luotitaohua.contains(riZhu)) {
           mapResult["【裸体桃花-日柱】"+riZhu]=["甲子日、庚午日、丁卯日、癸酉日"
                                         ,"身坐桃花煞，再遇带合，故主浊滥荒淫"]
       }



       /**
        *   天罗地网
        * [2017-08-28 add by longzhiyou]
        */

       /**
        * 孤辰寡宿
        * 年支查找
        * 演变惆怅煞
        * [2017-08-30 add by longzhiyou]
        */
       def guchen = ShenShaAlgorithm.guchen.get(nianZhi)
       def guasu = ShenShaAlgorithm.guasu.get(nianZhi)
       if (zhuyunsui.contains(guchen)&&zhuyunsui.contains(guasu)) {
           mapResult["【年支查柱运岁孤辰寡宿全】"]="孤辰:"+guchen +"寡宿:"+guasu
       }


       if (CoreAlgorithm.isYang(nianGan)) {
           if (bazi.getGender()=="男") {
            //阳男

           }else {

           }

       }else {
           if (bazi.getGender()=="女") {
               //阴女
           }else {

           }
       }

       mapResult
   }
}