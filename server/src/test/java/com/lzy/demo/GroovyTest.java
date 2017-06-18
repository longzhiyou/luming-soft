package com.lzy.demo;

import org.junit.Test;

import javax.script.*;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class GroovyTest {


    @Test
    public void runGroovyScript(){

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("groovy");


       String rule ="\n" +
               "\tdef testDemo(){\n" +
               "\t\t\tfor (i in 0..4) {\n" +
               "\t\t\t\t\tprintln \"hello$i\"\n" +
               "\t\t\t}\n" +
               "\t}\n" +
               "\n" +
               "def printDemo(){\n" +
               "\t\t\tfor (i in 0..4) {\n" +
               "\t\t\t\t\tprintln \"print$i\"\n" +
               "\t\t\t}\n" +
               "\t}" ;
        Object result = null;
        try {
            engine.eval(rule);
            Invocable inv = (Invocable) engine;

//            GroovyRuleTest groovyRuleTest = inv.getInterface(GroovyRuleTest.class);

//            groovyRuleTest.printDemo();
            try {
                result = inv.invokeFunction("printDemo");
            } catch (NoSuchMethodException e) {
                e.printStackTrace();

            }
        } catch (ScriptException e) {
            e.printStackTrace();

        }

    }




}