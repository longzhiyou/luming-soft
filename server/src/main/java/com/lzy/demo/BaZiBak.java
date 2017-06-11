package com.lzy.demo;

import com.google.common.collect.ImmutableMap;
import com.lzy.common.LiuShiJiaZiEnum;
import com.lzy.common.WuXingEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:10
 */
public class BaZiBak {

//    public final static String[] gan = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
//    //地支
//    public final static String[] zhi = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
//
//    //五行
//    public final static String[] wuxing = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
//
//    //五行十二长生诀
//    public final static String[] wuxingChangShengJue = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
//
//
//    final static String chineseNumber[] = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "腊"};
//
//
//    /**
//     * 六十甲子
//     */
//    public static final String[] jiazhi = {
//            "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
//            "甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
//            "甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
//            "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
//            "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
//            "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"
//    };

//    /**
//     * 天干map
//     * [2017-06-09 add by longzhiyou]
//     */
//    public final static ImmutableMap<String,TianGanEnum> tianganMap = ImmutableMap.<String,
//            TianGanEnum>builder()
//            .put(TianGanEnum.JIA.display(), TianGanEnum.JIA)
//            .put(TianGanEnum.YI.display(), TianGanEnum.YI)
//            .put(TianGanEnum.BING.display(), TianGanEnum.BING)
//            .put(TianGanEnum.DING.display(), TianGanEnum.DING)
//            .put(TianGanEnum.WU.display(), TianGanEnum.WU)
//            .put(TianGanEnum.JI.display(), TianGanEnum.JI)
//            .put(TianGanEnum.GENG.display(), TianGanEnum.GENG)
//            .put(TianGanEnum.XIN.display(), TianGanEnum.XIN)
//            .put(TianGanEnum.REN.display(), TianGanEnum.REN)
//            .put(TianGanEnum.GUI.display(), TianGanEnum.GUI)
//            .build();
//    /**
//     * 地支map
//     * [2017-06-09 add by longzhiyou]
//     */
//    public final static ImmutableMap<String,DiZhiEnum> dizhiMap = ImmutableMap.<String,
//            DiZhiEnum>builder()
//            .put("子", DiZhiEnum.ZI)
//            .put("丑", DiZhiEnum.ZI)
//            .put("寅", DiZhiEnum.ZI)
//            .put("卯", DiZhiEnum.ZI)
//            .put("辰", DiZhiEnum.ZI)
//            .put("巳", DiZhiEnum.ZI)
//            .put("午", DiZhiEnum.ZI)
//            .put("未", DiZhiEnum.ZI)
//            .put("申", DiZhiEnum.ZI)
//            .put("酉", DiZhiEnum.ZI)
//            .put("戌", DiZhiEnum.ZI)
//            .put("亥", DiZhiEnum.ZI)
//            .build();
//
//    /**
//     * 五行map
//     * [2017-06-09 add by longzhiyou]
//     */
//    public final static ImmutableMap<String,WuXingEnum> mapWuXing = ImmutableMap.<String,
//            WuXingEnum>builder()
//            .put( WuXingEnum.MU.display(), WuXingEnum.MU)
//            .put( WuXingEnum.HUO.display(), WuXingEnum.HUO)
//            .put( WuXingEnum.TU.display(), WuXingEnum.TU)
//            .put( WuXingEnum.JIN.display(), WuXingEnum.JIN)
//            .put( WuXingEnum.SHUI.display(), WuXingEnum.SHUI)
//            .build();

    /**
     * 60甲子map
     * [2017-06-09 add by longzhiyou]
     */
//    public final static ImmutableMap<String,LiuShiJiaZiEnum> mapLiuShiJiaZi = ImmutableMap.<String,
//            LiuShiJiaZiEnum>builder()
//            .put(LiuShiJiaZiEnum.JIAZI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.YICHOU.display(), LiuShiJiaZiEnum.YICHOU)
//            .put(LiuShiJiaZiEnum.BINGYIN.display(), LiuShiJiaZiEnum.BINGYIN)
//            .put(LiuShiJiaZiEnum.DINGMAO.display(), LiuShiJiaZiEnum.DINGMAO)
//            .put(LiuShiJiaZiEnum.WUCHEN.display(), LiuShiJiaZiEnum.WUCHEN)
//            .put(LiuShiJiaZiEnum.JISI.display(), LiuShiJiaZiEnum.JISI)
//            .put(LiuShiJiaZiEnum.GENGSWU.display(), LiuShiJiaZiEnum.GENGSWU)
//            .put(LiuShiJiaZiEnum.XINWEI.display(), LiuShiJiaZiEnum.XINWEI)
//            .put(LiuShiJiaZiEnum.RENSHEN.display(), LiuShiJiaZiEnum.RENSHEN)
//            .put(LiuShiJiaZiEnum.GUIYOU.display(), LiuShiJiaZiEnum.GUIYOU)
//            .put(LiuShiJiaZiEnum.JIAXU.display(), LiuShiJiaZiEnum.JIAXU)
//            .put(LiuShiJiaZiEnum.YIHAI.display(), LiuShiJiaZiEnum.YIHAI)
//            .put(LiuShiJiaZiEnum.BINGZI.display(), LiuShiJiaZiEnum.BINGZI)
//            .put(LiuShiJiaZiEnum.DINGCHOU.display(), LiuShiJiaZiEnum.DINGCHOU)
//            .put(LiuShiJiaZiEnum.WUYIN.display(), LiuShiJiaZiEnum.WUYIN)
//            .put(LiuShiJiaZiEnum.JIMAO.display(), LiuShiJiaZiEnum.JIMAO)
//            .put(LiuShiJiaZiEnum.GENCHEN.display(), LiuShiJiaZiEnum.GENCHEN)
//            .put(LiuShiJiaZiEnum.XINSI.display(), LiuShiJiaZiEnum.XINSI)
//            .put(LiuShiJiaZiEnum.RENWU.display(), LiuShiJiaZiEnum.RENWU)
//            .put(LiuShiJiaZiEnum.GUIWEI.display(), LiuShiJiaZiEnum.GUIWEI)
//            .put(LiuShiJiaZiEnum.JIASHEN.display(), LiuShiJiaZiEnum.JIASHEN)
//            .put(LiuShiJiaZiEnum.YIYOU.display(), LiuShiJiaZiEnum.YIYOU)
//            .put(LiuShiJiaZiEnum.BINGXU.display(), LiuShiJiaZiEnum.BINGXU)
//            .put(LiuShiJiaZiEnum.DINGHAI.display(), LiuShiJiaZiEnum.DINGHAI)
//            .put(LiuShiJiaZiEnum.WUZI.display(), LiuShiJiaZiEnum.WUZI)
//            .put(LiuShiJiaZiEnum.JICHOU.display(), LiuShiJiaZiEnum.JICHOU)
//            .put(LiuShiJiaZiEnum.GENGYIN.display(), LiuShiJiaZiEnum.GENGYIN)
//            .put(LiuShiJiaZiEnum.XINMAO.display(), LiuShiJiaZiEnum.XINMAO)
//            .put(LiuShiJiaZiEnum.RENCHEN.display(), LiuShiJiaZiEnum.RENCHEN)
//            .put(LiuShiJiaZiEnum.GUISI.display(), LiuShiJiaZiEnum.RENCHEN)
//            .put(LiuShiJiaZiEnum.JIAWU.display(), LiuShiJiaZiEnum.JIAWU)
//            .put(LiuShiJiaZiEnum.YIWEI.display(), LiuShiJiaZiEnum.YIWEI)
//            .put(LiuShiJiaZiEnum.BINGSHEN.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.DINGYOU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.WUXU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.JIHAI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.GENGZI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.XINCHOU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.RENYIN.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.GUIMAO.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.JIACHEN.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.YISI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.BINGWU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.DINGWEI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.WUSHEN.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.JIYOU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.GENGXU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.XINHAI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.RENZI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.GUICHOU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.JIAYIN.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.YIMAO.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.BINGCHEN.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.DINGSI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.WUWU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.JIWEI.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.GENGSHEN.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.XINYOU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.RENXU.display(), LiuShiJiaZiEnum.JIAZI)
//            .put(LiuShiJiaZiEnum.GUIHAI.display(), LiuShiJiaZiEnum.JIAZI)
//            .build();


//    public final static String[] shishen = {"比肩", "劫财", "食神", "伤官", "偏财", "正财", "七杀", "正官", "偏印", "正印"};


//    /**
//     * 六十甲子
//     */
//    public static final String[] jiazi = {
//            "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
//            "甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
//            "甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
//            "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
//            "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
//            "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"
//    };
//
//    public final static ImmutableMap<String,String> jiaziMap = ImmutableMap.<String, String>builder()
//            .put("甲子","海中金")
//            .put("乙丑","海中金")
//            .put("丙寅","炉中火")
//            .put("丁卯","炉中火")
//            .put("戊辰","大林木")
//            .put("己巳","大林木")
//            .put("庚午","路旁土")
//            .put("辛未","路旁土")
//            .put("壬申","剑锋金")
//            .put("癸酉","剑锋金")
//            .put("甲戌","山头火")
//            .put("乙亥","山头火")
//            .put("丙子","涧下水")
//            .put("丁丑","涧下水")
//            .put("戊寅","城头土")
//            .put("己卯","城头土")
//            .put("庚辰","白蜡金")
//            .put("辛巳","白蜡金")
//            .put("壬午","杨柳木")
//            .put("癸未","杨柳木")
//            .put("甲申","泉中水")
//            .put("乙酉","泉中水")
//            .put("丙戌","屋上土")
//            .put("丁亥","屋上土")
//            .put("戊子","霹雳火")
//            .put("己丑","霹雳火")
//            .put("庚寅","松柏木")
//            .put("辛卯","松柏木")
//            .put("壬辰","长流水")
//            .put("癸巳","长流水")
//            .put("甲午","沙中金")
//            .put("乙未","沙中金")
//            .put("丙申","山下火")
//            .put("丁酉","山下火")
//            .put("戊戌","平地木")
//            .put("己亥","平地木")
//            .put("庚子","壁上土")
//            .put("辛丑","壁上土")
//            .put("壬寅","金箔金")
//            .put("癸卯","金箔金")
//            .put("甲辰","复灯火")
//            .put("乙巳","复灯火")
//            .put("丙午","天河水")
//            .put("丁未","天河水")
//            .put("戊申","大驿土")
//            .put("己酉","大驿土")
//            .put("庚戌","钗钏金")
//            .put("辛亥","钗钏金")
//            .put("壬子","桑拓木")
//            .put("癸丑","桑拓木")
//            .put("甲寅","大溪水")
//            .put("乙卯","大溪水")
//            .put("丙辰","沙中土")
//            .put("丁巳","沙中土")
//            .put("戊午","天上火")
//            .put("己未","天上火")
//            .put("庚申","石榴木")
//            .put("辛酉","石榴木")
//            .put("壬戌","大海水")
//            .put("癸亥","大海水")
//
//            .build();

    /**
     * 年柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer nianGanMatch(String gan){

//        String temp = canggan[1];

//        for (int i = 0; i < jiazi.length; i++) {
//
//            System.out.println(jiazi[i]);
//        }

//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < 10; j++) {
//                String str = String.format("日干:%s   它干:%s    十神:%s",tiangan[i],tiangan[j],tableShiShen[i][j]);
//                System.out.println(str);
//            }
//
//        }
//        if (gan.equals(nianGan)) {
//            return 1;
//        }
        return 0;
    }


    //        TianGanEnum tianGan1 = getTianGan(wo);
//        TianGanEnum tianGan2 = getTianGan(other);
//
//        int ret = tianGan2.getValue()-tianGan1.getValue();
//        ret=(ret+10)%10;
//
//        /**
//         * 如果wo是阳干则是6或者7
//         * 阴干则是5或者6
//         * [2017-06-09 add by longzhiyou]
//         */
//        if (tianGan1.isYang()) {
//            return 6 == ret || 7 == ret;
//        }else {
//            return 5 == ret || 6 == ret;
//        }


//        TianGanEnum tianGan1 = getTianGan(gan1);
//        TianGanEnum tianGan2 = getTianGan(gan2);
//
//        //合是相减绝对值等于5
//        int ret = Math.abs(tianGan1.getValue()-tianGan2.getValue());
//        return 5 == ret;



    public Integer nianZhiMatch(String zhi){

//        if (zhi.equals(nianZhi)) {
//            return 1;
//        }
        return 0;
    }

    /**
     * 月柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer yueGanMatch(String gan){

//        if (gan.equals(yueGan)) {
//            return 1;
//        }
        return 0;
    }
    public Integer yueZhiMatch(String zhi){

//        if (zhi.equals(yueZhi)) {
//            return 1;
//        }
        return 0;
    }

    /**
     * 日柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer riGanMatch(String gan){

//        if (gan.equals(riGan)) {
//            return 1;
//        }
        return 0;
    }
    public Integer riZhiMatch(String zhi){

//        if (zhi.equals(riZhi)) {
//            return 1;
//        }
        return 0;
    }

    /**
     * 时柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer shiGanMatch(String gan){

//        if (gan.equals(shiGan)) {
//            return 1;
//        }
        return 0;
    }
    public Integer shiZhiMatch(String zhi){

//        if (zhi.equals(shiZhi)) {
//            return 1;
//        }
        return 0;
    }

    /**
     * 获取天干序数
     * @param gan 天干字符串
     * @return 天干索引
     */
    public Integer getGanShu(String gan){

//        for (int i = 0; i < tiangan.length; i++) {
//            if (tiangan[i].equals(gan)) {
//                return i;
//            }
//        }
        return 0;
    }




    /**
     * 十神
     * [2017-06-08 add by longzhiyou]
     */
//    public final static String bijian="比肩";
//    public final static String jiecai="劫财";
//    public final static String shishen="食神";
//    public final static String shangguan="伤官";
//    public final static String piancai="偏财";
//    public final static String zhengcai="正财";
//    public final static String qisha="七杀";
//    public final static String zhengguan="正官";
//    public final static String pianyin="偏印";
//    public final static String zhengyin="正印";



    /**
     * 十神表
     * 第一个是日干
     * [2017-06-08 add by longzhiyou]
     */
//    public final static ImmutableMap<String,String> shishenMap = ImmutableMap.<String, String>builder()
//            .put("甲甲", bijian).put("乙乙", bijian).put("丙丙", bijian).put("丁丁", bijian)
//            .put("戊戊", bijian).put("己己", bijian)
//            .put("庚庚", bijian).put("辛辛", bijian).put("壬壬", bijian).put("癸癸", bijian)
//
//            .put("甲乙", jiecai).put("乙甲", jiecai).put("丙丁", jiecai).put("丁丙", jiecai)
//            .put("戊己", jiecai).put("己戊", jiecai)
//            .put("庚辛", jiecai).put("辛庚", jiecai).put("壬癸", jiecai).put("癸壬", jiecai)
//
//            .put("甲丙", shishen).put("乙丁", shishen).put("丙戊", shishen).put("丁己", shishen)
//            .put("戊庚", shishen).put("己辛", shishen)
//            .put("庚壬", shishen).put("辛癸", shishen).put("壬甲", shishen).put("癸乙", shishen)
//
//            .put("甲丁", shangguan).put("乙丙", shangguan).put("丙己", shangguan).put("丁戊", shangguan)
//            .put("戊辛", shangguan).put("己庚", shangguan)
//            .put("庚癸", shangguan).put("辛壬", shangguan).put("壬乙", shangguan).put("癸甲", shangguan)
//
//            .put("甲戊", piancai).put("乙己", piancai).put("丙庚", piancai).put("丁辛", piancai)
//            .put("戊壬", piancai).put("己癸", piancai)
//            .put("庚甲", piancai).put("辛乙", piancai).put("壬丙", piancai).put("癸丁", piancai)
//
//            .put("甲己", zhengcai).put("乙戊", zhengcai).put("丙辛", zhengcai).put("丁庚", zhengcai)
//            .put("戊癸", zhengcai).put("己壬", zhengcai)
//            .put("庚乙", zhengcai).put("辛甲", zhengcai).put("壬丁", zhengcai).put("癸丙", zhengcai)
//
//            .put("甲庚", qisha).put("乙辛", qisha).put("丙壬", qisha).put("丁癸", qisha)
//            .put("戊甲", qisha).put("己乙", qisha)
//            .put("庚丙", qisha).put("辛丁", qisha).put("壬戊", qisha).put("癸己", qisha)
//
//            .put("甲辛", zhengguan).put("乙庚", zhengguan).put("丙癸", zhengguan).put("丁壬", zhengguan)
//            .put("戊乙", zhengguan).put("己甲", zhengguan)
//            .put("庚丁", zhengguan).put("辛丙", zhengguan).put("壬己", zhengguan).put("癸戊", zhengguan)
//
//            .put("甲壬", pianyin).put("乙癸", pianyin).put("丙甲", pianyin).put("丁乙", pianyin)
//            .put("戊丙", pianyin).put("己丁", pianyin)
//            .put("庚戊", pianyin).put("辛己", pianyin).put("壬庚", pianyin).put("癸辛", pianyin)
//
//            .put("甲癸", zhengyin).put("乙壬", zhengyin).put("丙乙", zhengyin).put("丁甲", zhengyin)
//            .put("戊丁", zhengyin).put("己丙", zhengyin)
//            .put("庚己", zhengyin).put("辛戊", zhengyin).put("壬辛", zhengyin).put("癸庚", zhengyin)
//
//            .build();
//



//
//    public final static String [][]tableShiShen={
//            {bijian,jiecai,shishen,shangguan,piancai,zhengcai,qisha,zhengguan,pianyin,zhengyin},
//            {jiecai,bijian,shangguan,shishen,zhengcai,piancai,zhengguan,qisha,zhengyin,pianyin},
//            {pianyin,zhengyin,bijian,jiecai,shishen,shangguan,piancai,zhengcai,qisha,zhengguan},
//            {zhengyin,pianyin,jiecai,bijian,shangguan,shishen,zhengcai,piancai,zhengguan,qisha},
//            {qisha,zhengguan,pianyin,zhengyin,bijian,jiecai,shishen,shangguan,piancai,zhengcai},
//            {zhengguan,qisha,zhengyin,pianyin,jiecai,bijian,shangguan,shishen,zhengcai,piancai},
//            {piancai,zhengcai,qisha,zhengguan,pianyin,zhengyin,bijian,jiecai,shishen,shangguan},
//            {zhengcai,piancai,zhengguan,qisha,zhengyin,pianyin,jiecai,bijian,shangguan,shishen},
//            {shishen,shangguan,piancai,zhengcai,qisha,zhengguan,pianyin,zhengyin,bijian,jiecai},
//            {shangguan,shishen,zhengcai,piancai,zhengguan,qisha,zhengyin,pianyin,jiecai,bijian}
//
//    };


//    public static final String sTianGan = "甲乙丙丁戊己庚辛壬癸";
//    public static final String sDiZhi = "子丑寅卯辰巳午未申酉戌亥";
//    public static final String sWuXing = "金木水火土";
//
//    public final static String[] yinyang = {"阴", "阳"};
//    public final static String[] wuxing = {"木", "火", "土", "金", "水"};
//
//    public final static String[] tiangan = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
//
//    public final static String[] dizhi = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
//


    //    public final static String[] canggan = {"癸", "辛癸己", "甲丙戊", "乙", "癸戊乙", "丙戊", "丁己", "丁己乙",
//            "戊庚壬", "辛", "戊丁辛", "甲壬"};

    //    //地支藏干
//    public final static ImmutableMap<String,ImmutableSet<String>> cangganMap = ImmutableMap.<String, ImmutableSet<String>>builder()
//            .put("子", ImmutableSet.of( "癸"))
//            .put("丑", ImmutableSet.of( "辛","癸","己"))
//            .put("寅", ImmutableSet.of( "甲","丙","戊"))
//            .put("卯", ImmutableSet.of( "乙"))
//            .put("辰", ImmutableSet.of( "癸","戊","乙"))
//            .put("巳", ImmutableSet.of( "丙","戊"))
//            .put("午", ImmutableSet.of( "丁","己"))
//            .put("未", ImmutableSet.of( "丁","己","乙"))
//            .put("申", ImmutableSet.of( "戊","庚","壬"))
//            .put("酉", ImmutableSet.of( "辛"))
//            .put("戌", ImmutableSet.of( "戊","丁","辛"))
//            .put("亥", ImmutableSet.of( "甲","壬"))
//            .build();

    private int year;
    private int month;
    private int day;
    private boolean leap;
    Date baseDate = null;
    final static String chineseNumber[] = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "腊"};

    public final static String[] Gan = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    public final static String[] Zhi = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
    static SimpleDateFormat chineseDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    final static long[] lunarInfo = new long[]{0x04bd8, 0x04ae0, 0x0a570, 0x054d5, 0x0d260, 0x0d950, 0x16554, 0x056a0, 0x09ad0, 0x055d2,
            0x04ae0, 0x0a5b6, 0x0a4d0, 0x0d250, 0x1d255, 0x0b540, 0x0d6a0, 0x0ada2, 0x095b0, 0x14977,
            0x04970, 0x0a4b0, 0x0b4b5, 0x06a50, 0x06d40, 0x1ab54, 0x02b60, 0x09570, 0x052f2, 0x04970,
            0x06566, 0x0d4a0, 0x0ea50, 0x06e95, 0x05ad0, 0x02b60, 0x186e3, 0x092e0, 0x1c8d7, 0x0c950,
            0x0d4a0, 0x1d8a6, 0x0b550, 0x056a0, 0x1a5b4, 0x025d0, 0x092d0, 0x0d2b2, 0x0a950, 0x0b557,
            0x06ca0, 0x0b550, 0x15355, 0x04da0, 0x0a5d0, 0x14573, 0x052d0, 0x0a9a8, 0x0e950, 0x06aa0,
            0x0aea6, 0x0ab50, 0x04b60, 0x0aae4, 0x0a570, 0x05260, 0x0f263, 0x0d950, 0x05b57, 0x056a0,
            0x096d0, 0x04dd5, 0x04ad0, 0x0a4d0, 0x0d4d4, 0x0d250, 0x0d558, 0x0b540, 0x0b5a0, 0x195a6,
            0x095b0, 0x049b0, 0x0a974, 0x0a4b0, 0x0b27a, 0x06a50, 0x06d40, 0x0af46, 0x0ab60, 0x09570,
            0x04af5, 0x04970, 0x064b0, 0x074a3, 0x0ea50, 0x06b58, 0x055c0, 0x0ab60, 0x096d5, 0x092e0,
            0x0c960, 0x0d954, 0x0d4a0, 0x0da50, 0x07552, 0x056a0, 0x0abb7, 0x025d0, 0x092d0, 0x0cab5,
            0x0a950, 0x0b4a0, 0x0baa4, 0x0ad50, 0x055d9, 0x04ba0, 0x0a5b0, 0x15176, 0x052b0, 0x0a930,
            0x07954, 0x06aa0, 0x0ad50, 0x05b52, 0x04b60, 0x0a6e6, 0x0a4e0, 0x0d260, 0x0ea65, 0x0d530,
            0x05aa0, 0x076a3, 0x096d0, 0x04bd7, 0x04ad0, 0x0a4d0, 0x1d0b6, 0x0d250, 0x0d520, 0x0dd45,
            0x0b5a0, 0x056d0, 0x055b2, 0x049b0, 0x0a577, 0x0a4b0, 0x0aa50, 0x1b255, 0x06d20, 0x0ada0
    };

    /**
     * @return the month
     */
    public String getMonth() {
        return chineseNumber[month- 1] ;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return getYearStr(year);
    }

    /**
     * @return the year
     */
    public int getnumberYear() {
        return year;
    }

    /**
     * @return the year
     */
    public int getnumbermonth() {
        return month;
    }

    /**
     * @return the year 返回年的顺序，子0 丑2
     */
    public int getYearindex() {
        return (year - 4) % 12;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return getChinaDayString(day);
    }

    /**
     * 六十甲子
     */
    public static final String[] jiazhi = {
            "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
            "甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
            "甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
            "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
            "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
            "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"
    };
    private Calendar cal;

    /**
     * @param hour 这里的时间范围是1-12，具体几点到几点是子时、丑时请参考相关文档
     * 具体的选择如下 "子：1", "丑：2", "寅：3", "卯：4", "辰：5", "巳：6", "午：7", "未：8", "申：9", "酉：10", "戌：11", "亥：12"
     * @author kongqz
     * */
    public String getYearGanZhi(int hour) {
        //1864年是甲子年，每隔六十年一个甲子
        int idx = (year - 1864) % 60;
        //没有过春节的话那么年还算上一年的，此处求的年份的干支
        String y = jiazhi[idx];

        String m="";
        String d="";
        String h="";
        idx = idx % 5;
        int idxm=0;
        /**
         * 年上起月
         * 甲己之年丙作首，乙庚之岁戊为头，
         * 丙辛必定寻庚起，丁壬壬位顺行流，
         * 更有戊癸何方觅，甲寅之上好追求。
         */
        idxm=(idx+1)*2;
        if(idxm==10) idxm=0;
        //求的月份的干支
        m=Gan[(idxm+month-1)%10]+Zhi[(month+2-1)%12];


        /*求出和1900年1月31日甲辰日相差的天数
         * 甲辰日是第四十天
        */
        int offset = (int) ((cal.getTime().getTime() - baseDate.getTime()) / 86400000L);
        offset=(offset+40)%60;
        //求的日的干支
        d=jiazhi[offset];

        /**
         * 日上起时
         * 甲己还生甲，乙庚丙作初，
         * 丙辛从戊起，丁壬庚子居，
         * 戊癸何方发，壬子是真途。
         */

        offset=(offset % 5 )*2;
        //求得时辰的干支
        h=Gan[(offset+hour)%10]+Zhi[hour];
        //在此处输出我们的年月日时的天干地支
        return y+","+m+","+d+","+h;
    }

    public String getShichenFromDay(int offset){

        return null;
    }

    //====== 传回农历 y年的总天数
    final private static int yearDays(int y) {
        int i,  sum = 348;
        for (i = 0x8000; i > 0x8; i >>= 1) {
            if ((lunarInfo[y - 1900] & i) != 0) {
                sum += 1;
            }
        }
        return (sum + leapDays(y));
    }

    //====== 传回农历 y年闰月的天数
    final private static int leapDays(int y) {
        if (leapMonth(y) != 0) {
            if ((lunarInfo[y - 1900] & 0x10000) != 0) {
                return 30;
            } else {
                return 29;
            }
        } else {
            return 0;
        }
    }

    //====== 传回农历 y年闰哪个月 1-12 , 没闰传回 0
    final private static int leapMonth(int y) {
        return (int) (lunarInfo[y - 1900] & 0xf);
    }

    //====== 传回农历 y年m月的总天数
    final private static int monthDays(int y, int m) {
        if ((lunarInfo[y - 1900] & (0x10000 >> m)) == 0) {
            return 29;
        } else {
            return 30;
        }
    }

    /***
     * @return 传回农历 y年的生肖
     */
    final public String animalsYear() {
        final String[] Animals = new String[]{"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
        return Animals[(year - 4) % 12];
    }

    //====== 传入 月日的offset 传回干支, 0=甲子
    final private static String cyclicalm(int num) {
        return (Gan[num % 10] + Zhi[num % 12]);
    }

    //====== 传入 offset 传回干支, 0=甲子
    final public String cyclical() {
        int num = year - 1900 + 36;
        return (cyclicalm(num));
    }

    /**
     * 传出y年m月d日对应的农历.
     * yearCyl3:农历年与1864的相差数 ?
     * monCyl4:从1900年1月31日以来,闰月数
     * dayCyl5:与1900年1月31日相差的天数,再加40 ?
     *
     * @param cal
     * @return
     */
    public BaZiBak(Calendar cal) {
        this.cal=cal;
        int yearCyl,  monCyl,  dayCyl;
        int leapMonth = 0;

        try {
            baseDate = chineseDateFormat.parse("1900-1-31");
        } catch (ParseException e) {
            e.printStackTrace(); //To change body of catch statement use Options | File Templates.
        }

        //求出和1900年1月31日相差的天数
        int offset = (int) ((cal.getTime().getTime() - baseDate.getTime()) / 86400000L);
        dayCyl = offset + 40;
        monCyl = 14;

        //用offset减去每农历年的天数
        // 计算当天是农历第几天
        //i最终结果是农历的年份
        //offset是当年的第几天
        int iYear,  daysOfYear = 0;
        for (iYear = 1900; iYear < 2050 && offset > 0; iYear++) {
            daysOfYear = yearDays(iYear);
            offset -= daysOfYear;
            monCyl += 12;
        }
        if (offset < 0) {
            offset += daysOfYear;
            iYear--;
            monCyl -= 12;
        }

        //农历年份
        year = iYear;
        yearCyl = iYear - 1864;
        leapMonth = leapMonth(iYear); //闰哪个月,1-12
        leap = false;

        //用当年的天数offset,逐个减去每月（农历）的天数，求出当天是本月的第几天
        int iMonth,  daysOfMonth = 0;
        for (iMonth = 1; iMonth < 13 && offset > 0; iMonth++) {

            //闰月
            if (leapMonth > 0 && iMonth == (leapMonth + 1) && !leap) {
                --iMonth;
                leap = true;
                daysOfMonth = leapDays(year);
            } else {
                daysOfMonth = monthDays(year, iMonth);
            }
            offset -= daysOfMonth;

            //解除闰月
            if (leap && iMonth == (leapMonth + 1)) {
                leap = false;
            }
            if (!leap) {
                monCyl++;
            }
        }

        //offset为0时，并且刚才计算的月份是闰月，要校正
        if (offset == 0 && leapMonth > 0 && iMonth == leapMonth + 1) {
            if (leap) {
                leap = false;
            } else {
                leap = true;
                --iMonth;
                --monCyl;
            }
        }

        //offset小于0时，也要校正
        if (offset < 0) {
            offset += daysOfMonth;
            --iMonth;
            --monCyl;
        }
        month = iMonth;
        day = offset + 1;
    }
    public static String getChinaDayString(int day) {
        String chineseTen[] = {"初", "十", "廿", "卅"};
        int n = day % 10 == 0 ? 9 : day % 10 - 1;
        if (day > 30) {
            return "";
        }
        if (day == 10) {
            return "初十";
        } else {
            return chineseTen[day / 10] + chineseNumber[n];
        }
    }
    public String toString() {
        return getYearStr(year) + "年" + (leap ? "闰" : "") + chineseNumber[month - 1] + "月" + getChinaDayString(day);
    }

    public String getYearStr(int year) {

        String[] chineseword = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String ys = "";
        int index = year / 1000;
        ys += chineseword[index];
        year = year % 1000;
        index = year / 100;
        ys += chineseword[index];
        year = year % 100;
        index = year / 10;
        ys += chineseword[index];
        year = year % 10;
        index = year;
        ys += chineseword[index];
        return ys;
    }
    public static String getSixtyDay() {
        String temp = "";
        for (int i = 0; i < 60; i++) {
            temp += ",/" + cyclicalm(i) + "/";
        }
        return temp;
    }



}
