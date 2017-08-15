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

       ;
        System.out.println("寅藏干:"+ CoreAlgorithm.getCangGan("寅"));
        boolean isCangGan = CoreAlgorithm.isCangGan("丙","寅");
        Assert.assertTrue(isCangGan);


    }


}