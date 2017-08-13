package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm
import com.lzy.core.ShenShaAlgorithm

/**
 *  女命规则
 * Created by bukeyan on 2017/6/18.
 */
 class WomanRule {

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
         *  女命12论-女命详解
         *  1。冲合论
         *  2。地支统属论
         *  3。夫星旺衰论
         *  4。神煞
         *  5。格局
         *  6。调侯
         *  7。十神
         *  8。有情无情
         *  9。诗赋
         *  10。阴阳强弱
         *  11。墓库
         *  12。特定制式
         *
         */

        //通法论式-女命详解p110

        def yima = ShenShaAlgorithm.mapYiMa.get(riZhi)
        if (listMingZhi.count(yima)>1){

            mapResult["【二逢驿马者，母氏荒凉】"]="《渭泾论》交驰逢驿马，母氏荒凉"
        }

        def guchen = ShenShaAlgorithm.mapGuChen.get(nianZhi)
        if (listMingZhi.contains(guchen)){
            if(commonAlgorithm.isShuangChong(yueZhu,riZhu) && [yueZhi,riZhi].contains(guchen)){
                mapResult["【月日孤辰对冲，恐有败于夫家】"]="月日双冲带孤辰"
            }
            if(commonAlgorithm.isShuangChong(yueZhu,shiZhu) && [yueZhi,shiZhi].contains(guchen)){
                mapResult["【月时孤辰对冲，恐有败于夫家】"]="月时双冲带孤辰"
            }

            if(commonAlgorithm.isShuangChong(riZhu,shiZhu) && [riZhi,shiZhi].contains(guchen)){
                mapResult["【时日孤辰对冲，恐有败于夫家】"]="月时双冲带孤辰"
                mapResult["【时日孤冲，其祸无穷】"]="《渭泾论》"
            }
        }

        if(commonAlgorithm.getShiShenRelation(riGan,nianGan)=="伤官"){
            mapResult["【年上伤官，主带疾生产】"]="《论妇人总论》"

        }
        if (listMingZhi.count("辰")>2&& !listMingZhi.contains("戌")){
            mapResult["【有辰无戌者孤】"]="《妇人总论》"

        }



        if(CoreAlgorithm.rumu.get(shangguangan)==yueZhi){
            mapResult["【伤官入墓，地老天荒】"]="《崖泉女命赋》"
        }

        if ((listMingGan.count("戊")>1||listMingGan.count("己")>1) && bazi.getTuCount()>3){
            mapResult["【干头戊己土重重,心内玲陇无发越,脾气倔强心玲珑】"]="《崖泉女命赋》这说明女人的智力和性格。戊已土重重，它的功能一是晦火，二是克水，而火与水都代表人的智力和表达能力。地支组合好，则人虽聪明但不善于表达，地支组合不好，则是笨女人一个。"
        }

        if(riGan=="癸"&&listMingZhi.contains("亥")&&listMingZhi.contains("酉")){
            mapResult["【癸日女命见亥酉，交际繁忙】"]="《崖泉女命赋》"

        }

        if(bazi.isWuXingQueYi()){
            if(bazi.getQueYiWuXing() == commonAlgorithm.getTianGanWuXing(zhengguangan)){
                if(commonAlgorithm.isDiZhiHe(yueZhi,riZhi)){
                    mapResult["【无官见合者迟婚】"]="日月地支六合"
                }
            }

        }

        def guanCount = bazi.getDiZhiShiShenCount("正官")
        def tianGanGuanCount = bazi.getTianGanCount(zhengguangan)

        if(tianGanGuanCount>0 && guanCount>0 &&(tianGanGuanCount+guanCount)>3){
            mapResult["【多官带合者，感情有困扰】"]="女命详解p217"
        }

        if(riGan=="辛" && shiZhi=="卯"){
            mapResult["【辛日卯时，儿女少而迟】"]="女命详解p217"
        }

        if(commonAlgorithm.getShiShenDiZhi(riGan,"正印")==yueZhi&& listMingGan.contains(pianyingan)){
            mapResult["【用正印而逢枭，兰阶夜冷。】"]="渭泾论"
        }

        if(commonAlgorithm.getShiShenDiZhi(riGan,"偏印")==yueZhi&& listMingGan.contains(zhengyingan)){
            mapResult["【用枭神而遇印，玉树春荣。】"]="渭泾论"
        }



        def bijianluzhi = commonAlgorithm.getLuZhi(bijiangan)
        def jiecailuzhi = commonAlgorithm.getLuZhi(jiecaigan)
        def listGan = [nianGan,yueGan,shiGan]
        if(listGan.contains(bijiangan)||listGan.contains(jiecaigan)){
            if (listMingZhi.count(bijianluzhi)+listMingZhi.count(jiecailuzhi)>1){
                mapResult["【比肩劫财根重者，恐怕当小三】"]="渭泾论"
            }
        }






        /**
         * 女命阳火性发焦，里里外外把心操。闲言碎语装不住，响炮不放不能消。
         * 心灵手巧又爽快，炕上剪子地下刀。窗外飞来一只鸟，你要一看就会描。
         * 姐妹遂心全都好，不对心情懒得瞧。仔细能干到不错，老来嘴碎好叨叨。
         * 这是江湖派的口诀，算这命的，你可以看看，大白菜话，大白菜准确度。
         */





        mapResult
    }
}