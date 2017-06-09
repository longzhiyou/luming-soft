package com.lzy.demo;

import org.junit.Test;
import org.raistlic.common.permutation.Combination;
import org.raistlic.common.permutation.Permutation;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/**
 * 排列组合测试类
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class PermutationCombinationTest {


    //问题一： 有三个字符串 "a", "b", "c"，进行排列，列出共有多少种排列方式
    @Test
    public void testPermutation(){

        Permutation<String> stringPermutation = Permutation.of(Arrays.asList("亥", "卯", "未"));
        BigInteger permutationCount = stringPermutation.getPermutationCount();
        System.out.println(permutationCount);
        for(List<String> list : Permutation.of(Arrays.asList("亥", "卯", "未"))){

            System.out.println(list);
        }

    }

    //问题三： 从五个数 1, 2, 3, 4, 5 中任取 3 个数进行排列，列出共有多少种排列方式
    @Test
    public void testPermutation1(){
        for(List<String> list : Permutation.of(Arrays.asList("子", "子", "戌", "卯"), 3))
            System.out.println(list);
    }


    @Test
    public void testPermutationTianGan(){
        for(List<String> list : Permutation.of(Arrays.asList("甲", "乙", "丙", "丁",
                "戊", "己",
                "庚", "辛", "壬", "癸"), 2))
            System.out.println(list);
    }

    @Test
    public void testCombinationTianGan(){
        for(List<String> list : Combination.of(Arrays.asList("甲", "乙", "丙", "丁",
                "戊", "己",
                "庚", "辛", "壬", "癸"), 2))
            System.out.println(list);
    }


    //从五个数 1, 2, 3, 4, 5 中任取 3 个数，列出共有多少种取法
    @Test
    public void testCombination(){
        for(List<String> list : Combination.of(Arrays.asList("子", "子", "戌", "卯"), 3))
            System.out.println(list.toString());
    }


}