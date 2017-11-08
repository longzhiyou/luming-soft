package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.JiaZiAlgorithm

/**
 *  实战规则
 * Created by bukeyan on 2017/6/18.
 */
 class ShiZhanRule implements BaseRule{

    @Override
     def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

        def mapResult = [:]
        def mapRule = [:]
        def matchStr = ""
        def ruleValue ;
        def tempShow=""

        def nianGan = bazi.getNianGan()
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

        def taiZhu = bazi.getTaiZhu()

        def listMingGan = bazi.getListMingGan()
        def listMingZhi = bazi.getListMingZhi()
        def listMingZhu = bazi.getListMingZhu()

        def yunGan = bazi.getYunGan()
        def yunZhi = bazi.getYunZhi()
        def yunZhu = bazi.getYunZhu()

        def liunianGan = bazi.getLiunianGan()
        def liunianZhi = bazi.getLiunianZhi()
        def liunianZhu = bazi.getLiunianZhu()

        def luZhi = commonAlgorithm.getLuZhi(nianGan)
        def gender = bazi.getGender()
        def nianzhuwuxing = commonAlgorithm.getJiaZiWuXing(nianZhu)

        /**
         *  天月德同
         *  阳干逢四库月
         * [2017-11-08 add by longzhiyou]
         */

        def tianyuedetong=["辰壬","戌丙","丑庚","未甲"]
        matchStr=nianGan+"年人生"+yueZhi+"月"
        if (tianyuedetong.contains(yueZhi+nianGan)) {
            mapResult["【天月德同】"]=matchStr
        }

        matchStr=riGan+"日人生"+yueZhi+"月"
        if (tianyuedetong.contains(yueZhi+riGan)) {
            mapResult["【天月德同】"]=matchStr
        }

        /**
         * 天地德合
         * [2017-10-20 add by longzhiyou]
         */

        if(commonAlgorithm.isShuangHe(nianZhu, shiZhu)){
            def data=["天地德合"]
            mapResult["【年-时双合】"]=data
            if(commonAlgorithm.isYiXun(nianZhu,shiZhu)){
                data.push("君臣庆会-干支俱合一旬之内")
                mapResult["【年-时双合】"]=data
            }
        }

        def wuming=[nianZhu,yueZhu,riZhu,shiZhu,taiZhu]
        def wumingmatch=[]
        wuming.each {
            def wuxing = commonAlgorithm.getJiaZiWuXing(it)
            if(!wumingmatch.contains(wuxing)){
                wumingmatch.push(wuxing)
            }

        }

        if(wumingmatch.size()==1){
            mapResult["【一气为根】"]="年月日时胎五行同是:"+wumingmatch[0]
        }

        def liangganlianzhu=[
                "甲乙",
                "丙丁",
                "戊己",
                "庚辛",
                "壬癸",
        ]

        if(nianGan+yueGan==riGan+shiGan && liangganlianzhu.contains(nianGan+yueGan)){
            mapResult["【两干连珠】"]=["年月与日时天干同"]
        }


        /**
         * 【五行真日时】
         乙酉日庚辰时为精金、丁巳日丙午时为精火、癸亥日壬子时为精水、
         己丑日戊辰时为精土、甲寅日丁卯时为精木。以上主富贵（广信集）
         * [2017-10-20 add by longzhiyou]
         */
        if (riZhu=="乙酉"&&shiZhu=="庚辰") {
            mapResult["【五行真日时】主富贵（广信集）"]="乙酉日庚辰时为精金"
        }
        if (riZhu=="丁巳"&&shiZhu=="丙午") {
            mapResult["【五行真日时】主富贵（广信集）"]="丁巳日丙午时为精火"
        }
        if (riZhu=="癸亥"&&shiZhu=="壬子") {
            mapResult["【五行真日时】主富贵（广信集）"]="癸亥日壬子时为精水"
        }
        if (riZhu=="己丑"&&shiZhu=="戊辰") {
            mapResult["【五行真日时】主富贵（广信集）"]="己丑日戊辰时为精土"
        }
        if (riZhu=="甲寅"&&shiZhu=="丁卯") {
            mapResult["【五行真日时】主富贵（广信集）"]="甲寅日丁卯时为精木"
        }

        /**
         *  【论五行真贵】神白经 纳音五行对应河图五行阳干透出并带合
         火人丙日辛时辛日丙时、木人甲日己时己日甲时、土人戊日癸时癸日戊时、
         水人壬日丁时丁日壬时、金人庚日乙时乙日庚时。重犯福减。
         * [2017-10-20 add by longzhiyou]
         */
        def wuxingzhengui=[
                "火人丙日辛时",
                "火人辛日丙时",

                "木人甲日己时",
                "木人己日甲时",

                "土人戊日癸时",
                "土人癸日戊时",

                "水人壬日丁时",
                "水人丁日壬时",

                "金人庚日乙时",
                "金人乙日庚时"

        ]
        matchStr=nianzhuwuxing+"人"+riGan+"日"+shiGan+"时"
        if (wuxingzhengui.contains(matchStr)) {
            mapResult["【【论五行真贵】神白经 纳音五行对应河图五行阳干透出并带合】重犯福减"]=matchStr
        }

       def zuoxiayouhua = [
               "壬午":["丁禄在午 壬与丁合","最为福深幽"],
               "丁亥":["壬禄在亥 丁与壬合","最为福深幽"],
               "戊子":["癸禄在子 戊与癸合","聪明"],
               "甲午":["己禄在午 甲与己合","在寅午戌月得地,亦主有小亨"],
               "辛巳":["丙禄在巳 辛与丙合","辛巳权谋"],
               "癸巳":["戊禄在巳 癸与戊合","贵中有酒色之疾，损寿"],
       ]
        if(zuoxiayouhua.containsKey(riZhu)){
            mapResult["【坐下有化-日柱】"]=zuoxiayouhua.get(riZhu)
        }

        if(listMingZhu.contains("辛亥")&&listMingZhu.contains("丁巳")) {
            mapResult["【真气交互格】辛亥-丁巳 两柱要紧邻"]=["辛亥金人得丁巳土，有丁壬合，真木往来，有丙辛合，真水往来","交互真气全，宰相命"]

        }
        if(listMingZhu.contains("癸亥")&&listMingZhu.contains("丁巳")) {
            mapResult["【真气交互格】癸亥-丁巳 两柱要紧邻"]=["丁巳土人得癸亥水，有戊癸合，真火往来，有丁壬合，真木往来","交互真气全，宰相命"]

        }

        if(listMingZhu.contains("戊午")&&listMingZhu.contains("壬子")) {
            mapResult["【真气交互格】戊午-壬子 两柱要紧邻"]=["戊午火见壬子木，中有丁壬真木，戊癸真火","交互全，两府命"]

        }
        if(listMingZhu.contains("丙申")&&listMingZhu.contains("乙酉")) {
            mapResult["【真气交互格】丙申-乙酉 两柱要紧邻"]=["丙申见乙酉，中有丙辛真水，乙庚真金","交互全，两府命"]

        }
        if(listMingZhu.contains("庚寅")&&listMingZhu.contains("己卯")) {
            mapResult["【真气交互格】庚寅-己卯 两柱要紧邻"]=["庚寅得己卯，中有甲己真土，乙庚真金","交互全，两府命"]

        }


//        /**
//         *  【五行真气取干化与纳音同类】
//         壬子壬午真木、己酉己卯真土、丙子丙午真水、戊子戊午真火、乙丑乙未庚辰庚戌真金
//         * [2017-10-20 add by longzhiyou]
//         */
//        if (listMingZhu.contains("壬子")&&listMingZhu.contains("壬午")) {
//            mapResult["【五行真气取干化与纳音同类-真木】"]="壬子壬午真木"
//        }
//        if (listMingZhu.contains("己酉")&&listMingZhu.contains("己卯")) {
//            mapResult["【五行真气取干化与纳音同类-真土】"]="己酉己卯真土"
//        }
//        if (listMingZhu.contains("壬子")&&listMingZhu.contains("壬午")) {
//            mapResult["【五行真气取干化与纳音同类】"]="丙子丙午真水"
//        }
//        if (listMingZhu.contains("壬子")&&listMingZhu.contains("壬午")) {
//            mapResult["【五行真气取干化与纳音同类】"]="戊子戊午真火"
//        }
//        if (listMingZhu.contains("壬子")&&listMingZhu.contains("壬午")) {
//            mapResult["【五行真气取干化与纳音同类】"]="戊子戊午真火"
//        }


        /**
         *  分出大类,分别讨论
         *  层次,富贵-男命
         *  婚姻
         *  健康寿夭
         *  子女
         *
         * [2017-10-13 add by longzhiyou]
         */

        /**
         * 甲己年：三月，戊戌。七月，癸亥。十月，丙申。十一月，丁亥
         * 乙庚年：四月，壬申。九月，乙巳。
         * 丙辛年：三月，辛巳。九月，庚辰。十月，甲辰。
         * 丁壬年：无
         * 戊癸年：六月，己丑。
         *
         * 十恶大败日 出道藏第四十九
         * [2017-10-10 add by longzhiyou]
         */

        def shiedabai = [
                "甲辰戊戌","甲申癸亥","甲亥丙申","甲子丁亥",
                "己辰戊戌","己申癸亥","己亥丙申","己子丁亥",

                "乙巳壬申","乙戌乙巳",
                "庚巳壬申","庚戌乙巳",

                "丙辰辛巳","丙戌庚辰","丙亥甲辰",
                "辛辰辛巳","辛戌庚辰","辛亥甲辰",
                "戊未己丑",
                "癸未己丑"
        ]

        if (shiedabai.contains(nianGan+yueZhi+riZhu)){
            mapResult["【十恶大败日】"]=nianGan+"年"+yueZhi+"月"+riZhu+"日"
        }

        /**
         *  原则
         *  1.势-五行旺则泄
         * [2017-08-03 add by longzhiyou]
         */
        //五行缺一规则


        /**
         * 婚姻-女命重点
         *  男命用年柱纳音所克五行，引到日支妻宫.
         *  女命用克年柱纳音五行，引到日支妻宫.
         * [2017-08-03 add by longzhiyou]
         */
        if (gender=="女") {
            /**
             *  孤鸾煞
             *  孤鸾寡鹞煞 呻吟煞
             *  http://blog.sina.com.cn/s/blog_6788746e0100wkeq.html
             *  孤鸾共有八组，乙巳，丁巳，辛亥，戊申，壬寅，戊午，壬子，丙午
             *  「木火逢蛇大不祥，金豬何必強猖狂；土猴木虎夫何在，時對孤鸞舞一場。」
             *  古歌所云，本屬乙巳（蛇）、丁巳（蛇）、辛亥（豬）、戊申（猴）、甲寅（虎），五日誕生者。
             *  《渊海子平》书中亦有古诗：“木虎孀无婿（甲寅），金猪岂有郎（辛亥），赤黄马独卧（丙午、戊午），黑鼠守空房（壬子）。”孤寡之象
             * [2017-08-30 add by longzhiyou]
             */

            def guluansha=["乙巳","丁巳","辛亥","戊申","甲寅","丙午","戊午","壬子","壬寅"]
            if (guluansha.contains(riZhu)) {
                def data = ["木火蛇无婿(乙巳,丁巳)，金猪岂有郎（辛亥），土猴常独卧（戊申），木虎（甲寅）水虎（壬寅可能不准）定居孀,赤黄马独卧（丙午、戊午），黑鼠守空房（壬子）",
                            "孤鸾煞主克夫，主再嫁，主守寡，若不离婚，夫必先亡。官星受伤，或日支逢冲，丈夫则会早死。"
                ]

                if (riZhu=="甲寅" || riZhu=="辛亥") {
                    data.add(0,riZhu+"【此日两个口诀都有，从重论】")
                    mapResult["【孤鸾煞】"]=data
                }else {
                    mapResult["【孤鸾煞】"]=data
                }

                if (guluansha.contains(riZhu)&&guluansha.contains(shiZhu)) {
                    data.add(0,riZhu+"【日柱时住都有，从重论】")
                    mapResult["【孤鸾煞】"]=data
                }

                if (riZhu=="丁巳") {
                    data.add(0,riZhu+"【丁已孤骛，命遇聪明诗女】")
                    mapResult["【孤鸾煞】"]=data

                }
            }

            if (riZhu=="丙午"|| riZhu=="壬子" ) {

                mapResult["【日坐阳刃】"] = ["性格过于坚毅"
                                       ,"女命生在这天，那对婚姻是很不利的，日坐阳刃，为人个性刚强，要强，不易相让"
                                       ,"婚姻生活中轻易固执、容易争吵。尤其丙午日，往往做事情风风火火，像男人的做派。"
                                       ,"女人太刚强，假如老公也不甘示弱，那婚姻十有八九是不平静的。即便老公能忍，估计他心里也不大愉快"]
            }


        }

        /**
         *  子女
         *  1.花园十二宫-用纳音五行引到时支看十二长生诀
         *      男命用克年柱纳音五行
         *      女命用年柱纳音五行所生
         * [2017-08-03 add by longzhiyou]
         */
        //健康
        //吉凶

        /**
         *
         *  六法冲克-细批终身详解》P616 论“大凶”
         *  “六法冲克”断生死关口 http://blog.sina.com.cn/s/blog_49d801fd0102dsp3.html
         *  《金不换大运》
         * [2017-08-03 add by longzhiyou]
         */

        //纳音同位克
        def tongweike = JiaZiAlgorithm.mapJiaZiInfo.get(nianZhu).nayintongweike.match
        if(tongweike==shiZhu){
            mapResult["【时柱纳音同位克年柱】"] = "时柱:"+shiZhu+" 年柱:"+nianZhu
        }
        if(tongweike==riZhu){
            mapResult["【日柱纳音同位克年柱】"] = "日柱:"+riZhu+" 年柱:"+nianZhu
        }
        if(tongweike==yunZhu){
            mapResult["【运柱纳音同位克年柱】"] = "运柱:"+yunZhu+" 年柱:"+nianZhu
        }

        if(!yunZhu.isEmpty()){
            def info = JiaZiAlgorithm.mapJiaZiInfo.get(yunZhu)
            if (riZhu==info.nayingeyike){
                mapResult["【大运纳音隔一相克日柱】"] = "大运:"+yunZhu.toString()+" 日柱:"+riZhu.toString()
            }

            if (riZhu==info.nayinmuguike){
                mapResult["【大运纳音墓鬼相克日柱】"] = "大运:"+yunZhu.toString()+" 日柱:"+riZhu.toString()
            }

            if(info.nayinkongwangke.contains(riZhu)){
                mapResult["【大运纳音空亡相克日柱】"] = "日柱:"+riZhu.toString()+ "空亡在-大运:"+yunZhu.toString()
            }

            if (nianZhu==info.nayingeyike){
                mapResult["【大运纳音隔一相克年柱】"] = "大运:"+yunZhu.toString()+" 年柱:"+nianZhu.toString()
            }

            if (nianZhu==info.nayinmuguike){
                mapResult["【大运纳音墓鬼相克年柱】"] = "大运:"+yunZhu.toString()+" 年柱:"+nianZhu.toString()
            }

            if(info.nayinkongwangke.contains(nianZhu)){
                mapResult["【大运纳音空亡相克年柱】"] = "年柱:"+nianZhu.toString()+ "空亡在-大运:"+yunZhu.toString()
            }

        }


        if(!liunianZhu.isEmpty()){
            def info = JiaZiAlgorithm.mapJiaZiInfo.get(liunianZhu)
            if (riZhu==info.nayingeyike){
                mapResult["【流年纳音隔一相克日柱】"] = "流年:"+liunianZhu.toString()+" 日柱:"+riZhu.toString()
            }

            if (riZhu==info.nayinmuguike){
                mapResult["【流年纳音墓鬼相克日柱】"] = "流年:"+liunianZhu.toString()+" 日柱:"+riZhu.toString()
            }

            if(info.nayinkongwangke.contains(riZhu)){
                mapResult["【流年纳音空亡相克日柱】"] = "日柱:"+riZhu.toString()+ "空亡在-流年:"+liunianZhu.toString()
            }

        }




        mapResult
    }
}