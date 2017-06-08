package com.lzy.common;

import com.google.common.collect.ImmutableSet;

/**
 * 十二地支
 * @author lzy
 */
public enum DiZhiEnum {

    ZI("子",1,YinYangEnum.YANG,WuXingEnum.SHUI,11,ImmutableSet.of( "癸")),
    CHOU("丑",2,YinYangEnum.YIN,WuXingEnum.TU ,12,ImmutableSet.of("癸","己","辛")),
    YIN("寅",3,YinYangEnum.YANG,WuXingEnum.MU,1,ImmutableSet.of("丙","甲","戊")),
    MAO("卯",4,YinYangEnum.YIN,WuXingEnum.MU,2,ImmutableSet.of( "乙")),
    CHEN("辰",5,YinYangEnum.YANG,WuXingEnum.TU,3,ImmutableSet.of("乙","戊","癸")),
    SI("巳",6,YinYangEnum.YIN,WuXingEnum.HUO ,4,ImmutableSet.of( "戊","丙","庚")),
    WU("午",7,YinYangEnum.YANG,WuXingEnum.HUO,5,ImmutableSet.of( "丁","己")),
    WEI("未",8,YinYangEnum.YIN,WuXingEnum.TU,6,ImmutableSet.of( "丁","己","乙")),
    SHEN("申",9,YinYangEnum.YANG,WuXingEnum.JIN,7,ImmutableSet.of( "戊","庚","壬")),
    YOU("酉",10,YinYangEnum.YIN,WuXingEnum.JIN,8,ImmutableSet.of( "辛")),
    XU("戌",10,YinYangEnum.YIN,WuXingEnum.TU,9,ImmutableSet.of( "戊","丁","辛")),
    HAI("亥",10,YinYangEnum.YIN,WuXingEnum.SHUI,10,ImmutableSet.of( "甲","壬"));
    
    /**
     * 显示
     */
    private final String display;
    /**
     * 数
     */
    private final int value;
    /**
     * 阴阳
     */
    private final YinYangEnum yinYang;
    /**
     * 五行
     */
    private final WuXingEnum wuXing;
    /**
     * 月份
     */
    private final int month;

    /**
     * 地支藏干
     */
    private final ImmutableSet<String> canggan;

    DiZhiEnum(String display,
              int value,
              YinYangEnum yinYang,
              WuXingEnum wuXing,
              int month,
              ImmutableSet<String> canggan){
        this.display = display;
        this.yinYang = yinYang;
        this.wuXing = wuXing;
        this.value = value;
        this.month = month;
        this.canggan =canggan;
    }
    
    public static DiZhiEnum getDiZhi(String display){
        for (DiZhiEnum tiangan:DiZhiEnum.values()){
            if (tiangan.display.equals(display)){
                return tiangan;
            }
        }
        return null;
    }
    
    public String display(){
        return this.display;
    }
    
    public int value(){
        return value;
    }
    
    public int month(){
        return month;
    }
    
    public YinYangEnum getYinYang(){
        return this.yinYang;
    }
    
    public WuXingEnum getWuXing(){
        return this.wuXing;
    }
}
