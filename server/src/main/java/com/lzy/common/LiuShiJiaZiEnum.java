package com.lzy.common;

/**
 * 六十甲子
 * @author dzm
 */
public enum LiuShiJiaZiEnum {

    JIAZI("甲子",1,TianGanEnum.JIA,DiZhiEnum.ZI,WuXingEnum.JIN,"海中金"),
    YICHOU("乙丑",2,TianGanEnum.YI,DiZhiEnum.CHOU,WuXingEnum.JIN,"海中金"),
    BINGYIN("丙寅",3,TianGanEnum.BING,DiZhiEnum.YIN,WuXingEnum.HUO,"炉中火"),
    DINGMAO("丁卯",4,TianGanEnum.DING,DiZhiEnum.MAO,WuXingEnum.HUO,"炉中火"),
    WUCHEN("戊辰",5,TianGanEnum.WU,DiZhiEnum.CHEN,WuXingEnum.MU,"大林木"),
    JISI("己巳",6,TianGanEnum.JI,DiZhiEnum.SI,WuXingEnum.MU,"大林木"),
    GENGSWU("庚午",7,TianGanEnum.GENG,DiZhiEnum.WU,WuXingEnum.TU,"路旁土"),
    XINWEI("辛未",8,TianGanEnum.XIN,DiZhiEnum.WEI,WuXingEnum.TU,"路旁土"),
    RENSHEN("壬申",9,TianGanEnum.REN,DiZhiEnum.SHEN,WuXingEnum.JIN,"剑锋金"),
    GUIYOU("癸酉",10,TianGanEnum.GUI,DiZhiEnum.YOU,WuXingEnum.JIN,"剑锋金"),
    JIAXU("甲戌",11,TianGanEnum.JIA,DiZhiEnum.XU,WuXingEnum.HUO,"山头火"),
    YIHAI("乙亥",12,TianGanEnum.YI,DiZhiEnum.HAI,WuXingEnum.HUO,"山头火"),
    BINGZI("丙子",13,TianGanEnum.BING,DiZhiEnum.ZI,WuXingEnum.SHUI,"涧下水"),
    DINGCHOU("丁丑",14,TianGanEnum.DING,DiZhiEnum.CHOU,WuXingEnum.SHUI,"涧下水"),
    WUYIN("戊寅",15,TianGanEnum.WU,DiZhiEnum.YIN,WuXingEnum.TU,"城头土"),
    JIMAO("己卯",16,TianGanEnum.JI,DiZhiEnum.MAO,WuXingEnum.TU,"城头土"),
    GENCHEN("庚辰",17,TianGanEnum.GENG,DiZhiEnum.CHEN,WuXingEnum.JIN,"白蜡金"),
    XINSI("辛巳",18,TianGanEnum.XIN,DiZhiEnum.SI,WuXingEnum.JIN,"白蜡金"),
    RENWU("壬午",19,TianGanEnum.REN,DiZhiEnum.WU,WuXingEnum.MU,"杨柳木"),
    GUIWEI("癸未",20,TianGanEnum.GUI,DiZhiEnum.WEI,WuXingEnum.MU,"杨柳木"),
    JIASHEN("甲申",21,TianGanEnum.JIA,DiZhiEnum.SHEN,WuXingEnum.SHUI,"泉中水"),
    YIYOU("乙酉",22,TianGanEnum.YI,DiZhiEnum.YOU,WuXingEnum.SHUI,"泉中水"),
    BINGXU("丙戌",23,TianGanEnum.BING,DiZhiEnum.XU,WuXingEnum.TU,"屋上土"),
    DINGHAI("丁亥",24,TianGanEnum.DING,DiZhiEnum.HAI,WuXingEnum.TU,"屋上土"),
    WUZI("戊子",25,TianGanEnum.WU,DiZhiEnum.ZI,WuXingEnum.HUO,"霹雳火"),
    JICHOU("己丑",26,TianGanEnum.JI,DiZhiEnum.CHOU,WuXingEnum.HUO,"霹雳火"),
    GENGYIN("庚寅",27,TianGanEnum.GENG,DiZhiEnum.YIN,WuXingEnum.MU,"松柏木"),
    XINMAO("辛卯",28,TianGanEnum.XIN,DiZhiEnum.MAO,WuXingEnum.MU,"松柏木"),
    RENCHEN("壬辰",29,TianGanEnum.REN,DiZhiEnum.CHEN,WuXingEnum.SHUI,"长流水"),
    GUISI("癸巳",30,TianGanEnum.GUI,DiZhiEnum.SI,WuXingEnum.SHUI,"长流水"),
    JIAWU("甲午",31,TianGanEnum.JIA,DiZhiEnum.WU,WuXingEnum.JIN,"沙中金"),
    YIWEI("乙未",32,TianGanEnum.YI,DiZhiEnum.WEI,WuXingEnum.JIN,"沙中金"),
    BINGSHEN("丙申",33,TianGanEnum.BING,DiZhiEnum.SHEN,WuXingEnum.HUO,"山下火"),
    DINGYOU("丁酉",34,TianGanEnum.DING,DiZhiEnum.SHEN,WuXingEnum.HUO,"山下火"),
    WUXU("戊戌",35,TianGanEnum.WU,DiZhiEnum.YOU,WuXingEnum.MU,"平地木"),
    JIHAI("己亥",36,TianGanEnum.JI,DiZhiEnum.HAI,WuXingEnum.MU,"平地木"),
    GENGZI("庚子",37,TianGanEnum.GENG,DiZhiEnum.ZI,WuXingEnum.TU,"壁上土"),
    XINCHOU("辛丑",38,TianGanEnum.XIN,DiZhiEnum.CHOU,WuXingEnum.TU,"壁上土"),
    RENYIN("壬寅",39,TianGanEnum.REN,DiZhiEnum.YIN,WuXingEnum.JIN,"金箔金"),
    GUIMAO("癸卯",40,TianGanEnum.GUI,DiZhiEnum.MAO,WuXingEnum.JIN,"金箔金"),
    JIACHEN("甲辰",41,TianGanEnum.JIA,DiZhiEnum.CHEN,WuXingEnum.HUO,"复灯火"),
    YISI("乙巳",42,TianGanEnum.YI,DiZhiEnum.SI,WuXingEnum.HUO,"复灯火"),
    BINGWU("丙午",43,TianGanEnum.BING,DiZhiEnum.WU,WuXingEnum.SHUI,"天河水"),
    DINGWEI("丁未",44,TianGanEnum.DING,DiZhiEnum.WEI,WuXingEnum.SHUI,"天河水"),
    WUSHEN("戊申",45,TianGanEnum.WU,DiZhiEnum.SHEN,WuXingEnum.TU,"大驿土"),
    JIYOU("己酉",46,TianGanEnum.JI,DiZhiEnum.YOU,WuXingEnum.TU,"大驿土"),
    GENGXU("庚戌",47,TianGanEnum.GENG,DiZhiEnum.XU,WuXingEnum.JIN,"钗钏金"),
    XINHAI("辛亥",48,TianGanEnum.XIN,DiZhiEnum.HAI,WuXingEnum.JIN,"钗钏金"),
    RENZI("壬子",49,TianGanEnum.REN,DiZhiEnum.ZI,WuXingEnum.MU,"桑拓木"),
    GUICHOU("癸丑",50,TianGanEnum.GUI,DiZhiEnum.CHOU,WuXingEnum.MU,"桑拓木"),
    JIAYIN("甲寅",51,TianGanEnum.JIA,DiZhiEnum.YIN,WuXingEnum.SHUI,"大溪水"),
    YIMAO("乙卯",52,TianGanEnum.YI,DiZhiEnum.MAO,WuXingEnum.SHUI,"大溪水"),
    BINGCHEN("丙辰",53,TianGanEnum.BING,DiZhiEnum.CHEN,WuXingEnum.TU,"沙中土"),
    DINGSI("丁巳",54,TianGanEnum.DING,DiZhiEnum.SI,WuXingEnum.TU,"沙中土"),
    WUWU("戊午",55,TianGanEnum.WU,DiZhiEnum.WU,WuXingEnum.HUO,"天上火"),
    JIWEI("己未",56,TianGanEnum.JI,DiZhiEnum.WEI,WuXingEnum.HUO,"天上火"),
    GENGSHEN("庚申",57,TianGanEnum.GENG,DiZhiEnum.SHEN,WuXingEnum.MU,"石榴木"),
    XINYOU("辛酉",58,TianGanEnum.XIN,DiZhiEnum.YOU,WuXingEnum.MU,"石榴木"),
    RENXU("壬戌",59,TianGanEnum.REN,DiZhiEnum.XU,WuXingEnum.SHUI,"大海水"),
    GUIHAI("癸亥",60,TianGanEnum.GUI,DiZhiEnum.HAI,WuXingEnum.SHUI,"大海水");
    
    private final String name;
    private final int value;
    private final TianGanEnum tiangan;
    private final DiZhiEnum dizhi;
    /**
     * 五行
     */
    private final WuXingEnum wuXing;

    private final String nayin;
    
    LiuShiJiaZiEnum(String name, int value, TianGanEnum tianGanEnum,
                    DiZhiEnum diZhiEnum, WuXingEnum wuXing, String nayin){
        this.value = value;
        this.name = name;
        this.tiangan = tianGanEnum;
        this.dizhi = diZhiEnum;
        this.wuXing = wuXing;
        this.nayin = nayin;
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
}
