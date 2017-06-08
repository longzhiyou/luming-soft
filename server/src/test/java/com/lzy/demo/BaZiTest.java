package com.lzy.demo;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.*;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class BaZiTest {


    @Test
    public void testBaZi() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try {
            //设定此人的西元时间为1980-01-13
            cal.setTime(sdf.parse("1980-01-13"));
            BaZi lunar = new BaZi(cal);
            System.out.println("此人农历的日期【"+lunar.toString()+"】");
            //此处是为了获取时间在中国的八字学说上的显示，此人是午时生的
            System.out.println("此人八字【"+lunar.getYearGanZhi(7)+"】");
            //获取生肖
            System.out.println("此人的农历生肖【"+lunar.animalsYear()+"】");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void testLogic(){

        List<BaziAlgorithm> baziAlgorithms = new ArrayList<>();
        //初始化
        baziAlgorithms.add(new WuXingQueYi());
        baziAlgorithms.add(new AllYinYang());

        for (BaziAlgorithm baziAlgorithm : baziAlgorithms) {
            ComputedResult compute = baziAlgorithm.compute();
            if (compute!=null) {
                System.out.println("【"+compute.getSubject()+"】");
            }

        }
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