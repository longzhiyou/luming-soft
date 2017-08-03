package com.lzy.demo;

import com.lzy.core.CommonAlgorithm;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class CommonAlgorithmTest {


    CommonAlgorithm commonAlgorithm = new CommonAlgorithm();

    @Test
    public void testCommonAlgorithm(){


        String nian="亥";
        String yue="寅";
        String ri="辰";
        String shi="子";

        String yun="丑";
        String liunian="申";
        String jia="卯";

        Set<String> result=commonAlgorithm.getDiZhiSanHui(Arrays.asList(nian,yue,ri,shi,yun,liunian
        ,jia));

        System.out.println("三会:"+result.toString());

//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < 10; j++) {
//                String str = String.format("日干:%s   它干:%s    十神:%s",
//                        commonAlgorithm.listTianGan.get(i)
//                        ,commonAlgorithm.listTianGan.get(j)
//                        ,commonAlgorithm.tableShiShen[i][j]);
//                System.out.println(str);
//            }
//
//        }

//        for (int i = 11; i >= 0; i--) {
//
//            System.out.print(String.format("\"%s\",\t",commonAlgorithm.listDiZhi.get(i)));
//        }

//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < 12; j++) {
//                String str = String.format("%s\t%s\t%s",
//                        commonAlgorithm.listTianGan.get(i)
//                        ,commonAlgorithm.listChangShengJue.get(j)
//                        ,commonAlgorithm.tableTianGanChangShengJue[i][j]);
//                System.out.println(str);
//            }
//
//        }

//        String liuqin = commonAlgorithm.getShiShen("甲", "丙");
//        liuqin = commonAlgorithm.getShiShen("癸", "丙");
//        Assert.assertEquals("食",liuqin);



    }
    @Test
    public void testYiXun(){
        Boolean yiXun = commonAlgorithm.isYiXun("甲申", "庚寅");
        Assert.assertTrue(yiXun);

    }


    @Test
    public void changshengjue(){
//        commonAlgorithm.getTianGanChangShengJue("乙","刃");

//        commonAlgorithm.getShiShenDiZhi("甲","正财");
        String wuXing = commonAlgorithm.getJiaZiWuXing("甲子");
        String wuXingChangShengJueName = commonAlgorithm.getWuXingChangShengJueName(wuXing, "亥");
        System.out.println(wuXingChangShengJueName);
//        Assert.assertEquals("长生",wuXingChangShengJueName);

    }



    @Test
    public void testIsTianGanKe() {

        boolean tianGanKe = commonAlgorithm.isTianGanKe("戊", "庚");
//        Assert.assertTrue(tianGanKe);
    }

    @Test
    public void testIsTianGanHe() {

        boolean tianGanHe = commonAlgorithm.isTianGanHe("庚","乙");
//        Assert.assertTrue(tianGanHe);
    }


    @Test
    public void testIsDiZhiSanHe(){
        String s1="亥";
//        List<String> strings = Arrays.asList(s1, "未", "卯");
//        boolean containsKey = commonAlgorithm.mapDiZhiSanHe.containsKey(strings.toString());

        boolean containsKey = commonAlgorithm.isDiZhiSanHe(s1, "未", "卯");
//        Assert.assertTrue(containsKey);
    }


    @Test
    public void testIsShuangChong(){

        boolean containsKey = commonAlgorithm.isShuangChong("甲子", "戊午");
//        Assert.assertTrue(containsKey);
    }

    @Test
    public void testIsShuangHe(){

        boolean containsKey = commonAlgorithm.isShuangHe("甲子", "丁丑");
//        Assert.assertTrue(containsKey);
    }

    @Test
    public void testNaYinKe(){

        boolean ke = commonAlgorithm.isNaYinWuXingKe("丙寅", "甲子");
//        Assert.assertTrue(ke);
    }

    @Test
    public void getAnDai(){

        String anDai = commonAlgorithm.getAnDai("戊", "甲", "子", "寅");
//        Assert.assertTrue(ke);
    }





}