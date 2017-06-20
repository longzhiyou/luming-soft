package com.lzy.rule;

import com.lzy.demo.BaZi;
import com.lzy.demo.CommonAlgorithm;

/**
 *
 * Created by bukeyan on 2017/6/18.
 */
public interface BaseRule {
    Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm);
}