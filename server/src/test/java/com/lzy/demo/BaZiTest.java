package com.lzy.demo;

import org.junit.Assert;
import org.junit.Test;

import javax.print.DocFlavor;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class BaZiTest {


    @Test
    public void testBaZi() throws Exception {
        BaZi baZi = new BaZi("甲","子","丙","子","丙","戌","辛","卯");

        GroovyRule groovyRule = new GroovyRule();
        Object result = groovyRule.matchRule(baZi);
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
        ScriptEngineManager factory = new ScriptEngineManager();//step 1
        ScriptEngine engine = factory.getEngineByName("JavaScript");//Step 2
        engine.eval("print('Hello, Scripting')");//Step 3

    }
}