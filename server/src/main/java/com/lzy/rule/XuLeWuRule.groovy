package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm
import com.lzy.core.ShenShaAlgorithm

/**
 *  徐乐吾规则
 * Created by bukeyan on 2017/6/18.
 */
class XuLeWuRule {

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
        *   真阳刃(阳刃出鞘)
        *   甲见乙卯 庚见辛酉 丙见 午丁 壬见 子癸
        *    劫财阳刃
        以财为用时，最忌讳
        护禄阳刃
        甲以寅为禄，见申冲克，见卯则.身弱用最好
        背禄
        通会 阴干伤官就是，乙用丙
        刃头财
        甲见己卯
        丙见庚午
        女命
        阳干用伤官为正，食神为忌。戊 甲为夫，庚克
        凡夫见冲动者，多淫滥，为夫多。
        忌合
        尤其是双鸳合
        一乙 二庚 一己二甲
        特例
        甲见丙寅
        甲午日，女命伤夫。
        * [2017-09-11 add by longzhiyou]
        */

       def tempMap = ["甲":"乙卯","庚":"辛酉","丙":"丁午","壬":"癸子"]
       def zhenyangren = tempMap.get(riGan)
       if (zhenyangren
               &&listMingGan.contains(zhenyangren[0])
               &&listMingZhi.contains(zhenyangren[1])
       ) {
           mapResult["【真阳刃(阳刃出鞘)】"]=riGan+"日见"+zhenyangren

       }

       tempMap = ["乙":"庚","己":"甲","丁":"壬","辛":"丙"]
       matchStr = tempMap.get(riGan)
       if (mapResult&&listMingGan.count(matchStr)>1) {

           mapResult["【女命夫星忌双鸳合】"]=riGan+"日见二"+matchStr+"多淫滥，为夫多"
       }








       mapResult
   }
}