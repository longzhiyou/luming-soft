package com.lzy.demo;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:10
 */
public class BaZi {



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

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                String str = String.format("日干:%s   它干:%s    十神:%s",tiangan[i],tiangan[j],shishenTable[i][j]);
                System.out.println(str);
            }

        }
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

    public Integer ganShu(String gan){

        for (int i = 0; i < tiangan.length; i++) {
            if (tiangan[i].equals(gan)) {
                return i;
            }
        }
        return 0;
    }

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

    //农历月
    public final static String lunarMonth[] = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "腊"};



}
