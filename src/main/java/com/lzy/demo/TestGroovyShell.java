package com.lzy.demo;

import groovy.lang.GroovyShell;
import groovy.lang.Script;
import groovy.util.GroovyScriptEngine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;

/**
 * Java动态调用脚本语言Groovy，完善接口配置
 * http://blog.csdn.net/hpym365/article/details/59732571
 * Groovy与Java集成常见的坑(转)
 * http://www.cnblogs.com/softidea/p/5122188.html
 * Groovy引发的PermGen区爆满问题定位与解决
 * http://xiongzheng.me/question/2015/01/02/groovy-permgen-out/
 * User: longzhiyou
 * Date: 2017/6/7
 * Time: 19:32
 */
public class TestGroovyShell {
    public static void test() {
        GroovyShell shell = new GroovyShell();
        String scriptText = "def mul(x, y) { x * y }\n println mul(5, 7)";

        Script script = shell.parse(scriptText);
        Object result = script.run();


    }

    public static void groovyScriptEngineExample () {

        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("groovy");
        String HelloLanguage = "def hello(language) {return \"Hello $language\"}";
        try {
            engine.eval(HelloLanguage);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        Invocable inv = (Invocable) engine;
        Object[] params = {new String("Groovy"),new String("Groovy1")};
        Object result = null;
        try {
            result = inv.invokeFunction("hello", params);
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assert result.equals("Hello Groovy");
        System.err.println(result);


    }

    public static void main(String[] args) {

        groovyScriptEngineExample();
//        test();
    }
}
