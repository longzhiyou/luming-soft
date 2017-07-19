package com.lzy.rule

import com.lzy.common.TianGanEnum
import com.lzy.demo.BaZi
import com.lzy.demo.CommonAlgorithm
import com.lzy.rule.BaseRule

/**
 * 梁湘润规则
 *  子平母法规则
 * Created by bukeyan on 2017/6/18.
 */
public class LiangXiangRunRule implements BaseRule{

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

        def luZhi = commonAlgorithm.getLuZhi(nianGan)

        def renZhi = commonAlgorithm.getShiShenDiZhi(riGan, "刃")
        def yinZhi = commonAlgorithm.getShiShenDiZhi(riGan, "印")

        //五行缺一规则
        //子平母法规则
        def mufa=[:]
        mapResult["子平母法规则"]=mufa

        //1，羊刃格，劫财透月干，四地支中又见二支为正印禄，既羊刃格带印极旺，凶灾.
        //按照此方法只有 木和金日主才有 更严格只有 甲和庚才有
        matchStr=riGan+yueGan+yueZhi
        def countYin = bazi.getDiZhiShiShenCount("印")
        def countJiecai = bazi.getDiZhiShiShenCount("劫财")
        if("甲乙卯"==matchStr || "庚辛酉"==matchStr ){
            if(countYin>=2){
                mufa["羊刃格带印极旺-凶灾"]="羊刃格，劫财透月干，四地支中又见二支为正印禄，既羊刃格带印极旺，凶灾"
            }
        }
        else if(renZhi==yueZhi){
            //羊刃格包括阴干
            if(countJiecai>=1&&countYin>=2){
                mufa["羊刃格带印极旺-凶灾-规则放宽"]="羊刃格，劫财透干，又见二支为正印禄，凶灾，无救"
            }


        }


        return mapResult
    }
}