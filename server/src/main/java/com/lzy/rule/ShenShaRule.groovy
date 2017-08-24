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
           mapResult["【戟锋煞】"]="命主后天伤残或被判流刑"
       }

       mapResult
   }
}