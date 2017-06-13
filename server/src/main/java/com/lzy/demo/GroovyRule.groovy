package com.lzy.demo

/**
 * http://www.groovy-lang.org/syntax.html
 * http://www.groovy-lang.org/operators.html
 * Created by bukeyan on 2017/6/7.
 */
class GroovyRule {

    def testDemo(){

        def heterogeneous = [1, "a", true] //	Our list here contains a number, a string and a boolean value
        String[] arrStr = ['Ananas', 'Banana', 'Kiwi']

        assert arrStr instanceof String[]
        assert !(arrStr instanceof List)

        def key = 'name'
        def person = [key: 'Guillaume']

        assert !person.containsKey('name')
        assert person.containsKey('key')
        person = [(key): 'Guillaume']

        assert person.containsKey('name')
        assert !person.containsKey('key')

//        def list =[]
//        def map = [:]
////        map."中文" = "法司"
//        map.put('with-dash-signs-and-single-quotes',"ALLOWED")
//
//
////        // a standalone single line comment
////        println "hello" // a comment till the end of the line
////        /* a standalone multiline comment
////   spanning two lines */
////        println "hello" /* a multiline comment starting
////                   at the end of a statement */
////        println 1 /* one */ + 2 /* two */
//        println map;
//        list.add(map);
//        println list;
//        assert map instanceof Map
//        return map;
    }
    def matchRule(BaZi bazi,CommonAlgorithm commonAlgorithm) {


        def resultList=[];
        def resultMap={};
        def gan = bazi.getRiGan();
        def ganZhengYin = commonAlgorithm.getShiShenTianGan(gan, "正印");
//        def zhi = commonAlgorithm.getTianGanChangShengJue(ganZhengYin, "禄");

        def zhi = bazi.getShiShenChangShengJue("正印","禄");

        def frequency = bazi.getDiZhiFrequency(zhi);

//        resultMap.put("马化龙据","甲子年丙子时")
//        resultMap.put("蛇化青龙龙据","甲子年丙子时")
//        resultList.add(String.format("%s: %d", "主刑", 1))
//        resultList.add("主法死:"+"规则是甲子日甲子时")

//        String result="";
//        String nianzhu = bazi.getNianZhu();
//        String yuezhu = bazi.getYueZhu();
//        String rizhu = bazi.getRiZhu();
//        String shizhu = bazi.getShiZhu();
//        if(rizhu=="甲子" || shizhu=="甲子"){
//            if(yuezhu.equals("乙卯")){
//                result+="主刑";
//            }else if(yuezhu.equals("乙巳")){
//                result+="主法死";
//            }
//
//        }
        return resultList
    }
}
