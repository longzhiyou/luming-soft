package com.lzy.demo;

import groovy.lang.GroovyShell;
import groovy.lang.Script;

import java.io.IOException;

/**
 * User: longzhiyou
 * Date: 2017/6/7
 * Time: 19:32
 */
public class TestGroovyShell {
    public static void test() {
        GroovyShell shell = new GroovyShell();
        String scriptText = "def mul(x, y) { x * y }\nprintln mul(5, 7)";

        while (true) {
            Script script = shell.parse(scriptText);
            Object result = script.run();
        }
    }

    public static void main(String[] args) {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        test();
    }
}
