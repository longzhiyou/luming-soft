package com.lzy.demo;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.lzy.common.DiZhiEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:10
 */
public class BaZi {

    private String nianGan;
    private String nianZhi;

    private String yueGan;
    private String yueZhi;

    private String riGan;
    private String riZhi;

    private String shiGan;
    private String shiZhi;

    public static final String sTianGan = "甲乙丙丁戊己庚辛壬癸";
    public static final String sDiZhi = "子丑寅卯辰巳午未申酉戌亥";
    public static final String sWuXing = "金木水火土";

    public final static String[] yinyang = {"阴", "阳"};
    public final static String[] wuxing = {"木", "火", "土", "金", "水"};

    public final static String[] tiangan = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    public final static String[] dizhi = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
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


    //地支藏干
    public final static ImmutableMap<String,DiZhiEnum> cangganMap = ImmutableMap.<String,
            DiZhiEnum>builder()
            .put("子", DiZhiEnum.ZI)
            .put("丑", DiZhiEnum.ZI)
            .put("寅", DiZhiEnum.ZI)
            .put("卯", DiZhiEnum.ZI)
            .put("辰", DiZhiEnum.ZI)
            .put("巳", DiZhiEnum.ZI)
            .put("午", DiZhiEnum.ZI)
            .put("未", DiZhiEnum.ZI)
            .put("申", DiZhiEnum.ZI)
            .put("酉", DiZhiEnum.ZI)
            .put("戌", DiZhiEnum.ZI)
            .put("亥", DiZhiEnum.ZI)
            .build();



//    public final static String[] shishen = {"比肩", "劫财", "食神", "伤官", "偏财", "正财", "七杀", "正官", "偏印", "正印"};


    /**
     * 十神
     * [2017-06-08 add by longzhiyou]
     */
    public final static String bijian="比肩";
    public final static String jiecai="劫财";
    public final static String shishen="食神";
    public final static String shangguan="伤官";
    public final static String piancai="偏财";
    public final static String zhengcai="正财";
    public final static String qisha="七杀";
    public final static String zhengguan="正官";
    public final static String pianyin="偏印";
    public final static String zhengyin="正印";

    /**
     * 十神表
     * [2017-06-08 add by longzhiyou]
     */
    public final static String [][]shishenTable={
            {bijian,jiecai,shishen,shangguan,piancai,zhengcai,qisha,zhengguan,pianyin,zhengyin},
            {jiecai,bijian,shangguan,shishen,zhengcai,piancai,zhengguan,qisha,zhengyin,pianyin},
            {pianyin,zhengyin,bijian,jiecai,shishen,shangguan,piancai,zhengcai,qisha,zhengguan},
            {zhengyin,pianyin,jiecai,bijian,shangguan,shishen,zhengcai,piancai,zhengguan,qisha},
            {qisha,zhengguan,pianyin,zhengyin,bijian,jiecai,shishen,shangguan,piancai,zhengcai},
            {zhengguan,qisha,zhengyin,pianyin,jiecai,bijian,shangguan,shishen,zhengcai,piancai},
            {piancai,zhengcai,qisha,zhengguan,pianyin,zhengyin,bijian,jiecai,shishen,shangguan},
            {zhengcai,piancai,zhengguan,qisha,zhengyin,pianyin,jiecai,bijian,shangguan,shishen},
            {shishen,shangguan,piancai,zhengcai,qisha,zhengguan,pianyin,zhengyin,bijian,jiecai},
            {shangguan,shishen,zhengcai,piancai,zhengguan,qisha,zhengyin,pianyin,jiecai,bijian}

    };


    //第一个是日干
    public final static ImmutableMap<String,String> shishenMap = ImmutableMap.<String, String>builder()
            .put("甲甲", bijian).put("乙乙", bijian).put("丙丙", bijian).put("丁丁", bijian)
            .put("戊戊", bijian).put("己己", bijian)
            .put("庚庚", bijian).put("辛辛", bijian).put("壬壬", bijian).put("癸癸", bijian)

            .put("甲乙", jiecai).put("乙甲", jiecai).put("丙丁", jiecai).put("丁丙", jiecai)
            .put("戊己", jiecai).put("己戊", jiecai)
            .put("庚辛", jiecai).put("辛庚", jiecai).put("壬癸", jiecai).put("癸壬", jiecai)

            .put("甲丙", shishen).put("乙丁", shishen).put("丙戊", shishen).put("丁己", shishen)
            .put("戊庚", shishen).put("己辛", shishen)
            .put("庚壬", shishen).put("辛癸", shishen).put("壬甲", shishen).put("癸乙", shishen)

            .put("甲丁", shangguan).put("乙丙", shangguan).put("丙己", shangguan).put("丁戊", shangguan)
            .put("戊辛", shangguan).put("己庚", shangguan)
            .put("庚癸", shangguan).put("辛壬", shangguan).put("壬乙", shangguan).put("癸甲", shangguan)

            .put("甲戊", piancai).put("乙己", piancai).put("丙庚", piancai).put("丁辛", piancai)
            .put("戊壬", piancai).put("己癸", piancai)
            .put("庚甲", piancai).put("辛乙", piancai).put("壬丙", piancai).put("癸丁", piancai)

            .put("甲己", zhengcai).put("乙戊", zhengcai).put("丙辛", zhengcai).put("丁庚", zhengcai)
            .put("戊癸", zhengcai).put("己壬", zhengcai)
            .put("庚乙", zhengcai).put("辛甲", zhengcai).put("壬丁", zhengcai).put("癸丙", zhengcai)

            .put("甲庚", qisha).put("乙辛", qisha).put("丙壬", qisha).put("丁癸", qisha)
            .put("戊甲", qisha).put("己乙", qisha)
            .put("庚丙", qisha).put("辛丁", qisha).put("壬戊", qisha).put("癸己", qisha)

            .put("甲辛", zhengguan).put("乙庚", zhengguan).put("丙癸", zhengguan).put("丁壬", zhengguan)
            .put("戊乙", zhengguan).put("己甲", zhengguan)
            .put("庚丁", zhengguan).put("辛丙", zhengguan).put("壬己", zhengguan).put("癸戊", zhengguan)

            .put("甲壬", pianyin).put("乙癸", pianyin).put("丙甲", pianyin).put("丁乙", pianyin)
            .put("戊丙", pianyin).put("己丁", pianyin)
            .put("庚戊", pianyin).put("辛己", pianyin).put("壬庚", pianyin).put("癸辛", pianyin)

            .put("甲癸", zhengyin).put("乙壬", zhengyin).put("丙乙", zhengyin).put("丁甲", zhengyin)
            .put("戊丁", zhengyin).put("己丙", zhengyin)
            .put("庚己", zhengyin).put("辛戊", zhengyin).put("壬辛", zhengyin).put("癸庚", zhengyin)

            .build();


    /**
     * 六十甲子
     */
    public static final String[] jiazi = {
            "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
            "甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
            "甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
            "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
            "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
            "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"
    };

    public final static ImmutableMap<String,String> jiaziMap = ImmutableMap.<String, String>builder()
            .put("甲子","海中金")
            .put("乙丑","海中金")
            .put("丙寅","炉中火")
            .put("丁卯","炉中火")
            .put("戊辰","大林木")
            .put("己巳","大林木")
            .put("庚午","路旁土")
            .put("辛未","路旁土")
            .put("壬申","剑锋金")
            .put("癸酉","剑锋金")
            .put("甲戌","山头火")
            .put("乙亥","山头火")
            .put("丙子","涧下水")
            .put("丁丑","涧下水")
            .put("戊寅","城头土")
            .put("己卯","城头土")
            .put("庚辰","白蜡金")
            .put("辛巳","白蜡金")
            .put("壬午","杨柳木")
            .put("癸未","杨柳木")
            .put("甲申","泉中水")
            .put("乙酉","泉中水")
            .put("丙戌","屋上土")
            .put("丁亥","屋上土")
            .put("戊子","霹雳火")
            .put("己丑","霹雳火")
            .put("庚寅","松柏木")
            .put("辛卯","松柏木")
            .put("壬辰","长流水")
            .put("癸巳","长流水")
            .put("甲午","沙中金")
            .put("乙未","沙中金")
            .put("丙申","山下火")
            .put("丁酉","山下火")
            .put("戊戌","平地木")
            .put("己亥","平地木")
            .put("庚子","壁上土")
            .put("辛丑","壁上土")
            .put("壬寅","金箔金")
            .put("癸卯","金箔金")
            .put("甲辰","复灯火")
            .put("乙巳","复灯火")
            .put("丙午","天河水")
            .put("丁未","天河水")
            .put("戊申","大驿土")
            .put("己酉","大驿土")
            .put("庚戌","钗钏金")
            .put("辛亥","钗钏金")
            .put("壬子","桑拓木")
            .put("癸丑","桑拓木")
            .put("甲寅","大溪水")
            .put("乙卯","大溪水")
            .put("丙辰","沙中土")
            .put("丁巳","沙中土")
            .put("戊午","天上火")
            .put("己未","天上火")
            .put("庚申","石榴木")
            .put("辛酉","石榴木")
            .put("壬戌","大海水")
            .put("癸亥","大海水")

            .build();



    //农历月
    public final static String lunarMonth[] = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "腊"};




    /**
     * 十天干生旺死绝表
     *
     * 天干 长生 沐浴 冠带 临官 帝旺 衰 病 死 墓 绝 胎 养      *
     * 甲 亥 子 丑 寅 卯 辰 巳 午 未 申 酉 戌
     * 丙 寅 卯 辰 巳 午 未 申 酉 戌 亥 子 丑
     * 戊 寅 卯 辰 巳 午 未 申 酉 戌 亥 子 丑
     * 庚 巳 午 未 申 酉 戌 亥 子 丑 寅 卯 辰
     * 壬 申 酉 戌 亥 子 丑 寅 卯 辰 巳 午 未
     * 乙 午 巳 辰 卯 寅 丑 子 亥 戌 酉 申 未
     * 丁 酉 申 未 午 巳 辰 卯 寅 丑 子 亥 戌
     * 己 酉 申 未 午 巳 辰 卯 寅 丑 子 亥 戌
     * 辛 子 亥 戌 酉 申 未 午 巳 辰 卯 寅 丑
     * 癸 卯 寅 丑 子 亥 戌 酉 申 未 午 巳 辰
     *
     * @param paramString1
     * @param paramString2
     * @return
     */

    /**
     * 地支三合组合
     */
    ImmutableMap<String,String> sanheMap =
            ImmutableMap.<String, String>builder()
                    .put("亥卯未","木")
                    .put("亥未卯","木")
                    .put("卯亥未","木")
                    .put("卯未亥","木")
                    .put("未卯亥","木")
                    .put("未亥卯","木")

                    .put("寅午戌","火")
                    .put("寅戌午","火")
                    .put("午戌寅","火")
                    .put("午寅戌","火")
                    .put("戌午寅","火")
                    .put("戌寅午","火")


                    .put("巳酉丑","金")
                    .put("巳丑酉","金")
                    .put("酉丑巳","金")
                    .put("酉巳丑","金")
                    .put("丑巳酉","金")
                    .put("丑酉巳","金")

                    .put("申子辰","水")
                    .put("申辰子","水")
                    .put("子申辰","水")
                    .put("子辰申","水")
                    .put("辰申子","水")
                    .put("辰子申","水")


                    .build();

    /**
     * 判断地支三合
     * @return 成功返回五行,失败返回空字符串
     */
    public String matchSanHe(String di1, String di2, String di3){

//        boolean containsKey = sanheMap.containsKey(String.format("%s%s%s", di1, di2, di3));
        String s = sanheMap.get(String.format("%s%s%s", di1, di2, di3));
        return s;
    }

    /**
     * 判断地支半三合
     */
    String dizhiBanSanHe(String di1, String di2){

        return "";
    }



    public BaZi() {
    }

    public BaZi(String nianGan, String nianZhi,
                String yueGan, String yueZhi,
                String riGan, String riZhi,
                String shiGan, String shiZhi) {
        this.nianGan = nianGan;
        this.nianZhi = nianZhi;
        this.yueGan = yueGan;
        this.yueZhi = yueZhi;
        this.riGan = riGan;
        this.riZhi = riZhi;
        this.shiGan = shiGan;
        this.shiZhi = shiZhi;
    }

    /**
     * 年柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer nianGanMatch(String gan){

//        String temp = canggan[1];

        for (int i = 0; i < jiazi.length; i++) {

            System.out.println(jiazi[i]);
        }

//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < 10; j++) {
//                String str = String.format("日干:%s   它干:%s    十神:%s",tiangan[i],tiangan[j],shishenTable[i][j]);
//                System.out.println(str);
//            }
//
//        }
        if (gan.equals(nianGan)) {
            return 1;
        }
        return 0;
    }
    public Integer nianZhiMatch(String zhi){

        if (zhi.equals(nianZhi)) {
            return 1;
        }
        return 0;
    }

    /**
     * 月柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer yueGanMatch(String gan){

        if (gan.equals(yueGan)) {
            return 1;
        }
        return 0;
    }
    public Integer yueZhiMatch(String zhi){

        if (zhi.equals(yueZhi)) {
            return 1;
        }
        return 0;
    }

    /**
     * 日柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer riGanMatch(String gan){

        if (gan.equals(riGan)) {
            return 1;
        }
        return 0;
    }
    public Integer riZhiMatch(String zhi){

        if (zhi.equals(riZhi)) {
            return 1;
        }
        return 0;
    }

    /**
     * 时柱函数
     * [2017-06-08 add by longzhiyou]
     */
    public Integer shiGanMatch(String gan){

        if (gan.equals(shiGan)) {
            return 1;
        }
        return 0;
    }
    public Integer shiZhiMatch(String zhi){

        if (zhi.equals(shiZhi)) {
            return 1;
        }
        return 0;
    }

    /**
     * 获取天干序数
     * @param gan 天干字符串
     * @return 天干索引
     */
    public Integer getGanShu(String gan){

        for (int i = 0; i < tiangan.length; i++) {
            if (tiangan[i].equals(gan)) {
                return i;
            }
        }
        return 0;
    }


    // 将天干转为index
    int computeGanIndex(char gan) {
        int i;
        for (i = 0; i < 10; i++)
            if (sTianGan.charAt(i) == gan)
                break;
        if (i >= 10)
            return -1;
        return i;
    }

    // 将地支转为index
    int ComputeZhiIndex(char zhi) {
        int i;
        for (i = 0; i < 12; i++)
            if (sDiZhi.charAt(i) == zhi)
                break;
        if (i >= 12)
            return -1;
        return i;
    }




}
