package com.lzy.demo;

import com.lzy.core.BaZi;
import com.lzy.core.CommonAlgorithm;
import com.lzy.rule.theory.LiangXiangRunRule;
import com.lzy.rule.NianShiRule;
import com.lzy.rule.ShiZhanRule;
import com.lzy.rule.theory.WuXingJingJiRule;
import org.junit.Test;

import javax.script.ScriptException;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class BaZiTest {


    CommonAlgorithm commonAlgorithm = new CommonAlgorithm();
//    ImmutableList<String> gan = ImmutableList.of("甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸");

    @Test
    public void testGroovyRule(){
        GroovyRule groovyRule = new GroovyRule();
        groovyRule.testDemo();
    }

    @Test
    public void testCommonAlgorithm(){



//        CommonAlgorithm.getTianGanHeWuXing("甲","戊");
//        CommonAlgorithm.getJiaZiWuXing("甲子");

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
    public void testNianShiRule(){
        BaZi baZi = new BaZi("甲子","戊戌","丁申","己亥");

        NianShiRule rule = new NianShiRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("GroovyRule:"+result.toString());
    }

    @Test
    public void wuxingjingji(){
//        BaZi baZi = new BaZi("辛酉","乙亥","癸巳","癸卯");
        BaZi baZi = new BaZi("甲子","戊戌","丁申","癸未");

        WuXingJingJiRule wuXingJingJiRule = new WuXingJingJiRule();
        Object result = wuXingJingJiRule.matchRule(baZi,commonAlgorithm);
        System.out.println("GroovyRule:"+result.toString());
    }

    @Test
    public void liangxiangrun(){
//        BaZi baZi = new BaZi("辛酉","乙亥","癸巳","癸卯");
        BaZi baZi = new BaZi("甲子","戊戌","丁申","癸未");

        LiangXiangRunRule rule = new LiangXiangRunRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("GroovyRule:"+result.toString());
    }

    @Test
    public void shizhan(){
//        BaZi baZi = new BaZi("辛酉","乙亥","癸巳","癸卯");
        BaZi baZi = new BaZi("乙丑","戊戌","己丑","己丑");
//        baZi.setYun("己","丑");
        baZi.setYunZhu("己丑");
        baZi.setLiunianZhu("甲子");

        ShiZhanRule rule = new ShiZhanRule();
        Object result = rule.matchRule(baZi,commonAlgorithm);
        System.out.println("GroovyRule:"+result.toString());
    }



    @Test
    public void testBaZi() throws Exception {

//        int indexOf = gan.indexOf("癸");
//
//        Assert.assertEquals(0,indexOf);

//        BaZi baZi = new BaZi("甲","子","丙","子","甲","子","辛","卯");
        BaZi baZi = new BaZi("甲子","乙卯","甲子","戊申");
        baZi.setYun("丁","卯");
        baZi.setLiuNian("癸","酉");
//        boolean wuXingQueYi = baZi.isWuXingQueYi();
        String queYiWuXing = baZi.getQueYiWuXing();
//        CommonAlgorithm commonAlgorithm = new CommonAlgorithm();

//        baZi.getDiZhiShiShenCount("枭");
//
        GroovyRule groovyRule = new GroovyRule();

        Object result = groovyRule.matchRule(baZi,commonAlgorithm);
        System.out.println("GroovyRule:"+result.toString());


//        baZi.matchSanHe("巳","酉","丑1");
//        Integer ret=1;
//        Assert.assertEquals(ret,baZi.nianGanMatch("甲"));
//        Assert.assertEquals(ret,baZi.nianZhiMatch("子"));
//        Assert.assertEquals(ret,baZi.yueGanMatch("丙"));
//        Assert.assertEquals(ret,baZi.yueZhiMatch("子"));
//        Assert.assertEquals(ret,baZi.riGanMatch("丙"));
//        Assert.assertEquals(ret,baZi.riZhiMatch("戌"));
//        Assert.assertEquals(ret,baZi.shiGanMatch("辛"));
//        Assert.assertEquals(ret,baZi.shiZhiMatch("卯"));


    }

    @Test
    public void testLogic(){

//        List<BaziAlgorithm> baziAlgorithms = new ArrayList<>();
//        //初始化
//        baziAlgorithms.add(new WuXingQueYi());
//        baziAlgorithms.add(new AllYinYang());
//
//        for (BaziAlgorithm baziAlgorithm : baziAlgorithms) {
//            ComputedResult compute = baziAlgorithm.compute();
//            if (compute!=null) {
//                System.out.println("【"+compute.getSubject()+"】");
//            }
//
//        }
    }


    /**
     * http://blog.csdn.net/atco/article/details/51144835
     * [2017-06-07 add by longzhiyou]
     */
    @Test
    public void testHelloScript() throws ScriptException {
//        ScriptEngineManager factory = new ScriptEngineManager();//step 1
//        ScriptEngine engine = factory.getEngineByName("JavaScript");//Step 2
//        engine.eval("print('Hello, Scripting')");//Step 3

    }
}