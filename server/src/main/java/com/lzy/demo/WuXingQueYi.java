package com.lzy.demo;

/**
 * 五行缺一
 * User: longzhiyou
 * Date: 2017/6/7
 * Time: 16:13
 */
public class WuXingQueYi implements BaziAlgorithm{

    @Override
    public ComputedResult compute() {
        ComputedResult computedResult = new ComputedResult();
        computedResult.setSubject("五行缺一");
        return computedResult;
    }
}
