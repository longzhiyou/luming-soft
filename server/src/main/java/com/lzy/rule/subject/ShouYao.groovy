package com.lzy.rule.subject

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.rule.BaseRule

/**
 *  寿夭专题
 *
 * Created by bukeyan on 2017/6/18.
 */
class ShouYao implements BaseRule{

   @Override
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

       def taiZhu = bazi.getTaiZhu()

       def listMingGan = bazi.getListMingGan()
       def listMingZhi = bazi.getListMingZhi()
       def listMingZhu = bazi.getListMingZhu()

       def yunGan = bazi.getYunGan()
       def yunZhi = bazi.getYunZhi()
       def yunZhu = bazi.getYunZhu()

       def xingNianGan = bazi.getXingnianan()
       def xingNianZhi = bazi.getXingnianZhi()
       def xingNianZhu = bazi.getXingnianZhu()

       def liunianGan = bazi.getLiunianGan()
       def liunianZhi = bazi.getLiunianZhi()
       def liunianZhu = bazi.getLiunianZhu()

       def luZhi = commonAlgorithm.getLuZhi(nianGan)
       def gender = bazi.getGender()
       def nianzhuwuxing = commonAlgorithm.getJiaZiWuXing(nianZhu)


       mapResult
   }
}