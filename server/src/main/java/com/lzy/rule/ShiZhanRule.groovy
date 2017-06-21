package com.lzy.rule;

import com.lzy.demo.BaZi;
import com.lzy.demo.CommonAlgorithm;
import com.lzy.domain.AnalyzeResult;

/**
 *  实战规则
 * Created by bukeyan on 2017/6/18.
 */
public class ShiZhanRule implements BaseRule{

    @Override
    public String matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {
        //五行缺一规则
        return null;
    }
}