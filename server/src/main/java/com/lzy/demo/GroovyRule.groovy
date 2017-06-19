package com.lzy.demo

/**
 * http://www.groovy-lang.org/syntax.html
 * http://www.groovy-lang.org/operators.html
 * Created by bukeyan on 2017/6/7.
 */
class GroovyRule {

    def matchWuXingJingJiRule(BaZi bazi,CommonAlgorithm commonAlgorithm){
        def mapResult = [:]
        def  nianGan = bazi.getNianGan()
        def nianZhi = bazi.getNianZhi()
        def nianZhu = bazi.getNianZhu()

        def yueGan = bazi.getYueGan()
        def yueZhi =bazi.getYueZhi()
        def yueZhu = bazi.getYueZhu()

        def riGan = bazi.getRiGan()
        def riZhi = bazi.getRiZhi()
        def riZhu = bazi.getRiZhu()

        def shiGan = bazi.getShiGan()
        def shiZhi = bazi.getShiZhi()
        def shiZhu = bazi.getShiZhu()
        //荣神格
        def matchStr = yueZhi+riGan+shiGan
        def rongshenge = [
                "寅甲乙","寅乙甲","卯甲乙","卯乙甲",
                "巳丙丁","巳丁丙","午丙丁","午丁丙",
                "申庚辛","申辛庚","酉庚辛","酉辛庚",
                "亥壬癸","亥癸壬","子壬癸","子癸壬",
                "辰戊己","辰己戊","戌戊己","戌己戊",
                "丑戊己","丑己戊","未戊己","未己戊"
        ]

        if (rongshenge.contains(matchStr)) {
            mapResult["荣神格"]="春甲乙日时、夏丙丁日时、秋庚辛日时、冬壬癸日时、四季戊己日时 主人心明，日时全见者足寿，富贵多权。（神白经）"
        }
        mapResult;


    }
    def testDemo(){

        for (i in 0..4) {
            println "hello$i"
        }
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
        def map = [:]
        map["中文"] = "法司"
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
        println map;
//        list.add(map);
//        println list;
//        assert map instanceof Map
//        return map;
    }

    //def bazi, def commonAlgorithm
    def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {


        def isYangGan = commonAlgorithm.isYangGan("甲");
        def mapResult = [:]
        def  nianGan = bazi.getNianGan()
        def nianZhi = bazi.getNianZhi()
        def nianZhu = bazi.getNianZhu()

        def yueGan = bazi.getYueGan()
        def yueZhi =bazi.getYueZhi()
        def yueZhu = bazi.getYueZhu()

        def riGan = bazi.getRiGan()
        def riZhi = bazi.getRiZhi()
        def riZhu = bazi.getRiZhu()

        def shiGan = bazi.getShiGan()
        def shiZhi = bazi.getShiZhi()
        def shiZhu = bazi.getShiZhu()
        //荣神格
        def matchStr = yueZhi+riGan+shiGan
        def rongshenge = [
                "寅甲乙","寅乙甲","卯甲乙","卯乙甲",
                "巳丙丁","巳丁丙","午丙丁","午丁丙",
                "申庚辛","申辛庚","酉庚辛","酉辛庚",
                "亥壬癸","亥癸壬","子壬癸","子癸壬",
                "辰戊己","辰己戊","戌戊己","戌己戊",
                "丑戊己","丑己戊","未戊己","未己戊"
        ]

        if (rongshenge.contains(matchStr)) {
            mapResult["荣神格"]="春甲乙日时、夏丙丁日时、秋庚辛日时、冬壬癸日时、四季戊己日时 主人心明，日时全见者足寿，富贵多权。（神白经）"
        }
        mapResult;


    }
}
