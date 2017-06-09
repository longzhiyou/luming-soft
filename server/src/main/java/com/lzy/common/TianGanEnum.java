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
    
    TianGanEnum(String display, int value, YinYangEnum yinYang, WuXingEnum wuXing){
        this.display = display;
        this.yinYang = yinYang;
        this.wuXing = wuXing;
        this.value = value;
    }

    public String display(){
        return this.display;
    }

    public int value(){
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
            if (tiangan.display.equals(display)){
                return tiangan;
            }
        }
        return null;
    }

    public  static TianGanEnum getByValue(int value){
        for (TianGanEnum tiangan:TianGanEnum.values()){
            if (tiangan.value() == value){
                return tiangan;
            }
        }
        return null;
    }

    /**
     * 判断天干是否相合
     * @param gan1
     * @param gan2
     * @return
     */
    public  static boolean isHe(String gan1,String gan2){
        TianGanEnum tianGan1 = getTianGan(gan1);
        TianGanEnum tianGan2 = getTianGan(gan2);

        //合是相减绝对值等于5
        int ret = Math.abs(tianGan1.value()-tianGan2.value());
        return 5 == ret;

    }

    /**
     * 天干gan2是否克gan1
     * @param gan1 甲
     * @param gan2 庚 辛
     * @return
     */
    public  static boolean isKe(String gan1,String gan2){
        TianGanEnum tianGan1 = getTianGan(gan1);
        TianGanEnum tianGan2 = getTianGan(gan2);

        int ret = tianGan2.value()-tianGan1.value();
        ret=(ret+10)%10;

        /**
         * 如果gan1是阳干则是6或者7
         * 阴干则是5或者6
         * [2017-06-09 add by longzhiyou]
         */
        if (isYang(tianGan1)) {
            return 6 == ret || 7 == ret;
        }else {
            return 5 == ret || 6 == ret;
        }

    }

    public static boolean isYin(TianGanEnum gan){

        return gan.getYinYang().value()==0;

    }

    public  static boolean isYang(TianGanEnum gan){

        return gan.getYinYang().value()==1;

    }

    /**
     * 是否是五行木
     * @return
     */
    public  boolean isMu() {

        return this.getWuXing().getDisplay().equals("木");

    }

    /**
     * 是否是五行火
     * @return
     */
    public   boolean isHuo() {
        return this.getWuXing().getDisplay().equals("火");

    }

    /**
     * 是否是五行土
     * @return
     */
    public   boolean isTu() {

        return this.getWuXing().getDisplay().equals("土");

    }

    /**
     * 是否是五行金
     * @return
     */
    public   boolean isJin() {

//        TianGanEnum tianGan = getTianGan(gan);
        return this.getWuXing().getDisplay().equals("金");

    }

    /**
     * 是否是五行水
     * @return
     */
    public  boolean isShui() {

//        TianGanEnum tianGan = getTianGan(gan);
        return this.getWuXing().getDisplay().equals("水");

    }




}
