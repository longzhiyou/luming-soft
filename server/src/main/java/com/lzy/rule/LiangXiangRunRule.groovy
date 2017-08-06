package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 * 梁湘润规则
 *  子平母法规则
 * Created by bukeyan on 2017/6/18.
 */
public class LiangXiangRunRule implements BaseRule{

    @Override
    Object matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

        def mapResult = [:]
//        mapResult["实务"] = shiwu(bazi, commonAlgorithm)
        mapResult["子平母法"] = mufa(bazi, commonAlgorithm)

        return mapResult
    }

    //子平母法规则
    static Object mufa(BaZi bazi, CommonAlgorithm commonAlgorithm) {

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

        def luZhi = commonAlgorithm.getLuZhi(riGan)

        def renZhi = commonAlgorithm.getShiShenDiZhi(riGan, "刃")
        def yinZhi = commonAlgorithm.getShiShenDiZhi(riGan, "印")
        def jiecai = commonAlgorithm.getTianGanShiShen(riGan, "劫财")
        def bijian = commonAlgorithm.getTianGanShiShen(riGan, "比肩")

        //1，羊刃格，劫财透月干，四地支中又见二支为正印禄，既羊刃格带印极旺，凶灾.
        //按照此方法只有 木和金日主才有 更严格只有 甲和庚才有
        matchStr=riGan+yueGan+yueZhi
        def countYin = bazi.getDiZhiShiShenCount("印")
        def countPianYin = bazi.getDiZhiShiShenCount("偏印")

        def countJiecai = bazi.getTianGanCount(jiecai)
        def countBiJian = bazi.getTianGanCount(bijian)

        if("甲乙卯"==matchStr || "庚辛酉"==matchStr ){
            if(countYin>=2){
                mapResult["羊刃格带印极旺-凶灾"]="羊刃格，劫财透月干，四地支中又见二支为正印禄，既羊刃格带印极旺，凶灾，无救"
            }
        }
        else if(renZhi==yueZhi){
            /**
             *  核心概念就是 阳刃格局 带比印 太旺
             * [2017-07-19 add by longzhiyou]
             */
            //羊刃格包括阴干,印包括正印偏印∂
            if((countJiecai+countBiJian)>0&& (countYin+countPianYin)>1){
                mapResult["羊刃格带印极旺-凶灾-规则放宽"]="羊刃格，劫财透干，又见二支为正印禄，凶灾"
            }


        }

        //2，旺财遇劫带旺印，官非，刑名，意外灾害.
        def caizhi = commonAlgorithm.getShiShenDiZhi(riGan, "正财")
        def piancaizhi = commonAlgorithm.getShiShenDiZhi(riGan, "偏财")
        if((caizhi==yueZhi||piancaizhi==yueZhi) && jiecai==yueGan && (countYin+countPianYin)>1){

            mapResult["旺财遇劫带旺印-官非，刑名，意外灾害"]="月支正财禄，月干劫财，地支有两个印临官位"
        }

        //3，双禄带比印，孤克之命.
        if(luZhi==riZhi && bazi.getDiZhiCount(luZhi)>1 && (countYin+countPianYin)>0){
            if(countJiecai>0){
                mapResult["双禄带劫财印，大凶之命"]="日主坐禄，又重见禄支，天干透劫财，更有[印]专旺之支"
            }else if(countBiJian>0 ){
                mapResult["双禄带比印，孤克之命"]="日主坐禄，又重见禄支，天干透比，更有[印]专旺之支"
            }

        }

        //4，日主坐禄透比，更有印专旺之支，过旺.官非，残疾
        if(luZhi==riZhi && countBiJian>0 && (countYin+countPianYin)>0){
            mapResult["日主坐禄透比，更有印专旺之支"]="过旺.官非，残疾。如果三会印，则大凶"

        }

        return mapResult
    }

    static Object shiwu(BaZi bazi, CommonAlgorithm commonAlgorithm) {

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

        def luZhi = commonAlgorithm.getLuZhi(nianGan)

        def renZhi = commonAlgorithm.getShiShenDiZhi(riGan, "刃")
        def yinZhi = commonAlgorithm.getShiShenDiZhi(riGan, "印")

        return mapResult
    }
}