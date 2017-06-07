package com.lzy.demo;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
}