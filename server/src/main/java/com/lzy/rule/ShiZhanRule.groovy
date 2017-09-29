package com.lzy.rule;

import com.lzy.core.BaZi;
import com.lzy.core.CommonAlgorithm
import com.lzy.core.JiaZiAlgorithm

/**
 *  实战规则
 * Created by bukeyan on 2017/6/18.
 */
public class ShiZhanRule implements BaseRule{

    @Override
    public def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

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
        def gender = bazi.getGender()

        /**
         *  原则
         *  1.势-五行旺则泄
         * [2017-08-03 add by longzhiyou]
         */
        //五行缺一规则

        //层次,富贵-男命
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

        if (gender=="女"&&(riZhu=="丙午"|| riZhu=="壬子") ) {

            mapResult["【日坐阳刃】"] = ["性格过于坚毅"
                                   ,"女命生在这天，那对婚姻是很不利的，日坐阳刃，为人个性刚强，要强，不易相让"
                                   ,"婚姻生活中轻易固执、容易争吵。尤其丙午日，往往做事情风风火火，像男人的做派。"
                                   ,"女人太刚强，假如老公也不甘示弱，那婚姻十有八九是不平静的。即便老公能忍，估计他心里也不大愉快"]
        }



        mapResult
    }
}