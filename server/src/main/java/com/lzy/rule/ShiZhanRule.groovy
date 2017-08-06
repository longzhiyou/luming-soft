package com.lzy.rule;

import com.lzy.core.BaZi;
import com.lzy.core.CommonAlgorithm
import com.lzy.core.JiaZiAlgorithm

/**
 *  实战规则
 * Created by bukeyan on 2017/6/18.
 */
public class ShiZhanRule implements BaseRule{

    @Override
    public Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

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
         *  原则
         *  1.势-五行旺则泄
         * [2017-08-03 add by longzhiyou]
         */
        //五行缺一规则

        //层次,富贵-男命
        /**
         * 婚姻-女命重点
         *  男命用年柱纳音所克五行，引到日支妻宫.
         *  女命用克年柱纳音五行，引到日支妻宫.
         * [2017-08-03 add by longzhiyou]
         */

        /**
         *  子女
         *  1.花园十二宫-用纳音五行引到时支看十二长生诀
         *      男命用克年柱纳音五行
         *      女命用年柱纳音五行所生
         * [2017-08-03 add by longzhiyou]
         */
        //健康
        //吉凶

        /**
         *  岁运
         *  六法冲克-细批终身详解》P616 论“大凶”
         *  “六法冲克”断生死关口 http://blog.sina.com.cn/s/blog_49d801fd0102dsp3.html
         *  《金不换大运》
         * [2017-08-03 add by longzhiyou]
         */

        if(!liunianZhu.isEmpty()){
            def info = JiaZiAlgorithm.mapJiaZiInfo.get(liunianZhu)
            if (riZhu==info.nayingeyike){
                mapResult["【流年纳音隔一相克日柱】"] = "流年:"+liunianZhu.toString()+" 日柱:"+riZhu.toString()
            }

            if (riZhu==info.nayinmuguike){
                mapResult["【流年纳音墓鬼相克日柱】"] = "流年:"+liunianZhu.toString()+" 日柱:"+riZhu.toString()
            }

            if(info.nayinkongwangke.contains(riZhu)){
                mapResult["【流年纳音空亡相克日柱】"] = "日柱:"+riZhu.toString()+ "空亡在-流年:"+liunianZhu.toString()
            }

        }



        mapResult
    }
}