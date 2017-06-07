package com.lzy.demo;

import lombok.Data;

/**
 *
 * Created by bukeyan on 2017/6/7.
 */

public class CommonAlgorithm {

    //初步用数组,只是key
    public static final String sTianGan = "甲乙丙丁戊己庚辛壬癸";
    public static final String sDiZhi = "子丑寅卯辰巳午未申酉戌亥";
    public static final String sWuXingTable = "金木水火土";

    //天干
    public final static String[] gan = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
    //地支
    public final static String[] zhi = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    //五行
    public final static String[] wuxing = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    //五行十二长生诀
    public final static String[] wuxingChangShengJue = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};


    final static String chineseNumber[] = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "腊"};


    /**
     * 六十甲子
     */
    public static final String[] jiazhi = {
            "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
            "甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
            "甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
            "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
            "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
            "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"
    };


}
