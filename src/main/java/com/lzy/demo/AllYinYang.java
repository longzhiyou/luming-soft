package com.lzy.demo;

/**
 * 全阴全阳
 * User: longzhiyou
 * Date: 2017/6/7
 * Time: 16:13
 */
public class AllYinYang implements BaziAlgorithm{

    @Override
    public ComputedResult compute() {
        ComputedResult computedResult = new ComputedResult();
        computedResult.setSubject("全阴全阳");
        return computedResult;
    }
}
