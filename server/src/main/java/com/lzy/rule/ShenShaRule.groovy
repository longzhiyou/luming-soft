package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

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

       def luZhi = commonAlgorithm.getLuZhi(nianGan)

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
           mapResult["【戟锋煞】"]="命主后天意外伤害而伤残，大运流年忌讳【忌干】旺支。刑合之期"
       }

       /**
        * 破煞
        * 年时结构
        * [2017-08-25 add by longzhiyou]
        */
       def posha=["卯午","丑辰","子酉","未戌"]
       if (posha.contains(nianZhi+shiZhi)) {
           mapResult["【破煞】"]="少年多灾难，多指连累家属破财，如连年有病，增加家长无限忧虑。"
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
           mapResult["【天刑煞】"]="体弱多病，一生多有疾病。常与医生交往，医药费比较高，但也年年过"
       }

       /**
        *   痼疾杀，死病符
        *   痼疾煞的起法：“岁后一辰，带冲者是”。比如子年生人，退后一个地支是亥，若八字里又带巳，即是带有痼疾的标志。
        * [2017-08-25 add by longzhiyou]
        */
       def gujisha=["子":"亥巳","丑":"子午","寅":"丑未","卯":"寅申",
                    "辰":"卯酉","巳":"辰戌","午":"巳亥","未":"午子",
                    "申":"未丑","酉":"申寅","戌":"酉卯","亥":"戌辰"]
       matchStr = gujisha.get(nianZhi)
       if (listMingZhi.contains(matchStr[0])&&listMingZhi.contains(matchStr[1])) {
           mapResult["【痼疾煞】"]="岁后一辰，带冲者是。痼疾是一种令人烦心之疾病，与体弱多病不同。体弱多病，只是时常有病，甚至自己的病症，别人尚且不易发觉。" +
                   "[痼疾]则不同。病象在外，譬如：久年气喘，甚至血漏、痔疮等。"
       }

       mapResult
   }
}