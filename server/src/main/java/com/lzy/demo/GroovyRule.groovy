package com.lzy.demo

/**
 *
 * Created by bukeyan on 2017/6/7.
 */
class GroovyRule {

    def matchRule(BaZi bazi) {

        String result="";
        String nianzhu = bazi.getNianZhu();
        String yuezhu = bazi.getYueZhu();
        String rizhu = bazi.getRiZhu();
        String shizhu = bazi.getShiZhu();
        if(rizhu=="甲子" || shizhu=="甲子"){
            if(yuezhu.equals("乙卯")){
                result+="主刑";
            }else if(yuezhu.equals("乙巳")){
                result+="主法死";
            }

        }
        return result
    }
}
