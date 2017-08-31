package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 *  五核心规则
 * Created by bukeyan on 2017/6/18.
 */
public class CoreRule implements BaseRule{

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

        def taiGan = bazi.getTaiGan()
        def taiZhi = bazi.getTaiZhi()
        def taiZhu = bazi.getTaiZhu()
        def luZhi = commonAlgorithm.getLuZhi(nianGan)

        def listMingTaiZhi = listMingZhi+taiZhi
        def listMingTaiGan = listMingGan+taiGan
        def listMingTaiZhu = listMingZhu+taiZhu

        /**
         *  生克，空亡，冲，三刑，六害
         *  福神相助
         *  死绝-是谁?
         *  冲破
         *  空亡
         * [2017-08-31 add by longzhiyou]
         */

        mapResult
    }
}