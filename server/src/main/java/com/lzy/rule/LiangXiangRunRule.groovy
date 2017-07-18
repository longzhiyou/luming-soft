package com.lzy.rule

import com.lzy.demo.BaZi
import com.lzy.demo.CommonAlgorithm
import com.lzy.rule.BaseRule

/**
 * 梁湘润规则
 *  子平母法规则
 * Created by bukeyan on 2017/6/18.
 */
public class LiangXiangRunRule implements BaseRule{

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

        def luZhi = commonAlgorithm.getLuZhi(nianGan)


        //五行缺一规则
        //子平母法规则
        def mufa=[:]
        mapResult["子平母法规则"]=mufa
        mufa["shuanglu"]="双鹿"


        return mapResult
    }
}