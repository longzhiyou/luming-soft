package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.JiaZiAlgorithm

/**
 *  实战规则-特殊规则类似擒拿一击致命
 *
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

        def xingNianGan = bazi.getXingnianan()
        def xingNianZhi = bazi.getXingnianZhi()
        def xingNianZhu = bazi.getXingnianZhu()

        def liunianGan = bazi.getLiunianGan()
        def liunianZhi = bazi.getLiunianZhi()
        def liunianZhu = bazi.getLiunianZhu()

        def luZhi = commonAlgorithm.getLuZhi(nianGan)
        def gender = bazi.getGender()
        def nianzhuwuxing = commonAlgorithm.getJiaZiWuXing(nianZhu)

        /**
         * 六金中惟庚戌尤喜巳，盖火库中金也。若见乙巳，虽纳音属火，而乙与庚合，化为真金亦无碍。
         * [2017-11-28 add by longzhiyou]
         */
        if (nianZhu=="庚戌") {
            if (shiZhi=="巳" || riZhi=="") {
                mapResult["【庚戌年见日或时巳】"] = ["六金中惟庚戌尤喜巳，盖火库中金也。若见乙巳，虽纳音属火，而乙与庚合，化为真金亦无碍。"]
            }
        
        }
        
        /**
         *  重新整理
         *  全阴全阳
         *  五行缺一规则
         *  日月地支对冲-婚姻
         * 井栏斜冲
         *  三合三会透干-五行性
         *  （明式）三合（会）- 梁湘润《格局生旺库今论》“明式”三合财 地支不必坐财禄，只要有三个‘支藏天干’之财，譬如丁日主----见三个‘巳’----巳中有‘庚’----即是三庚财----古典三合财”
         *  墓库运
         *  十干败亡运
         *  金不换
         *  生旺库罗网
         *
         * [2017-11-17 add by longzhiyou]
         */

        /**
         *  井栏斜冲
         *  申日辰时，未日亥时，寅日戌时，丑日巳时互换，皆为井栏斜冲，主难妻，
         更带食神，名绝房杀，主多女少男。如甲辰壬申，带倒食者，尤紧。古赋，井栏对敌，荘子鼓盆而歌，谓此也。日是自
         刑，主妻多病，日坐沐浴杀，主得美妻多不廉。
         * [2017-11-17 add by longzhiyou]
         */

        def jinglanxiechong = ["申辰","未亥","寅戌","丑巳"]
        if (jinglanxiechong.contains(riZhi+shiZhi)|| jinglanxiechong.contains(shiZhi+riZhi)) {
            mapResult["【井栏斜冲】"+riZhi+"日"+shiZhi+"时"] = ["井栏对敌，荘子鼓盆而歌，谓此也。"
                                                         ,"日是自刑，主妻多病，日坐沐浴杀，主得美妻多不廉"
            ]
        }

        /**
         *  辛卯日时，名曰白虎闭目，火年必损眼，其余辛与卯字者，亦忌之。（并广信集）
         * [2017-11-17 add by longzhiyou]
         */
        if (riZhu=="辛卯"&& shiZhu=="辛卯") {
            mapResult["【白虎闭目】"] = "辛卯日时，名曰白虎闭目，火年必损眼，其余辛与卯字者，亦忌之。（并广信集）"
        }

        /**
         *  岁 运 柱形成 生旺库 罗网。
         * [2017-11-17 add by longzhiyou]
         */
        mapResult["【生旺库罗网】"] = [
                "先查看 岁 运 柱形成 生旺库 罗网"
                ,""
        ]

        /**
         * 墓库运：
         辰戌丑未月入 癸 丁 辛 乙 运，五年不吉祥。
         生于四库月提,走阴天干运，且这个天干在原局月令为对应五行的墓库时，为墓库运（己土运除外，因土无库）
         * [2017-11-17 add by longzhiyou]
         */
        def mukuyun=["乙未","丁戌","辛丑","癸辰"]
        if (mukuyun.contains(yunGan+yueZhi)) {
            mapResult["【墓库运】"] = [
                    yueZhi+"月走"+yunGan+"干运"
                    ,"五年不吉祥"
            ]
        }

        /**
         *十干禄绝运：
             甲申乙酉见阎王，丙子丁亥急切防。
             庚午辛已风中烛，戊寅己卯亦重伤。
             壬辰戌兼癸丑未，未别浮生入鬼乡。
             用法:不必考虑格局。只要日主四柱地支没有临官、帝旺根,大运逢如上败亡大运（即和日元禄位相克的大运）,轻则败落，重则死伤。


         * 五行精纪
         * 【急脚杀】
         此以干支相克，只如甲乙属木、申酉属金，金克木也。

         甲乙申酉见阎王，丙丁亥子切须防，庚辛巳午如风烛，戊己寅卯亦重伤，壬癸辰戌加丑未，永别浮生入鬼乡。（并三命篡
         局）

         广信集作天鬼截路杀，若甲人见申，乙人见酉，生时带着，支干皆有者，定夭。如甲人见庚申是，支干皆有也。太岁与
         大运逢之，主多孝服，更与小运并，主死。

         金书命诀云：行年二位临斯位，自察前程有盛衰。

         应该是走杀运重
         * [2017-11-17 add by longzhiyou]
         */

        def shiganlujue = ["甲乙申酉见阎王，丙丁亥子切须防，庚辛巳午如风烛，戊己寅卯亦重伤，壬癸辰戌加丑未，永别浮生入鬼乡"
                ,"太岁与大运逢之，主多孝服，更与小运并，主死"
                ,"如甲人见庚申,生时支干皆有者，定夭"
        ]
        def jijiaosha = [ "甲":["申"]
                         ,"乙":["酉"]
                         ,"丙":["亥"]
                         ,"丁":["子"]
                         ,"戊":["寅"]
                         ,"己":["卯"]
                         ,"庚":["巳"]
                         ,"辛":["午"]
                         ,"壬":["辰","戌"]
                         ,"癸":["丑","未"]
                        ]
        matchStr = jijiaosha.get(nianGan)
        if (matchStr.contains(shiZhi)) {
            mapResult["【急脚杀-年干对时支】"] =shiganlujue
        }
        if (matchStr.contains(yunZhi)) {

            mapResult["【急脚杀-年干对运支】"] = shiganlujue

            if (matchStr.contains(xingNianZhi)) {
                mapResult["【急脚杀-年干对运支-行年支】"] = [
                        "与小运并，主死"
                ]
            }
        }

        matchStr = "败亡大运,轻则败落，重则死伤"
        if (riGan=="甲") {

            if (yunZhi=="申" && !listMingZhi.contains("寅") && !listMingZhi.contains("卯")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"甲申乙酉见阎王"
                ]
            }
        }else if (riGan=="乙") {
            if (yunZhi=="酉" && !listMingZhi.contains("寅") && !listMingZhi.contains("卯")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"甲申乙酉见阎王"
                ]
            }
        }else if (riGan=="丙") {
            if (yunZhi=="子" && !listMingZhi.contains("巳") && !listMingZhi.contains("午")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"丙子丁亥急切防"
                ]
            }
        }else if (riGan=="丁") {
            if (yunZhi=="亥" && !listMingZhi.contains("巳") && !listMingZhi.contains("午")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"丙子丁亥急切防"
                ]
            }
        }else if (riGan=="戊") {
            if (yunZhi=="寅" && !listMingZhi.contains("巳") && !listMingZhi.contains("午")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"戊寅己卯亦重伤"
                ]
            }
        }else if (riGan=="己") {
            if (yunZhi=="卯" && !listMingZhi.contains("巳") && !listMingZhi.contains("午")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"戊寅己卯亦重伤"
                ]
            }
        }else if (riGan=="庚") {
            if (yunZhi=="午" && !listMingZhi.contains("申") && !listMingZhi.contains("酉")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"庚午辛已风中烛"
                ]
            }
        }else if (riGan=="辛") {
            if (yunZhi=="巳" && !listMingZhi.contains("申") && !listMingZhi.contains("酉")) {
                mapResult["【十干禄绝运】"] = [
                        matchStr
                        ,"庚午辛已风中烛"
                ]
            }
        }

        def jinbuhuan=[
                "甲子":["甲日子提为印绶，顺行不似逆行高。官多杀盛东为美，午未相逢总徒劳。"],
                "甲丑":["阳木天元值丑提，分明大运喜东西。发财发福多荣达，午未之中亦不宜。"],
                "甲寅":["甲木生东值孟春，财多杀重定超群。顺行火地多难显，逆走终为富贵人。"],
                "甲卯":["阳木春生值卯提，柱中有杀最为奇。不拘逆顺东南地，申酉相逢反不宜。"],
                "甲辰":["甲木辰提喜有官，逆行东地弗为欢。顺行南地多颠倒，除是根深富贵看。"],
                "甲巳":["阳木根深在巳月，柱中财杀喜相逢。逆行早岁声名显，顺行须防夭寿终。"],
                "甲午":["甲木日干居午月，伤官木火喜生财。顺行怕入西方运，东北行来更妙哉。"],
                "甲未":["阳木有根生六月，财官有气福非常。逆行最喜东方运，惟恐初生寿不长。"],
                "甲申":["甲木无根值孟秋，财多杀旺恨身柔。运行顺地迟方好，逆运须防夭更休。"],
                "甲酉":["甲木酉提用正官，顺行坎地必成欢。逆转南离官被制，须知禄尽见阎王。"],
                "甲戌":["甲木戌提用财官，顺运东南福更宽。若得柱中逢亥未，逆行名姓达金鸾。"],
                "甲亥":["甲木生元值亥提，柱中有杀更为奇。中年最喜东方运，午未之中数不齐。"],

                "乙子":["乙木生居子月中，更无官煞喜匆匆。逆行大运非常美，无杀无官逆运通。"],
                "乙丑":["乙木提纲值丑官，南方第一次西东。纵然名不登金榜，豪富终须比石崇。"],
                "乙寅":["乙生寅月木伤官，财杀相逢更有欢。顺运连行多福禄，无财无杀亦贫寒。"],
                "乙卯":["乙木提纲值仲春，财官有气亦超群。火金大运皆为美，白手兴家迈等伦。"],
                "乙辰":["乙木辰提为杂气，西方大运亦为高。若行戌运多颠倒，刑并入财寿不牢。"],
                "乙巳":["乙木相逢孟夏时，运行东北始为奇。柱中更值无根裔，顺运终防寿不齐。"],
                "乙午":["乙木如逢午月天，食神有气怕身轻。柱中若是根基薄，大运提防喜逆行。"],
                "乙未":["未月生逢乙日干，柱中官杀亦为欢。顺行西北伤元寿，逆走东南福更宽。"],
                "乙申":["乙木生来值孟秋，财官印绶忌身柔。中年不许行西北，顺运无如逆运通。"],
                "乙酉":["乙木酉月杀多强，大运功名佐庙廊。若是有根尤更妙，南行火运贵非常。"],
                "乙戌":["乙生戌月多财杀，惟恐初年疾病生。若到中年多发达，不拘顺逆总宜行。"],
                "乙亥":["乙木居亥印生身，逆走西南富贵真。有杀有官犹喜顺，到头大限怕逢辰。"],

                "丙子":["丙火冬生值子纲，有印生身大吉昌。运入东南多发达，逆行难保寿年长。"],
                "丙丑":["丙火如逢丑月看，土多格局作伤官。印多运入西方美，根浅东南福不全。"],
                "丙寅":["丙多官杀值寅提，运入南方分外奇。若是官轻尤喜北，总然大运要行西。"],
                "丙卯":["丙火日干卯提纲，干弱如逢喜火乡。若是无官尤不利，却行身旺亦平常。"],
                "丙辰":["丙火辰提戊己多，伤官火土更如何。逢财逢印多通达，南北相逢总不过。"],
                "丙巳":["丙火建禄日干强，官杀相逢大吉昌。顺逆运行多发达，若行戌运有灾殃。"],
                "丙午":["丙火午月作伤官，有杀当为贵命看。金水运行多吉利，如行水地不为欢。"],
                "丙未":["丙逢未月伤官显，官杀相逢未足奇。如得独官为贵气，运行西北利名驰。"],
                "丙申":["丙火申提日主柔，得从得化始为优。若从水位伤元寿，逆去东南福禄周。"],
                "丙酉":["丙逢酉月火衰微，比劫扶身寿不奇。逆去东南为背禄，顺行水地始为奇。"],
                "丙戌":["丙逢戌月土重重，有杀无官回不同。大运顺行多富贵，若逢官杀亦中中。"],
                "丙亥":["丙火亥提为杀印，分明大运喜东南。中年富贵非常美，运若西方寿不齐。"],


                "丁子":["丁火如逢子月提，柱中有杀更无亏。平生最喜东方运，若到西方福不齐。"],
                "丁丑":["丁火丑月事如何，四柱分明怕土多。运入东方俱发达，南方火地不相宜。"],
                "丁寅":["丁火逢寅印绶明，柱中有水喜南行。运行北地尤通达，西方财乡祸患生。"],
                "丁卯":["丁逢卯月有印星，南北应多遂利名。独杀若无官混杂，金章紫绶至公卿。"],
                "丁辰":["丁逢辰月本伤官，顺入南方福更宽。逆运初年多蹇剥，更逢戌亥寿相干。"],
                "丁巳":["丁逢巳月本刚强，大运何愁入水乡。运入顺行初不利，中年最喜入西方。"],
                "丁午":["丁逢建禄本身强，无水须防寿不全。若得运中逢七杀，姓名远达九重天。"],
                "丁未":["未月逢丁要见财，无财到底命多乖。若逢财杀方为美，西方大运更奇哉。"],
                "丁申":["丁逢申月日干强，大运南方喜逆行。若是根深尤喜顺，中年发达更峥嵘。"],
                "丁酉":["丁逢酉月用偏财，官杀相逢更妙哉。大运逆行多顺遂，功名两字称心怀。"],
                "丁戌":["丁逢戌月伤官旺，官杀虽多却不防。南与东方多顺遂，荣华富贵福无疆。"],
                "丁亥":["丁生亥月用官星，顺逆东南福不轻。若是煞星多混杂，寿年尤恐半凋零。"],

                "戊子":["戊土日干生子月，坐支辰戌最为奇。支虚更值财神位，运怕东兮又怕西。"],
                "戊丑":["戊土丑月日干坚，更有财官福寿全。逆顺运行俱得地，若无财杀亦徒然。"],
                "戊寅":["戊土寅月日干轻，杀印相生格局明。运入火乡尤发达，逆行水地总平平。"],
                "戊卯":["戊土卯月用官星，有印相生格局清。南运发财强北运，如逢酉地寿元倾。"],
                "戊辰":["戊土辰月日干强，更有财星福禄昌。顺运西南应发达，财官轻处亦非良。"],
                "戊巳":["戊土巳提为建禄，柱中财杀更为奇。逆行大运宜东北，顺走西南事不齐。"],
                "戊午":["戊土五月印当权，大运分明喜杀官。官杀重时宜顺运，官轻逆运妙无端。"],
                "戊未":["戊土生来季夏天，若无财煞未周全。逆行更喜东方运，顺逆财多亦不然。"],
                "戊申":["戊土生申用食神，有财有煞贵堪伦。逆行火地必通达，火地行来反受屯。"],
                "戊酉":["戊土生来值酉提，怕行坎水喜火离。除非四柱元辰旺，卯运相逢最不宜。"],
                "戊戌":["戊土戌月日干强，财杀重逢更吉祥。运气不拘行顺逆，若无财杀亦平常。"],
                "戊亥":["戊土亥提财杀真，身强有火更超群。逆行早岁须防酉，顺运中年忌卯辰。"],

                "己子":["己土子月用财星,有杀无官格局清,大怕柱中身太弱,顺行寅卯早凋零."],
                "己丑":["己土丑月日干坚,四柱分明忌比肩,若有财官并有杀,逆行大运福无边."],
                "己寅":["己土寅月值身柔,若是身柔命不周,身旺更行南运美,逆行运气寿休囚."],
                "己卯":["己土卯月杀当权,逆运须知寿不坚,顺逆火乡无极妙,官星相会不周全."],
                "己辰":["己土辰提杂气真,财官有气定超群,顺行运气尤当妙,逆运行时不十分."],
                "己巳":["己土巳月身尤旺,印绶伤官格局清,身旺最宜财运遇,无财逆运亦相应."],
                "己午":["己土午月本身强,建禄分明理更长,官杀轻时宜顺运,官轻逆行亦荣昌."],
                "己未":["己土未月欣逢杀,刃煞相伤更妙哉,运气中年多发达,不拘顺逆称心怀."],
                "己申":["己土申月用伤官,若是身轻必不安,所喜须宜行逆运,怕逢寅卯杀相干."],
                "己酉":["己土八月辛金旺,若是身轻命不牢,旺喜顺行衰喜逆,无财无杀不为高."],
                "己戌":["己土如逢九月天,财官两旺福无边,运行顺逆俱平稳,发达之时在壮年."],
                "己亥":["亥提己土用财官,身旺财官总是欢,若是身柔喜顺运,东方难决一平安."],

                "庚子":["子月如逢庚日干,有财有杀始平安,西方不似东方运,午运如逢寿数完."],
                "庚丑":["庚金丑月有财官,格局分明杂气看,木火柱无终不美,东南运气遇为欢."],
                "庚寅":["庚金寅月日干微,土透天干命愈奇,逆运初年嫌子丑,顺行大运怕逢离."],
                "庚卯":["庚金生值仲春时,官煞如逢命始奇,但嫌四柱元神弱,顺运三旬恐殒危."],
                "庚辰":["庚金三月土重重,更有财官福禄丰,逆运固知强顺运,中逢子地有灾凶."],
                "庚巳":["庚金四月杀星强,有制方知杀伏降,若是无根又无制,其人多有少年亡."],
                "庚午":["五月庚金喜有根,有根有水贵堪言,逆行大运宜东地,子字相逢总不然."],
                "庚未":["庚金未月土旺地,戊己土重命无过,若是土轻行逆运,康宁福寿沐恩波."],
                "庚申":["七月庚金金大刚,坐支若是亦平常,财官两处宜行顺,财杀轻时逆运强."],
                "庚酉":["八月庚金用两星,柱中有杀最相应,有财无煞纯金局,从革尤当显姓名."],
                "庚戌":["庚金九月喜逢财,杀透天干亦妙哉,顺命初年兼子地,逆行离巽有凶灾."],
                "庚亥":["庚金十月日干衰,有土相逢亦妙哉,顺运必然强逆运,中年唯恐有灾危."],

                "辛子":["子月辛金喜丙丁,若然无火亦平平,运行木火多通达,财杀多时喜逆行."],
                "辛丑":["辛金丑月宜丁火,戊己重重亦不妨,无火土多防夭寿,纵然不夭也平常."],
                "辛寅":["辛金寅月财官旺,大运不须喜逆行,若是无财行顺运,中年唯恐丧残生."],
                "辛卯":["卯月辛金如有杀,坐支有土更为奇,顺行逆转名多显,若到西方反不齐."],
                "辛辰":["辛金生於辰月中,有财有杀更和同,顺行逆运多通达,富贵荣华福寿崇."],
                "辛巳":["辛金巳月官星旺,伤食全无亦不过,逆运但防官字否,顺行一路总蹉跎."],
                "辛午":["辛金午月杀当权,四柱根深逆顺坚,若是无根堪弃命,如行西运大无恙."],
                "辛未":["未月辛金杀印全,印多尤似有亏偏,逆行水运多通达,顺运初年略不然."],
                "辛申":["申月辛金金水清,伤官有杀最相应,坐支无酉方为妙,运入东南显姓名."],
                "辛酉":["辛金酉月日干强,财杀相逢更异常,逆运到头多发达,顺行水地未为良."],
                "辛戌":["戌月辛金煞印全,柱中有制福无边,逆行顺去俱无阻,巳地相逢总不然."],
                "辛亥":["辛金亥月若无官,水冷应知金大寒,若有官星尤有杀,定应名姓到金銮."],

                "壬子":["壬水生逢子月天,无财无杀未周全,终身困苦多流落,纵到财乡亦枉然."],
                "壬丑":["壬水丑月喜逢财,财旺身强更妙哉,运气顺行经水火,堪为万事称君怀."],
                "壬寅":["壬水如逢寅月生,食神相左亦相应,南方运气增财帛,有杀终当播姓名."],
                "壬卯":["壬逢卯月伤官格,逆运无如顺运高,杀透更加身旺处,功名富贵寿称高."],
                "壬辰":["壬水辰月杀星强,甲乙相逢杀伏降,更得财星并印绶,不拘顺逆亦相当."],
                "壬巳":["壬水生逢夏月天,财星官杀旺堂前,无根只怕初年失,若到中年福愈坚."],
                "壬午":["壬生午月财星旺,亥水相逢更异常,若是无根多弃命,平生白手置田庄."],
                "壬未":["壬水生逢季夏时,分明杂气异为奇,顺行逆转多通达,卯地相逢总不宜."],
                "壬申":["壬水生申为杀印,有财有用亦相当,运行南地强如壮,卯地相逢命不长."],
                "壬酉":["壬水相逢八月天,分明印绶格当权,无官怕入财乡运,有杀须应福愈坚."],
                "壬戌":["壬水生来值季秋,财多杀旺身忌柔,财居火地俱通达,并木之乡返不周."],
                "壬亥":["壬水亥提为建禄,柱中有土运之东,南方运气俱为美,若是无财亦不通."],

                "癸子":["癸水冬生值子提,财官重见最为奇,顺行喜到东南运,逆走南方亦不宜."],
                "癸丑":["癸水丑提为杂气,无财无印不堪推,顺行木火俱为妙,逆运西南寿不齐."],
                "癸寅":["癸水寅月木伤官,官杀重逢祸百端,北运不如南运好,若到申宫寿有干."],
                "癸卯":["癸水生来卯月中,无官无杀喜和同,顺行南地多清贵,恐入西方寿早终."],
                "癸辰":["癸水辰月喜逢财,杂气分明格美哉,若是无根身太弱,顺行南运必多灾."],
                "癸巳":["癸水巳提财更旺,官多不与杀相同,有根逆运多财足,顺入西方早见凶."],
                "癸午":["癸水生逢午月中,分明财杀格相同,无根运不行申地,弃水从财反有功."],
                "癸未":["癸水未月杀星强,有刃无官禄位昌,运入东方经制伏,定看名姓列朝堂."],
                "癸申":["癸水生来值孟秋,有财终不忌身柔,顺行北运尤为妙,若是无财反不周."],
                "癸酉":["癸水酉月印生身,有杀方为格局真,逆运须知强顺运,功名富贵又超群."],
                "癸戌":["戌月如逢癸日干,分明杂气用财官,运行木火多财禄,逆运初年寿有干."],
                "癸亥":["癸日生来亥月中,伤官水木总相同,逆行最妙南方运,顺走须知忌卯凶."],
        ]


        mapResult["【金不换】"] = jinbuhuan.get(riGan+yueZhi)


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
         * 【四大福神】
         甲日丙寅时（丙丁壬人上，辛癸人次之）、乙日己卯时（乙癸丁人上，甲庚人次之）、
         庚日甲申时（乙庚戊人上，壬癸人次之）、辛日丁酉时（甲丙辛人上，丁巳人次之）。

         【财库印】
         若水人得火印，是也。余准此。

         * [2017-11-09 add by longzhiyou]
         */

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