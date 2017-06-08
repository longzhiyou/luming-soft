package com.lzy.demo;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.*;

/**
 *
 * Created by bukeyan on 2017/6/7.
 */
public class HelloTest {

    @Test
    public void testHello() throws Exception {


        CommonAlgorithm commonAlgorithm = new CommonAlgorithm();


        Hello hello = new Hello();
        Object o = hello.sayHello(commonAlgorithm);
        System.out.println(o);

    }
}