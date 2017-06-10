package com.lzy.common;

/**
 * 阴阳
 * @author dzm
 */
public enum YinYangEnum {
    YIN("阴",0),
    YANG("阳",1);
    
    private final String name;
    private final int value;
    
    private YinYangEnum(String name, int value){
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
