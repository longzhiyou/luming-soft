package com.lzy.demo;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.lzy.common.DiZhiEnum;
import com.lzy.common.LiuShiJiaZiEnum;
import com.lzy.common.TianGanEnum;
import com.lzy.common.WuXingEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:10
 */
public class BaZi {

    /**
     * 四柱天干地支
     * [2017-06-09 add by longzhiyou]
     */
    private String nianGan;
    private String nianZhi;

    private String yueGan;
    private String yueZhi;

    private String riGan;
    private String riZhi;

    private String shiGan;
    private String shiZhi;


    private int muCount;
    private int huoCount;
    private int tuCount;
    private int jinCount;
    private int shuiCount;

    public String getNianGan() {
        return nianGan;
    }

    public String getNianZhi() {
        return nianZhi;
    }

    public String getYueGan() {
        return yueGan;
    }

    public String getYueZhi() {
        return yueZhi;
    }

    public String getRiGan() {
        return riGan;
    }

    public String getRiZhi() {
        return riZhi;
    }

    public String getShiGan() {
        return shiGan;
    }

    public String getShiZhi() {
        return shiZhi;
    }

    public int getMuCount() {
        return muCount;
    }

    public int getHuoCount() {
        return huoCount;
    }

    public int getTuCount() {
        return tuCount;
    }

    public int getJinCount() {
        return jinCount;
    }

    public int getShuiCount() {
        return shuiCount;
    }

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
     * 第一个是日干
     * [2017-06-08 add by longzhiyou]
     */
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
    private boolean cangganCount;


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

        this.wuxingCount(true);
    }

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


    /**
     * 计算五行个数
     * cangan: 默认计算藏干
     */
    public void wuxingCount(boolean cangan){

        //干
        TianGanEnum tianGan = TianGanEnum.getTianGan(nianGan);
        wuxingTianGanCount(tianGan);

        tianGan = TianGanEnum.getTianGan(yueGan);
        wuxingTianGanCount(tianGan);

        tianGan = TianGanEnum.getTianGan(riGan);
        wuxingTianGanCount(tianGan);

        tianGan = TianGanEnum.getTianGan(shiGan);
        wuxingTianGanCount(tianGan);

        DiZhiEnum diZhi = DiZhiEnum.getDiZhi(nianZhi);
        wuxingDiZhiCount(diZhi,cangan);
        diZhi = DiZhiEnum.getDiZhi(yueZhi);
        wuxingDiZhiCount(diZhi,cangan);
        diZhi = DiZhiEnum.getDiZhi(riZhi);
        wuxingDiZhiCount(diZhi,cangan);
        diZhi = DiZhiEnum.getDiZhi(shiZhi);
        wuxingDiZhiCount(diZhi,cangan);

        if (cangan) {
            System.out.println("【藏干");
        }else {
            System.out.println("【不藏干");
        }
        System.out.println(String.format("【木:】%d",muCount));
        System.out.println(String.format("【火:】%d",huoCount));
        System.out.println(String.format("【土:】%d",tuCount));
        System.out.println(String.format("【金:】%d",jinCount));
        System.out.println(String.format("【水:】%d",shuiCount));


    }

    public void wuxingTianGanCount(TianGanEnum tianGan){
        if (tianGan.isMu()) {
            muCount+=1;
        }else if (tianGan.isHuo()) {
            huoCount+=1;
        }else if (tianGan.isTu()) {
            tuCount+=1;
        }else if (tianGan.isJin()) {
            jinCount+=1;
        }else {
            shuiCount+=1;
        }
    }

    public void wuxingDiZhiCount(DiZhiEnum diZhi,boolean cangan){

        if (cangan) {

            ImmutableSet<String> cangganSet = diZhi.getCanggan();
            for (String gan : cangganSet) {
                TianGanEnum tianGan = TianGanEnum.getTianGan(gan);
                wuxingTianGanCount(tianGan);
            }
        }else {
            if (diZhi.isMu()) {
                muCount+=1;
            }else if (diZhi.isHuo()) {
                huoCount+=1;
            }else if (diZhi.isTu()) {
                tuCount+=1;
            }else if (diZhi.isJin()) {
                jinCount+=1;
            }else {
                shuiCount+=1;
            }
        }

    }

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

//        for (int i = 0; i < tiangan.length; i++) {
//            if (tiangan[i].equals(gan)) {
//                return i;
//            }
//        }
        return 0;
    }







}
