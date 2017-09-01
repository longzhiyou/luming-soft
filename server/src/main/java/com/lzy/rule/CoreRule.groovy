package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm
import com.lzy.core.ShenShaAlgorithm

/**
 *  五核心规则
 * Created by bukeyan on 2017/6/18.
 */
public class CoreRule implements BaseRule{

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

        def taiGan = bazi.getTaiGan()
        def taiZhi = bazi.getTaiZhi()
        def taiZhu = bazi.getTaiZhu()
        def luZhi = commonAlgorithm.getLuZhi(nianGan)

        def listMingTaiZhi = listMingZhi+taiZhi
        def listMingTaiGan = listMingGan+taiGan
        def listMingTaiZhu = listMingZhu+taiZhu

        def yunZhu = bazi.getYunZhu()
        def liunianZhu = bazi.getLiunianZhu()
        def xingnianZhu = bazi.getXingnianZhu()

        /**
         *  生克，空亡，冲，三刑，六害
         *  福神相助
         *  死绝-是谁?
         *  冲破
         *  空亡
         *  年柱 月 日 时 大运 流年 行年
         *  日柱 年 月 时 大运 流年
         * [2017-08-31 add by longzhiyou]
         */

        def nianjiesha = ShenShaAlgorithm.jiesha.get(nianZhi)
        def nianwangshen = ShenShaAlgorithm.wangshen.get(nianZhi)
        def niankongwang = CoreAlgorithm.kongwang.get(nianZhu)

        def nianwuxing = commonAlgorithm.getJiaZiWuXing(nianZhu)

        def nianlu = CoreAlgorithm.ganlu.get(nianZhi)
        def niansearch=["时柱":["神煞":[],"纳音生克":"","冲":"","三刑":"","空亡":"","六害":"","纳音死绝":"","纳音自坐":""],
                        "日柱":["神煞":[],"纳音生克":"","冲":"","三刑":"","空亡":"","六害":"","纳音死绝":"","纳音自坐":""],
                        "运柱":["神煞":[],"纳音生克":"","冲":"","三刑":"","空亡":"","六害":"","纳音死绝":"","纳音自坐":""],
                        "流年柱":["神煞":[],"纳音生克":"","冲":"","三刑":"","空亡":"","六害":"","纳音死绝":"","纳音自坐":""],
                        "行年柱":["神煞":[],"纳音生克":"","冲":"","三刑":"","空亡":"","六害":"","纳音死绝":"","纳音自坐":""],
                        "月柱":["神煞":[],"纳音生克":"","冲":"","三刑":"","空亡":"","六害":"","纳音死绝":""],"纳音自坐":""]

        def searchZhu=["时柱":shiZhu.toString(),"日柱":riZhu.toString(),"运柱":yunZhu.toString()
                       ,"流年柱":liunianZhu.toString()]

        searchZhu.each {
            def zhu = it.value
            if (nianjiesha==zhu[1]) {
                niansearch.get(it.getKey())["神煞"].push("截杀")
            }
            if (nianwangshen==zhu[1]) {
                niansearch.get(it.getKey()).get("神煞").push("亡神")
            }

            if (nianlu==zhu[0]) {
                niansearch.get(it.getKey()).get("神煞").push("禄")
            }

            if (commonAlgorithm.isNaYinWuXingKe(nianZhu,zhu)) {
                niansearch.get(it.getKey())["纳音生克"]="克我"
            }
            else if (commonAlgorithm.isNaYinWuXingKe(zhu,nianZhu)) {
                niansearch.get(it.getKey())["纳音生克"]="我克"
            }


            if (niankongwang.contains(zhu[1])) {
                niansearch.get(it.getKey())["空亡"]="是"
            }
            def si = commonAlgorithm.getWuXingChangShengJue(nianwuxing, "死")
            if (si==zhu[1]) {
                niansearch.get(it.getKey())["纳音死绝"]="死"
            }

            niansearch.get(it.getKey())["纳音自坐"]=commonAlgorithm.getWuXingChangShengJueName(
                    commonAlgorithm.getJiaZiWuXing(zhu),zhu[1])

        }


        mapResult["【年柱查已知因】"]=niansearch

        mapResult
    }
}