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
         * 十三位炳现魁星：得年柱的第13位且第13位属甲辰旬。
         * 二十四统：时柱为年柱的第24位，即天干为年正官、地支为年后一位。
         * 三十六大贵：时柱为
         * [2017-09-20 add by longzhiyou]
         */


        //大衍虚一，常人必无:大衍之数五十，其用四十九之数，得之者，合于大衍。自本命数至四十九位是也
        ruleValue = CoreAlgorithm.getJiaZiByWeiShu(nianZhu, 48)
        if (ruleValue==shiZhu) {
            mapResult["【大衍虚一，常人必无】"]=["大衍之数五十，其用四十九之数，得之者，合于大衍。自本命数至四十九位是也"]
        }

        mapResult
    }
}