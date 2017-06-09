package com.lzy.common;

/**
 * 五行
 * 万物皆由水生，水极阴，阴极则阳生，所以冬至为阳之始，其月为子，数一
 * 阴极则阳生，所以夏至为阴之始，其月在午，数二
 * 日从东升，昼为阳，东方属木，所以数三
 * 日从西落，夜为阴，西方属金，数四
 * 土居中央，包含万物，数五
 * @author dzm
 */
public enum WuXingEnum {

    MU("木",1,3,8),
    HUO("火",2,2,7),
    TU("土",3,5,10),
    JIN("金",4,4,9),
    SHUI("水",5,1,6);
    
    private final String display;
    private final int value;
    private final int shengshu; //五行生数
    private final int chengshu; //五行生数

    WuXingEnum(String display, int value, int shengshu, int chengshu) {
        this.display = display;
        this.value = value;
        this.shengshu = shengshu;
        this.chengshu = chengshu;
    }

    public String getDisplay() {
        return display;
    }

    public int getValue() {
        return value;
    }

    public int getShengshu() {
        return shengshu;
    }

    public int getChengshu() {
        return chengshu;
    }
}
