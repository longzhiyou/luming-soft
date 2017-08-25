package com.lzy.core
/**
 *  核心算法
 * Created by bukeyan on 2017/6/18.
 */
class CoreAlgorithm {

    /**
     * 十干属性
     * 1.阴阳
     * 2.河图五行
     * 3.化气五行
     * [2017-08-15 add by longzhiyou]
     */
    static  ganAttribute=[
            "甲":[yinyang:"阳",wuxing:"木"],
            "乙":[yinyang:"阴",wuxing:"木"],
            "丙":[yinyang:"阳",wuxing:"火"],
            "丁":[yinyang:"阴",wuxing:"火"],
            "戊":[yinyang:"阳",wuxing:"土"],
            "己":[yinyang:"阴",wuxing:"土"],
            "庚":[yinyang:"阳",wuxing:"金"],
            "辛":[yinyang:"阴",wuxing:"金"],
            "壬":[yinyang:"阳",wuxing:"水"],
            "癸":[yinyang:"阴",wuxing:"水"]
    ]
    static boolean isYang(gan){
        def attribute = ganAttribute.get(gan)
        if (attribute&&attribute.yinyang=="阳") {
            return true
        }
        return false

    }
    static boolean isYin(gan){
        def attribute = ganAttribute.get(gan)
        if (attribute&&attribute.yinyang=="阴") {
            return true
        }
        return false

    }

    static boolean isMu(gan){
        def attribute = ganAttribute.get(gan)
        if (attribute&&attribute.wuxing=="木") {
            return true
        }
        return false

    }
    static boolean isHuo(gan){
        def attribute = ganAttribute.get(gan)
        if (attribute&&attribute.wuxing=="火") {
            return true
        }
        return false

    }
    static boolean isTu(gan){
        def attribute = ganAttribute.get(gan)
        if (attribute&&attribute.wuxing=="土") {
            return true
        }
        return false

    }
    static boolean isJin(gan){
        def attribute = ganAttribute.get(gan)
        if (attribute&&attribute.wuxing=="金") {
            return true
        }
        return false

    }
    static boolean isShui(gan){
        def attribute = ganAttribute.get(gan)
        if (attribute&&attribute.wuxing=="水") {
            return true
        }
        return false

    }

    //地支拱
    static  gongdizhi=[  "亥丑":"子",
                         "子寅":"丑",
                         "丑卯":"寅",
                         "寅辰":"卯",
                         "卯巳":"辰",
                         "辰午":"巳",
                         "巳未":"午",
                         "午申":"未",
                         "未酉":"申",
                         "申戌":"酉",
                         "酉亥":"戌",
                         "戌子":"亥",
                        //三合拱
                         "申辰":"子",
                         "寅戌":"午",
                         "亥未":"卯",
                         "巳丑":"酉"
                   ]

    /**
     *  获取拱支
     * [2017-08-25 add by longzhiyou]
     */
    static def getGongZhi(ganzhi1,ganzhi2){
        def zhi
        if (ganzhi1[0]==ganzhi2[0]) {
            def gong1 = gongdizhi.get(ganzhi1[1] + ganzhi2[1])
            def gong2 = gongdizhi.get(ganzhi2[1]+ganzhi1[1])
            if (gong1){
                zhi=gong1
            }else if (gong2){
                zhi=gong2
            }

        }
        zhi
    }

    static def jiazi = ["甲子","乙丑","丙寅","丁卯","戊辰","己巳","庚午","辛未","壬申","癸酉",
                        "甲戌","乙亥","丙子","丁丑","戊寅","己卯","庚辰","辛巳","壬午","癸未",
                        "甲申","乙酉","丙戌","丁亥","戊子","己丑","庚寅","辛卯","壬辰","癸巳",
                        "甲午","乙未","丙申","丁酉","戊戌","己亥","庚子","辛丑","壬寅","癸卯",
                        "甲辰","乙巳","丙午","丁未","戊申","己酉","庚戌","辛亥","壬子","癸丑",
                        "甲寅","乙卯","丙辰","丁巳","戊午","己未","庚申","辛酉","壬戌","癸亥"
    ]

    /**
     * 空亡
     * [2017-08-25 add by longzhiyou]
     */
    static def kongwang = [
            "甲子":"戌亥","乙丑":"戌亥","丙寅":"戌亥","丁卯":"戌亥","戊辰":"戌亥","己巳":"戌亥","庚午":"戌亥","辛未":"戌亥","壬申":"戌亥","癸酉":"戌亥",
            "甲戌":"申酉","乙亥":"申酉","丙子":"申酉","丁丑":"申酉","戊寅":"申酉","己卯":"申酉","庚辰":"申酉","辛巳":"申酉","壬午":"申酉","癸未":"申酉",
            "甲申":"午未","乙酉":"午未","丙戌":"午未","丁亥":"午未","戊子":"午未","己丑":"午未","庚寅":"午未","辛卯":"午未","壬辰":"午未","癸巳":"午未",
            "甲午":"辰巳","乙未":"辰巳","丙申":"辰巳","丁酉":"辰巳","戊戌":"辰巳","己亥":"辰巳","庚子":"辰巳","辛丑":"辰巳","壬寅":"辰巳","癸卯":"辰巳",
            "甲辰":"寅卯","乙巳":"寅卯","丙午":"寅卯","丁未":"寅卯","戊申":"寅卯","己酉":"寅卯","庚戌":"寅卯","辛亥":"寅卯","壬子":"寅卯","癸丑":"寅卯",
            "甲寅":"子丑","乙卯":"子丑","丙辰":"子丑","丁巳":"子丑","戊午":"子丑","己未":"子丑","庚申":"子丑","辛酉":"子丑","壬戌":"子丑","癸亥":"子丑"
    ]

    /**
     *  是否一旬,获取空亡相等
     * [2017-08-25 add by longzhiyou]
     */
    static boolean isYiXun(ganzhi1,ganzhi2){

        kongwang.get(ganzhi2) == kongwang.get(ganzhi1)

    }
    /**
     *  获取夹柱
     * [2017-08-25 add by longzhiyou]
     */
    static def getJiaZhu(ganzhi1,ganzhi2){
        def jiazhu
        def index1 = jiazi.indexOf(ganzhi1)
        def zhu1 = jiazi.get((index1+2)%60)
        if (zhu1==ganzhi2) {
            jiazhu = jiazi.get((index1+1)%60)
        }

        if (!jiazhu) {
            def index2 = jiazi.indexOf(ganzhi1)
            def zhu2 = jiazi[index2-2]
            if (zhu2==ganzhi2) {
                jiazhu = jiazi[index2-1]
            }
        }

        jiazhu
    }


    //天干入墓库
    static def rumu=[
            "乙":"未",
            "丁":"戌",
            "辛":"丑",
            "癸":"辰"
    ]

    //十干禄
    static  ganlu=[
            "甲":"寅",
            "乙":"卯",
            "丙":"巳",
            "丁":"午",
            "戊":"巳",
            "己":"午",
            "庚":"申",
            "辛":"酉",
            "壬":"亥",
            "癸":"子"
    ]

    //十干绝
    static  ganjue=[
            "甲":"申",
            "乙":"酉",
            "丙":"亥",
            "丁":"子",
            "戊":"亥",
            "己":"子",
            "庚":"寅",
            "辛":"卯",
            "壬":"巳",
            "癸":"午"
    ]

    //五行绝
    static  wuxingjue=[
            "木":"申",
            "火":"亥",
            "土":"亥",
            "金":"寅",
            "水":"巳"
    ]

    //支藏天干
    static  zhicangtiangan=[
            "子":"癸",
            "丑":"癸己辛",
            "寅":"丙甲戊",
            "卯":"乙",
            "辰":"乙戊癸",
            "巳":"戊丙庚",
            "午":"丁己",
            "未":"丁己乙",
            "申":"戊庚壬",
            "酉":"辛",
            "戌":"戊丁辛",
            "亥":"甲壬"
    ]

    static boolean isCangGan(gan,zhi){
        def attribute = zhicangtiangan.get(zhi)
        if (attribute&&attribute.contains(gan)) {
            return true
        }
        return false

    }

    static def getCangGan(zhi){
        zhicangtiangan.get(zhi)
    }

//    static  zhicangtiangan=[
//            "子":["癸"],
//            "丑":["癸","己","辛"],
//            "寅":["丙","甲","戊"],
//            "卯":["乙"],
//            "辰":["乙","戊","癸"],
//            "巳":["戊","丙","庚"],
//            "午":["丁","己"],
//            "未":["丁","己","乙"],
//            "申":["戊","庚","壬"],
//            "酉":["辛"],
//            "戌":["戊","丁","辛"],
//            "亥":["甲","壬"]
//    ]

    //四季
    static def siji=[

            "寅":"春",
            "卯":"春",
            "辰":"春",
            "巳":"夏",
            "午":"夏",
            "未":"夏",
            "申":"秋",
            "酉":"秋",
            "戌":"秋",
            "亥":"冬",
            "子":"冬",
            "丑":"冬"
    ]


    /**
     * 四联用神-子平秘钥p29
     *
     */

    /**
     * 调侯-穷通宝鉴兰江网评注
     * master: 主要调侯
     * minor: 次要用神
     * assist: 辅助
     * detail: 所有调侯
     * remark: 推理
     */
    static def tiaohou=[
            "甲寅":[master:"丙",minor:"庚",assist:"癸",detail:"丙癸,庚丁",remark:"调和气候为要。丙火为主。癸水为佐助.雨水后庚为主"],
            "甲卯":[master:"庚",minor:"丙丁",assist:"戊己",detail:"庚戊己丙丁",remark:"羊刃架杀，专用庚金，以戊己为辅佐。无庚用丙丁泄秀，不取制杀。"],
            "甲辰":[master:"庚",minor:"壬",assist:"丁",detail:"庚丁壬",remark:"用庚金必须丁火制之，伤官制杀。无庚用壬"],
            "甲巳":[master:"癸",minor:"",assist:"",detail:"癸庚丁",remark:"调和气候癸水为主。原局气润，庚丁为用"],
            "甲午":[master:"癸",minor:"",assist:"",detail:"癸庚丁",remark:"木性虚焦，癸水为主。无癸用丁，要行北运。木盛先庚，庚盛先丁"],
            "甲未":[master:"癸",minor:"",assist:"",detail:"癸庚丁",remark:"上半月同午月用癸。下半月用庚丁。"],
            "甲申":[master:"庚",minor:"",assist:"",detail:"庚丁壬",remark:"伤官制杀，无丁用壬"],
            "甲酉":[master:"庚",minor:"",assist:"",detail:"庚丙丁",remark:"用丁制杀，用丙调侯。丁丙并用为辅佐"],
            "甲戌":[master:"庚",minor:"",assist:"",detail:"庚壬癸甲丁",remark:"土旺者用甲木，木旺者用庚金，丁壬癸为辅佐"],
            "甲亥":[master:"庚",minor:"",assist:"",detail:"庚戊丙丁",remark:"用庚金必须丁火制之，用丙调侯。水旺用戊"],
            "甲子":[master:"丁",minor:"",assist:"",detail:"丁丙庚",remark:"木性生寒，丁先庚后。用丙调侯。必须支见巳寅为贵格"],
            "甲丑":[master:"丁",minor:"",assist:"",detail:"丁丙庚",remark:"丁火必不可少.丙通根巳寅。甲木为助。用庚劈甲引丁。"],

            "乙寅":[master:"",minor:"",assist:"",detail:"丙癸",remark:"取丙火解寒。略取癸水滋润。不宜困丙。火多用癸"],
            "乙卯":[master:"",minor:"",assist:"",detail:"丙癸",remark:"以癸滋木。以丙泄秀。"],
            "乙辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "乙丑":[master:"",minor:"",assist:"",detail:"",remark:""],


            "丙寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丙丑":[master:"",minor:"",assist:"",detail:"",remark:""],


            "丁寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "丁丑":[master:"",minor:"",assist:"",detail:"",remark:""],

            "戊寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "戊丑":[master:"",minor:"",assist:"",detail:"",remark:""],



            "己寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "己丑":[master:"",minor:"",assist:"",detail:"",remark:""],

            "庚寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "庚丑":[master:"",minor:"",assist:"",detail:"",remark:""],

            "辛寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "辛丑":[master:"",minor:"",assist:"",detail:"",remark:""],

            "壬寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "壬丑":[master:"",minor:"",assist:"",detail:"",remark:""],

            "癸寅":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸卯":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸辰":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸巳":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸午":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸未":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸申":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸酉":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸戌":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸亥":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸子":[master:"",minor:"",assist:"",detail:"",remark:""],
            "癸丑":[master:"",minor:"",assist:"",detail:"",remark:""]


    ]


}