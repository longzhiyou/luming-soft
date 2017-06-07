package com.lzy.demo;

import lombok.Data;

/**
 *
 * Created by bukeyan on 2017/6/7.
 */

public class CommonAlgorithm {
    private String chineseNumber = "正";
    public final static String[] Gan = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    public String getChineseNumber() {
        return chineseNumber;
    }

    public void setChineseNumber(String chineseNumber) {
        this.chineseNumber = chineseNumber;
    }

    public static String[] getGan() {
        return Gan;
    }
}
