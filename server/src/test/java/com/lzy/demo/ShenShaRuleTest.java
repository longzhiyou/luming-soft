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

    @Test
    public void posha(){

        BaZi baZi = new BaZi("己卯","戊辰","甲子","庚午");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }

    @Test
    public void tianxingsha(){

        BaZi baZi = new BaZi("甲寅","戊辰","丙子","庚寅");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }

    @Test
    public void bingfu(){

        BaZi baZi = new BaZi("甲子","戊辰","甲戌","乙丑");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }

    @Test
    public void gujisha(){

        BaZi baZi = new BaZi("己巳","戊辰","甲戌","乙丑");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }

    @Test
    public void guanfusha(){

        BaZi baZi = new BaZi("戊寅","癸亥","癸未","己未");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }

    @Test
    public void guajiansha(){

        BaZi baZi = new BaZi("庚申","乙巳","辛酉","己巳");
        baZi.setYunZhu("己酉");
        baZi.setLiunianZhu("辛丑");

        ShenShaRule rule = new ShenShaRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("神煞测试结果:"+result.toString());

    }








}