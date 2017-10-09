package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 *  日时系统规则
 * Created by bukeyan on 2017/6/18.
 */
 class RiShiRule implements BaseRule{


     //释日时贵格

    @Override
     def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

        def mapResult = [:]
        def matchStr = ""
        def ruleValue ;
        def tempShow=""

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

        def listMingGan = bazi.getListMingGan()
        def listMingZhi = bazi.getListMingZhi()
        def listMingZhu = bazi.getListMingZhu()



        def yunGan = bazi.getYunGan()
        def yunZhu = bazi.getYunZhu()
        def liunianGan = bazi.getLiunianGan()

        def taiGan = bazi.getTaiGan()
        def taiZhi = bazi.getTaiZhi()
        def taiZhu = bazi.getTaiZhu()
        def luZhi = commonAlgorithm.getLuZhi(nianGan)

        def listMingTaiZhi = listMingZhi+taiZhi
        def listMingTaiGan = listMingGan+taiGan
        def listMingTaiZhu = listMingZhu+taiZhu

        /**
         *
         * 《五行精纪》第十卷释日时贵格，结尾小注云“以上注字有神白经云者，或是引用或是附入”，说明禄命法日时间断系统继承了《神白经》一书，《神白经》应当是禄命法日时断体系的第一个法源。
         * 《五行精纪》第十一卷释日时犯月中恶杀，结尾小注云“并宰公要诀”，说明日时结合月令断的方法是参考了《宰公要诀》一书。《宰公要诀》应当是禄命法日时断体系的第二个法源。
         */

        def mapRule = [
            "甲子":[
                     "丙寅":["居日禄"]
                    ,"己巳":["神白云化主贵"]
                    ,"辛未":["贵"]
                    ,"乙亥":["目疾"]
            ],
            "甲寅":[
                     "甲子":["高贵"]
                    ,"乙丑":["平"]
                    ,"丙寅":["贵"]
                    ,"戊辰":["平"]
                    ,"己巳":["平"]
                    ,"辛未":["神白云金化木主贵"]
            ],
            "甲辰":[
                     "乙丑":["贵主血"]
                    ,"丙寅":["神白云火木化主贵"]
                    ,"庚午":["主血"]
                    ,"甲戌":["贵"]
            ],
            "甲午":[
                    "甲子":["高"]
                    ,"辛未":["高"]
                    ,"壬申":["高"]
                    ,"癸酉":["孤"]
            ],
            "甲申":[
                    "丙寅":["平"]
                    ,"己巳":["贵"]
                    ,"辛未":["神白云金化木主贵"]
            ],
            "甲戌":[
                     "甲子":["平"]
                    ,"丙寅":["神白火木化主有厚福"]
                    ,"辛卯":["平"]
                    ,"乙亥":["平"]
            ],
            "乙丑":[
                     "戊寅":["高"]
                    ,"己卯":["高"]
                    ,"辛未":["始杂后纯"]
                    ,"甲申":["高"]
                    ,"乙酉":["高"]
                    ,"丁亥":["秀"]
            ],
            "乙卯":[
                     "丙子":["高"]
                    ,"己卯":["高"]
                    ,"壬午":["高"]
                    ,"甲申":["化贵"]

            ],
            "乙巳":[
                     "甲申":["化"]
                    ,"丙戌":["吉"]
                    ,"丁亥":["吉"]

            ],
            "乙未":[
                     "丙子":["平"]
                    ,"己卯":["贵-不确定"]
                    ,"丁亥":["贵"]

            ],
            "乙酉":[
                     "丙子":["贵"]
                    ,"己卯":["秀"]
                    ,"丁亥":["平"]
                    ,"庚辰":["神白云金化主有厚祸福"]
            ],
            "乙亥":[
                     "丙子":["化青赤主福"]
                    ,"庚辰":["平"]
                    ,"甲申":["神白云通乙庚之化主厚福"]
            ],
            "丙子":[
                     "壬辰":["印"]
                    ,"癸巳":["神白云水化主有福不宜饮酒"]
                    ,"己丑":["六丙日见己丑时主血灾疾"]

            ],
            "丙寅":[
                     "己丑":["神白云火土象主贵有血疾"]
                    ,"乙亥":["火土象主贵"]
                    ,"庚寅":["贵不久"]
                    ,"癸巳":["神白云火化主贵而无寿不宜饮酒"]

            ],
            "丙辰":[
                     "庚寅":["高"]
                    ,"甲午":["平"]
                    ,"己亥":["神白云火土化须发有福只寿短"]
                     ,"己丑":["六丙日见己丑时主血灾疾"]

            ],
            "丙午":[
                     "壬辰":["贵"]
                    ,"癸巳":["戒酒"]
                    ,"丙申":["主血火厄"]
                    ,"戊戌":["平"]
                    ,"己亥":["贵武"]
                     ,"己丑":["六丙日见己丑时主血灾疾"]
            ],
            "丙申":[
                     "戊子":["平"]
                     ,"己丑":["主血灾疾"]
                     ,"癸巳":["主血"]


            ],
            "丙戌":[
                     "己丑":["高武","主血灾疾"]
                    ,"辛卯":["神白云火大主福厚"]
                    ,"癸巳":["戒酒"]
                    ,"甲午":["平"]
                    ,"丙申":["高"]

            ],
            "丁丑":[
                     "壬寅":["化贵"]
                    ,"丙午":["平"]
                    ,"戊申":["秀实"]


            ],
            "丁卯":[
                     "壬寅":["贵"]
                    ,"甲辰":["不利陈献"]
                    ,"丙午":["平"]
                    ,"辛亥":["平"]


            ],
            "丁巳":[
                     "庚子":["平"]
                     ,"辛丑":["平"]
                     ,"壬寅":["平"]
                     ,"丙午":["平"]
                     ,"丁未":["夹禄"]


            ],
            "丁未":[
                     "壬寅":["神白云木化主贵"]
                    ,"丙午":["吉"]
                    ,"庚戌":["吉"]


            ],
            "丁酉":[
                     "壬寅":["神白云木化主贵"]
                    ,"甲辰":["平"]
                    ,"丙午":["平"]
                    ,"辛亥":["平"]


            ],
            "丁亥":[
                     "壬寅":["神白云木化主贵"]
                    ,"甲辰":["血疾"]
                    ,"丙午":["平"]

            ],
            "戊子":[
                     "甲寅":["贵"]
                    ,"乙卯":["神白云火木象主贵少寿"]
                    ,"丁巳":["贵"]
                    ,"戊午":["夏不镕铸"]

            ],
            "戊寅":[
                     "癸亥":["高"]
                     ,"丁巳":["高-不确定"]
                     ,"甲寅":["高-不确定"]


            ],
            "戊辰":[
                     "丁巳":["秀-不确定"]
                    ,"癸亥":["秀"]
                    ,"庚申":["秀-不确定"]
                    ,"乙卯":["神白云水木象主贵无寿"]

            ],
            "戊午":[
                     "甲寅":["化贵"]
                    ,"丁巳":["高贵"]
                    ,"癸亥":["贵"]

            ],
            "戊申":[
                     "壬子":["高"]
                    ,"丁巳":["平"]
                    ,"己未":["贵"]

            ],
            "戊戌":[
                     "乙卯":["贵"]
                    ,"丁巳":["贵"]
                    ,"己未":["贵平"]

            ]

        ]

        def rizhuinfo = mapRule.get(riZhu)
        if(rizhuinfo&&rizhuinfo.containsKey(shiZhu)){
            mapResult[riZhu+"日"+shiZhu+"时"] = rizhuinfo.get(shiZhu)
        }


        return mapResult
    }
}