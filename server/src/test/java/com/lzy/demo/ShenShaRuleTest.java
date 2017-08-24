package com.lzy.demo;

import com.lzy.core.BaZi;
import com.lzy.core.CommonAlgorithm;
import com.lzy.rule.ShenShaRule;
import org.junit.Test;

/**
 * 神煞规则测试用例
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class ShenShaRuleTest {

    CommonAlgorithm commonAlgorithm = new CommonAlgorithm();

    @Test
    public void tianhuosha(){

        BaZi baZi = new BaZi("丙寅","甲午","丙戌","丁酉");
        baZi.setYun("戊","戌");
        baZi.setLiuNian("壬","寅");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }

    @Test
    public void jifengsha(){

        BaZi baZi = new BaZi("甲午","丙寅","甲辰","甲子");
//        baZi.setYun("戊","戌");
//        baZi.setLiuNian("壬","寅");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }







}