package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm
import com.lzy.core.ShenShaAlgorithm

import static com.lzy.core.CoreAlgorithm.wuxingkewo

/**
 *  子女规则
 * Created by bukeyan on 2017/6/18.
 */
class ChildrenRule {

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

       def shangguangan = commonAlgorithm.getTianGanShiShen(riGan,"伤官")
       def zhengguangan = commonAlgorithm.getTianGanShiShen(riGan,"正官")
       def zhengyingan = commonAlgorithm.getTianGanShiShen(riGan,"正印")
       def pianyingan= commonAlgorithm.getTianGanShiShen(riGan,"偏印")
       def bijiangan= commonAlgorithm.getTianGanShiShen(riGan,"比肩")
       def jiecaigan= commonAlgorithm.getTianGanShiShen(riGan,"劫财")
       def shishengan= commonAlgorithm.getTianGanShiShen(riGan,"食神")

       /**
        *   花园十二长生宫断子息诀
        *   http://blog.sina.com.cn/s/blog_727392820102v1wp.html,重点参考
        *  《星学大成》卷二载有论纳音定子息歌：
        *  长生之位中旬半，沐浴一双保吉康，冠带临官三子位，旺中五子自成行，
        *  衰中二子病中一，死中至老没儿郎，除非养取他人子，入墓之时难保双，
        *  受气为绝一个子，胎中头女有姑娘，养中三子只留二，男女宫中仔细详。
        *  最后一句话揭开谜底，原来是要用到星命的十二宫来看的。其法以分男女造之不同。
        *  若男命以年柱纳音寻克我者为官杀作为子女，
        *  女命则以年柱纳音寻我生者为食伤作为子女。
        定出子女五行后寻五行长生，顺排到男女宫，观十二长生落在男女宫为何来断子息。
        因为子女为花和果，男女宫比喻为花园。按照自然规律，开花容易结果难，所以一般讲生女儿容易生儿子难，
        纵观花园十二宫诗诀以女命为主，有些也结合男命论断，如能结合四柱参断当能铁口
        *
        *
        长生
        花园长生四男儿，配上旺胎五英奇，男女聪明女欢喜，男婚女嫁两相宜，
        天降麒麟呈祥瑞，岐山鸣凤世间稀，局如八骏花园秀，真个花好共月圆，
        桂子兰孙集幸福，竹包松茂苍青枝，鲤鱼跳过龙门过，朱紫满园更明鲜。
        沐浴
        花园沐浴在命宫，花开花谢重又重，残花落叶春归去，只存二三继香灯，
        沐浴本事桃花宿，一树桃花艳英英，神天保佑喜成对，宜男有女易长成，
        故园夜雨修花草，晚年添得婿如龙，翠柏苍松云遮月，老蚌生珠日东升。

        例，年命丁未纳音为水，
        如坤造则水生木为子女，木长生在亥，
        如果男女宫在子，则为沐浴。依照诗诀，不论生男或生女，都会成双，或者两儿或者两女，多了保不住。
        若两女，小女儿是晚年所得（四十以后所生）会很有出息，能招乘龙快婿。
        如果是乾造则用土，长生在寅，男女宫则得绝，也是生女儿的多，但是此诀以女命为主看子息，古法男命重财官，女命看夫子。
        当时断此命是一个半儿的命，命主并不解其意，现只有一个儿子好好的，哪来半个呢？
        后儿子意外死亡，命主断后，为了续香火，又要了一个儿子。原来郝师说的另半个儿是指这个。
        录母命：
        1960年六月廿三日子时，男女宫壬午，土命用金排得沐浴，命定一双，小儿子也是晚得。其实盲师说一个半，真实意思是指：原本一双，但是大儿子没长成为半个，留小儿子一个，故而说一个半。并非卜文认为的小儿子是另外半个！活人有称半个的吗？


        *  1、定子息：男命，以纳音克我者为子息。女命以纳音我生者为子息。
        *  2、定命宫，排十二宫。
        *  3、定子息个数
        *
        * https://tieba.baidu.com/p/4310586490

        * [2017-09-11 add by longzhiyou]
        */

       def ziNvGong = CoreAlgorithm.getZiNvGong("子", "酉")

       def gender = bazi.getGender()
       if (gender!="女") {
           //我生之五行
           def s = CoreAlgorithm.getWuxingwosheng()[commonAlgorithm.getJiaZiWuXing(nianZhu)]
           s= commonAlgorithm.getWuXingChangShengJueName(s,ziNvGong)
           mapResult["子女宫长生诀"]= s

       }else {
           //克我五行
           def s = CoreAlgorithm.getWuxingkewo()[commonAlgorithm.getJiaZiWuXing(nianZhu)]
           s= commonAlgorithm.getWuXingChangShengJueName(s,ziNvGong)
           mapResult["子女宫长生诀"]= s
       }


       mapResult
   }
}