package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 *  女命规则
 * Created by bukeyan on 2017/6/18.
 */
 class WomanRule {

    String matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

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


        mapResult
    }
}