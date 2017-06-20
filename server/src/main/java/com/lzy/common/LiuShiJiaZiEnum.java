package com.lzy.common;

import com.google.common.collect.ImmutableSet;

/**
 * 六十甲子
 * @author dzm
 */
public enum LiuShiJiaZiEnum {

    JIAZI("甲子",1,TianGanEnum.JIA,DiZhiEnum.ZI,WuXingEnum.JIN,"海中金", ImmutableSet.of( "戌亥")),
    YICHOU("乙丑",2,TianGanEnum.YI,DiZhiEnum.CHOU,WuXingEnum.JIN,"海中金", ImmutableSet.of( "戌亥")),
    BINGYIN("丙寅",3,TianGanEnum.BING,DiZhiEnum.YIN,WuXingEnum.HUO,"炉中火", ImmutableSet.of( "戌亥")),
    DINGMAO("丁卯",4,TianGanEnum.DING,DiZhiEnum.MAO,WuXingEnum.HUO,"炉中火", ImmutableSet.of( "戌亥")),
    WUCHEN("戊辰",5,TianGanEnum.WU,DiZhiEnum.CHEN,WuXingEnum.MU,"大林木", ImmutableSet.of( "戌亥")),
    JISI("己巳",6,TianGanEnum.JI,DiZhiEnum.SI,WuXingEnum.MU,"大林木", ImmutableSet.of( "戌亥")),
    GENGSWU("庚午",7,TianGanEnum.GENG,DiZhiEnum.WU,WuXingEnum.TU,"路旁土", ImmutableSet.of( "戌亥")),
    XINWEI("辛未",8,TianGanEnum.XIN,DiZhiEnum.WEI,WuXingEnum.TU,"路旁土", ImmutableSet.of( "戌亥")),
    RENSHEN("壬申",9,TianGanEnum.REN,DiZhiEnum.SHEN,WuXingEnum.JIN,"剑锋金", ImmutableSet.of( "戌亥")),
    GUIYOU("癸酉",10,TianGanEnum.GUI,DiZhiEnum.YOU,WuXingEnum.JIN,"剑锋金", ImmutableSet.of( "戌亥")),

    JIAXU("甲戌",11,TianGanEnum.JIA,DiZhiEnum.XU,WuXingEnum.HUO,"山头火", ImmutableSet.of( "申酉")),
    YIHAI("乙亥",12,TianGanEnum.YI,DiZhiEnum.HAI,WuXingEnum.HUO,"山头火", ImmutableSet.of( "申酉")),
    BINGZI("丙子",13,TianGanEnum.BING,DiZhiEnum.ZI,WuXingEnum.SHUI,"涧下水", ImmutableSet.of( "申酉")),
    DINGCHOU("丁丑",14,TianGanEnum.DING,DiZhiEnum.CHOU,WuXingEnum.SHUI,"涧下水", ImmutableSet.of( "申酉")),
    WUYIN("戊寅",15,TianGanEnum.WU,DiZhiEnum.YIN,WuXingEnum.TU,"城头土", ImmutableSet.of( "申酉")),
    JIMAO("己卯",16,TianGanEnum.JI,DiZhiEnum.MAO,WuXingEnum.TU,"城头土", ImmutableSet.of( "申酉")),
    GENCHEN("庚辰",17,TianGanEnum.GENG,DiZhiEnum.CHEN,WuXingEnum.JIN,"白蜡金", ImmutableSet.of( "申酉")),
    XINSI("辛巳",18,TianGanEnum.XIN,DiZhiEnum.SI,WuXingEnum.JIN,"白蜡金", ImmutableSet.of( "申酉")),
    RENWU("壬午",19,TianGanEnum.REN,DiZhiEnum.WU,WuXingEnum.MU,"杨柳木", ImmutableSet.of( "申酉")),
    GUIWEI("癸未",20,TianGanEnum.GUI,DiZhiEnum.WEI,WuXingEnum.MU,"杨柳木", ImmutableSet.of( "申酉")),

    JIASHEN("甲申",21,TianGanEnum.JIA,DiZhiEnum.SHEN,WuXingEnum.SHUI,"泉中水", ImmutableSet.of( "午未")),
    YIYOU("乙酉",22,TianGanEnum.YI,DiZhiEnum.YOU,WuXingEnum.SHUI,"泉中水", ImmutableSet.of( "午未")),
    BINGXU("丙戌",23,TianGanEnum.BING,DiZhiEnum.XU,WuXingEnum.TU,"屋上土", ImmutableSet.of( "午未")),
    DINGHAI("丁亥",24,TianGanEnum.DING,DiZhiEnum.HAI,WuXingEnum.TU,"屋上土", ImmutableSet.of( "午未")),
    WUZI("戊子",25,TianGanEnum.WU,DiZhiEnum.ZI,WuXingEnum.HUO,"霹雳火", ImmutableSet.of( "午未")),
    JICHOU("己丑",26,TianGanEnum.JI,DiZhiEnum.CHOU,WuXingEnum.HUO,"霹雳火", ImmutableSet.of( "午未")),
    GENGYIN("庚寅",27,TianGanEnum.GENG,DiZhiEnum.YIN,WuXingEnum.MU,"松柏木", ImmutableSet.of( "午未")),
    XINMAO("辛卯",28,TianGanEnum.XIN,DiZhiEnum.MAO,WuXingEnum.MU,"松柏木", ImmutableSet.of( "午未")),
    RENCHEN("壬辰",29,TianGanEnum.REN,DiZhiEnum.CHEN,WuXingEnum.SHUI,"长流水", ImmutableSet.of( "午未")),
    GUISI("癸巳",30,TianGanEnum.GUI,DiZhiEnum.SI,WuXingEnum.SHUI,"长流水", ImmutableSet.of( "午未")),

    JIAWU("甲午",31,TianGanEnum.JIA,DiZhiEnum.WU,WuXingEnum.JIN,"沙中金", ImmutableSet.of( "辰巳")),
    YIWEI("乙未",32,TianGanEnum.YI,DiZhiEnum.WEI,WuXingEnum.JIN,"沙中金", ImmutableSet.of( "辰巳")),
    BINGSHEN("丙申",33,TianGanEnum.BING,DiZhiEnum.SHEN,WuXingEnum.HUO,"山下火", ImmutableSet.of( "辰巳")),
    DINGYOU("丁酉",34,TianGanEnum.DING,DiZhiEnum.SHEN,WuXingEnum.HUO,"山下火", ImmutableSet.of( "辰巳")),
    WUXU("戊戌",35,TianGanEnum.WU,DiZhiEnum.YOU,WuXingEnum.MU,"平地木", ImmutableSet.of( "辰巳")),
    JIHAI("己亥",36,TianGanEnum.JI,DiZhiEnum.HAI,WuXingEnum.MU,"平地木", ImmutableSet.of( "辰巳")),
    GENGZI("庚子",37,TianGanEnum.GENG,DiZhiEnum.ZI,WuXingEnum.TU,"壁上土", ImmutableSet.of( "辰巳")),
    XINCHOU("辛丑",38,TianGanEnum.XIN,DiZhiEnum.CHOU,WuXingEnum.TU,"壁上土", ImmutableSet.of( "辰巳")),
    RENYIN("壬寅",39,TianGanEnum.REN,DiZhiEnum.YIN,WuXingEnum.JIN,"金箔金", ImmutableSet.of( "辰巳")),
    GUIMAO("癸卯",40,TianGanEnum.GUI,DiZhiEnum.MAO,WuXingEnum.JIN,"金箔金", ImmutableSet.of( "辰巳")),

    JIACHEN("甲辰",41,TianGanEnum.JIA,DiZhiEnum.CHEN,WuXingEnum.HUO,"复灯火", ImmutableSet.of( "寅卯")),
    YISI("乙巳",42,TianGanEnum.YI,DiZhiEnum.SI,WuXingEnum.HUO,"复灯火", ImmutableSet.of( "寅卯")),
    BINGWU("丙午",43,TianGanEnum.BING,DiZhiEnum.WU,WuXingEnum.SHUI,"天河水", ImmutableSet.of( "寅卯")),
    DINGWEI("丁未",44,TianGanEnum.DING,DiZhiEnum.WEI,WuXingEnum.SHUI,"天河水", ImmutableSet.of( "寅卯")),
    WUSHEN("戊申",45,TianGanEnum.WU,DiZhiEnum.SHEN,WuXingEnum.TU,"大驿土", ImmutableSet.of( "寅卯")),
    JIYOU("己酉",46,TianGanEnum.JI,DiZhiEnum.YOU,WuXingEnum.TU,"大驿土", ImmutableSet.of( "寅卯")),
    GENGXU("庚戌",47,TianGanEnum.GENG,DiZhiEnum.XU,WuXingEnum.JIN,"钗钏金", ImmutableSet.of( "寅卯")),
    XINHAI("辛亥",48,TianGanEnum.XIN,DiZhiEnum.HAI,WuXingEnum.JIN,"钗钏金", ImmutableSet.of( "寅卯")),
    RENZI("壬子",49,TianGanEnum.REN,DiZhiEnum.ZI,WuXingEnum.MU,"桑拓木", ImmutableSet.of( "寅卯")),
    GUICHOU("癸丑",50,TianGanEnum.GUI,DiZhiEnum.CHOU,WuXingEnum.MU,"桑拓木", ImmutableSet.of( "寅卯")),

    JIAYIN("甲寅",51,TianGanEnum.JIA,DiZhiEnum.YIN,WuXingEnum.SHUI,"大溪水", ImmutableSet.of( "子丑")),
    YIMAO("乙卯",52,TianGanEnum.YI,DiZhiEnum.MAO,WuXingEnum.SHUI,"大溪水", ImmutableSet.of( "子丑")),
    BINGCHEN("丙辰",53,TianGanEnum.BING,DiZhiEnum.CHEN,WuXingEnum.TU,"沙中土", ImmutableSet.of( "子丑")),
    DINGSI("丁巳",54,TianGanEnum.DING,DiZhiEnum.SI,WuXingEnum.TU,"沙中土", ImmutableSet.of( "子丑")),
    WUWU("戊午",55,TianGanEnum.WU,DiZhiEnum.WU,WuXingEnum.HUO,"天上火", ImmutableSet.of( "子丑")),
    JIWEI("己未",56,TianGanEnum.JI,DiZhiEnum.WEI,WuXingEnum.HUO,"天上火", ImmutableSet.of( "子丑")),
    GENGSHEN("庚申",57,TianGanEnum.GENG,DiZhiEnum.SHEN,WuXingEnum.MU,"石榴木", ImmutableSet.of( "子丑")),
    XINYOU("辛酉",58,TianGanEnum.XIN,DiZhiEnum.YOU,WuXingEnum.MU,"石榴木", ImmutableSet.of( "子丑")),
    RENXU("壬戌",59,TianGanEnum.REN,DiZhiEnum.XU,WuXingEnum.SHUI,"大海水", ImmutableSet.of( "子丑")),
    GUIHAI("癸亥",60,TianGanEnum.GUI,DiZhiEnum.HAI,WuXingEnum.SHUI,"大海水", ImmutableSet.of( "子丑"));
    
    private final String name;
    private final int value;
    private final TianGanEnum tiangan;
    private final DiZhiEnum dizhi;
    /**
     * 五行
     */
    private final WuXingEnum wuXing;

    private final String nayin;

    /**
     * 空亡
     */
    private final ImmutableSet<String> kongwang;

    
    LiuShiJiaZiEnum(String name, int value, TianGanEnum tianGanEnum,
                    DiZhiEnum diZhiEnum, WuXingEnum wuXing, String nayin,ImmutableSet<String> kongwang){
        this.value = value;
        this.name = name;
        this.tiangan = tianGanEnum;
        this.dizhi = diZhiEnum;
        this.wuXing = wuXing;
        this.nayin = nayin;
        this.kongwang = kongwang;
    }

    /**
     * 根据序号查找
     * @param value
     * @return
     */
    public static LiuShiJiaZiEnum getByValue(int value){
        LiuShiJiaZiEnum current = null;
        for (LiuShiJiaZiEnum liuShiJiaZiEnum:LiuShiJiaZiEnum.values()){
            if (liuShiJiaZiEnum.getValue() == value){
                current = liuShiJiaZiEnum;
                break;
            }
        }
        return current;
    }

    public static LiuShiJiaZiEnum getByDisplay(String display){
        LiuShiJiaZiEnum current = null;
        for (LiuShiJiaZiEnum liuShiJiaZiEnum:LiuShiJiaZiEnum.values()){
            if (liuShiJiaZiEnum.getName().equals(display)){
                current = liuShiJiaZiEnum;
                break;
            }
        }
        return current;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public TianGanEnum getTiangan() {
        return tiangan;
    }

    public DiZhiEnum getDizhi() {
        return dizhi;
    }

    public TianGanEnum tiangan(){
        return this.tiangan;
    }
    
    public DiZhiEnum dizhi(){
        return this.dizhi;
    }

    public WuXingEnum getWuXing() {
        return wuXing;
    }

    public String getNayin() {
        return nayin;
    }

    public ImmutableSet<String> getKongwang() {
        return kongwang;
    }
}
