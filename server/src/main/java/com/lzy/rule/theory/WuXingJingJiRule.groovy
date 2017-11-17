package com.lzy.rule.theory;

import com.lzy.core.BaZi;
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm
import com.lzy.rule.BaseRule

/**
 *  五行精纪规则
 * Created by bukeyan on 2017/6/18.
 */
public class WuXingJingJiRule  implements BaseRule{

    @Override
    public Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {
        def mapResult = [:]
        def mapRule = [:]
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

        //第一卷
        def mapNaYinLun=[
                "甲子":[
                        "戊申":"甲子从革之金，其气散，得戊申土相之，则吉。戊申乃金临官之地，土者更旺于子，必能生成"
                        ,"癸巳":"甲子从革之金，其气散，得癸巳水相之，则吉。癸巳系金生于巳，水旺于子，纳音各有所归，又为朝元禄"
                        ,"丁卯":"忌丁卯之火"
                        ,"丁酉":"忌丁酉之火"
                        ,"戊午":"忌戊午之火"
                ]

                ,"乙丑":[
                         "己丑":"乙丑自库之金，火不能克。盖退藏之金，苟无刑害冲破，未有不显荣者.独忌己丑之火"
                        ,"戊午":"乙丑自库之金，火不能克。盖退藏之金，苟无刑害冲破，未有不显荣者.独忌戊午之火"
                        ,"己未":"乙丑自库之金，火不能克。盖退藏之金，苟无刑害冲破，未有不显荣者.独忌己未之火"

                ]

                ,"丙寅":[
                         "甲寅":"丙寅赫牺之火，无水制之，则为燔灼炎烈之患，水不可遇，独爱甲寅之水，就位济之，又名朝元禄。"
                ]

                ,"丁卯":[
                         "乙卯":"丁卯伏明之火，气弱宜木生之，遇水则凶，乙卯水最毒。"
                         ,"乙酉":"丁卯伏明之火，气弱宜木生之，遇水则凶，乙酉水最毒。"
                ]

                ,"壬申":[
                         "丙申":"壬申临官之金，利见水土，若丙之火，则为灾害。"
                         ,"丙寅":"壬申临官之金，利见水土，若丙寅之火，则为灾害。"
                         ,"戊午":"壬申临官之金，利见水土，若戊午之火，则为灾害。"
                ]

                ,"癸酉":[
                        "丁酉":"癸酉坚成之金，火死于酉，见火何伤，惟忌丁酉火，就位克之。"
                ]

                ,"甲戌":[
                         "壬戌":"甲戌自库之火，不嫌众水，惟忌壬戌，所谓墓中受克，其患难逃。 "
                ]

                ,"乙亥":[
                         "己亥":"乙亥伏明之火，其气湮欎而不发，借己亥木生之，则精神旺相。"
                         ,"辛卯":"乙亥伏明之火，其气湮欎而不发，借辛卯木生之，则精神旺相。"
                         ,"己巳":"乙亥伏明之火，其气湮欎而不发，借己巳木生之，则精神旺相。"
                         ,"壬午":"乙亥伏明之火，其气湮欎而不发，借壬午木生之，则精神旺相。"
                         ,"癸未":"乙亥伏明之火，其气湮欎而不发，借癸未木生之，则精神旺相。"
                         ,"癸巳":"癸巳水，有之则不吉。"
                         ,"癸亥":"癸亥水，有之则不吉。"
                         ,"丙午":"丙午水，有之则不吉。"
                ]

                ,"丙子":[
                         "庚子":"丙子流衍之水，不忌众土，惟嫌庚子，乃旺中逢鬼，不祥莫大焉。 "
                ]

                ,"丁丑":[
                         "辛未":"丁丑福聚之水，忌辛未相刑破也。"
                         ,"丙辰":"丁丑福聚之水，忌丙辰相刑破也。"
                         ,"丙戌":"丁丑福聚之水，忌丙戌相刑破也。"
                ]

                ,"戊寅":[
                         "己亥":"戊寅受伤之土，最为无力，要生旺火，以资其气，忌己亥木克之，主短夭之凶。"
                         ,"庚寅":"戊寅受伤之土，最为无力，要生旺火，以资其气，忌庚寅木克之，主短夭之凶。"
                         ,"辛卯":"戊寅受伤之土，最为无力，要生旺火，以资其气，忌辛卯木克之，主短夭之凶。"
                ]

                ,"己卯":[
                         "丁卯":"己卯自死之土，抑有甚焉，贵得丁卯之火，由合而来，以致其福。"
                         ,"甲戌":"己卯自死之土，抑有甚焉，贵得甲戌之火，由合而来，以致其福。"
                         ,"乙亥":"己卯自死之土，抑有甚焉，贵得乙亥之火，由合而来，以致其福。"
                         ,"己未":"己卯自死之土，抑有甚焉，贵得己未之火，由合而来，以致其福。"
                ]

                ,"庚辰":[
                         "甲辰":"庚辰气聚之金，不用火制，其器自成，火盛反丧其器，病绝火无害。若甲辰火，恶不可言，亦不能克众木，益我气亦繁耳。"
                         ,"乙巳":"庚辰气聚之金，不用火制，其器自成，火盛反丧其器，病绝火无害。若乙巳火，恶不可言，亦不能克众木，益我气亦繁耳。"
                ]

                ,"辛巳":[
                         "丙寅":"辛巳自生之金，精神具足，体气完备，炎烈炽火而不忌，忌丙寅之火，盖金绝于寅而气散，复见生旺之火，焉可当之。"
                         ,"乙巳":"辛巳自生之金，精神具足，体气完备，炎烈炽火而不忌，忌乙巳之火，盖金生于巳而不能生而气散，复见生旺之火，焉可当之。"
                         ,"戊午":"辛巳自生之金，精神具足，体气完备，炎烈炽火而不忌，忌戊午之火，盖金败于午而气散，复见生旺之火，焉可当之。"
                ]

                ,"壬午":[
                         "甲午":"壬午柔和之木，枝干微弱，木能生火，却忌见火多，多则烬矣。虽生旺之金，亦不能伤，盖金就我败，得金反贵，水土盛者亦贵，惟忌甲午金伤之。"

                ]


                ,"癸未":[
                         "庚戌":"癸未自库之木，生旺尤佳，虽乙丑金不能冲破，各归其根，而不相犯，忌庚戌金。"
                         ,"乙未":"癸未自库之木，生旺尤佳，虽乙丑金不能冲破，各归其根，而不相犯，忌乙未金。"
                ]


                ,"甲申":[
                         "戊申":"甲申者自生之水，其气流衍，宜有所贵，亦藉金生，不忌众土，特嫌戊申之土。"
                         ,"庚子":"甲申者自生之水，其气流衍，宜有所贵，亦藉金生，不忌众土，特嫌庚子之土。"
                ]


                ,"乙酉":[
                         "己酉":"乙酉自败之水，假众金以相之，盖我气既弱，藉母以育，忌己酉之土，则夭折穷贱"
                         ,"乙卯":"乙酉自败之水，假众金以相之，盖我气既弱，藉母以育，忌乙卯之土，则夭折穷贱"
                         ,"戊申":"乙酉自败之水，假众金以相之，盖我气既弱，藉母以育，忌戊申之土，则夭折穷贱"
                         ,"庚子":"乙酉自败之水，假众金以相之，盖我气既弱，藉母以育，忌庚子之土，则夭折穷贱"
                         ,"辛丑":"乙酉自败之水，假众金以相之，盖我气既弱，藉母以育，忌辛丑之土，则夭折穷贱"
                ]


                ,"丁亥":[
                         "己亥":"丁亥临官之土，木不能克，嫌金多，须得火以生救之乃吉，忌己亥之木。"
                         ,"辛卯":"丁亥临官之土，木不能克，嫌金多，须得火以生救之乃吉，忌辛卯之木。"
                ]


                ,"己丑":[
                         "丙寅":"己丑水中之火，又曰神龙之火，遇水方贵，为六气之君可也。 " +
                                 "五行要论云：己丑为天将之火，又为天乙本家，含威福光厚之气，发越峻猛，贵极乘之，为将德，为魁名，而建功。" +
                                 "烛神经云：己丑胎养之火，其气渐隆，若遇丙寅戊午之火助之，可成济物之功。"
                         ,"戊午":"烛神经云：己丑胎养之火，其气渐隆，若遇丙寅戊午之火助之，可成济物之功。"
                ]


                ,"壬辰":[
                         "壬辰":"壬辰自库之水，若池沼水积之地，忌金来决破，若再见壬辰，是谓自刑，别辰无咎，遇多水土皆喜"
                         ,"壬戌":"壬辰自库之水，若池沼水积之地，忌金来决破，遇多水土皆喜，惟畏壬戌"
                         ,"癸亥":"壬辰自库之水，若池沼水积之地，忌金来决破，遇多水土皆喜，惟畏癸亥"
                         ,"丙子":"壬辰自库之水，若池沼水积之地，忌金来决破，遇多水土皆喜，惟畏丙子"
                ]


                ,"甲午":[
                         "丁卯":"甲午自败之金，亦曰强悍之金，遇火生旺，其器乃成，忌丁卯之火，凶。"
                         ,"丁酉":"甲午自败之金，亦曰强悍之金，遇火生旺，其器乃成，忌丁酉之火，凶。"
                         ,"戊子":"甲午自败之金，亦曰强悍之金，遇火生旺，其器乃成，忌戊子之火，凶。"
                ]


                ,"乙未":[
                         "己未":"乙未偏库之金，亦欲火制，而土生之，则福壮气聚，忌己未之火。"
                         ,"丙申":"乙未偏库之金，亦欲火制，而土生之，则福壮气聚，忌丙申之火。"
                         ,"丁酉":"乙未偏库之金，亦欲火制，而土生之，则福壮气聚，忌丁酉之火。"
                ]


                ,"丙申":[
                         "甲申":"丙申自病之火，其气极微，假木相助，其气方生，忌甲申之水。"
                         ,"乙酉":"丙申自病之火，其气极微，假木相助，其气方生，忌乙酉之水。"
                         ,"甲寅":"丙申自病之火，其气极微，假木相助，其气方生，忌甲寅之水。"
                         ,"乙卯":"丙申自病之火，其气极微，假木相助，其气方生，忌乙卯之水。"
                ]


                ,"丁酉":[
                         "甲申":"丁酉自死之火，其气极微，假木相助，其气方生，忌甲申之水。"
                         ,"乙酉":"丁酉自死之火，其气极微，假木相助，其气方生，忌乙酉之水。"
                         ,"甲寅":"丁酉自死之火，其气极微，假木相助，其气方生，忌甲寅之水。"
                         ,"乙卯":"丁酉自死之火，其气极微，假木相助，其气方生，忌乙卯之水。"
                ]


                ,"己亥":[
                         "辛亥":"己亥自生之木，根本繁盛，不忌众金，惟嫌辛亥之金"
                         ,"辛巳":"己亥自生之木，根本繁盛，不忌众金，惟嫌辛巳之金"
                         ,"癸酉":"己亥自生之木，根本繁盛，不忌众金，惟嫌癸酉之金"
                         ,"己卯":"己亥自生之木，根本繁盛，不忌众金，若见己卯土，未有不大贵。"
                         ,"丁未":"己亥自生之木，根本繁盛，不忌众金，若见丁未水，未有不大贵。"
                         ,"癸未":"己亥自生之木，根本繁盛，不忌众金，若见癸未木，未有不大贵。"
                ]

                ,"庚子":[
                         "壬申":"庚子厚德之土，能克众水,不忌他木，盖木至子无气，若遇壬申之金，谓之名位禄，其贵必矣。"
                ]

                ,"癸卯":[
                          "丙寅":"三命纂局云：癸卯自胎之金，若逢丙寅炉中之火不为鬼，以胎金炉中成器，必有高达。"
                         ,"丁卯":"三命纂局云：癸卯自胎之金，若逢丁卯炉中之火不为鬼，以胎金炉中成器，必有高达。"
                ]

                ,"甲辰":[
                         "戊辰":"甲辰偏库之火，多火助之吉，所谓同气相救，以资其不足，若见戊辰木生之为贵格"
                         ,"戊戌":"甲辰偏库之火，多火助之吉，所谓同气相救，以资其不足，若见戊戌木生之为贵格"
                         ,"壬辰":"甲辰偏库之火，多火助之吉，所谓同气相救，以资其不足，忌壬辰壬戌丙午丁未水最毒。"
                         ,"壬戌":"甲辰偏库之火，多火助之吉，所谓同气相救，以资其不足，忌壬戌水最毒。"
                         ,"丙午":"甲辰偏库之火，多火助之吉，所谓同气相救，以资其不足，忌丙午水最毒。"
                         ,"丁未":"甲辰偏库之火，多火助之吉，所谓同气相救，以资其不足，忌丁未水最毒。"
                ]

                ,"己酉":[
                          "丁卯":"己酉自败之土，其气不足，藉火以相助之。见丁卯火则吉"
                         ,"丁酉":"己酉自败之土，其气不足，藉火以相助之。见丁酉火则吉"
                         ,"辛卯":"己酉自败之土，其气不足，藉火以相助之。切忌死绝，畏辛卯木，灾蹇夭折。"
                         ,"辛酉":"己酉自败之土，其气不足，藉火以相助之。切忌死绝，畏辛酉木，灾蹇夭折。"
                ]

                ,"甲寅":[
                          "壬寅":"甲寅自病之水，虽然病，土不能克，盖干支二木，可以制土，若见壬寅之金则为优裕。"
                         ,"癸卯":"甲寅自病之水，虽然病，土不能克，盖干支二木，可以制土，若见癸卯之金则为优裕。"
                ]

                ,"乙卯":[
                         "壬寅":"乙卯自死之水，虽然死，土不能克，盖干支二木，可以制土，若见壬寅之金则为优裕。"
                        ,"癸卯":"乙卯卯自死之水，虽然死，土不能克，盖干支二木，可以制土，若见癸卯之金则为优裕。"
                ]

               ,"戊午":[
                         "壬寅":"乙卯自死之水，虽然死，土不能克，盖干支二木，可以制土，若见壬寅之金则为优裕。"
                        ,"癸卯":"乙卯卯自死之水，虽然死，土不能克，盖干支二木，可以制土，若见癸卯之金则为优裕。"
                ]

//               ,"乙卯":[
//                         "丙午":"戊午自旺之火，居离明之方，旺相之地，其气极盛，他水无伤，忌丙午天上之水。"
//                        ,"丁未":"戊午自旺之火，居离明之方，旺相之地，其气极盛，他水无伤，忌丁未天上之水。"
//                ]

               ,"己未":[
                         "丙午":"己未偏库之火，居离明之方，旺相之地，其气极盛，他水无伤，忌丙午天上之水。"
                        ,"丁未":"己未偏库之火，居离明之方，旺相之地，其气极盛，他水无伤，忌丁未天上之水。"
                ]

               ,"庚申":[
                         "甲申":"庚申金居木上，因金以成器，忌再见金，致毁其器，若见甲申水则入格也。"
                        ,"乙酉":"庚申金居木上，因金以成器，忌再见金，致毁其器，若见乙酉水则入格也。"
                ]


               ,"辛酉":[
                         "甲申":"辛酉金居木上，因金以成器，忌再见金，致毁其器，若见甲申水则入格也。"
                        ,"乙酉":"辛酉金居木上，因金以成器，忌再见金，致毁其器，若见乙酉水则入格也。"
                        ,"癸卯":"辛酉失位之木，木因金乡乘之者，涉世多艰，惟对以癸卯金，则刚柔相济，挺拔出群，决取巍科。"
                ]


        ]
        ruleValue= mapNaYinLun.get(nianZhu)
        if (ruleValue!=null) {
            if (ruleValue.containsKey(shiZhu)) {
                mapResult["第一卷,${nianZhu}人${shiZhu}时"]= ruleValue.get(shiZhu)
            }
            if (ruleValue.containsKey(riZhu)) {
                mapResult["第一卷,${nianZhu}人${riZhu}日"]=ruleValue.get(riZhu)
            }
        }




        //五虎遁禄干
        def mapDunLuGan=["甲":"丙","乙":"己","丙":"癸","丁":"丙"
                         ,"戊":"丁","己":"庚",
                         "庚":"甲","辛":"丁","壬":"辛","癸":"甲"]
        //天乙贵人
        def mapTianYi=["甲":"丑未" ,"戊":"丑未" ,"庚":"丑未",
                       "乙":"子申" ,"己":"子申" ,
                       "丙":"亥酉" ,"丁":"亥酉" ,
                       "壬":"巳卯" ,"癸":"巳卯" ,
                       "辛":"午寅"]
        //马
        def mapMa=[
                "寅":"申" ,"午":"申" ,"戌":"申",
                "申":"寅" ,"子":"寅" ,"辰":"寅",
                "巳":"亥" ,"酉":"亥" ,"丑":"亥",
                "亥":"巳" ,"卯":"巳" ,"未":"巳"]

        //截杀
        def mapJieSha=[
                "寅":"亥" ,"午":"亥" ,"戌":"亥",
                "申":"巳" ,"子":"巳" ,"辰":"巳",
                "巳":"寅" ,"酉":"寅" ,"丑":"寅",
                "亥":"申" ,"卯":"申" ,"未":"申"]


        /**
         * 第三卷
         * [2017-08-31 add by longzhiyou]
         */

        if (listMingZhi.contains(luZhi)) {
            mapResult["【十干不杂】"]=["经云：五音不杂无淫乱之性，合居禄位也。"
                                 ,"甲乙人在寅卯、丙丁人在巳午 庚辛人在申酉、壬癸人在亥子"]
        }

        //荣神格
        matchStr = yueZhi+riGan+shiGan
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

        //干神二字连格
        def erzilian = [
                ["甲乙","乙甲"],
                ["丙丁","丁丙"],
                ["庚辛","辛庚"],
                ["壬癸","癸壬"],
                ["戊己","己戊"]
        ]

        erzilian.each{dataList->
            if (dataList.contains(nianGan+yueGan) && dataList.contains(riGan+shiGan)) {
                mapResult["干神二字连格"]="如甲乙或丙丁两字分四柱也，然须五行不杂，乃贵。（鬼谷遗文）"
            }
        }

        //【喜神】
        def xishen = [
                "甲壬癸",
                "甲癸壬",
                "乙壬癸",
                "乙癸壬",

                "丙甲乙",
                "丙乙甲",
                "丁甲乙",
                "丁乙甲",

                "戊丙丁",
                "戊丁丙",
                "己丙丁",
                "己丁丙",

                "庚戊己",
                "庚己戊",
                "辛戊己",
                "辛己戊",

                "壬庚辛",
                "壬辛庚",
                "癸庚辛",
                "癸辛庚"
        ]
        matchStr = nianGan+riGan+shiGan
        if (xishen.contains(matchStr)) {
            mapResult["喜神"]="盖取十干遇生己之位也，谓甲遇壬见癸之类，水能生木，余准此，若人遇之，主有大福禄也。（三命铃）"
        }

        /**
         * 【三五连合格】
         * [2017-08-31 add by longzhiyou]
         */

//        顺挑连合
        def shunlianhe = ["甲乙丙","丙丁戊","戊己庚","庚辛壬","壬癸甲"]
        def tempData=["干神顺足亦非常，论此非常不可当，生旺相兼临贵格，定知君侧理阴阳。"
                      ,"三五连合者，自上至下，阴阳相和也。",
                        "两比干在上，一干在下，谓之顺挑连合.一干在上，两比干在下，谓之倒垂连合",
                        "倒垂相连，顺数为上，杂数次之，不犯他干，生旺相承，福禄相助，尤胜五行连珠格。（阎东叟书） "]
        if (shunlianhe.contains(nianGan+yueGan+riGan)) {
            mapResult["【三五连合格-顺挑连合-年月日三干】"]=tempData
        }

        if (shunlianhe.contains(nianGan+yueGan+shiGan)) {
            mapResult["【三五连合格-顺挑连合-年月时三干】"]=tempData
        }

        if (shunlianhe.contains(nianGan+riGan+shiGan)) {
            mapResult["【三五连合格-顺挑连合-年日时三干】"]=tempData
        }
        if (shunlianhe.contains(yueGan+riGan+shiGan)) {
            mapResult["【三五连合格-顺挑连合-月日时三干】"]=tempData
        }


        //倒垂者
        def daolianhe = ["癸甲乙","乙丙丁","丁戊己","己庚辛","辛壬癸"]
        if (daolianhe.contains(nianGan+yueGan+riGan)) {
            mapResult["【三五连合格-倒垂连合-年月日三干】"]=tempData
        }

        if (daolianhe.contains(nianGan+yueGan+shiGan)) {
            mapResult["【三五连合格-倒垂连合-年月时三干】"]=tempData
        }
        if (daolianhe.contains(nianGan+riGan+shiGan)) {
            mapResult["【三五连合格-倒垂连合-年日时三干】"]=tempData
        }
        if (daolianhe.contains(yueGan+riGan+shiGan)) {
            mapResult["【三五连合格-倒垂连合-月日时三干】"]=tempData
        }

        /**
         * 【神藏杀没格】
         * 甲庚丙壬、乙辛、丁癸，最为贵格，名曰神藏杀没。盖上天清气之盛者，如年月日时胎五位中合成，更有福神相助，
         无死绝冲破空亡，须贵极一品。
         * [2017-08-31 add by longzhiyou]
         */

        if (
            (listMingTaiGan.contains("甲")
            &&listMingTaiGan.contains("庚")
            &&listMingTaiGan.contains("丙")
            &&listMingTaiGan.contains("壬"))
                    || (listMingTaiGan.contains("乙")
                        &&listMingTaiGan.contains("辛")
                        &&listMingTaiGan.contains("丁")
                        &&listMingTaiGan.contains("癸"))
        ) {

            mapResult["【神藏杀没格】"]=["甲庚丙壬、乙辛丁癸，最为贵格，名曰神藏杀没。"
                                  ,"盖上天清气之盛者，如年月日时胎五位中合成，更有福神相助，无死绝冲破空亡，须贵极一品。"
                                  ,"若有冲破空亡而有福神相助，亦可为两制两省。"
                                  ,"如日时上不犯空亡，他处犯之，亦可为两府，然活不久。"
                                  ,"如不犯空亡，只犯死绝，可作卿监，仍多难而有好差遣，"
                                  ,"若无福神为助，不过一多难员正郎而已。"
                                  ,"不犯死绝，而犯冲破空亡，无福神助之者，亦可作馆职之格"
                                  ,"或死绝空亡，更无福神为之助，即碌碌不出州县耳。"
                                  ,"更有三刑六害，只作有名举人，或清高僧道，与富足百姓而已。（林开五命） "
                                  ,"阎东叟云：甲庚丙壬为阳干之吉会，乙辛丁癸为阴干之福源，六凶神至此而藏 "
                                  ,"玉霄宝鉴云：如甲庚丙壬全，必生居孟月者，方为入格。乙辛丁癸，必生居季月者，方为入格。不然非也。"
                                  ,"阎东叟云：甲庚丙壬为阳干之吉会，乙辛丁癸为阴干之福源，六凶神至此而藏 "



            ]
        }




        //【连珠粹美格】
        def lianzhuge = [
                "甲丙辛己",
                "甲丙戊庚",
                "甲己辛癸",
                "甲辛庚丙",
                "甲辛癸丙",

                "乙庚壬甲",
                "乙庚丁己",
                "乙癸丁壬",
                "乙庚丁辛",
                "乙戊甲癸",
                "乙戊甲庚",

                "丙戊癸辛",
                "丙辛癸乙",
                "丙戊庚壬",
                "丙癸壬戊",
                "丙乙丁辛",

                "丁己辛壬",
                "丁癸壬己",
                "丁己癸乙",
                "丁乙己戊",
                "丁壬己辛",

                "戊癸丁乙",
                "戊庚壬甲",
                "戊庚乙癸",

                "己辛甲癸",
                "己甲丙戊",
                "己甲丁壬",
                "己甲丁辛",
                "己辛癸乙",

                "庚乙丁己",
                "庚壬甲丙",
                "庚丁丙壬",

                "辛癸乙丙",
                "辛丙庚戊",
                "辛壬丙甲",
                "辛癸乙丁",
                "辛丙丁癸",

                "壬甲丙戊",
                "壬己戊甲",
                "壬丁己辛",

                "癸戊庚壬",
                "癸乙丁己",
                "癸戊己乙",
                "癸戊丙乙"
        ]

        matchStr = nianGan+yueGan+riGan+shiGan
        if (lianzhuge.contains(matchStr)) {
            mapResult["连珠粹美格"]="年月日时,一句唤就者为贵，更有吉杀，定为卿相。（广信集）"+matchStr
        }


        /**
         *  【福会】【官卿】
         * 福会者，取十干所生及所克是也，谓如甲木生丙火，克之戊土之类，如甲人见丙戊是也（他准此并与官卿同）。若人胎月
         * 日时遇之，主衣食丰足，官爵崇高，大小运行年至此，亦有迁官进财之喜。（三命指掌）
         * [2017-08-31 add by longzhiyou]
         */
        def guanqing = [
                "甲":["丙戊","甲随丙戊官卿泰"],
                "乙":["丁己","乙见丁己禄还生"],
                "丙":["戊庚","丙会戊庚年称遂"],
                "丁":["己辛","丁到己辛事皆成"],
                "戊":["庚壬","戊入庚壬门有庆"],
                "己":["辛癸","己逢辛癸职迁荣"],
                "庚":["壬甲","庚迁壬甲财丰足"],
                "辛":["癸乙","辛逢癸乙命先升"],
                "壬":["甲丙","壬逢甲丙无不喜"],
                "癸":["乙丁","癸入乙丁命高亨"]
        ]

        def strings = guanqing.get(nianGan)

        if (listMingTaiGan.contains(strings[0][0])&&listMingTaiGan.contains(strings[0][1])) {
            mapResult["官卿"]=strings[1]+" 取十干所生及所克是也，谓如甲木生丙火，克之戊土之类，如甲人见丙戊是也.胎月日时遇之，主衣食丰足，官爵崇高"
        }

        if ([yunGan,liunianGan].contains(strings[0][0])&&[yunGan,liunianGan].contains(strings[0][1])) {
            mapResult["官卿-运,流年"]=strings[1]+" 取十干所生及所克是也，谓如甲木生丙火，克之戊土之类，如甲人见丙戊是也.大小运行年至此，亦有迁官进财之喜。（三命指掌） "
        }




        //禄库
        mapRule=["甲":"未","乙":"未","丙":"戌","丁":"戌"
                 ,"戊":"辰","己":"辰",
                 "庚":"丑","辛":"丑","壬":"辰","癸":"辰"]

        if (listMingZhi.count(mapRule) >2) {
            mapResult["【禄库】"]=["甲乙库未丙丁戌，戊己壬癸辰中立，庚辛若向丑中行，一生衣食终须吉。"
                               ,"凡人生值此库，若年月日时皆有者，主两府台辅之贵，或落空亡亦吉。(八字金书)"]
        }

        ruleValue= mapRule.get(nianGan)
        if (shiZhi==ruleValue && commonAlgorithm.isNaYinWuXingKe(shiZhu,nianZhu)) {
            mapResult["禄库中有财-年时"]="岁干之墓谓之禄库，禄库中又带纳音为财者，乃禄库中有财，不惟贵，而又主富"
        }

        if (riZhi==ruleValue&& commonAlgorithm.isNaYinWuXingKe(riZhu,nianZhu)) {
            mapResult["禄库中有财-年日"]="岁干之墓谓之禄库，禄库中又带纳音为财者，乃禄库中有财，不惟贵，而又主富"
        }

        //【相合禄】
        mapRule=["甲":"己亥","乙":"庚戌","丙":"辛巳","丁":"壬午"
                 ,"戊":"癸巳","己":"甲午",
                 "庚":"乙巳","辛":"丙辰","壬":"丁亥","癸":"戊子"]
        ruleValue= mapRule.get(nianGan)
        if (shiZhu==ruleValue) {
            mapResult["【相合禄】时柱"]="年干和时干,地支六合年干禄支.禄若会见则富贵，相合则奋迅"
        }
        if (riZhu==ruleValue) {
            mapResult["【禄头财】日柱"]="年干和时干,地支六合年干禄支.禄若会见则富贵，相合则奋迅"
        }

        //【食神带禄】
        mapRule=["壬":"甲寅","癸":"乙卯","戊":"庚申","己":"辛酉"]
        ruleValue= mapRule.get(nianGan)
        if (shiZhu==ruleValue) {
            mapResult["【食神带禄】时柱"]="禄若会见则富贵，相合则奋迅"
        }
        if (riZhu==ruleValue) {
            mapResult["【食神带禄】日柱"]="禄若会见则富贵，相合则奋迅"
        }

        //【食神坐支合禄】
        mapRule=["甲":"丙申","乙":"丁未","丙":"戊申","丁":"己未","庚":"壬寅","辛":"癸丑"]
        ruleValue= mapRule.get(nianGan)
        if (shiZhu==ruleValue) {
            mapResult["【食神坐支合禄】时柱"]="年干食神坐支六合食神自己禄"
        }
        if (riZhu==ruleValue) {
            mapResult["【食神坐支合禄】日柱"]="年干食神坐支六合食神自己禄"
        }

        //【食神坐年干禄位】
        mapRule=["甲":"丙寅","乙":"丁卯"]
        ruleValue= mapRule.get(nianGan)
        if (shiZhu==ruleValue) {
            mapResult["【食神坐年干禄位】时柱"]="年干取食神，此食神坐年干禄位"
        }
        if (riZhu==ruleValue) {
            mapResult["【食神坐年干禄位】日柱"]="年干取食神，此食神坐年干禄位"
        }


        //【名位禄】
        def mingweilu = ["甲丙寅","乙丁卯","庚壬申","辛癸酉"]
        matchStr = nianGan+shiZhu
        if (mingweilu.contains(matchStr)) {
            mapResult["【名位禄】时柱"]="凡禄上带食神者是，如甲人见丙寅，谓之名位禄，皆为贵格，余仿此。（林开五命）"
        }
        matchStr = nianGan+riZhu
        if (mingweilu.contains(matchStr)) {
            mapResult["【名位禄】日柱"]="凡禄上带食神者是，如甲人见丙寅，谓之名位禄，皆为贵格，余仿此。（林开五命）"
        }

        //【生成禄】
        def shengchenglu = ["甲甲寅","乙乙卯","丙丁巳","丁戊午","戊丁巳","己戊午",
                            "庚庚申","辛辛酉","壬癸亥","癸壬子"]
        matchStr = nianGan+shiZhu
        if (shengchenglu.contains(matchStr)) {
            mapResult["【生成禄】时柱"]=matchStr
        }
        matchStr = nianGan+riZhu
        if (shengchenglu.contains(matchStr)) {
            mapResult["【生成禄】日柱"]=matchStr
        }

        //【真禄】五虎遁得到禄位天干,又得到此天干的禄位
        def zhenlu=["甲":"丙巳","乙":"己午","丙":"癸子","丁":"丙巳"
                    ,"戊":"丁午","己":"庚申",
                    "庚":"甲寅","辛":"丁午","壬":"辛酉","癸":"甲寅"]
        def zhenluValue = zhenlu.get(nianGan);
        if (listMingGan.contains(zhenluValue[0])&&listMingZhi.contains(zhenluValue[1])) {
            mapResult["【真禄】"]="更带福神，可作贵显科甲之格"+nianGan+zhenluValue
        }

        //【禄头财】
        mapRule=["甲":"戊寅","乙":"己卯","丙":"辛巳","丁":"庚午"
                    ,"戊":"癸巳","己":"壬午",
                    "庚":"甲申","辛":"乙酉","壬":"丁亥","癸":"丙子"]
        ruleValue= mapRule.get(nianGan);
        if (shiZhu==ruleValue) {
            mapResult["【禄头财】时柱"]="主人富有声望。古诗云：禄生于絪缛，因财反有名，君子荣显禄，常人主丰盈。"
        }
        if (riZhu==ruleValue) {
            mapResult["【禄头财】日柱"]="主人富有声望。古诗云：禄生于絪缛，因财反有名，君子荣显禄，常人主丰盈。"
        }


        //【禄头鬼】
        mapRule=["甲":"庚寅","乙":"辛卯","丙":"癸巳","丁":"壬午"
                 ,"戊":"乙巳","己":"甲午",
                 "庚":"丙申","辛":"丁酉","壬":"己亥","癸":"戊子"]
        ruleValue= mapRule.get(nianGan)
        if (shiZhu==ruleValue) {
            mapResult["【禄头鬼】时柱"]="又名赤舌杀，君子主甲科，常人口舌刑责，若别有贵救，主家世超越，三代富有，行年太岁遇之，主有灾。（广信录）"
        }
        if (riZhu==ruleValue) {
            mapResult["【禄头鬼】日柱"]="又名赤舌杀，君子主甲科，常人口舌刑责，若别有贵救，主家世超越，三代富有，行年太岁遇之，主有灾。（广信录）"
        }

        //【禄盈天府格】
        mapRule=["甲":"丙寅巳","乙":"己卯午","丙":"癸巳子","丁":"丙午巳"
                    ,"戊":"丁巳午","己":"庚午申",
                    "庚":"甲申寅","辛":"丁酉午","壬":"辛亥酉","癸":"甲子寅"]
        ruleValue= mapRule.get(nianGan)
        if (listMingZhu.contains(ruleValue[0,1])&&listMingZhi.contains(ruleValue[2])) {

            mapResult["【禄盈天府格】"]="福禄兼足,稍有福助之，五品之贵，一云重重福禄主富盛"
        }

        //【旬中禄格】
        def yuerishizhi = [yueZhi,riZhi,shiZhi]
        if (yuerishizhi.contains(luZhi)) {

            for(i in 1..3){
                def mingzhu = listMingZhu[i]
                if (luZhi==mingzhu[1]&& commonAlgorithm.isYiXun(nianZhu,mingzhu)) {
                    mapResult["【旬中禄格】"]="${nianZhu}年和${mingzhu}在一旬，福禄兼足,稍有福助之，五品之贵，一云重重福禄主富盛".toString()
                }
            }
        }

        //【暗禄格】五虎遁禄双六合
        mapRule=["甲":"辛亥","乙":"甲戌","丙":"戊申","丁":"辛未"
                 ,"戊":"壬申","己":"乙未",
                 "庚":"己巳","辛":"壬辰","壬":"丙寅","癸":"己丑"]
        ruleValue= mapRule.get(nianGan)
        tempShow ="此是上清暗合禄，不因师指若何知。${nianGan}人${ruleValue}"
        if (shiZhu==ruleValue) {
            mapResult["【暗禄格】时柱"]=tempShow.toString()
        }
        if (riZhu==ruleValue) {
            mapResult["【暗禄格】日柱"]=tempShow.toString()
        }

        //【天雄禄】甲人数至戊是五数，不必求戊，戊禄在巳，见巳即名天雄禄，更正禄加之为入格。（马子才命格）
        mapRule=["甲":"巳","乙":"午","丙":"申","丁":"酉"
                 ,"戊":"亥","己":"子",
                 "庚":"寅","辛":"卯","壬":"巳","癸":"午"]
        ruleValue= mapRule.get(nianGan)
        if (listMingZhi.contains(ruleValue)&& listMingZhi.contains(luZhi)) {
            mapResult["【天雄禄】"]="甲人数至戊是五数，不必求戊，戊禄在巳，见巳即名天雄禄，更正禄加之为入格。（马子才命格）"
        }

        //【天禄贵神】太岁本干不见禄，取五虎元遁，至禄上看得何干，真干见天乙贵神，而贵人所坐之干，复得贵于禄上者是也
        def dunLuShangGan = mapDunLuGan.get(nianGan)
        if (listMingGan.contains(dunLuShangGan)) {

            def tianyi = mapTianYi.get(dunLuShangGan)
            for(i in 0..1){
                if (listMingZhi.contains(tianyi[i])) {
                    for(j in 0..3){
                        if (tianyi[i]==listMingZhi[j]) {
                            //获取贵人所坐之干
                            if (mapTianYi.get(listMingGan[j]).contains(luZhi)) {
                                mapResult["【天禄贵神】"]="如更入格，贵极一品，常格得之，不下三品。（玉霄宝鉴）"
                            }

                        }
                    }
                }
            }


        }

        /**
         * 【禄堂】
         *  自来言禄，但知甲禄在寅之类，殊未知禄堂为最贵，甲人得甲戌是也，以其甲为岁干，则甲之本位遁在戌，若更得诸位
            福神助发，必须大贵。独辛壬有二位，辛有辛卯辛丑，壬有壬寅壬子，余皆一位。（李虚中书）
         * [2017-08-31 add by longzhiyou]
         */
        def lutang = ["甲甲戌","乙乙酉","丙丙申","丁丁未","戊戊午","己己巳","庚庚辰",
                      "辛辛卯","辛辛丑","壬壬寅","壬壬子","癸癸亥"]

        tempData = ["自来言禄，但知甲禄在寅之类，殊未知禄堂为最贵，甲人得甲戌是也，以其甲为岁干，则甲之本位遁在戌,若更得诸位福神助发，必须大贵（李虚中书）"]
        if (lutang.contains(nianGan+shiZhu)) {
            tempData.add(0,nianGan+"人"+shiZhu+"时柱")
            mapResult["【禄堂】"]=tempData
        }
        if (lutang.contains(nianGan+riZhu)) {
            tempData.add(0,nianGan+"人"+shiZhu+"日柱")
            mapResult["【禄堂】"]=tempData
        }

        /**
         *  第十三卷
         * [2017-09-19 add by longzhiyou]
         */

        /**
         * 【福星贵】一名文星贵，玉门关集，『禄干福神』
         * 甲丙相邀入虎乡，更游鼠穴最高强，戊猴己未丁宜亥，乙癸逢牛卯禄昌，庚趁马头辛到巳，壬骑龙背喜非常。
         * 用法:
         * 1.年干对时支
         * 参考: 如蔡君谟，壬子年、癸卯月、庚戌日、庚辰时，壬骑龙背，又贵在卯巳得辰，是谓福星扶贵人。（紫虚局）
         *
         * 如甲人见甲寅或甲子，乙人得乙丑，丙人得丙寅或丙子，丁人得丁亥，戊人得戊申，
         * 己人得己未，庚人得庚午，辛人得辛巳，壬人得壬辰，癸人得癸丑，为文星入华馆。
         *
         * http://blog.sina.com.cn/s/blog_6064c6590102vqpk.html
         * [2017-09-19 add by longzhiyou]
         */
        def fuxinggui = ["甲":["寅","子"]
                         ,"丙":["寅","子"]
                         ,"戊":["申"]
                         ,"己":["未"]
                         ,"丁":["亥"]
                         ,"乙":["丑","卯"]
                         ,"癸":["丑","卯"]
                         ,"庚":["午"]
                         ,"辛":["巳"]
                         ,"壬":["辰"]

        ]

        mapRule = fuxinggui[nianGan]
        if (mapRule.contains(shiZhi)) {
            mapResult["【福星贵】年干对时支"]=["甲丙相邀入虎乡，更游鼠穴最高强，戊猴己未丁宜亥，乙癸逢牛卯禄昌，庚趁马头辛到巳，壬骑龙背喜非常。"]
        }


        //文星入华馆
        def wenxingruhuaguan = ["甲":["甲寅","甲子"]
                                ,"乙":["乙丑"]
                                ,"丙":["丙寅","丙子"]
                                ,"丁":["丁亥"]
                                ,"戊":["戊申"]
                                ,"己":["己未"]
                                ,"庚":["庚午"]
                                ,"辛":["辛巳"]
                                ,"壬":["壬辰"]
                                ,"癸":["癸丑"]


        ]

        mapRule = wenxingruhuaguan[nianGan]
        if (mapRule.contains(shiZhu)) {
            mapResult["【文星入华馆】年干对时柱"] = nianGan+"人见"+mapResult.toString()
        }
        if (mapRule.contains(riZhu)) {
            mapResult["【文星入华馆】年干对日柱"] = nianGan+"人见"+mapResult.toString()
        }
        if (mapRule.contains(yunZhu)) {
            mapResult["【文星入华馆】年干对运柱"] = nianGan+"人见"+mapResult.toString()
        }

        /**
         * 第十八卷
         * [2017-09-19 add by longzhiyou]
         */

        //【本家食神】
        def nianshishen = commonAlgorithm.getTianGanShiShen(nianGan, "食神")
        mapRule = [
                "谓如甲食丙，甲子人见丙子之类是也，得此者非大富，即大贵。"
                ,"月不如日，日不如时，若互换生旺带禄贵者，无不贵显。"
                ,"一名隔十三食神，古诗云:论命先论隔十三，命中带得入朝参，金鱼束带浑闲事，若见魁星定面南。"
                ,"甲辰、丁未、庚戌、 癸丑四位为真魁星。如汪状元，戊戌见庚戌时，是见魁星也。"
        ]
        if (nianZhi==yueZhi&&nianshishen==yueGan) {
            mapResult["【本家食神】年柱对月柱"] = mapRule
        }
        if (nianZhi==riZhi&&nianshishen==riGan) {
            mapResult["【本家食神】年柱对日柱"] = mapRule
        }
        if (nianZhi==shiZhi&&nianshishen==shiGan) {
            mapResult["【本家食神】年柱对时柱"] = mapRule
        }

        /**
         * 第十九卷
         * [2017-09-19 add by longzhiyou]
         */

//        论财
//        【天财】
//        甲乙人见戊己为财、丙丁人见庚辛为财、戊己人见壬癸为财、
//        庚辛人见甲乙为财、壬癸人见丙丁为财。（林开五命）
//
//        【又天财】
//        纳音本干自见真五行财，而见合者是。假令乙亥人，四干中见庚者，是天财也。乙亥纳音火克乙庚真金，干头自是财故
//        也。主富足优逸，一生无不足愁苦之叹。


        def nianzhuwuxing = commonAlgorithm.getJiaZiWuXing(nianZhu)
        def heWuXing = CoreAlgorithm.getTianGanHeWuXing(nianGan, shiGan)
        if (heWuXing!=null) {

            def ke = commonAlgorithm.isWuXingShengKe(nianzhuwuxing, heWuXing, "我克")
            if (ke) {
                mapResult["【天财-时干】"] = ["纳音本干自见真五行财，而见合者是。假令乙亥人，四干中见庚者，是天财也。乙亥纳音火克乙庚真金，" ,
                                     "干头自是财故,主富足优逸，一生无不足愁苦之叹"
                ]
            }

        }
        heWuXing = CoreAlgorithm.getTianGanHeWuXing(nianGan, riGan)
        if (heWuXing!=null) {

            def ke = commonAlgorithm.isWuXingShengKe(nianzhuwuxing, heWuXing, "我克")
            if (ke) {
                mapResult["【天财-日干】"] = ["纳音本干自见真五行财，而见合者是。假令乙亥人，四干中见庚者，是天财也。乙亥纳音火克乙庚真金，" ,
                                        "干头自是财故,主富足优逸，一生无不足愁苦之叹"
                ]
            }

        }

//
//        【真财】
//        术者多以甲见戊，乙见己之类为财，是未知真财。甲己见丙辛、丙辛见戊癸、戊癸见乙庚、乙庚见丁壬、丁壬见甲己，
//        为真财。生居有气旺相之位（有气旺相为此五行），主富盛，若居死绝无气处者，有如无也。
//
//        【生成财】
//        所谓生成财，以其支干合也。假如甲乙生，用戊己土之属，申子辰上之生旺库也。若戊申、戊辰、戊子，支干合成，故
//        谓之生成财。凡人命入贵格，除贵外须主大富，仍多历钱谷重任，若不入贵格，其生成财上又无福神助之，是大豪富百
//        姓命，仍主纳粟有官。又有自生自旺财，如甲乙人戊午己亥是也。余仿此推之。（林开五命）
//
//        【生合财】
//        甲人见戊癸、乙人见己甲、丙人见庚乙、丁人见辛丙、戊人见壬丁
//        己人见癸戊、庚人见甲己、辛人见乙庚、壬人见丙辛、癸人见丁壬
//
//        以上主成立富贵。
//
//        【子母财】
//        如木命人见火月土日时之类是也，主平生多见喜事。
//        【财下有财】
//        如火命人见火月土日时之类是也。
//
//        【类财杀】
//        寅午戌人见乙庚、巳酉丑人见丁壬、申子辰人见戊癸、亥卯未人见甲己
//
//        【财会杀】
//        以上名微杀，主名利并行，寅午戌火克金，金墓在丑，余仿此。
//        寅午戌人见辛丑、巳酉丑人见乙未、申子辰人见丙戌、亥卯未人见戊辰
//
//        以上乃妻财聚会之神，主富足，及有美妻、横财，却防妇人毒药害命。古诗去：财会刑，商贾因妻富出伦，但防毒药因
//        此掩夜轮。（并广信集）
//        【名位财】
//        食神中见库是也，假令戊子火人见庚戌，戊食庚，火墓在戌，克金为财，逢此者，一生受禄也。余仿此。（珞琭贵贱格）
//
//        【外财】
//        只取长生宫是，如甲用戊己为财，见戊申是也，又如癸用丙丁为财，见丙寅是，此类多得外财。（李虚中书）
//
//        【鬼财】
//        干头见鬼，而纳音反制克干头鬼者是也。假令丁卯纳音火，丁于真五行属木，四干中见乙庚，是干头金鬼，丁卯纳音火，
//        却能制乙庚金，故名鬼财，此类人多主一生得世财，或为豪猾胥吏之徒以起家。丁卯丁酉得乙庚，戊寅戊申得丙辛，乙
//        酉乙卯得戊癸，准此。更带辰戌丑未多者，主为艺术之士，而大获世财。大抵鬼财主不得父祖产业之力，而多主自立强
//        干得之，若被刑杀带杀，居福聚之地者，多主寇盗之类，更逢恶运，则多因恶财以致死，有吉神救助，而居子得之，则
//        而主横财，横得横失矣。（玉霄宝鉴）
//
//        【财库发金格】如戊己干克水为财，水墓处是也
//        年干克下是天财，克墓之乡正库开，财入库时多谷帛，家豪谷物积成堆。
//        如毕状元，己亥年、癸酉月、庚辰日、甲申时是也。（紫虚局）
//
//        禄命身三等财库者，取我克者为财。为甲子金，甲为禄属木，木克土，故土为禄财，土墓在辰，是为禄财库也。子命属
//        水，水克火故火为命财，火墓在戌，是为命财库也。金为身，金克木，故木为身财，木墓在未，是为身财库也。余仿此
//        推之，主财产丰盈，自能劳立，少年多主辛苦，渐方称遂。
//
//        财绶者，并以岁干制月建，如甲乙人在辰戌丑未，丙丁人在申酉，余准此。若人遇之，主职位崇高，印绶显赫。（三命铃）
//        但看财命有气，逢背禄而不贫者也。财绝命衰，纵建禄而不富。
//        王氏注云：人生以财命为主，五行所克者之谓财，财与命皆得属于五行生旺之地，虽四柱背禄亦不至于贫贱也。或命与
//        财二者无气，虽得建禄，亦不能致富贵也。
//
//        莹和尚注云：财命宜旺地，如庚寅木命，庚禄在申，见丁亥土，木生土旺，虽背了申之庚禄而不贫。次如火归巳地，逢
//        金土，向申中遇水，皆曰财命有气。财绝命衰者，戊戌木命，见丁巳月生，虽云压禄财乡，其隶命衰财绝，虽建禄而不
//        富，此法不但月上时日皆然。（珞琭子）
//
//        凡命纳音财多而旺者，有财贿而浊。在死墓处逢财，主富而悭贪无义，亦主因死人而得财。（广信集）
//        【身衰不能克财】
//        谓如金克木为财，若壬寅金见戊辰木，安能克制翻成损气。如丁卯火自败，不足以制癸酉自旺之金，五行同此。（广信）
//        【小盈大亏，恐是劫财之地】
//        莹和尚注云：譬如丙辰土命，见癸巳，丙禄在巳，以水为财，劫杀却居巳，财既绝矣，命又衰矣，即曰小盈大亏，恐是
//        劫财之地。（珞琭子）

        /**
         * 【五行正印】
         *  乙丑金印、癸未木印、壬辰水印、甲戌火印、丙辰土印
         * [2017-10-17 add by longzhiyou]
         */
        def wuxingzhengyin = ["金乙丑",
                              "木癸未",
                              "水壬辰",
                              "火甲戌",
                              "土丙辰"
        ]
        if (wuxingzhengyin.contains(nianzhuwuxing+shiZhu)) {

            mapResult[nianZhu+"人"+shiZhu+"本家五行正印"] = [
                    "其中更带禄马、夹贵、华盖，须作出将入相断之"
            ]
        }else if (wuxingzhengyin.contains(nianzhuwuxing+riZhu)) {

            mapResult[nianZhu+"人"+riZhu+"本家五行正印"] = [
                    "其中更带禄马、夹贵、华盖，须作出将入相断之"
            ]
        }


        /**
         * 夹贵正印
                丙丁人得甲戌
                壬癸人得丙辰壬辰
         * [2017-10-17 add by longzhiyou]
         */
        def jiaguizhengyin = ["丙甲戌","丁甲戌","壬甲戌","丁甲戌",
                              "壬丙辰","癸丙辰","壬壬辰","癸壬辰"
        ]

        if (jiaguizhengyin.contains(nianGan+shiZhu)) {

            mapResult[nianGan+"人时柱夹贵正印"] = [
                    "出将入相之格"
            ]
        }else if (jiaguizhengyin.contains(nianGan+riZhu)) {

            mapResult[nianGan+"人日柱夹贵正印"] = [
                    "出将入相之格"
            ]
        }


        mapResult
    }
}