package com.lzy.rule;

import com.lzy.core.BaZi;
import com.lzy.core.CommonAlgorithm;

/**
 *
 * Created by bukeyan on 2017/6/18.
 */
public interface BaseRule {
    Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm);
}