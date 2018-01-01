package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 * 参考规则
 * Created by bukeyan on 2017/6/18.
 */
 class ReferenceRule implements BaseRule{

     @Override
     Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

         def mapResult = [:]
         mapResult["【御定子平】"] = yudingziping(bazi, commonAlgorithm)
         mapResult["【滴天髓十干】"] = ditiansui(bazi, commonAlgorithm)
         mapResult["【十干体相】"] = shigantixiang(bazi, commonAlgorithm)
         mapResult["【管见子平-十干喜忌诗诀】"] = guanjianziping(bazi, commonAlgorithm)
         mapResult["终南命理十干喜忌口诀"] = zhongnanmingli(bazi, commonAlgorithm)

         mapResult["【拦江网十干】"] = lanjiangwang(bazi, commonAlgorithm)
         mapResult["【天元赋】"] = tianyuanfu(bazi, commonAlgorithm)

         //十干喜忌诗诀【管见子平】


         return mapResult
     }

     //终南命理十干喜忌口诀
     static Object zhongnanmingli(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()



         mapResult
     }

     //十干模板
     static Object shiganmuban(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()
         if (riGan=="甲") {

             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]


         }else if (riGan=="乙") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]



         }else if (riGan=="丙") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]



         }else if (riGan=="丁") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]
         }else if (riGan=="戊") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]
         }else if (riGan=="己") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]
         }else if (riGan=="庚") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]

         }else if (riGan=="辛") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]

         }else if (riGan=="壬") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]

         }else if (riGan=="癸") {
             mapResult["【日干】"+riGan]=[
                     ""
                     ,""
                     ,""
                     ,""
                     ,""
                     ,""
             ]
         }

         mapResult
     }

     //拦江网
     static Object lanjiangwang(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()
         if (riGan=="甲") {

             mapResult["【日干】"+riGan]=[
                     "喜用：庚丁"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：甲木挺生无根叶，庚金造作栋梁材，更爱丁火来吐秀，木火通明贵自来；"
                     ,"十干所忌歌-岁运用神一理共推：甲木从来不怕金，支成金局有忧心，不怕土埋共火化，独愁壬水泛其身；"
                     ,""
                     ,""
                     ,""
             ]


         }else if (riGan=="乙") {
             mapResult["【日干】"+riGan]=[
                     "喜用：丙癸"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：乙乃花木爱丙荣，向阳花木易逢春，癸水雨露滋根本，芝叶禾稼尽相生；"
                     ,"十干所忌歌-岁运用神一理共推：乙木微弱忌丁焚，不怕辛金只愁庚，贪合庚夫凶藏吉，运逢金库死无生；"
                     ,""
                     ,""
                     ,""
             ]



         }else if (riGan=="丙") {
             mapResult["【日干】"+riGan]=[
                     "喜用：壬甲"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：丙乃天边一太阳，甲乙之木焉能光，日逢湖海乾坤亮，专欣壬水辅阳生；"
                     ,"十干所忌歌-岁运用神一理共推：丙火太阳出自天，却愁雨露水来掩，逢辛成合化成水，运逢辛酉落西方；"
                     ,""
                     ,""
                     ,""
             ]



         }else if (riGan=="丁") {
             mapResult["【日干】"+riGan]=[
                     "喜用：甲庚"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：丁火灯烛无他爱，专取甲木接引光，次取庚辛来劈甲，得令逢之焰亦长；"
                     ,"十干所忌歌-岁运用神一理共推：丁火灯焰怕风雨，相逢癸水一场凶，湿乙不生无焰火，逢壬化木却有功；"
                     ,""
                     ,""
                     ,""
             ]
         }else if (riGan=="戊") {
             mapResult["【日干】"+riGan]=[
                     "喜用：甲丙"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：戊乃太山至不灵，用甲来劈有精神"
                     ,"十干所忌歌-岁运用神一理共推：戊土高山洁且清，忌己湿泥沾其身，又忌乙木多搜破，逢癸化火反成禛； "
                     ,""
                     ,""
                     ,""
             ]
         }else if (riGan=="己") {
             mapResult["【日干】"+riGan]=[
                     "喜用：丙癸"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：己乃田园爱丙暖，逢癸可作美田称；"
                     ,"十干所忌歌-岁运用神一理共推：己土田园本爱水，无癸却作旱田推，只怕壬水兴波浪，生茅淹死作沙泥；"
                     ,""
                     ,""
                     ,""
             ]
         }else if (riGan=="庚") {
             mapResult["【日干】"+riGan]=[
                     "喜用：丁甲"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：庚金顽钝可制熔，或用丙丁暖其身，更爱壬水来伤泄，土厚埋金甲有情；"
                     ,"十干所忌歌-岁运用神一理共推：庚金从来不怕丙，丙火在天岂熔金，只怕壬水来寒滞，土厚埋金一场刑；"
                     ,""
                     ,""
                     ,""
             ]

         }else if (riGan=="辛") {
             mapResult["【日干】"+riGan]=[
                     "喜用：壬丙"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：辛金珠玉喜壬淘，土厚还须用甲高，冬乐丙火来解冻，己土湿泥酌用瘳（音chou ,意 “损害”）；"
                     ,"十干所忌歌-岁运用神一理共推：辛金珠玉清必贵，只愁己土蔽金光，三冬雨露渄金爱，冻金困丙实堪伤；"
                     ,""
                     ,""
                     ,""
             ]

         }else if (riGan=="壬") {
             mapResult["【日干】"+riGan]=[
                     "喜用：辛戊"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：壬乐戊土为堤岸，又喜庚金发水源，甲丙两般皆酌用，当分衰旺理亦玄；"
                     ,"十干所忌歌-岁运用神一理共推：壬水不愁太山土，水旺用为堤岸防，江湖死水须澄洁，却愁己土浊沧浪；"
                     ,""
                     ,""
                     ,""
             ]

         }else if (riGan=="癸") {
             mapResult["【日干】"+riGan]=[
                     "喜用：庚辛"
                     ,"十干所喜歌-岁运四柱皆喜用神一理而推：癸快庚辛无别取，辛金清秀又为隆，若逢水冷金寒候，丙火解冻有奇功。"
                     ,"十干所忌歌-岁运用神一理共推：癸水怕丙熬干性，又愁戊土塞根源，土厚无甲来疏劈，纵有庚金也不然。"
                     ,""
                     ,""
                     ,""
             ]
         }

         mapResult
     }


     //十干喜忌诗诀【管见子平】
     static Object guanjianziping(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()
         if (riGan=="甲") {

             mapResult["【日干】"+riGan]=[
                     "甲木枝干春向荣，土金火透最为亨。庚辛不忌逢壬癸，戊己何妨见丙丁。官杀印乡多富贵，食伤财地必峥嵘。虎猪蛇鼠生逢时，跨凤乘龙上帝京。"
                     ,"甲木属阳，乃枝干之木，生值春月，正当生旺，必假金以剥制，方成栋梁之才。设若无金，必得厚土。如土金俱无，必丙丁火透出，以泄其旺气。此三者，只是太过，宜脱之、剥之之象。不过，取其中和耳，别无他论也。如庚辛申酉，金气多者，见壬癸水为用。戊己，土气厚者，必得丙丁火为用。此杀官喜印、伤食喜财，只要五行所得之意。虎，寅也;猪，亥也;蛇，巳也;鼠，子也;鸡，酉也;龙，辰也。时元值之，上贵之命也。"
             ]


         }else if (riGan=="乙") {
             mapResult["【日干】"+riGan]=[
                     "乙为根蒂做天干，不用金剥火是官。"
                     ,"曲直体成南去乐，从革局就北来观。"
                     ,"财强杀旺名中外，水浅金轻伤肾肝。"
                     ,"马猴时遇多荣达，鼠兔加临作贵看。"
                     ,"乙木属阴，乃根蒂之木;生于春三月，正当有气;必得金制，方能成功。如无金，必得火透天干，有木火通明之象。赋云：火明木秀，斯人不负经魁。若四柱纯木，以成曲直之体;喜行南运，取贵。若四柱金多而成从革之体;喜行北运，取贵。四柱少水生，而无金剥，多主肾部、肝经不足之病，性多恼怒，盖肝藏气故也。财强杀旺，为之财滋七杀，令名必扬中外也。午申子卯，四时生人，多主富贵。"
             ]



         }else if (riGan=="丙") {
             mapResult["【日干】"+riGan]=[
                     "丙为阳火号文明，金水相逢极有情。"
                     ,"巳午见官终不显，子申遇印始成名(论提纲)"
                     ,"贫穷有学谈天地，富贵无缘靠弟兄。"
                     ,"用入库乡当退位，休言伐木鸟嘤嘤。"
                     ,"丙火属阳，乃文明之象，生于金水提纲，多主富贵，此禄马旺地，故有情也。生巳午提纲，官星无气，又行东南运，其官终不能显。如生子申月令，财官有气之地，但得岁运印绶一生之，其功名必成。生于夏月，财官俱弱;身虽贫贱，有谈天论地之才学;盖丙主礼，又主文明故也。生金水旺时，财官得令;而比肩无力，多不得弟兄辅助;或暗中有生扶，却有贼恩之祸。但怕用神入库，当有退位休官之叹，而无出谷迁乔之理。又当审辨，用之轻重，库之开闭。如原柱中有库，岂可又以库言哉。"
             ]



         }else if (riGan=="丁") {
             mapResult["【日干】"+riGan]=[
                     "丁火其形本属阴，阳光许助结同心。"
                     ,"藏财坐贵偏宜甲，跨马骑牛最爱壬。"
                     ,"财杀旺时名愈重，水金衰处困尤深。"
                     ,"二阳产降逢天乙，爕理阴阳妙用金。"
                     ,"丁火阴柔，得阳火助之，方美。十段锦云：丁为阴火，喜遇阳壬，见丙兮百年安逸。盖谓丙内藏辛，丙邀辛金，为丁火之偏财，亦助丁火之光;故云结同心也。财星喜藏，贵人宜坐，甲木宜透，此为贵命也。"
                     ,"午丑二字，用之扶助;盖午丁火之禄，丑乃丁火财库，二者宜见之为妙。壬水正官，岂不最爱之?如生寅卯提纲，为印绶，喜见壬水为官。如财杀并透，有力者，大富贵之命。但水金衰弱，定主蹇滞。如丁火生于季冬月令，财杀并透，又有天乙贵人辅助，此乃宰相之命也。宜斟酌较之，庶无差忒。"
             ]
         }else if (riGan=="戊") {
             mapResult["【日干】"+riGan]=[
                     "戊为阳土即丘陵，坐库藏财贵有恒。"
                     ,"甲乙旺时名愈重，财干墓地寿难凭。"
                     ,"五行生处为佳兆，三合逢时是福征。"
                     ,"印重财轻官杀坏，伤残肢体病难胜。"
                     ,"积土为丘;王冢曰陵。皆动而有成之象。戊土属阳，故以此二者喻之。坐下库，谓之有根;藏有财，谓之不燥。合此二者，不但主贵，亦主有恒。盖土主信，体用相宜，乃禀中和之气。日主有气，再得官杀旺相，功名自然显达。如专用财，又行财星墓地，只恐难为寿矣。且财星之墓，此人多患脾胃之病。土能长养万物，故喜生气。土合则厚，必无倾颓之患。三合逢之，自为福利。如四柱印绶太重，又无财星，官杀俱绝，又无食伤，火炎土燥，疾病可知矣。"
             ]
         }else if (riGan=="己") {
             mapResult["【日干】"+riGan]=[
                     "己土平平一野场，多金多水亦多光。"
                     ,"攀龙附凤声名重，跨马骑牛姓字香。"
                     ,"身旺官星原有用，主强七煞应无伤。"
                     ,"支干带合根基厚，堪与皇家做栋梁。"
                     ,"己土属阴，而主静，为平地野场之土。喜伤食、财星，愈多愈妙。柱得辰酉二字，以益其体。午丑二字，以助其用。如此者，体用相益，自然显达。日主旺相，见官星七杀，则主荣贵。赋云：木疏季土，培成稼穑之禾。岂不宜见乎?凡用土必要见合，则无虚崩之患。如五行带合，不偏不党;财官得所，不重不轻，无混杂之病;得中和之气，岂不为国家栋梁乎?辰丑酉午四字，非柱中见之为吉，岁运逢之亦美。"
             ]
         }else if (riGan=="庚") {
             mapResult["【日干】"+riGan]=[
                     "庚金锋锐旺秋天，冬月生人更妙玄。"
                     ,"木火绝嫌西与北，水金旺爱走东南。"
                     ,"时逢申子财名备，柱带牛羊富贵全。"
                     ,"埋没不遭金水旺，管教万里掌兵权。"
                     ,"阳金质刚，秋正司权，其体自然锋锐。生于冬月，有金水澄清之象。赋云：金白水清，此辈定登甲第。又云：金兼爱水之相涵，文学堪夸。可见用金要水，有金水相涵之秀，是其妙且玄也。柱中如水火俱绝而无气，忌行西北冷运。如水金乘旺，喜行东南方暖运。如得申巳二时，乃得禄、长生之地，多主富贵，财名并有。丑未，乃庚金贵人、财库之地。富贵双全，更要日干有气，财官旺相，见之者，妙。如日主轻，财官弱，又非也。不遭戊己土埋没，而合金水澄清，再有杀刃帮扶，定掌兵权之贵。"
             ]

         }else if (riGan=="辛") {
             mapResult["【日干】"+riGan]=[
                     "辛金原自土中生，木火提纲福不轻。"
                     ,"时遇虎龙多富贵，提逢亥子更聪明。"
                     ,"逆行西北还淹滞，顺历东南定显名。"
                     ,"但虑冬前寒太极，虽逢暖地只平平。"
                     ,"阴金本无形质，赖土以生;土愈多，而金愈厚矣。木火提纲，时元有助，其福难量，要以轻重较之，方可用寅辰二时，值之者，多主富贵。盖寅时财官生旺，又是天乙贵人之地。辰时内含水土库，正印扶身，水涵秀气。赋云：辛日壬辰贵在申者是也。如值多子提纲，主人聪明秀丽。西北背禄逐马之运，名利多淹滞。东南地暖，财官乘旺之乡，功名自然显达。但忌生于冬至以前，天地之气大寒。虽行东南方和暖之地，亦只平常之命也。"
             ]

         }else if (riGan=="壬") {
             mapResult["【日干】"+riGan]=[
                     "汪洋壬水旺三冬，最爱干头火土重。"
                     ,"秋降勾陈能作吉，春生朱雀岂为凶。"
                     ,"三方火局偏宜合，四库提逢不忌冲。"
                     ,"龙虎重重时日月，禹门神鲤化蛟龙。"
                     ,"水归冬旺，以时而言，必得火土透出，取贵。生于秋月，为印绶提纲，必得官杀透出，始吉。如生寅卯提纲，乃是伤官食神，必得财星，方能取其贵也。三方合成火局，有既济之象。生于四库提纲，必得冲开，方美。如日主、月令、时元，见寅辰二字多者，非壬骑龙背，必六壬趋艮。以神鲤而变蛟龙，乃大贵人之命也。"
             ]

         }else if (riGan=="癸") {
             mapResult["【日干】"+riGan]=[
                     "癸水池塘应不流，文含玄武可行舟。"
                     ,"申辰格备形如虎，寅午局全气食牛。"
                     ,"印重南方偏喜悦，财多北地岂忧愁。"
                     ,"坐库身强火土旺，为官必定效伊周。"
                     ,"癸水属阴，静而有常，故以池塘而喻之，盖阴主平静。如支下类成水局，上下交感，静极而动，可以通行舟楫矣。如申子辰三合备，天元有气，有大人虎变之象。寅午戌火局全者，水旺逢火，合成既济之名，自有食牛之志。印旺者，喜行财运。财多者，爱入劫乡。不过取中和之气，别无他议也。如坐下丑库，又重重见丑，为丑遥巳格。如无伤破，则有伊尹周公之勋业，乃宰相之命也。"
             ]
         }

         mapResult
     }


     //唐.一行禅师【天元赋】
     static Object tianyuanfu(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()
         if (riGan=="甲") {

             mapResult["【日干】"+riGan]=[
                      "【正印】甲得癸而滋荣，衣食自然丰足。"
                     ,"【七杀】阳木甲逢庚败，枝梢不得无伤。"
                     ,"【食神】食堂福寿崇高，皆言甲到丙乡"
                     ,"甲逢丁而成焰，资财累岁多朽。"
                     ,"甲憎乙向，逢之自己多灾。"
                     ,"甲见辛而化官，刚柔相济。"
                     ,"甲己相逢，化土为福，则夫妇遐昌。"
                     ,""
                     ,""
                     ,""
             ]


         }else if (riGan=="乙") {
             mapResult["【日干】"+riGan]=[
                     " 【正印】乙伴壬而获福，天赐禄位高崇。"
                     ,"【七杀】阴木乙遇辛金，茎叶自然有损。"
                     ,"【食神】朝省闻贵优升，盖为乙居丁舍"
                     ,"乙遇丙而化灰，金玉自消难聚。"
                     ,"乙被甲临，反与人为助。"
                     ,"乙见庚而为福，兄弟同乡。"
                     ,"乙庚各合，成金得位，则东西类化。"
                     ,""
                     ,""
                     ,""
             ]



         }else if (riGan=="丙") {
             mapResult["【日干】"+riGan]=[
                      "丙乙交会，平生福寿超群，出世深成才业。"
                     ,"炎炎丙火，遇壬而赫赫无光。"
                     ,"官禄并叠，丙食戊而成功"
                     ,"天元正败，丙见己而伤残。"
                     ,"丙最输丁"
                      ,"水火既济，却言丙对癸乡。"
                      ,"丙辛化水，智显则必主文章。"
                      ,""
                      ,""
                      ,""
             ]



         }else if (riGan=="丁") {
             mapResult["【日干】"+riGan]=[
                      "丁无正印诀"
                     ,"烁烁阴丁，逢癸而明辉自暗。"
                     ,"谷麦盈仓，丁啖己而有旺。"
                     ,"干禄全轻，丁值戊而衰弱。"
                     ,"丁嫌暗丙"
                      ,"意气相承，乃是丁归壬舍。"
                      ,"丁壬为木，聪明则近善多仁。"
                      ,""
                      ,""
                      ,""
             ]
         }else if (riGan=="戊") {
             mapResult["【日干】"+riGan]=[
                      "戊印丁兮，似虎居山谷之威。"
                     ,"戊居甲位，惟赖庚方能吉。"
                     ,"要得丰足，无过戊得逢庚。"
                     ,""
                     ,"戊同己兮，多生脾胃之疾。" ,""
                      ,"戊临乙位，得木而生成。"
                      ,"戊癸得化，禄位崇高，二者相逢，三才可立。"
                      ,""
                      ,""
             ]
         }else if (riGan=="己") {
             mapResult["【日干】"+riGan]=[
                      "己交丙兮，象龙得风云之势。"
                     ,"己坐乙乡，知是干头有鬼。"
                     ,"欲问高迁，全赖己加辛地。"
                     ,""
                     ,"己共戊兮，反有奔波之事。" ,""
                      ,"己向甲乡，阴遇阳而可贵。"
                      ,""
                      ,""
                      ,""
             ]
         }else if (riGan=="庚") {
             mapResult["【日干】"+riGan]=[
                      "庚逢己土，官禄有余。"
                     ,"庚逢丙战，势自倾危"
                     ,"满堂金玉，庚禄有壬。"
                     ,"庚中见癸，荡散资财。"
                     ,"柔能制刚，多因辛与庚期，大重之余，乃是辛居庚地。" ,""
                      ,"白虎通道，庚加丁临"
                      ,""
                      ,""
                      ,""
             ]

         }else if (riGan=="辛") {
             mapResult["【日干】"+riGan]=[
                      "辛到戊乡，衣食自足。"
                     ,"辛被丁侵，克伐成害"
                     ,"广置田园，辛能食癸。"
                     ,"辛禄遇壬，熔消福禄。"
                     ,"辛忌庚方" ,""
                      ,"太阴得路，辛归丙舍"
                      ,""
                      ,""
                      ,""
             ]

         }else if (riGan=="壬") {
             mapResult["【日干】"+riGan]=[
                      "壬水得辛，福寿无疆。"
                     ,"壬忧戊至，蹇气难通"
                     ,"壬食甲而有旺，众福如麻。"
                     ,"年少逢灾，壬伤乙运。"
                     ,"壬行癸厄" ,""
                      ,"壬于己兮，远泛洪波。"
                      ,""
                      ,""
                      ,""
             ]

         }else if (riGan=="癸") {
             mapResult["【日干】"+riGan]=[
                      "癸庚相逢，偏饶仆马。"
                     ,"癸怕己临，迟晦惊惶"
                     ,"癸向乙而生成，入食列鼎。"
                     ,"祖财随废，癸被甲侵。"
                     ,"癸喜戊兮，澄澜漂渺。"
                      ,""
                      ,""
                      ,""
                      ,""
                      ,""
             ]
         }

         mapResult
     }


     //滴天髓
     static Object ditiansui(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()
         if (riGan=="甲") {

             mapResult["【日干】"+riGan]=[
                     "甲木参天，脱胎要火。春不容金，秋不容土。火炽乘龙，水宕骑虎。地润天和，植立千古。"
             ]


         }else if (riGan=="乙") {
             mapResult["【日干】"+riGan]=[
                     "乙木虽柔，刲羊解牛。怀丁抱丙，跨凤乘猴。虚湿之地，骑马亦忧。藤萝系甲，可春可秋。刲(kuī)割取"
             ]



         }else if (riGan=="丙") {
             mapResult["【日干】"+riGan]=[
                     "丙火猛烈，欺霜侮雪。能锻庚金，逢辛反怯。土众成慈，水猖显节。虎马犬乡，甲木若来，必当焚灭（一本作虎马犬乡，甲来成灭）。"
             ]



         }else if (riGan=="丁") {
             mapResult["【日干】"+riGan]=[
                     "丁火柔中，内性昭融。抱乙而孝，合壬而忠。旺而不烈，衰而不穷，如有嫡母，可秋可冬。"
             ]
         }else if (riGan=="戊") {
             mapResult["【日干】"+riGan]=[
                     "戊土固重，既中且正。静翕动辟，万物司命。水润物生，火燥物病。若在艮坤，怕冲宜静。"
             ]
         }else if (riGan=="己") {
             mapResult["【日干】"+riGan]=[
                     "己土卑湿，中正蓄藏。不愁木盛，不畏水狂。火少火晦，金多金光。若要物旺，宜助宜帮。"
             ]
         }else if (riGan=="庚") {
             mapResult["【日干】"+riGan]=[
                     "庚金带煞，刚健为最。得水而清，得火而锐。土润则生，土干则脆。能赢甲兄，输于乙妹。"
             ]

         }else if (riGan=="辛") {
             mapResult["【日干】"+riGan]=[
                     "辛金软弱，温润而清。畏土之叠，乐水之盈。能扶社稷，能救生灵。热则喜母，寒则喜丁。"
             ]

         }else if (riGan=="壬") {
             mapResult["【日干】"+riGan]=[
                     "壬水通河，能泄金气，刚中之德，周流不滞。通根透癸，冲天奔地。化则有情，从则相济。"
             ]

         }else if (riGan=="癸") {
             mapResult["【日干】"+riGan]=[
                     "癸水至弱，达于天津。得龙而运，功化斯神。不愁火土，不论庚辛。合戊见火，化象斯真。"
             ]
         }

         mapResult
     }

     //十干体象
     static Object shigantixiang(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()
         if (riGan=="甲") {

             mapResult["【日干】"+riGan]=[
                     "甲木天干作首排，原無枝葉與根荄。欲存天地千年久，直向泥沙萬丈埋。斷就棟梁金得用，化成灰炭火爲災。蠢然塊物無機事，一任春秋自往來。"
             ]


         }else if (riGan=="乙") {
             mapResult["【日干】"+riGan]=[
                     "乙木根荄種得深，只宜陽地不宜陰。漂浮最怕多逢水，刻斫何須苦用金。南去火炎災不淺，西行土重禍猶侵。棟梁不是連根木，辨別工夫好用心。"
             ]



         }else if (riGan=="丙") {
             mapResult["【日干】"+riGan]=[
                     "丙火明明一太陽，原從正大立綱常。洪光不獨窺千里，巨焰猶能遍八荒。出世肯爲浮木子，傳生不作濕泥娘。江湖死水安能剋，惟怕成林木作殃。"
             ]



         }else if (riGan=="丁") {
             mapResult["【日干】"+riGan]=[
                     "丁火其形一燭燈，太陽相見奪光明。得時能化千斤鐵，失令難熔一寸金。雖少乾柴尤可引，縱多濕木不能生。其間衰旺當分曉，旺比一爐衰一檠。"
             ]
         }else if (riGan=="戊") {
             mapResult["【日干】"+riGan]=[
                     "戊土城牆堤岸同，鎮江河海要根重，柱中帶合形還壯，日下乘虛勢必崩。力薄不勝金漏泄，功成安用木疏通。平生最愛東南健，身旺東南健失中。"
             ]
         }else if (riGan=="己") {
             mapResult["【日干】"+riGan]=[
                     "己土田園屬四維，坤深能爲萬物基。水金旺處身還弱，火土功成局最奇。"
             ]
         }else if (riGan=="庚") {
             mapResult["【日干】"+riGan]=[
                     "庚金頑鈍性偏剛，火制功成怕水鄉。夏産東南過鍛煉，秋生西北亦光芒。水深反見他相剋，木旺能令我自傷。戊己干支重遇土，不逢衝破即埋藏。"
             ]

         }else if (riGan=="辛") {
             mapResult["【日干】"+riGan]=[
                     "辛金珠玉性通靈，最愛陽和沙水清。成就不勞炎火煆，滋扶偏愛濕泥生。木多火旺宜西北，水冷金寒要丙丁。坐祿通根身旺地，何愁厚土沒其形。"
             ]

         }else if (riGan=="壬") {
             mapResult["【日干】"+riGan]=[
                     "壬水汪洋並百川，漫流天下總無邊。干支多聚成漂蕩，火土重逢涸本源。養性結胎須未午，長生歸祿屬乾坤。身強原自無財祿，西北行程厄少年。"
             ]

         }else if (riGan=="癸") {
             mapResult["【日干】"+riGan]=[
                     "癸水應非雨露麽，根通亥子即江河。柱無坤坎身還弱，局有財官不尚多。申子辰全成上格，午寅戌備要中和。假饒火土生深夏，西北行程豈太過。"
             ]
         }

         mapResult
     }

     //御定子平规则
     static Object yudingziping(BaZi bazi, CommonAlgorithm commonAlgorithm) {
         def mapResult = [:]

         def riGan = bazi.getRiGan()
         def riZhi = bazi.getRiZhi()
         def riZhu = bazi.getRiZhu()

         if (riGan=="甲") {

             mapResult["【日干】"+riGan]=[
                     "甲木属阳，乃参天拔地，舒枝抽干之木。一出于地，不可挪移，不论春夏秋冬，亦不论良枯巨细，总要重土厚培，固其根底然后徐寻火金水木，以定贵富贫贱寿夭之局。所谓：欲图长久千年计，须向沙泥万丈埋是也。"
                      ,"若土薄根摇，则无论金克水荡，木劫火焚，固己必遭夭折矣.盖根不深而枝叶茂者未之有也。"
                     ,"甲为阳木，乃栋梁之材。生于初春，其质犹嫩；仲春方得旺气；三月水土温和，根株尤实，不得以衰论也。"
                     ,"至盛夏之时，其气尽发于外，外虽盛而内实虚。初秋之候，质渐结实；而深秋尤极坚固，盖凋零者其枝叶，贞固者其体干也。"
                     ,"至于亥月为长生之地，子丑月则木又得相气。"
                     ,"故春日之甲，喜丙火以舒其性，且防金克；夏日之甲，喜水以滋其根，不宜水泛；秋日之甲，喜金以成其用，无火亦不妨；冬日之甲，必得夕(炙火)以解其寒。"
                     ,"总之，其栽根植本，不论四时，俱喜见土。故四柱金旺火衰，即以弱论.若土(多)金水少，反以强称也。"
             ]
             if (riZhi=="子") {
                 mapResult["【日柱】"+riZhu]=[
                         "此溪边空心衰败之木也。先看枝柱有土培否，更看左右之根，与未中之库(后)方看金官火食。"
                         ,"遇金则为栋梁斧斤，遇火则为木火通明，遇土为殷实笃厚，遇水则为郁苍秀古。"
                         ,"或全或毁，或奇或正，或平或扁，始得定其品局。若培植不坚，根基不稳，更有马冲鬼凌，不问而知其夭折；"
                         ,"运之乘蹇(穷困,不顺利),独其次而。倘遇比肩重叠，只宜金火相成。"
                 ]
             }else if (riZhi=="寅") {
                 mapResult["【日柱】"+riZhu]=[
                         "此硕果品汇之木也。其果可当禄食，先要看有人看守【看守维何？庚辛是也，但辛不如庚耳。大约先喜庚，次喜辛。】，庶免剽窃，克享福寿；再无冲动，加以根芑叶茂，财官并著，否则名利虚花。"
                         ,"或有刑冲破禄坏印，则福禄自耗，必至飘零而后已。次看财食印绶，【最忌无官无煞】，而后行比劫刑冲破败之运。"
                 ]

             }else if (riZhi=="辰") {
                 mapResult["【日柱】"+riZhu]=[
                         "此郁湿水松之木也。木气郁于湿土之中，根蒂甚固，人领之，多含醇朴，所少者挥霍发扬田耳。最喜露庚露丙，方能发达；否则依阿苟且，田福寿亦偏。若遇比劫重叠，尤宜厚土栽根，不至土疏木败。不怕水局会丛，只怕刑冲劫害，最喜丙丁戊已、寅午戌火土运，忌行申酉亥子丑抑郁运"]

             }else if (riZhi=="午") {
                 mapResult["【日柱】"+riZhu]=["工师运斤之木也。其木取之于山，用之于家，必要庚辛透露，庚第一，辛次之，田则利器在手，方成栋梁，而善其事；否则不免枯朽而已。从来甲午逢庚，多为台谏。如柱中有寅，有亥，发福更大。壬癸重叠，非所好也。大抵喜金水，忌木火土运。木遇火而通明，然火多则木焚，故原有火者，不宜复行火运。"]

             }else if (riZhi=="申") {
                 mapResult["【日柱】"+riZhu]=["此砍断入水之木也。木根虽断，精液犹存，每每绝处再生。故一水底，得水浸润，便与金石同坚。是以四柱运中，若逢水局，无人不发；倘一暴十寒，枯朽I立至，所谓“枯木偏宜活水濡”也。喜行金水木湿土运，忌行火土枯燥运。"]


             }else if (riZhi=="戌") {
                 mapResult["【日柱】"+riZhu]=["此窖土松杉之木也。其木土存则存，土散则散，必要培戌，不可冲戌；然后看官煞以去枯蔓，再看雨露以润根荄，则上有一枝挺承，旁无余蔓盗窃，前后左右，一团苞孕，其神气坚固，自应栋梁，若刑冲破败减半矣。喜五行葆运，忌违时冲克运。"]

             }

         }else if (riGan=="乙") {
             mapResult["【日干】"+riGan]=[
                     "乙木属阴，乃名花佳卉，稻黍稷麦菽之类。其木婀娜多姿，可以移东就西，须要春培夏荫秋灌冬暄。然后去留舒配，得宜为得用，失宜为失用。最怕者甲木逼处为害，尤怕者庚金掣肘不伸。"

             ]

             if (riZhi=="丑") {
                 mapResult["【日柱】"+riZhu]=["此沾土初芽之木也。二阳已长，万象解甲，氤氲元气之中，人必存心仁厚，最宜遵养爱护，不宜轻折摧残；既怕旱，又怕涝，喜雨旸时若，火土温和是其妙境也。从来体用，有戊寅相逢，无人不发。倘旱涝交浸，刑冲迭见，即失中和之道。参观时令，又是吃紧法门。大约喜见乙木、丙火、戊土，得微云细雨之养，忌甲木庚金，大旱大涝，及刑冲克战运"]

             }else if (riZhi=="卯") {
                 mapResult["【日柱】"+riZhu]=["此禾黍秀实，禄品之木也，不惟可以悦目，抑且可以充饥。禄食有余，珍重可爱，加以财官印绶相护，不问而知其宝贵。即参以食伤吐气，亦不问而知其豪杰。最怕酉冲子刑，尤怕甲劫辰害，喜行辛金、乙木、水火土以护之，忌行庚金、甲木、申子酉以伤之。"]


             }else if (riZhi=="巳") {
                 mapResult["【日柱】"+riZhu]=["倒插花瓶之木也。其木喜庚壬相凑，无人不发，发必登科。大抵败后复成之木，必要泥桨深埋，庚壬重衬，庶几安稳易生；若遇丙丁一阳来复，更为易长。最怕刑冲枯燥，牛羊践履，一冲即死，有摇亦枯；不冲不摇，虽无庚壬，但有酉丑相会，亦可以托根延生矣。喜金水温土会巳，怕木火燥土冲巳。"]


             }else if (riZhi=="未") {
                 mapResult["【日柱】"+riZhu]=["此藤萝施架之木也。柔顺蔓延，人生多委靡不振，最喜高架相护，始得挺承雨露。故有架即沾君恩，无架终落尘埃。高架维何？寅亥甲木是也。若四柱无架，行运遇冲，不但名利俱坏，即命亦虑其难全也。喜行甲 乙寅亥火土吐气之运，忌行庚辛己、申午未墓库之运。"]


             }else if (riZhi=="酉") {
                 mapResult["【日柱】"+riZhu]=["此盆花奇香之木也。清新馨秀，可供帝玩。若干有财官印绶，支无刑冲破败，必有鉴赏者矣。但怕行亥午之运，午破酉，亥刑酉，英华一散，焉能有寿？不论秋冬春夏，与水火木金，都不甚关利害。乙酉，为官为利有权煞，生子养子终不好"]


             }else if (riZhi=="亥") {
                 mapResult["【日柱】"+riZhu]=["乙木逢死，此木上寄生之木也。从死处再生，便须依附而行。领此日者，多是移花接木，或晚生庶出。最要甲木劫星安稳，则功名富贵， 自可意外遭逢。若得太阳相照，或丁火温和，皆能享自然之福。如甲萎亥冲，不问而知，其夭折分离矣。喜行生扶及甲乙寅卯未亥相会之运，忌行克剥及酉申巳亥相冲之运。"]


             }

         }else if (riGan=="丙") {
             mapResult["【日干】:"+riGan]=["丙火属阳，乃太阳曦光之火，不可因春夏秋冬而论强弱，但分昼夜，而论生息。如昼生人最要行健，夜生人最要恬静。合而体用两全，离则体用两失。再察太阳，昼生未到辰时，尚不嫌其弱；夜生未到戌时，还要论其强。故卯时生人，虽丙丁姤合而不妨；酉时生人，虽焚膏继晷而亦不害。后论参前论，诚不易之理也",
             ]
             if (riZhi=="子") {
                 mapResult["【日柱】"+riZhu]=["此日浴咸池也。精光隐曜，夜生更得其体，如昼生则减其半矣。夜生者，能会西北申辰亥丑，便为上乘。昼生者，必遇东南寅卯巳年未方为有用。但生此日者，多躭于女色，易乱其性，不可不知所戒。昼喜行木火土运，夜喜行金水运。"]

             }else if (riZhi=="寅") {
                 mapResult["【日柱】"+riZhu]=["此日升旸谷也。太阳升殿，气概可凌万夫。如昼生人会午，更表英雄；夜生人会亥，始葆元气。最怕者，申马冲驰，无端惊动。昼生人喜会刃，夜生人忌冲马。"]


             }else if (riZhi=="辰") {
                 mapResult["【日柱】"+riZhu]=["此日经天罗也。太阳到此，微有淹滞，人领之，有蒙昧瞒旰之象。昼须遇寅巳午，众阳扶起，则不堕天罗，夜要透戊己食伤，支有申子会合，则不碰天罗。倘昼生阴曀而遇壬癸，夜生不见土德，必主少寿，便非好命。此日又名日德，得之者长存厚道。"]

             }else if (riZhi=="午") {
                 mapResult["【日柱】"+riZhu]=["此日丽中天也，羊刃甚烈，威焰逼人。人领之，性主太刚，妻宫亦有刑克。左右支柱，稍得金水，方成既济。若加甲乙丙丁炎燥，难享全福。喜行金水运，忌行火土，并忌羊刃重逢。"]


             }else if (riZhi=="申") {
                 mapResult["【日柱】"+riZhu]=["此日照昆仑也。昆仑之下有岷池，太阳到此，与水相荡，触为红霞。盖哺而将暮，弱而无力，所谓“丙临申位火无烟也。如夜生犹喜恬息，昼生必待生扶，不然多学少成，始勤终怠，更有夭折之患。从来红霞晚照，虽荣不久。人领斯造，其光景亦然。喜行木火土，忌行金水。"]


             }else if (riZhi=="戌") {
                 mapResult["【日柱】"+riZhu]=["此日入地网也。旦昼之浊气未净，暮夜之清气未澄，太阳到此困遮田甚矣。人领之，多晦倦暴燥；昼生者，支柱有寅午，加一番振作；夜生者，支柱有亥子，成一段宁息。若昼无振作之权，夜无宁息之体，恐难出人头地。昼喜木火寅午戌，夜喜金水亥子丑。至于失中，又当再酌。"]

             }

         }else if (riGan=="丁") {
             mapResult["【日干】"+riGan]=["丁火属阴，乃阴柔传灯之火，可亲可炙。或取于树，甲乙，或取于石，庚；或取于引化，壬。总喜就燥，不喜就湿，喜夜不喜昼。易生于干薪，难生于湿木。甲喜其透，乙喜其全。癸实难堪，壬为最好。"]

             if (riZhi=="丑") {
                 mapResult["【日柱】"+riZhu]=["此钻激之火也。何谓钻？钻燧于木是也，利用甲。何谓激？激，激火于石是也，利用庚。或钻或激，总要火土干地相逢，庶几可遂就燥之性。若投于丑辰未库，落于西北二方，其不渐灭也几希矣。喜行甲木火土燥运，忌行金水阴库潮湿运，丑为金水之库，丁火至此，微甚，再不干燥，必至渐灭，故不宜行金水运。"]

             }else if (riZhi=="卯") {
                 mapResult["【日柱】"+riZhu]=["此木屑香烟也。其火喜壬官粘合，则香气盘桓，可达之于帝座，名曰“正官”，四柱俱喜水土。若逢亥子，亦是生灭迭见，不但功名难成，仍恐相激易败。若既无壬癸，再加火土燥烈，则散漫无统，攸忽易散矣。喜金水潮湿，忌木火土干燥。丁用卯中乙木为嫡母，故宜生不宜伤。苟逢枯燥之乡，则木焚而香气失，必用壬来相合。丁壬化木，子能从母，孝子之义也。"]


             }else if (riZhi=="巳") {
                 mapResult["【日柱】"+riZhu]=["此燧珠之火也。触于曦光，则炎光可燎；若逢阴雨，则火气难生。领此者，其功名富贵，都从直中取得，勿向曲里求成。故喜诞乙巳、丙午、丁未三时，则炎燃立见，取功名如拾芥也。若非巳午未时生人，则韬晦无闻；再加亥马冲驰，必是傍人门户，且不能多寿矣。喜行东南木火土开霁之运，忌行西北金水墓库阴瞳田之运。 "]


             }else if (riZhi=="未") {
                 mapResult["【日柱】"+riZhu]=["此灰烬香烟也。火生土，土亦能存火，丁未是也。其火有烟无焰，全赖戊己灰土重埋，则耐久不灭。人领之，多含锋敛锷，功名不显，福寿无涯。昼生不见光彩，利于夜生，早年困迍多端，必至晚景荣耀，老益康宁。只怕丑未冲灭，未免克妻耳。喜行金水木运，忌行火土并冲运。若四柱失中和，又加酌论。"]

             }else if (riZhi=="酉") {
                 mapResult["【日柱】"+riZhu]=["此琉璃光灯也。其火 晶光莹彻，夜生分外辉煌，昼生亦抱光自莹。人领之，聪明伶俐，荣华可知。最喜壬水乙木，最忌癸水甲木。若遇午卯刑冲，便多破耗。喜乙壬火土金运，忌甲丙癸冲破运。"]


             }else if (riZhi=="亥") {
                 mapResult["【日柱】"+riZhu]=[
                         "御定子平":["此风前秉烛也。炎光恍惚，第一喜壬水来合，名曰“有罩灯笼”，可以普熙四方，可以持行千里，全然不怕风雨，定有科甲之造。若无壬，亦喜有庚在千，名曰“镇压在手”，可以止浪息风，可以镇守边疆，亦可以不怕风涛，必为武职之造。苟无庚无壬，则悠悠忽忽，难语功名富贵矣。再加刑冲，贫穷夭折，所不免也。喜行壬庚火土，忌行甲癸刑冲。"]
                 ]

             }
         }else if (riGan=="戊") {
             mapResult["【日干】:"+riGan]=["戊土属阳，乃冈陵山阜之土，博厚高大，最为得体。更喜乔木以壮观瞻，则山有色；流水以结知音，则山有神；峻石以成峭厉，则山有骨，三者备而富贵福泽无穷矣。大抵天下名山，定然山明水秀，不乏峻石乔松。若无火为暗山，无木为童山，无金为媚山，无水为枯山，便非佳境。再考此山，不妨官煞混杂。盖博厚之土，木愈多而山愈秀，何必分梧檟樲棘哉！"]

             if (riZhi=="子") {
                 mapResult["【日柱】"+riZhu]=["此为蒙山也。山下有水，曰蒙，取其空而能响。人领之，，大约僧道投生，转为武弁，以慈悲之心，为攻伐之手。盖从来武职，多生此日，有滋润胎息，生生不已之妙，所谓“天下原无穷戊子”是也。亦看上下左右，有财官印食，所以扶之者何如。但此日生人，其子息多难，即不难亦当晚得。喜行火土寅午戌生扶，忌行官煞卯申子辰克泄。"]

             }else if (riZhi=="寅") {
                 mapResult["【日柱】"+riZhu]=["此艮山也。止而不行，静而不动，曰“艮”，取其长生趋艮，气聚脉生。人领之，有任重道远之量。再加有食有煞，有刃有财，其富贵福泽寿考，更不可量。若刑冲破耗，或田有申为冲驰，则减半矣。喜财官印绶食伤，舒配得宜；忌刑冲破耗，偏倚失节。"]


             }else if (riZhi=="辰") {
                 mapResult["【日柱】"+riZhu]=["此蟹象吐颖之山也。水从山腰而出，津津细流，如蟹颖然，所谓“浅水长流山不枯”是也。盖长为财库，人领之，可以终身不穷。所怕者，戌来冲辰，大失元气，恐有刑伤灾晦。喜行金木申子辰运，忌行火土寅午戌运。亦看强弱衰旺，再加去留酌取。若生三冬，四柱金水太多，又宜行火土运。"]


             }else if (riZhi=="午") {
                 mapResult["【日柱】"+riZhu]=["此火山也。炎炎燥烈，阳刃特达。人领之，性气刚急，多有刑克，不可无煞以制其凶。然太刚方用煞，若单弱不明，宜用刃以帮身，又不可专用煞也。更须用食神以制煞，用印绶以扶刃，酌其强弱，配以生扶，文可巡抚，武奇参镇。喜金水木火土调剂，忌金水木火土偏倚。"]


             }else if (riZhi=="申") {
                 mapResult["【日柱】"+riZhu]=["此石山也。山土载石，曰“崔嵬”，气象巉岩。人领之，中无邪曲，外有仪范，但坐于马上，多动少静。最喜金水木，点缀以成明秀；忌火土燥烈，神色焦枯；尤不喜比肩重叠，埋没金光。亦量盛衰强弱，再加去留舒配。喜行金水木土运，忌行丙午丁未运。"]


             }else if (riZhi=="戌") {
                 mapResult["【日柱】"+riZhu]=["此为魁罡演武之山也。步伐整齐，英雄吐气。人领之，性多慷慨。加以煞刃财食，柤剑相迭—，或遇癸水知音，其名利富贵，未有不显扬者。只怕辰冲，又逢水旺，则为背水败阵。亦须参酌强弱，再加舒配。背水阵，谓土薄水泛，势不能振也。"]


             }

         }else if (riGan=="己") {
             mapResult["【日干】:"+riGan]=["己土属阴，乃田园稼墙之土，所谓“茀厥丰草，种之黄茂”，先不可令官煞混杂，须雨旸时若，燥湿得宜，又要春耕喜木，夏耘喜水，秋收喜火，与金冬藏喜土；数者得其机宜，不至失节，则大有之年也。更知向白阳之地，春光先到，己逢丙火，无人不发。即有舒配酌取，不离丙火范围。己土最喜丙火，最验。但生于夏月，值火太燥，又当酌定。"]
             if (riZhi=="丑") {
                 mapResult["【日柱】"+riZhu]=["足水腴田也。稻途宜于湿地，膏泽极多。最喜丙火露天干，火阳薰炙，其苗易秀而实。人领之，若正印有权，必见文章事业；若有武库冲开，煞印相错，亦易成武榜功名。喜行火土乙运，忌行金水甲运。或过衰过旺，又宜酌取。"]

             }else if (riZhi=="卯") {
                 mapResult["【日柱】"+riZhu]=["此体囚失气之土也。其地硗薄，无甚膏泽，且多剥削虚损，所谓“己土化卯。未中年先主灰心”也。人领之，无祖父燕贻，亦无货殖厚积。最喜干露呙丁，支藏丑戌，庶几有救，可享富贵寿考。若干无丙丁资扶，支无丑戌帮衬，又有酉子刑冲，其不伤折也几希矣。喜行甲木丑戌运，忌行乙木甲子卯酉运。最忌己卯，行卯运必死"]

             }else if (riZhi=="巳") {
                 mapResult["【日柱】"+riZhu]=["田此岭头稼穑也。黍宜高燥，喜见丙火太阳。人生领此，稼穑不难秀实；只恐怕旱涝，其年月日时，不宜太燥。若能雨旸时若，无不富贵福寿。金水成局，贫天不免矣。苟盛衰太过，又当酌用。一云：喜行金水木，忌火土合燥运。"]

             }else if (riZhi=="未") {
                 mapResult["【日柱】"+riZhu]=["此入土之稼穑也。喜高燥，怕污湿；喜培植，怕冲害。盖土培不深，则稼穑不茂，如参药芋薯之类是也。更有外实内虚之象。人领之，忠厚笃信，硁硁田谨守，但不免刑妻。若子穿丑冲，土气便薄。喜行化土培植之运，忌行刑冲穿克剥削运。未为木库，其形土，其中木，木能克土，外实内虚，故宜培也。"]

             }else if (riZhi=="酉") {
                 mapResult["【日柱】"+riZhu]=["此筑地稼穑也。虽坐长生，实未腴熟；砌斜为正，筑虚为实，其瘠硗殆甚。最喜于支有丙寅培植，则富贵无涯。若无培植，又多克削，则富贵难望，故去留舒配，其得力者在“丙寅”二字。喜甲木火土，忌乙木金水。  "]

             }else if (riZhi=="亥") {
                 mapResult["【日柱】"+riZhu]=["此注地稼穑也。淤泥浸润，多见潮湿，少见阳光。若值三冬，土凝冰结，不无淫泆之患，损耗之忧。唯丙丁常炙，则不劳力而得秀实。设遇阴雨阴木，终妨福寿。喜行甲木火土干燥，忌行乙木金水库湿。"]

             }
         }else if (riGan=="庚") {
             mapResult["【日干】:"+riGan]=[
                     "庚金属阳，乃铜铁剑戟之类，堪为大用。须先辨其生熟，然后酌其舒配。大抵寒凝未熟之金，必先木火煅炼，方得成器。若锋锐已成之金，必用金水淬田砺，可吐光芒。若比劫既强，怕财争起，唯身弱者，喜劫帮身。"
             ]
             if (riZhi=="子") {
                 mapResult["【日柱】"+riZhu]=[
                         "此倒悬钟磬也。金空则响，喜坐于死绝空地，未穿午冲，遇击则鸣，最忌丑戌相逢。盖此庚金，内虚外实，人领之，聪明内含，声名远播，如鼓钟子宫，声闻于外。倘然财煞空灵，富贵利达。若火土填实，合汶无声。喜金水木火虚灵，忌行火土塞实。此日主最难得好，土填失空灵之体；若略无生扶，又未免虚弱无根。"
                 ]
             }else if (riZhi=="寅") {
                 mapResult["【日柱】"+riZhu]=[
                         "此人冶炉锤也。初容之金，必逢木火交集，变质易成。倘食伤一见，跃冶可虞。至于去留舒配，或文或武，加些辰水泥浆，则关涉有趋。人生逢此，喜忌休咎，判然心目。喜木火土干燥，忌金水潮湿。．若火土燥，又宜比劫禄刃印地以全之。"
                 ]

             }else if (riZhi=="辰") {
                 mapResult["【日柱】"+riZhu]=[
                         "此水师将运也。须要酉刃相逢，方为勇毅果敢。文可科第巡抚，武可征剿总镇。若无刃而有比劫云集，亦是援兵敌忾；再有戊寅资助，尤为出众英雄。故除刃之外，有劫即为威权。虽不大显，亦可成名行伍。倘既无刃，又无援兵资助，则单弱畏怯，一事无成，名曰“病后金刚”，反为魔伏，何所用之？更不宜行于陆地，谓之“旱海行舟”。未戌刑冲，亦不为吉。"
                 ]

             }else if (riZhi=="午") {
                 mapResult["【日柱】"+riZhu]=[
                         "此出冶炉锤也。既炼之金，急要干支有水，方得淬砺成硎，文武俱能成器。若无金水，又加木火，必至过激，顿成夭折。故急于用水，刃又其次耳。喜行金水运，忌行木火土运。"
                 ]

             }else if (riZhi=="申") {
                 mapResult["【日柱】"+riZhu]=[
                         "此已成剑戟也。最怕再遇火乡。若生于丙丁寅午戌之时，恐名利无成。如会申子辰水局，又得辛金壬癸相凑，其剑气自冲牛斗，文武可居极品，兼得福寿康宁。喜行金水运，忌木火土运。"
                 ]

             }else if (riZhi=="戌") {
                 mapResult["【日柱】"+riZhu]=[
                         "此陆路将军也。人土无光，尘埋自易。亦要阳刃相逢，方能抵敌。若有比劫，亦是援兵敌忾，则膂力方刚，自能建立功名。倘无刃无援，则单弱难以鼓勇。一技壬癸申子辰水，则手足俱疲，不但名利无成，即性命亦难保矣。最忌者辰也，一冲即死。盖陆师入水，勇无所施。喜行金火土运，忌行水库水乡。若水运有劫，则不喜。"
                 ]

             }
         }else if (riGan=="辛") {
             mapResult["【日干】:"+riGan]=[
                     "辛金属阴，乃金玉珠宝之类。性地虚灵，气禀晶莹，先要印绶以资其质，更要食伤以吐其秀。阳和沙水，是其妙剂。大约精者不宜粗用，粹者不宜急投，遇春冬喜微火，夏秋喜清水。"

             ]
             if (riZhi=="丑") {
                 mapResult["【日柱】"+riZhu]=[
                         "此初孩胎息之金也。泽地萃金，清而不离乎浊，胎而未离乎元，急须爱护保存，勿令摧残伤损。要知此金胎于戊、于寅、于戌，类乎“玉出昆冈”；胎于庚、于子、于辰，类乎“金生丽水”。亦有老蚌生珠，或是晚生庶出。故有庚有戊有子有辰戌寅，则富贵无期；再加无刑冲无破败，则福寿可享。大抵喜护，即为国家奇宝；不善护，则为淤泥弃物。喜行金水沙土生扶运，忌行木火卯未刑冲运。"
                 ]
             }else if (riZhi=="卯") {
                 mapResult["【日柱】"+riZhu]=[
                         "此木精之金也。古木精液，触其曦气，凝土结为玳瑁，或金锡追琢，首饰翡翠，有意求为菲薄。是皆坐卯之辛，其质极虚幻脆薄，虽为可爱，实易毁坏。人领之，是孤介决绝之念，必辅以戊子、戊戌、丙戌相扶，庶几有所托而行于世，可获名利、妻子、福寿之报。若无戊子戊戌相扶，即单有丙丁照耀，亦为官贵虚邀，多是僧道现世，或无嗣承祧，或贫寒夭折，或骨肉寡情。喜行金土子戌相扶，忌行一派木火亥卯克泄。如遇水运，看其前后左右，另为酌用。大抵必有印绶，始用食神。不然，吐气反泄气也"
                 ]

             }else if (riZhi=="巳") {
                 mapResult["【日柱】"+riZhu]=[
                         "此石中璞玉也。玉藏石中，未雕曰“璞”。雕琢之功，惟水得以表见。所谓玉出昆冈，雨后吐彩也。生此日者，如天干有水则清白可爱，决主富贵利达。即支中藏有水者，次之。如干支俱无水，纵有财官，亦无用矣。遇丙化亦佳，偏喜亥冲为妙。喜行金水，忌行木火。土若盛衰强弱，又当再酌。"
                 ]

             }else if (riZhi=="未") {
                 mapResult["【日柱】"+riZhu]=[
                         "此溪土成金也。金从土生，得土即得金。生此日者，先要戊己资助，次要壬癸吐气。但己不如戊、癸不如壬之得力耳。只怕甲乙透出克土，再怕阴时淹滞，难以成炼。如有土有水，一炼成金，即售高价。大约看福寿以土为主，取功名以水为主，二者俱不可伤。"
                 ]

             }else if (riZhi=="酉") {
                 mapResult["【日柱】"+riZhu]=[
                         "此珍贵金玉也。辛禄居酉，乃宗庙瑚琏之重器，谁不爱敬？生此日者，有水透出，则光彩百倍，加之无木无火无庚，无暴气纳凿，便为朝家至宝，功名显薯也必矣。喜行金水，忌行木火土，并刑冲破败。"
                 ]

             }else if (riZhi=="亥") {
                 mapResult["【日柱】"+riZhu]=[
                         "，此水底珠玉也。淘沙可以见金，生此日者，名利从劳力忧患中来。最喜有寅合亥，名曰“捞金用筛”，文武即登彼岸。如无寅筛而遇土填水落，泥污刑库，则沉沦苦海，终无用矣。喜行寅午戌火土，忌行申子辰水库。"
                 ]

             }



         }else if (riGan=="壬") {
             mapResult["【日干】"+riGan]=["壬水属阳，乃天河雨露之水。有云油然，则普润苍生，作福无涯；若无云之雨，即沟浍皆盈，其涸可以立待。故壬水先要密云，方为有用；至用甲乙吐气，又其次耳。及水旺用土，此去留舒配之论，非本体也。其云惟何？庚辛是也。"
             ]
             if (riZhi=="子") {
                 mapResult["【日柱】"+riZhu]=["，此波涛洋溢之水也。生此日者，有煞以制刃，则狂澜砥柱，清晏田立俟，为文为武；再加印绶与官煞食伤，互相制伏，其功名富贵，大不可量。否则泛滥无所底止，将要转于沟壑之忧。喜行火土，忌行金水木。 "
                 ]
             }else if (riZhi=="寅") {
                 mapResult["【日柱】"+riZhu]=[
                         "此雨落沙堤也。见其人，不见其出，藏蓄于艮山之中，故富者俱多。若云雨并集，趋走东流，则利达无比。有木透出，多是武贵。若上下四旁，火土太燥，是镕冶之辈而已。喜行金水木，忌行火土午戌。  "
                 ]

             }else if (riZhi=="辰") {
                 mapResult["【日柱】"+riZhu]=[
                         "此壬骑龙背也。壬坐在辰，名曰“魁罡”。第一要遇亥子通源，则龙可飞天。更喜天干有甲庚，枝下有卯寅，为风云际会，则活泼升腾，潜渊游泳，决应文武科第，富贵利达。盖辰多则贵，寅多则富，惟见戌无情，战野元黄，从来不爽。喜行金水木申子辰亥子丑运，忌行火土巳午未寅午戌运。"
                 ]

             }else if (riZhi=="午") {
                 mapResult["【日柱】"+riZhu]=[
                         "此水火既济也。上水下火，胎元生息， 《易》以既济。又为禄马同乡。只看前后孰强孰弱，然后去留舒配，或补水补火，自不难矣。匀停即富贵，失匀停即贫贱。喜忌先看偏正，后酌用舍。"
                 ]

             }else if (riZhi=="申") {
                 mapResult["【日柱】"+riZhu]=[
                         "此水满渠成也。生生恬息，清白在躬。再生乎秋，或际乎庚，不问而知富贵。如生乎春夏，则减半矣。再察前后左右，有刃则用煞，无刃则不宜用煞。最忌者甲与戊太狠，以至过颡在山，反失其顺 流 之性。喜行金水 火，忌行木土，亦参酌舒配。"
                 ]

             }else if (riZhi=="戌") {
                 mapResult["【日柱】"+riZhu]=[
                         "此骤雨易晴也。壬水坐戌，旋雨旋止。人领之，凡名利妻子，多是遇而不遇。若前后有比肩旺禄帮身，则不遇可转为奇遇。倘有庚辛相助，又为“云露不散”，一见太阳，则化为甘霖，泽及万物矣。喜行金水，忌行木火土"
                 ]

             }
         }else if (riGan=="癸") {
             mapResult["【日干】"+riGan]=[
                     "癸水属阴，乃河涧川泽之水。生于卯上，盖取木生水之说。喜林木茂盛，得以溶导源流。故喜乙木吐气，以生斐然之美，所谓“风来水面时”也。人生领此，决定文章科第，仍余清逸佳致。如无乙干卯支，则无文章可许。宁有庚申、辛酉相扶，则源流亦清澈可嘉。最不利者，戊癸化火，反使利令智昏。"
             ]
             if (riZhi=="丑") {
                 mapResult["【日柱】"+riZhu]=[
                         "此秽积丛杂之水也。众水交集，气息多郁。人领之，必为事龌龊。必要上下四旁，有乙干卯支以通气疏息，则斐然成章，定为科名富贵。若有甲寅，亦可乘风破浪，堪成利达。但性气多暴，或作事凶险，有成有败，终不如乙木之安吉耳。倘若甲寅乙卯俱无，则不足取矣。偏喜丑未相冲，不喜子丑相合，喜行金水木，忌行火土库。"
                 ]
             }else if (riZhi=="卯") {
                 mapResult["【日柱】"+riZhu]=[
                         "此林中润泉也。癸生在卯，不惟无一点渣滓，且有清风徐来之妙。人领之，其心地坦白慈祥，其情怀潇洒脱落，不当从流俗中观也。文章易成科第，心术可挽末流。只怕前后浊水浊土相混，为不宜耳。喜行金水木，忌行火土。倘过于衰旺，又当酌取。"
                 ]

             }else if (riZhi=="巳") {
                 mapResult["【日柱】"+riZhu]=[
                         "此冈阜岑河之水也，名曰“财宫双美，水火既济”。人领之，多自作乾坤，自图名利，未必有祖父燕贻。最喜山林茂盛，云雨阴翳，则潮湿不竭，即成富贵。最忌者支柱有亥相冲，则堤坏而水自枯。三刑六害，犹其次耳。喜行金水木运，忌行火土冲运。"
                 ]

             }else if (riZhi=="未") {
                 mapResult["【日柱】"+riZhu]=[
                         "此川泽曲湾之水也。癸坐未库，流有湾曲。人领之，有智谋，有机变。最喜金水透出天干，亥卯会人地支，以成利达之美。若火土重逢，多是遇而不遇。喜行金水木，忌行火土库。"
                 ]

             }else if (riZhi=="酉") {
                 mapResult["【日柱】"+riZhu]=[
                         "此石孔流泉也。水生于石，其流极清，人领之，知必簪缨田世家，且有义气担当，清白家风；可爱文章，清俊可取。但前后有木映庚润，则清白不替，易绳祖武，易登科甲。若有庚无木，则减半矣。如概无庚无木，必愧先人矣。喜行金水木，忌行火土运。"
                 ]

             }else if (riZhi=="亥") {
                 mapResult["【日柱】"+riZhu]=[
                         "此水天一色也。脉出昆仑，气通乾亥，宛然水与天一色，名曰“运元之水”。人领之，元气葆涵，机械不生。再加有木，清风徐来，自是羲皇以上之人。至于功名富贵，犹其次耳。若左右有巳亥辰酉刑冲相混，再有狂风暴雨之甲壬相杂，便不宜矣。喜行平稳会合运，忌刑冲作浪运。"
                 ]

             }

         }

         mapResult
     }


}