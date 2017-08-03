package com.lzy.rule;

import com.lzy.core.BaZi;
import com.lzy.core.CommonAlgorithm

/**
 *  实战规则
 * Created by bukeyan on 2017/6/18.
 */
public class ShiZhanRule implements BaseRule{

    @Override
    public String matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

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
        return null
    }
}