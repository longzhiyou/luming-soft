package com.lzy.demo

/**
 *
 * Created by bukeyan on 2017/6/7.
 */
class GroovyRule {

    def matchRule(BaZi bazi) {
        def count = bazi.getHuoCount();
        return "火个数 $count"
    }
}
