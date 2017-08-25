package com.lzy.demo;

import com.lzy.core.CommonAlgorithm;
import com.lzy.core.CoreAlgorithm;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class CoreAlgorithmTest {



    @Test
    public void yinyang(){
        boolean yang = CoreAlgorithm.isYang("甲");
        Assert.assertTrue(yang);
        yang = CoreAlgorithm.isYang("丙");
        Assert.assertTrue(yang);
        yang = CoreAlgorithm.isYang("戊");
        Assert.assertTrue(yang);
        yang = CoreAlgorithm.isYang("庚");
        Assert.assertTrue(yang);
        yang = CoreAlgorithm.isYang("壬");
        Assert.assertTrue(yang);

        boolean yin = CoreAlgorithm.isYin("乙");
        Assert.assertTrue(yin);
        yin = CoreAlgorithm.isYin("丁");
        Assert.assertTrue(yin);
        yin = CoreAlgorithm.isYin("己");
        Assert.assertTrue(yin);
        yin = CoreAlgorithm.isYin("辛");
        Assert.assertTrue(yin);
        yin = CoreAlgorithm.isYin("癸");
        Assert.assertTrue(yin);

    }

    @Test
    public void canggan(){

        System.out.println("寅藏干:"+ CoreAlgorithm.getCangGan("寅"));
        boolean isCangGan = CoreAlgorithm.isCangGan("丙","寅");
        Assert.assertTrue(isCangGan);


    }

    @Test
    public void gongzhi(){

        Object gongZhi = CoreAlgorithm.getGongZhi("甲寅", "甲辰");
        Assert.assertNotNull(gongZhi);
        System.out.println("拱地支:"+ gongZhi);

        gongZhi = CoreAlgorithm.getGongZhi("甲戌", "甲寅");
        Assert.assertNotNull(gongZhi);
        System.out.println("三合拱地支:"+ gongZhi);


    }

    @Test
    public void jiazhu(){

        Object gongZhi = CoreAlgorithm.getJiaZhu("丙辰", "甲寅");
        Assert.assertNotNull(gongZhi);
        System.out.println("夹柱:"+ gongZhi);

//         gongZhi = CoreAlgorithm.getJiaZhu("壬戌", "庚申");
//        Assert.assertNotNull(gongZhi);
//        System.out.println("夹柱:"+ gongZhi);




    }

    @Test
    public void isYiXun(){

        boolean ret = CoreAlgorithm.isYiXun("壬戌", "癸亥");
        Assert.assertTrue(ret);

//         gongZhi = CoreAlgorithm.getJiaZhu("壬戌", "庚申");
//        Assert.assertNotNull(gongZhi);
//        System.out.println("夹柱:"+ gongZhi);




    }




}