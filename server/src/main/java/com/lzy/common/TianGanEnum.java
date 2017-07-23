package com.lzy.common;

/**
 * 十天干
 * @author dzm
 */
public enum TianGanEnum {

    JIA("甲",1,YinYangEnum.YANG,WuXingEnum.MU),
    YI("乙",2,YinYangEnum.YIN,WuXingEnum.MU),
    BING("丙",3,YinYangEnum.YANG,WuXingEnum.HUO),
    DING("丁",4,YinYangEnum.YIN,WuXingEnum.HUO),
    WU("戊",5,YinYangEnum.YANG,WuXingEnum.TU),
    JI("己",6,YinYangEnum.YIN,WuXingEnum.TU),
    GENG("庚",7,YinYangEnum.YANG,WuXingEnum.JIN),
    XIN("辛",8,YinYangEnum.YIN,WuXingEnum.JIN),
    REN("壬",9,YinYangEnum.YANG,WuXingEnum.SHUI),
    GUI("癸",10,YinYangEnum.YIN,WuXingEnum.SHUI);
    
    /**
     * 显示
     */
    private final String name;
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
    
    TianGanEnum(String name, int value, YinYangEnum yinYang, WuXingEnum wuXing){
        this.name = name;
        this.yinYang = yinYang;
        this.wuXing = wuXing;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public YinYangEnum getYinYang(){
        return this.yinYang;
    }

    public WuXingEnum getWuXing(){
        return this.wuXing;
    }



    public  static TianGanEnum getTianGan(String display){
        for (TianGanEnum tiangan:TianGanEnum.values()){
            if (tiangan.name.equals(display)){
                return tiangan;
            }
        }
        return null;
    }

    public  static TianGanEnum getByValue(int value){
        for (TianGanEnum tiangan:TianGanEnum.values()){
            if (tiangan.getValue() == value){
                return tiangan;
            }
        }
        return null;
    }


    public  boolean isYin(){

        return this.getYinYang().getValue()==0;

    }

    public  boolean isYang(){

        return this.getYinYang().getValue()==1;

    }

    /**
     * 是否是五行木
     * @return
     */
    public  boolean isMu() {

        return this.getWuXing().getName().equals("木");

    }

    /**
     * 是否是五行火
     * @return
     */
    public   boolean isHuo() {
        return this.getWuXing().getName().equals("火");

    }

    /**
     * 是否是五行土
     * @return
     */
    public   boolean isTu() {

        return this.getWuXing().getName().equals("土");

    }

    /**
     * 是否是五行金
     * @return
     */
    public   boolean isJin() {

        return this.getWuXing().getName().equals("金");

    }

    /**
     * 是否是五行水
     * @return
     */
    public  boolean isShui() {

        return this.getWuXing().getName().equals("水");

    }




}
