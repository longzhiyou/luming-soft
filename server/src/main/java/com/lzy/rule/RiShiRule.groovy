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

            ],

            "己丑":[
                    "甲子":["化贵"]
                    ,"庚午":["贵"]
                    ,"壬申":["高"]
                    ,"甲戌":["贵"]
                    ,"丙寅":["神白云火土象主贵有血疾"]


            ],
            "己卯":[
                    "丙寅":["平"]
                    ,"庚午":["贵"]
                    ,"甲戌":["高"]
                    ,"乙亥":["平"]



            ],
            "己巳":[
                    "甲子":["神白云土化主有福但不显"]
                    ,"庚午":["贵"]
                    ,"甲戌":["化贵"]
                    ,"乙亥":["平"]
            ],

            "己未":[
                    "甲子":["高"]
                    ,"庚午":["高"]
                    ,"丙寅":["神白云火土象主贵有血疾"]

            ],
            "己酉":[
                    "丙寅":["有用贵"]
                    ,"庚午":["贵"]



            ],
            "己亥":[
                    "丙寅":["神白云火木象主贵"]
                    ,"庚午":["贵"]
                    ,"壬申":["贵"]


            ],

            "庚子":[
                    "丙子":["贵"]
                    ,"甲申":["贵"]
                    ,"丁亥":["贵"]


            ],
            "庚寅":[
                    "丁丑":["平"]
                    ,"戊寅":["贵"]
                    ,"丁亥":["平"]

            ],
            "庚辰":[
                    "辛巳":["终蹇"]
                    ,"壬午":["发即死"]
                    ,"乙酉":["神白云金化主福厚"]


            ],
            "庚午":[
                    "丙子":["贵"]
                    ,"癸未":["贵"]
                    ,"甲申":["贵"]
                    ,"丁亥":["贵"]


            ],
            "庚申":[
                    "丁丑":["平"]
                    ,"甲申":["贵"]
                    ,"乙酉":["贵"]


            ],
            "庚戌":[
                    "丙子":["高"]
                    ,"戊寅":["贵"]
                    ,"壬午":["平"]
                    ,"癸未":["平"]
                    ,"甲申":["神白云金水带印主有清显之福"]


            ],
            "辛丑":[
                    "己丑":["孤"]
                    ,"戊子":["辛日见戊子时，谓之天庭清显气，辛酉得之最高。"]
                    ,"庚寅":["发即风疾"]
                    ,"癸巳":["化贵戒酒"]
                    ,"丙申":["化贵"]
                    ,"丁酉":["高"]
                    ,"己亥":["高"]


            ],
            "辛卯":[
                    "庚寅":["发即风疾"]
                    ,"戊子":["神白云金火化主有贵","辛日见戊子时，谓之天庭清显气，辛酉得之最高。"]
                    ,"丙申":["化贵"]

            ],
            "辛巳":[
                    "庚寅":["平"]
                    ,"戊子":["神白云金火象主贵","辛日见戊子时，谓之天庭清显气，辛酉得之最高。"]
                    ,"癸巳":["化贵"]
                    ,"甲午":["平"]
                    ,"丙申":["见血则福之兆"]
                    ,"丁酉":["平"]



            ],
            "辛未":[
                    "戊子":["贵","辛日见戊子时，谓之天庭清显气，辛酉得之最高。"]
                    ,"庚寅":["发即风疾"]
                    ,"丁酉":["贵"]
                    ,"丙申":["神白云金火乘合血乃福之先又水化主贵"]
                    ,"己亥":["贵"]


            ],
            "辛酉":[
                    "戊子":["神白云金化火主贵","辛日见戊子时，谓之天庭清显气，辛酉得之最高。"]
                    ,"庚寅":["贵"]
                    ,"壬辰":["平"]
                    ,"癸巳":["化贵戒酒"]
                    ,"丙申":["神白云水化主贵"]
                    ,"丁酉":["平"]

            ],
            "辛亥":[
                    "戊子":["贵","辛日见戊子时，谓之天庭清显气，辛酉得之最高。"]
                    ,"庚寅":["贵"]
                    ,"壬辰":["贵"]
                    ,"丁酉":["贵"]


            ],
            "壬子":[
                    "壬寅":["太虚","六壬日见壬寅时，名曰太虚，贵不久盛而祸生。"]
                    ,"辛亥":["贵"]


            ],
            "壬寅":[
                    "庚子":["贵"]
                    ,"壬寅":["太虚","六壬日见壬寅时，名曰太虚，贵不久盛而祸生。"]
                    ,"丁未":["神白云化木贵"]
                    ,"辛亥":["艰难"]


            ],
            "壬辰":[
                    "壬寅":["太虚","六壬日见壬寅时，名曰太虚，贵不久盛而祸生。"]
                    ,"甲辰":["水火血灾"]
                    ,"己酉":["高"]
                    ,"辛亥":["贵"]


            ],
            "壬午":[
                    "壬寅":["太虚","六壬日见壬寅时，名曰太虚，贵不久盛而祸生。"]
                    ,"癸卯":["高"]
                    ,"甲辰":["水火灾"]
                    ,"丁未":["平"]
                    ,"辛亥":["平"]


            ],
            "壬申":[
                    "壬寅":["太虚","六壬日见壬寅时，名曰太虚，贵不久盛而祸生。"]
                    ,"甲辰":["水火灾"]
                    ,"辛亥":["贵"]


            ],
            "壬戌":[
                    "壬寅":["太虚","六壬日见壬寅时，名曰太虚，贵不久盛而祸生。"]
                    ,"庚戌":["不利妻"]


            ],
            "癸丑":[
                    "甲寅":["贵"]
                    ,"丙辰":["平"]
                    ,"戊午":["财厚"]
                    ,"庚申":["高"]


            ],
            "癸卯":[
                    "癸丑":["平"]
                    ,"乙卯":["艰难"]
                    ,"辛酉":["平-时辰有误"]
                    ,"癸亥":["平-时辰有误"]


            ],
            "癸巳":[
                    "壬子":["平"]
                    ,"甲寅":["平"]
                    ,"庚申":["平"]


            ],
            "癸未":[
                    "甲寅":["贵"]
                    ,"丙辰":["高"]
                    ,"癸亥":["高"]

            ],
            "癸酉":[
                    "丙辰":["高"]
                    ,"庚申":["高"]
                    ,"癸亥":["高"]


            ],
            "癸亥":[
                    "壬子":["贵"]
                    ,"甲寅":["津梁高贵"]
                    ,"戊午":["贵"]
                    ,"庚申":["贵"]
                    ,"癸亥":["贵"]


            ]

        ]

        def rizhuinfo = mapRule.get(riZhu)
        if(rizhuinfo&&rizhuinfo.containsKey(shiZhu)){
            mapResult["【释日时贵格】"+riZhu+"日"+shiZhu+"时"] = rizhuinfo.get(shiZhu)
        }
//        释日时犯月中恶杀.日见杀主中年，时见杀主末死
        mapRule = [
                "甲子":[
                        "乙卯":["刑"]
                        ,"乙巳":["主法死"]

                ],
                "甲寅":[
                        "乙巳":["受刑"]
                        ,"丁亥":["旺中恶死"]

                ],
                "甲辰":[
                        "乙卯":["主刑折"]
                        ,"癸巳":["水火中死"]
                        ,"癸亥":["主凶死"]
                ],
                "甲午":[
                        "乙巳":["破祖夭"]
                        ,"乙亥":["自刑刀刃死"]
                        ,"癸亥":["旺中恶死"]
                ],
                "甲申":[
                        "乙卯":["夭"]
                        ,"丁巳":["死不全尸"]
                        ,"辛未":["神白云金化木主贵"]
                ],
                "甲戌":[
                        "乙卯":["犯刑"]
                        ,"乙亥":["主遭劫盗杀死"]

                ],



                "乙丑":[
                        "丙寅":["身不完死"]
                        ,"己未":["刑"]
                        ,"甲戌":["犯刑"]
                        ,"己丑":["大破凶"]

                ],
                "乙卯":[
                        "丁巳":["破祖凶"]
                        ,"戊申":["身不完死"]
                        ,"己酉":["恶死"]
                        ,"甲申":["化贵"]


                ],
                "乙巳":[
                        "甲寅":["刑"]
                        ,"壬辰":["刑夭"]
                        ,"乙酉":["下贱"]

                ],
                "乙未":[
                        "己未":["刑伤"]
                        ,"丙申":["身不完死"]
                        ,"己丑":["破祖恶死"]

                ],
                "乙酉":[
                        "戊寅":["大凶杀"]
                        ,"丁巳":["破祖贫"]
                        ,"乙酉":["金刃死"]
                ],
                "乙亥":[
                        "庚辰":["月刑"]
                        ,"乙酉":["破祖高贵中恶死"]
                ],



                "丙子":[
                        "丁巳":["夭"]
                        ,"己酉":["破家失土身贱"]


                ],
                "丙寅":[
                        "癸巳":["刑","恶死-重复"]
                        ,"乙酉":["大败"]


                ],
                "丙辰":[
                        "己巳":["凶死"]
                        ,"己亥":["自刑死"]
                        ,"癸丑":["破祖恶死"]


                ],
                "丙午":[
                        "丁巳":["恶死"]
                        ,"丁亥":["自刑恶死"]
                        ,"辛丑":["孤独"]

                ],
                "丙申":[
                        "癸巳":["中年刑"]
                        ,"乙酉":["破败"]


                ],
                "丙戌":[
                        "己亥":["死不全尸"]
                        ,"癸丑":["贫夭"]

                ],



                "丁丑":[
                        "戊寅":["夭"]
                        ,"辛丑":["破祖中年蹇"]
                        ,"戊申":["秀实"]


                ],
                "丁卯":[
                        "癸巳":["破祖凶死"]
                        ,"己未":["刑伤"]
                        ,"甲申":["刺面不完死"]



                ],
                "丁巳":[
                        "庚辰":["刑"]
                        ,"庚申":["大破"]
                        ,"辛酉":["刑破"]
                        ,"丙午":["平"]




                ],
                "丁未":[
                        "戊申":["夭"]
                        ,"庚戌":["刑"]
                        ,"辛丑":["刑凶"]



                ],
                "丁酉":[
                        "甲寅":["破败恶死"]
                        ,"癸巳":["离乡恶死"]
                        ,"乙酉":["刑死"]

                ],
                "丁亥":[
                        "庚寅":["恶死"]
                        ,"庚申":["身不全死"]
                        ,"辛酉":["破败"]

                ],


                "戊子":[
                        "乙卯":["刑"]
                        ,"癸巳":["旺中刑"]
                        ,"戊午":["旺中受刑"]

                ],
                "戊寅":[
                        "己巳":["刑"]
                        ,"辛酉":["凶"]
                        ,"己亥":["凶刑"]

                ],
                "戊辰":[
                        "戊辰":["自刑凶"]
                        ,"辛巳":["截路凶刑"]
                        ,"乙丑":["破败刑"]
                ],
                "戊午":[
                        "戊午":["身不全"]
                        ,"癸亥":["自刑夭"]

                ],
                "戊申":[
                        "己巳":["刑害"]
                        ,"戊午":["短夭伤六亲"]
                        ,"癸亥":["孤贫"]

                ],
                "戊戌":[
                        "戊午":["刺面短夭"]
                        ,"辛卯":["破败凶刑"]
                        ,"癸丑":["受刑"]

                ],

                "己丑":[
                        "甲寅":["贵中恶死"]
                        ,"丁未":["受刑"]
                        ,"丁丑":["破祖失乡恶死"]




                ],
                "己卯":[
                        "己巳":["破败凶死"]
                        ,"庚申":["血光恶死"]
                        ,"壬子":["刑害重"]




                ],
                "己巳":[
                        "壬寅":["受刑"]
                        ,"丁未":["刑伤"]
                        ,"癸酉":["夭"]
                ],


                "己未":[
                        "甲申":["身不完死"]
                        ,"丙子":["孤贫"]
                        ,"丁丑":["刑害"]


                ],
                "己酉":[
                        "庚寅":["破败恶死"]
                        ,"己巳":["凶恶"]
                        ,"戊戌":["孤单血光"]


                ],
                "己亥":[
                        "丙寅":["恶月-死"]
                        ,"壬申":["孤贫遭刑"]
                        ,"癸酉":["破凶"]


                ],


                "庚子":[
                        "己巳":["破贫"]
                        ,"癸未":["孤单"]
                        ,"己亥":["刑"]



                ],
                "庚寅":[
                        "癸酉":["破败凶"]
                        ,"辛亥":["血光"]
                        ,"甲子":["夭"]


                ],
                "庚辰":[
                        "乙巳":["破败刑"]
                        ,"乙酉":["旺中刑凶"]
                        ,"己丑":["破凶"]

                ],
                "庚午":[
                        "己巳":["破祖凶"]
                        ,"己亥":["破劫盗凶"]
                        ,"癸丑":["孤凶"]


                ],
                "庚申":[
                        "辛巳":["凶刑"]
                        ,"辛亥":["孤夭"]


                ],
                "庚戌":[
                        "乙巳":["凶破"]
                        ,"乙亥":["官灾多凶刑"]
                        ,"己丑":["破败凶"]





                ],
                "辛丑":[
                        "庚寅":["刺面凶"]
                        ,"癸未":["受刑"]
                        ,"癸丑":["破败孤凶"]



                ],
                "辛卯":[
                        "癸卯":["父母凶死"]
                        ,"辛巳":["大破凶"]
                        ,"壬申":["尸不全死"]


                ],
                "辛巳":[
                        "丙寅":["刑平"]
                        ,"乙巳":["先贫"]
                        ,"丁酉":["命不到三十"]

                ],
                "辛未":[
                        "庚申":["尸不全死"]
                        ,"壬子":["孤凶"]
                        ,"癸丑":["凶刑死"]

                ],
                "辛酉":[
                        "壬寅":["凶死"]
                        ,"辛巳":["大破祖凶"]
                        ,"庚戌":["凶死"]


                ],
                "辛亥":[
                        "丙寅":["尸不全死"]
                        ,"丙申":["失乡恶死"]
                        ,"丁酉":["失土恶死"]



                ],
                "壬子":[
                        "辛巳":["凶恶死"]
                        ,"辛亥":["大凶"]
                        ,"壬子":["刑"]

                ],
                "壬寅":[
                        "乙巳":["受刑"]
                        ,"丁酉":["大破祖恶死"]
                        ,"乙亥":["刑"]



                ],
                "壬辰":[
                        "丙辰":["夭死尸不全凶"]
                        ,"丁巳":["破祖孤"]
                        ,"辛丑":["大破刑"]

                ],
                "壬午":[
                        "丙午":["自刑多是非"]
                        ,"辛酉":["大破失乡恶死"]
                        ,"辛亥":["恶死"]



                ],
                "壬申":[
                        "乙巳":["受刑夭"]
                        ,"丁酉":["夭"]
                        ,"乙亥":["孤自刑"]


                ],
                "壬戌":[
                        "己酉":["孤单凶刑"]
                        ,"丁亥":["凶刑恶死"]
                        ,"辛丑":["刑"]


                ],
                "癸丑":[
                        "壬寅":["刑"]
                        ,"乙未":["刑"]
                        ,"庚戌":["刑"]
                        ,"乙丑":["下贱"]


                ],
                "癸卯":[
                        "甲辰":["凶刑孤"]
                        ,"丙申":["凶恶死"]
                        ,"癸丑":["刑"]



                ],
                "癸巳":[
                        "戊寅":["遭刑"]
                        ,"戊申":["受刑"]
                        ,"己酉":["乞丐"]


                ],
                "癸未":[
                        "壬申":["身不全凶"]
                        ,"庚申":["凶刑"]
                        ,"乙丑":["失土凶死"]
                ],
                "癸酉":[
                        "丙寅":["不全尸死"]
                        ,"乙巳":["大破凶死"]
                        ,"丁酉":["自缢死"]


                ],
                "癸亥":[
                        "戊寅":["死不全尸凶"]
                        ,"戊申":["孤贫"]
                        ,"己酉":["及告"]



                ]

        ]

        if(mapRule.get(riZhu).containsKey(yueZhu)){
            mapResult["【释日时犯月中恶杀,日见杀主中年】"+riZhu+"日"+yueZhu+"月"] = mapRule.get(riZhu).get(yueZhu)
        }

        if(mapRule.get(shiZhu).containsKey(yueZhu)){
            mapResult["【释日时犯月中恶杀,时见杀主末死】"+shiZhu+"时"+yueZhu+"月"] = mapRule.get(shiZhu).get(yueZhu)
        }



        return mapResult
    }
}