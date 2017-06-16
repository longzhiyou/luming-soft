package com.lzy.demo;

import com.google.common.collect.ImmutableSet;
import com.lzy.common.DiZhiEnum;
import com.lzy.common.TianGanEnum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:10
 */
public class BaZi {


    //性别
    private String gender;
    /**
     * 四柱天干地支
     * [2017-06-09 add by longzhiyou]
     */
    private String nianGan;
    private String nianZhi;
    private String nianZhu;

    private String yueGan;
    private String yueZhi;
    private String yueZhu;

    private String riGan;
    private String riZhi;
    private String riZhu;

    private String shiGan;
    private String shiZhi;
    private String shiZhu;

    //大运干支
    private String yunGan;
    private String yunZhi;
    private String yunZhu;

    //流年干支
    private String liunianGan;
    private String liunianZhi;
    private String liunianZhu;

    //年月日时天干
    List<String> listMingGan;
    List<String> listMingZhi;
    List<String> listMingZhu;

    //批大运

    //批流年
    List<String> listMingYunSuiGan;
    /**
     * 命运岁相关
     * [2017-06-13 add by longzhiyou]
     */
    List<String> listMingYunSuiZhi;

    List<String> listMingYunSuiZhu;


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


    public String getNianZhu() {
        return nianZhu;
    }

    public String getYueZhu() {
        return yueZhu;
    }

    public String getRiZhu() {
        return riZhu;
    }

    public String getShiZhu() {
        return shiZhu;
    }

    public String getYunGan() {
        return yunGan;
    }

    public String getYunZhi() {
        return yunZhi;
    }

    public String getYunZhu() {
        return yunZhu;
    }

    public String getLiunianGan() {
        return liunianGan;
    }

    public String getLiunianZhi() {
        return liunianZhi;
    }

    public String getLiunianZhu() {
        return liunianZhu;
    }

    public List<String> getListMingGan() {
        return listMingGan;
    }

    public List<String> getListMingZhi() {
        return listMingZhi;
    }

    public List<String> getListMingZhu() {
        return listMingZhu;
    }

    public List<String> getListMingYunSuiGan() {
        return listMingYunSuiGan;
    }

    public List<String> getListMingYunSuiZhi() {
        return listMingYunSuiZhi;
    }

    public List<String> getListMingYunSuiZhu() {
        return listMingYunSuiZhu;
    }

    public BaZi() {
    }

    public BaZi(String nianZhu, String yueZhu,
                String riZhu, String shiZhu) {


        init(nianZhu.substring(0,1),nianZhu.substring(1,2),
                yueZhu.substring(0,1),  yueZhu.substring(1,2),
                riZhu.substring(0,1),  riZhu.substring(1,2),
                shiZhu.substring(0,1),  shiZhu.substring(1,2));
    }

    public BaZi(String nianGan, String nianZhi,
                String yueGan, String yueZhi,
                String riGan, String riZhi,
                String shiGan, String shiZhi) {

        init( nianGan,  nianZhi,
                 yueGan,  yueZhi,
                 riGan,  riZhi,
                 shiGan,  shiZhi);

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private void init(String nianGan, String nianZhi,
                      String yueGan, String yueZhi,
                      String riGan, String riZhi,
                      String shiGan, String shiZhi){

        this.nianGan = nianGan;
        this.nianZhi = nianZhi;
        this.yueGan = yueGan;
        this.yueZhi = yueZhi;
        this.riGan = riGan;
        this.riZhi = riZhi;
        this.shiGan = shiGan;
        this.shiZhi = shiZhi;

        this.nianZhu = nianGan+nianZhi;
        this.yueZhu = yueGan+yueZhi;
        this.riZhu = riGan+riZhi;
        this.shiZhu = shiGan+shiZhi;

        this.listMingGan = Arrays.asList(nianGan, yueGan,riGan,shiGan);
        this.listMingZhi = Arrays.asList(nianZhi, yueZhi,riZhi,shiZhi);
        this.listMingZhu = Arrays.asList(nianZhu, yueZhu,riZhu,shiZhu);



        this.wuxingCount(true);

    }
    /**
     * 设置大运
     * @param yunGan
     * @param yunZhi
     */
    public void setYun(String yunGan, String yunZhi){
        this.yunGan = yunGan;
        this.yunZhi = yunZhi;
        this.yunZhu = yunGan+yunZhi;


    }

    /**
     * 设置流年
     * @param liunianGan
     * @param liunianZhi
     */
    public void setLiuNian(String liunianGan, String liunianZhi){
        this.liunianGan = liunianGan;
        this.liunianZhi = liunianZhi;
        this.liunianZhu = liunianGan+liunianZhi;

        this.listMingYunSuiGan = Arrays.asList(nianGan, yueGan,riGan,shiGan,yunGan,liunianGan);
        this.listMingYunSuiZhi = Arrays.asList(nianZhi, yueZhi,riZhi,shiZhi,yunZhi,liunianZhi);
        this.listMingYunSuiZhu = Arrays.asList(nianZhu, yueZhu,riZhu,shiZhu,yunZhu,liunianZhu);

//        for(List<String> list : Permutation.of(listMingYunSuiZhi)){
//
//            listMingYunSuiZhiPermutation.add(list.toString());
//        }
//
//

    }

    /**
     * 判断地支三合
     * @return 成功返回五行,失败返回空字符串
     */
    public String matchSanHe(String di1, String di2, String di3){

        return "";
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


        for(String gan:listMingGan){
            TianGanEnum tianGan = TianGanEnum.getTianGan(gan);
            wuxingTianGanCount(tianGan);
        }

        for(String zhi:listMingZhi){
            DiZhiEnum diZhi = DiZhiEnum.getDiZhi(zhi);
            wuxingDiZhiCount(diZhi,cangan);
        }

//        //干
//        TianGanEnum tianGan = TianGanEnum.getTianGan(nianGan);
//        wuxingTianGanCount(tianGan);
//
//        tianGan = TianGanEnum.getTianGan(yueGan);
//        wuxingTianGanCount(tianGan);
//
//        tianGan = TianGanEnum.getTianGan(riGan);
//        wuxingTianGanCount(tianGan);
//
//        tianGan = TianGanEnum.getTianGan(shiGan);
//        wuxingTianGanCount(tianGan);

//        DiZhiEnum diZhi = DiZhiEnum.getDiZhi(nianZhi);
//        wuxingDiZhiCount(diZhi,cangan);
//        diZhi = DiZhiEnum.getDiZhi(yueZhi);
//        wuxingDiZhiCount(diZhi,cangan);
//        diZhi = DiZhiEnum.getDiZhi(riZhi);
//        wuxingDiZhiCount(diZhi,cangan);
//        diZhi = DiZhiEnum.getDiZhi(shiZhi);
//        wuxingDiZhiCount(diZhi,cangan);

//        if (cangan) {
//            System.out.println("【藏干");
//        }else {
//            System.out.println("【不藏干");
//        }
//        System.out.println(String.format("【木:】%d",muCount));
//        System.out.println(String.format("【火:】%d",huoCount));
//        System.out.println(String.format("【土:】%d",tuCount));
//        System.out.println(String.format("【金:】%d",jinCount));
//        System.out.println(String.format("【水:】%d",shuiCount));


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
     * 获取天干重复的个数
     * @param gan
     * @return
     */
    public int getTianGanFrequency(String gan){

        int frequency = Collections.frequency(listMingGan, gan);
        if(gan.equals(riGan))
            frequency--;
        return frequency;
    }


    public int getDiZhiFrequency(String dizhi){

        int frequency = Collections.frequency(listMingZhi, dizhi);

        return frequency;
    }


    /**
     * 获取十神长生诀
     * @param shishenName "正印"
     * @param changshengJue "禄"
     * @return
     */
    public String getShiShenChangShengJue(String shishenName,String changshengJue){
        String shiShenTianGan = CommonAlgorithm.getTianGanShiShen(riGan, shishenName);
        String dizhi = CommonAlgorithm.getTianGanChangShengJue(shiShenTianGan, changshengJue);
        return dizhi;
    }


}
