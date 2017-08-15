package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 *  日月规则
 *  格局论
 *  调侯论
 * Created by bukeyan on 2017/6/18.
 */
public class RiYueRule implements BaseRule{

    @Override
    def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

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

        //定格局决表
        //调后用神表

        if (riGan=="甲"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="乙"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="丙"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="丁"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="戊"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="己"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="庚"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="辛"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="壬"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="癸"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }

        return mapResult
    }
}