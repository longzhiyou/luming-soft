package com.lzy.core;

import com.google.common.collect.ImmutableSet;
import com.lzy.common.DiZhiEnum;
import com.lzy.common.TianGanEnum;

import java.util.*;

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
    private String yunGan="";
    private String yunZhi="";
    private String yunZhu="";

    //流年干支
    private String liunianGan="";
    private String liunianZhi="";
    private String liunianZhu="";

    //行年干支
    private String xingnianan="";
    private String xingnianZhi="";
    private String xingnianZhu="";

    //胎命干支
    private String taiGan="";
    private String taiZhi="";
    private String taiZhu="";

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




    CommonAlgorithm commonAlgorithm;

    public CommonAlgorithm getCommonAlgorithm() {
        return commonAlgorithm;
    }

    /**
     * 五行个数map
     */
    private Map<String,Integer> mapWuXingCount = new HashMap<String, Integer>();
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
        if(mapWuXingCount.containsKey("木"))
            return mapWuXingCount.get("木");
        return 0;
    }

    public int getHuoCount() {

        if(mapWuXingCount.containsKey("火"))
            return mapWuXingCount.get("火");
        return 0;
//        return huoCount;
    }

    public int getTuCount() {

        if(mapWuXingCount.containsKey("土"))
            return mapWuXingCount.get("土");
        return 0;
    }

    public int getJinCount() {
        if(mapWuXingCount.containsKey("金"))
            return mapWuXingCount.get("金");
        return 0;

    }

    public int getShuiCount() {
        if(mapWuXingCount.containsKey("水"))
            return mapWuXingCount.get("水");
        return 0;
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

    public void setYunGan(String yunGan) {
        this.yunGan = yunGan;
    }

    public void setYunZhi(String yunZhi) {
        this.yunZhi = yunZhi;
    }

    public void setYunZhu(String yunZhu) {

        this.yunGan = yunZhu.substring(0,1);
        this.yunZhi = yunZhu.substring(1,2);
        this.yunZhu = yunZhu;
    }

    public void setLiunianGan(String liunianGan) {
        this.liunianGan = liunianGan;
    }

    public void setLiunianZhi(String liunianZhi) {
        this.liunianZhi = liunianZhi;
    }

    public void setLiunianZhu(String liunianZhu) {
        this.liunianGan = liunianZhu.substring(0,1);
        this.liunianZhi = liunianZhu.substring(1,2);
        this.liunianZhu = liunianZhu;
    }

    public String getXingnianan() {
        return xingnianan;
    }

    public void setXingnianan(String xingnianan) {
        this.xingnianan = xingnianan;
    }

    public String getXingnianZhi() {
        return xingnianZhi;
    }

    public void setXingnianZhi(String xingnianZhi) {
        this.xingnianZhi = xingnianZhi;
    }

    public String getXingnianZhu() {
        return xingnianZhu;
    }

    public void setXingnianZhu(String xingnianZhu) {
        this.xingnianZhu = xingnianZhu;
    }

    public String getTaiGan() {
        return taiGan;
    }

    public void setTaiGan(String taiGan) {
        this.taiGan = taiGan;
    }

    public String getTaiZhi() {
        return taiZhi;
    }

    public void setTaiZhi(String taiZhi) {
        this.taiZhi = taiZhi;
    }

    public String getTaiZhu() {
        return taiZhu;
    }

    public void setTaiZhu(String taiZhu) {
        this.taiZhu = taiZhu;
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

        this.commonAlgorithm = new CommonAlgorithm();
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
            addWuXingCount(tianGan.getWuXing().getName());
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

    private void addWuXingCount(String wuXingName){
        if (mapWuXingCount.containsKey(wuXingName)) {
            Integer wuXingCount = mapWuXingCount.get(wuXingName);
            mapWuXingCount.put(wuXingName,wuXingCount+1);
        }else {
            mapWuXingCount.put(wuXingName,1);
        }

    }

    public void wuxingDiZhiCount(DiZhiEnum diZhi,boolean cangan){

        if (cangan) {
            ImmutableSet<String> cangganSet = diZhi.getCanggan();
            for (String gan : cangganSet) {
                TianGanEnum tianGan = TianGanEnum.getTianGan(gan);
                addWuXingCount(tianGan.getWuXing().getName());
//
            }
        }else {

            addWuXingCount(diZhi.getWuXing().getName());


        }

    }


    /**
     * 获取天干重复的个数
     * @param gan
     * @return
     */
    public int getTianGanCount(String gan){

        int frequency = Collections.frequency(listMingGan, gan);
        if(gan.equals(riGan))
            frequency--;
        return frequency;
    }


    /**
     * 获取指定地支个数
     * @param dizhi
     * @return
     */
    public int getDiZhiCount(String dizhi){

        int frequency = Collections.frequency(listMingZhi, dizhi);

        return frequency;
    }

    /**
     * 获取十神地支个数
     * @param shishenName
     * @return
     */
    public int getDiZhiShiShenCount(String shishenName){

        String shiShenDiZhi = commonAlgorithm.getShiShenDiZhi(riGan, shishenName);

        return getDiZhiCount(shiShenDiZhi);

    }


    /**
     * 获取十神长生诀
     * @param shishenName "正印"
     * @param changshengJue "禄"
     * @return
     */
    public String getShiShenChangShengJue(String shishenName,String changshengJue){
        String shiShenTianGan = commonAlgorithm.getTianGanShiShen(riGan, shishenName);
        String dizhi = commonAlgorithm.getTianGanChangShengJue(shiShenTianGan, changshengJue);
        return dizhi;
    }

    /**
     * 五行是否缺一
     * @return
     */
    public boolean isWuXingQueYi(){
        return mapWuXingCount.size()==4;
    }

    /**
     * 获取缺一五行
     * @return
     */
    public String getQueYiWuXing(){

        String wuxing ="";
        if (isWuXingQueYi()) {
            for (int i = 0; i < CommonAlgorithm.listWuXing.size(); i++) {
                if (!mapWuXingCount.containsKey(CommonAlgorithm.listWuXing.get(i))) {
                    return CommonAlgorithm.listWuXing.get(i);
                }
            }
        }

        return wuxing;

    }




}
