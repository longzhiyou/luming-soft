package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm

/**
 *  兰台妙选规则
 * Created by bukeyan on 2017/6/18.
 */
public class LanTaiMiaoXuanRule implements BaseRule{

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


        /**
         *
         * 60甲子格局(自本命数)
         * 五福集祥：年柱、月柱、日柱、时柱、胎元各出一旬。
         * 一旬四位：年柱、月柱、日柱、时柱有三四柱同出一旬，逢官星、天乙贵人全又纳音相生者合格。
         * 一旬中睦集和气：年柱、月柱、日柱、时柱、胎元同出一旬。
         * 一旬包裹：甲寅人见癸亥、甲辰人得癸丑、甲午人得癸卯、甲申人得癸巳、甲戌人得癸未、甲子人得癸酉。
         * 二仪贵偶：一柱两见又逢天乙贵人。
         * 天地中分：天干同地支冲，即见年柱的第30位。
         * 虚一待用：天干地支均隔一位，如甲子人见丙寅。
         * 大衍虚一：天干同、地支隔位，即年支的第四十九位（大衍数为五十）。
         * 居三隔三：得年干支的前后三位，如丙寅人得己巳或己未。
         * 四位八位包藏：得年柱的第4位或第8位，如丙寅得己巳或癸酉，有用者贵，无用者富。
         * 五星七星拱集：得年柱的第五位或第七位，如甲子得戊辰或庚午，轻清者文贵，重浊者武贵。
         * 六位后先：得年柱的前后第6位，如甲子得己巳或己未。
         * 七日来复：得年柱的第7位，如甲子得庚午。
         * 七星拱集：月、日、时柱之一为年干的正官而地支冲年支。
         * 八位官星：得年柱的第8位，如甲子得辛未。
         * 十三位炳现魁星：得年柱的第13位且第13位属甲辰旬。∂
         * 二十四统：时柱为年柱的第24位，即天干为年正官、地支为年后一位。
         * 三十六大贵：时柱为
         * [2017-09-20 add by longzhiyou]
         */


        //大衍虚一，常人必无:大衍之数五十，其用四十九之数，得之者，合于大衍。自本命数至四十九位是也
        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 48)
        if (ruleValue==shiZhu) {
            mapResult["【大衍虚一，常人必无】"]=["大衍之数五十，其用四十九之数，得之者，合于大衍。自本命数至四十九位是也"]
        }

        //二十四统全，得之者，青云稳步
        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 23)
        if (ruleValue==shiZhu) {
            mapResult["【二十四统全，得之者，青云稳步】"]=["命中一年数至时，得二十四位是也。盖自始而终，包含生施大德，合此格大贵"
                    ,"一岁有二十四气，自立春以始，积五日则为一候，积三候则为一气，二气则为一月，所以一年统为七十二候二十四气。"
            ]
        }


        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 5)
        if (ruleValue==shiZhu) {
            mapResult["【六位后先，喜阴阳之对偶】先六位"]=["六位者，即本命数至第六位是也。"
                    ,"五盖一为阳，二为阴，数至于六，乃三阴三阳，不偏多。主荣贵"


            ]
        }

        ruleValue = CoreAlgorithm.getJiaZiByWeiShuAfter(nianZhu, 5)
        if (ruleValue==shiZhu) {
            mapResult["【六位后先，喜阴阳之对偶】后六位"]=["六位者，即本命数至第六位是也。"
                                           ,"五盖一为阳，二为阴，数至于六，乃三阴三阳，不偏多。主荣贵"


            ]
        }

        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 6)
        if (ruleValue==shiZhu) {
            mapResult["【七日来复，喜气候之循环】"]=["自本命顺数至第七位是也。"
                                           ,"盖七日之气，若离一阴必就一阳，若离二阴必就二阳，若离三阴必就三阳，以其相对而分合，此者，皆是有贵也"


            ]
        }

        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 30)
        if (ruleValue==shiZhu) {
            mapResult["【天地中分，奇才以产】"]=["天干同地支冲，即见年柱的第30位"
                                      ,"五行以干为天，以支为地。所谓中分者，支干各分一半是也。如甲子生甲午是，甲子至癸巳，三十之数已足。"
                                      ,"甲午再起一半。天于是中分。地于是中分。乙丑见乙未，丙寅见丙申，皆是天地中分之格也"

            ]
        }


        //三十六大贵，值之者，黄甲标名
        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 35)
        if (ruleValue==shiZhu) {
            mapResult["【三十六大贵，值之者，黄甲标名】"]=["自本生年至时，顺数三十六位是也。盖三十六者，乃阴阳至贵之数，人命获之，岂不贵哉"]
        }

        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 12)
        if (ruleValue==shiZhu) {
            mapResult["【十三位炳现魁星，凤池显职】"]=["地支同，时干是年干食神"
                    ,"自本命数至第十三位是。"
            ]
        }

        mapResult
    }
}