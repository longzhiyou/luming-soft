package com.lzy.demo;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.lzy.common.DiZhiEnum;
import com.lzy.common.LiuShiJiaZiEnum;
import com.lzy.common.TianGanEnum;
import com.lzy.common.WuXingEnum;

import java.util.Arrays;

/**
 * Created by bukeyan on 2017/6/7.
 */

public class CommonAlgorithm {


    //阴阳
    public final static ImmutableList<String> listYinYang = ImmutableList.of("阴", "阳");

    //天干
    public final static ImmutableList<String> listTianGan = ImmutableList.of("甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸");

    //地支
    public final static ImmutableList<String> listDiZhi = ImmutableList.of("子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥");

    //五行
    public final static ImmutableList<String> listWuXing = ImmutableList.of("木", "火", "土", "金", "水");

    //长生诀
    public final static ImmutableList<String> listChangShengJue = ImmutableList.of(
            "长生","沐浴","冠带","临官","帝旺","衰","病","死","墓","绝","胎","养");

    //长生诀不同的名称
    public final static ImmutableMap<String,String> mapChangShengJueName = ImmutableMap.<String,
            String>builder()
            .put("生","长生")
            .put("败","沐浴")
            .put("禄","临官")
            .put("旺","帝旺")
            .put("刃","帝旺")
            .put("阳刃","帝旺")
            .put("羊刃","帝旺")
            .put("库","墓")

            .build();


    /**
     * 五行十二长生表
     * 土特殊
     * [2017-06-08 add by longzhiyou]
     */
    public final static String [][] tableWuXingChangShengJue ={
            {"亥",	"子",	"丑",	"寅",	"卯",	"辰",	"巳",	"午",	"未",   "申",	"酉",	"戌"},
            {"寅",	"卯",	"辰",	"巳",	"午",	"未",    "申",	"酉",	"戌",	"亥",    "子",	"丑"},
            {"申",	"酉",	"戌",	"巳",	"午",	"丑",	"寅",	"卯",	"辰",	"巳",	"午",	"未"},
            {"巳",	"午",	"未",   "申",	"酉",	"戌",	"亥",	"子",	"丑",	"寅",	"卯",	"辰"},
            {"申",	"酉",	"戌",	"亥",	"子",	"丑",	"寅",	"卯",	"辰",	"巳",	"午",	"未"}
    };


    /**
     * 十天干生旺死绝表
     * 行: 天干索引
     */
    public final static String [][] tableTianGanChangShengJue ={
            {"亥",	"子",	"丑",	"寅",	"卯",	"辰",	"巳",	"午",	"未",   "申",	"酉",	"戌"},
            {"午",	"巳",	"辰",	"卯",	"寅",	"丑",	"子",   "亥",	"戌",	"酉",	"申",	"未"},
            {"寅",	"卯",	"辰",	"巳",	"午",	"未",    "申",	"酉",	"戌",	"亥",    "子",	"丑"},
            {"酉",	"申",	"未",    "午",	"巳",	"辰",	"卯",	"寅",	"丑",	"子",   "亥",	"戌"},
            {"寅",	"卯",	"辰",	"巳",	"午",	"未",    "申",	"酉",	"戌",	"亥",    "子",	"丑"},
            {"酉",	"申",	"未",    "午",	"巳",	"辰",	"卯",	"寅",	"丑",	"子",   "亥",	"戌"},
            {"巳",	"午",	"未",   "申",	"酉",	"戌",	"亥",	"子",	"丑",	"寅",	"卯",	"辰"},
            {"子",   "亥",	"戌",	"酉",	"申",	"未",   "午",	"巳",	"辰",	"卯",	"寅",	"丑"},
            {"申",	"酉",	"戌",	"亥",	"子",	"丑",	"寅",	"卯",	"辰",	"巳",	"午",	"未"},
            {"卯",	"寅",	"丑",	"子",   "亥",	"戌",	"酉",	"申",	"未",    "午",	"巳",	"辰"}
    };




    //六十甲子
    public static final ImmutableList<String> listLiuShiJiaZi = ImmutableList.of(
            "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
            "甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
            "甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
            "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
            "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
            "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"
    );


    /**
     * 天干map
     * [2017-06-09 add by longzhiyou]
     */
    public final static ImmutableMap<String,TianGanEnum> mapTianGan = ImmutableMap.<String,
            TianGanEnum>builder()
            .put(TianGanEnum.JIA.getName(), TianGanEnum.JIA)
            .put(TianGanEnum.YI.getName(), TianGanEnum.YI)
            .put(TianGanEnum.BING.getName(), TianGanEnum.BING)
            .put(TianGanEnum.DING.getName(), TianGanEnum.DING)
            .put(TianGanEnum.WU.getName(), TianGanEnum.WU)
            .put(TianGanEnum.JI.getName(), TianGanEnum.JI)
            .put(TianGanEnum.GENG.getName(), TianGanEnum.GENG)
            .put(TianGanEnum.XIN.getName(), TianGanEnum.XIN)
            .put(TianGanEnum.REN.getName(), TianGanEnum.REN)
            .put(TianGanEnum.GUI.getName(), TianGanEnum.GUI)
            .build();
    /**
     * 地支map
     * [2017-06-09 add by longzhiyou]
     */
    public final static ImmutableMap<String,DiZhiEnum> mapDiZhi = ImmutableMap.<String,
            DiZhiEnum>builder()
            .put("子", DiZhiEnum.ZI)
            .put("丑", DiZhiEnum.CHOU)
            .put("寅", DiZhiEnum.YIN)
            .put("卯", DiZhiEnum.MAO)
            .put("辰", DiZhiEnum.CHEN)
            .put("巳", DiZhiEnum.SI)
            .put("午", DiZhiEnum.WU)
            .put("未", DiZhiEnum.WEI)
            .put("申", DiZhiEnum.SHEN)
            .put("酉", DiZhiEnum.YOU)
            .put("戌", DiZhiEnum.XU)
            .put("亥", DiZhiEnum.HAI)
            .build();

    /**
     * 五行map
     * [2017-06-09 add by longzhiyou]
     */
    public final static ImmutableMap<String,WuXingEnum> mapWuXing = ImmutableMap.<String,
            WuXingEnum>builder()
            .put( WuXingEnum.MU.getName(), WuXingEnum.MU)
            .put( WuXingEnum.HUO.getName(), WuXingEnum.HUO)
            .put( WuXingEnum.TU.getName(), WuXingEnum.TU)
            .put( WuXingEnum.JIN.getName(), WuXingEnum.JIN)
            .put( WuXingEnum.SHUI.getName(), WuXingEnum.SHUI)
            .build();

    /**
     * 60甲子map
     * [2017-06-09 add by longzhiyou]
     */
    public final static ImmutableMap<String,LiuShiJiaZiEnum> mapLiuShiJiaZi = ImmutableMap.<String,
            LiuShiJiaZiEnum>builder()
            .put(LiuShiJiaZiEnum.JIAZI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.YICHOU.getName(), LiuShiJiaZiEnum.YICHOU)
            .put(LiuShiJiaZiEnum.BINGYIN.getName(), LiuShiJiaZiEnum.BINGYIN)
            .put(LiuShiJiaZiEnum.DINGMAO.getName(), LiuShiJiaZiEnum.DINGMAO)
            .put(LiuShiJiaZiEnum.WUCHEN.getName(), LiuShiJiaZiEnum.WUCHEN)
            .put(LiuShiJiaZiEnum.JISI.getName(), LiuShiJiaZiEnum.JISI)
            .put(LiuShiJiaZiEnum.GENGSWU.getName(), LiuShiJiaZiEnum.GENGSWU)
            .put(LiuShiJiaZiEnum.XINWEI.getName(), LiuShiJiaZiEnum.XINWEI)
            .put(LiuShiJiaZiEnum.RENSHEN.getName(), LiuShiJiaZiEnum.RENSHEN)
            .put(LiuShiJiaZiEnum.GUIYOU.getName(), LiuShiJiaZiEnum.GUIYOU)
            .put(LiuShiJiaZiEnum.JIAXU.getName(), LiuShiJiaZiEnum.JIAXU)
            .put(LiuShiJiaZiEnum.YIHAI.getName(), LiuShiJiaZiEnum.YIHAI)
            .put(LiuShiJiaZiEnum.BINGZI.getName(), LiuShiJiaZiEnum.BINGZI)
            .put(LiuShiJiaZiEnum.DINGCHOU.getName(), LiuShiJiaZiEnum.DINGCHOU)
            .put(LiuShiJiaZiEnum.WUYIN.getName(), LiuShiJiaZiEnum.WUYIN)
            .put(LiuShiJiaZiEnum.JIMAO.getName(), LiuShiJiaZiEnum.JIMAO)
            .put(LiuShiJiaZiEnum.GENCHEN.getName(), LiuShiJiaZiEnum.GENCHEN)
            .put(LiuShiJiaZiEnum.XINSI.getName(), LiuShiJiaZiEnum.XINSI)
            .put(LiuShiJiaZiEnum.RENWU.getName(), LiuShiJiaZiEnum.RENWU)
            .put(LiuShiJiaZiEnum.GUIWEI.getName(), LiuShiJiaZiEnum.GUIWEI)
            .put(LiuShiJiaZiEnum.JIASHEN.getName(), LiuShiJiaZiEnum.JIASHEN)
            .put(LiuShiJiaZiEnum.YIYOU.getName(), LiuShiJiaZiEnum.YIYOU)
            .put(LiuShiJiaZiEnum.BINGXU.getName(), LiuShiJiaZiEnum.BINGXU)
            .put(LiuShiJiaZiEnum.DINGHAI.getName(), LiuShiJiaZiEnum.DINGHAI)
            .put(LiuShiJiaZiEnum.WUZI.getName(), LiuShiJiaZiEnum.WUZI)
            .put(LiuShiJiaZiEnum.JICHOU.getName(), LiuShiJiaZiEnum.JICHOU)
            .put(LiuShiJiaZiEnum.GENGYIN.getName(), LiuShiJiaZiEnum.GENGYIN)
            .put(LiuShiJiaZiEnum.XINMAO.getName(), LiuShiJiaZiEnum.XINMAO)
            .put(LiuShiJiaZiEnum.RENCHEN.getName(), LiuShiJiaZiEnum.RENCHEN)
            .put(LiuShiJiaZiEnum.GUISI.getName(), LiuShiJiaZiEnum.RENCHEN)
            .put(LiuShiJiaZiEnum.JIAWU.getName(), LiuShiJiaZiEnum.JIAWU)
            .put(LiuShiJiaZiEnum.YIWEI.getName(), LiuShiJiaZiEnum.YIWEI)
            .put(LiuShiJiaZiEnum.BINGSHEN.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.DINGYOU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.WUXU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.JIHAI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.GENGZI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.XINCHOU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.RENYIN.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.GUIMAO.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.JIACHEN.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.YISI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.BINGWU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.DINGWEI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.WUSHEN.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.JIYOU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.GENGXU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.XINHAI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.RENZI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.GUICHOU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.JIAYIN.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.YIMAO.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.BINGCHEN.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.DINGSI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.WUWU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.JIWEI.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.GENGSHEN.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.XINYOU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.RENXU.getName(), LiuShiJiaZiEnum.JIAZI)
            .put(LiuShiJiaZiEnum.GUIHAI.getName(), LiuShiJiaZiEnum.JIAZI)
            .build();


    public final static ImmutableMap<String,String> mapTianGanHe =
            ImmutableMap.<String, String>builder()
            .put("[甲, 己]","土")
            .put("[己, 甲]","土")

            .put("[丁, 壬]","木")
            .put("[壬, 丁]","木")

            .put("[戊, 癸]","火")
            .put("[癸, 戊]","火")

            .put("[乙, 庚]","金")
            .put("[庚, 乙]","金")

            .put("[丙, 辛]","水")
            .put("[辛, 丙]","水")
            .build();

    public static final ImmutableList<String> listTianGanKe = ImmutableList.of(
            "[甲, 戊]","[甲, 己]","[甲, 庚]","[甲, 辛]",

            "[乙, 戊]","[乙, 己]","[乙, 庚]","[乙, 辛]",

            "[丙, 庚]","[丙, 辛]","[丙, 壬]","[丙, 癸]",

            "[丁, 庚]","[丁, 辛]", "[丁, 壬]","[丁, 癸]",

            "[戊, 壬]","[戊, 癸]","[戊, 甲]","[戊, 乙]",

            "[己, 壬]","[己, 癸]","[己, 甲]","[己, 乙]",

            "[庚, 甲]","[庚, 乙]","[庚, 丙]","[庚, 丁]",

            "[辛, 甲]","[辛, 乙]","[辛, 丙]","[辛, 丁]",

            "[壬, 丙]", "[壬, 丁]","[壬, 戊]","[壬, 己]",

            "[癸, 丙]", "[癸, 丁]","[癸, 戊]","[癸, 己]"
    );




    /**
     * 地支六合组合
     */
    public final static ImmutableMap<String,String> mapDiZhiHe =
            ImmutableMap.<String, String>builder()
                    .put("[子, 丑]","土")
                    .put("[丑, 子]","土")

                    .put("[寅, 亥]","木")
                    .put("[亥, 寅]","木")

                    .put("[卯, 戌]","火")
                    .put("[戌, 卯]","火")

                    .put("[辰, 酉]","金")
                    .put("[酉, 辰]","金")

                    .put("[巳, 申]","水")
                    .put("[申, 巳]","水")

                    .put("[午, 未]","土")
                    .put("[未, 午]","土")
                    .build();


    public static final ImmutableList<String> listDiZhiChong = ImmutableList.of(
            "[子, 午]", "[午, 子]",
            "[丑, 未]", "[未, 丑]",
            "[寅, 申]", "[申, 寅]",
            "[卯, 酉]", "[酉, 卯]",
            "[辰, 戌]", "[戌, 辰]",
            "[巳, 亥]", "[亥, 巳]"
    );


    /**
     * 地支三合组合
     */
    public final static ImmutableMap<String,String> mapDiZhiSanHe =
            ImmutableMap.<String, String>builder()
                    .put("[亥, 卯, 未]","木")
                    .put("[亥, 未, 卯]","木")
                    .put("[卯, 亥, 未]","木")
                    .put("[卯, 未, 亥]","木")
                    .put("[未, 亥, 卯]","木")
                    .put("[未, 卯, 亥]","木")

                    .put("[寅, 午, 戌]","火")
                    .put("[寅, 戌, 午]","火")
                    .put("[午, 寅, 戌]","火")
                    .put("[午, 戌, 寅]","火")
                    .put("[戌, 寅, 午]","火")
                    .put("[戌, 午, 寅]","火")


                    .put("[巳, 酉, 丑]","金")
                    .put("[巳, 丑, 酉]","金")
                    .put("[酉, 巳, 丑]","金")
                    .put("[酉, 丑, 巳]","金")
                    .put("[丑, 巳, 酉]","金")
                    .put("[丑, 酉, 巳]","金")

                    .put("[申, 子, 辰]","水")
                    .put("[申, 辰, 子]","水")
                    .put("[子, 申, 辰]","水")
                    .put("[子, 辰, 申]","水")
                    .put("[辰, 申, 子]","水")
                    .put("[辰, 子, 申]","水")

                    .build();

    public final static ImmutableMap<String,String> mapDiZhiSanHui =
            ImmutableMap.<String, String>builder()
                    .put("[寅, 卯, 辰]","木")
                    .put("[寅, 辰, 卯]","木")
                    .put("[卯, 寅, 辰]","木")
                    .put("[卯, 辰, 寅]","木")
                    .put("[辰, 寅, 卯]","木")
                    .put("[辰, 卯, 寅]","木")

                    .put("[巳, 午, 未]","火")
                    .put("[巳, 未, 午]","火")
                    .put("[午, 巳, 未]","火")
                    .put("[午, 未, 巳]","火")
                    .put("[未, 巳, 午]","火")
                    .put("[未, 午, 巳]","火")


                    .put("[申, 酉, 戌]","金")
                    .put("[申, 戌, 酉]","金")
                    .put("[酉, 申, 戌]","金")
                    .put("[酉, 戌, 申]","金")
                    .put("[戌, 申, 酉]","金")
                    .put("[戌, 酉, 申]","金")

                    .put("[亥, 子, 丑]","水")
                    .put("[亥, 丑, 子]","水")
                    .put("[子, 亥, 丑]","水")
                    .put("[子, 丑, 亥]","水")
                    .put("[丑, 亥, 子]","水")
                    .put("[丑, 子, 亥]","水")

                    .build();


    public static final ImmutableList<String> listDiZhiSanXing = ImmutableList.of(
            "[寅, 巳, 申]", "[寅, 申, 巳]",
            "[巳, 寅, 申]", "[巳, 申, 寅]",
            "[申, 寅, 巳]", "[申, 巳, 寅]",

            "[丑, 戌, 未]", "[丑, 未, 戌]",
            "[戌, 丑, 未]", "[戌, 未, 丑]",
            "[未, 丑, 戌]", "[未, 戌, 丑]"
    );



    //农历月
    public final static ImmutableList<String> lunarMonth =ImmutableList.of(
            "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥", "子", "丑");


    /**
     * 十神定义
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
    //十神
public final static ImmutableList<String> listShiShen = ImmutableList.of("比肩", "劫财", "食神", "伤官", "偏财", "正财", "七杀", "正官", "偏印", "正印");

    /**
     * 天干十神表
     * 行: 我干索引
     * 列: 它干
     * [2017-06-08 add by longzhiyou]
     */
    public final static String [][] tableShiShen ={
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
     * 五行生克表
     * 行索引为: 我
     * 列索引为: 其它五行
     * 索引问五行数组
     * 五行	木	 火	 土	 金	 水
         木	比和	 我生	 我克	 克我	 生我
         火
         土
         金
         水
     * [2017-06-12 add by longzhiyou]
     */
    public final static String [][] tableWuXingShengKe ={
            {"比和","我生","我克","克我","生我"},
            {"生我","比和","我生","我克","克我"},
            {"克我","生我","比和","我生","我克"},
            {"我克","克我","生我","比和","我生"},
            {"我生","我克","克我","生我","比和"}
    };

    /**
     * 十干 比劫禄刃印,十神财官印 地支代天干表
     * [2017-06-16 add by longzhiyou]
     */



    /**
     * 计算天干六亲十神关系
     * @param me
     * @param otherGan
     * @return 六亲十神名称
     */
    public  static String getShiShenRelation(String me, String otherGan){

        int woIndex = listTianGan.indexOf(me);
        int otherIndex = listTianGan.indexOf(otherGan);

        return tableShiShen[woIndex][otherIndex];


    }

    /**
     * 获取十神对应的天干
     * @param gan
     * @param shishenName
     * @return
     */
    public  static String getTianGanShiShen(String gan, String shishenName){

        int ganIndex = listTianGan.indexOf(gan);
        for(int i=0;i<10;i++){
            if(shishenName.equals(tableShiShen[ganIndex][i]))
                return  listTianGan.get(i);

        }
        return "";


    }

    /**
     * 获取十神对应的地支禄位
     * 地支禄位代表,火土同宫
     * @param gan
     * @param shishenName
     * @return 地支禄位对应的食神
     */
    public  static String getShiShenDiZhi(String gan, String shishenName){

        int ganIndex = listTianGan.indexOf(gan);
        String tianganShiShen="";
        for(int i=0;i<10;i++){
            if(shishenName.equals(tableShiShen[ganIndex][i]))
                tianganShiShen = listTianGan.get(i);

        }

        //获取本天干对应的禄位置
        String luZhi = getTianGanChangShengJue(tianganShiShen, "禄");
        return luZhi;


    }

    public  static TianGanEnum getTianGan(String sTianGan){

        return mapTianGan.get(sTianGan);
    }

    /**
     * 判断天干是否合
     * @param gan1
     * @param gan2
     * @return
     */
    public  static boolean isTianGanHe(String gan1,String gan2){

        return mapTianGanHe.containsKey( Arrays.asList(gan1, gan2).toString());

    }

    /**
     *
     * @param gan1
     * @param gan2
     * @return 如果不是相合返回null
     */
    public  static String getTianGanHeWuXing(String gan1,String gan2){

        String s = mapTianGanHe.get(Arrays.asList(gan1, gan2).toString());
        return s;

    }

    /**
     * 判断是否是阳干
     * @param gan1
     * @return
     */
    public  static boolean isYangGan(String gan1){

        TianGanEnum tianGanEnum = mapTianGan.get(gan1);
        return tianGanEnum.isYang();
    }

    /**
     * 判断天干是否克
     * @param gan1
     * @param gan2
     * @return
     */
    public  static boolean isTianGanKe(String gan1,String gan2){

        return listTianGanKe.contains( Arrays.asList(gan1, gan2).toString());


    }

    public  static boolean isDiZhiHe(String di1, String di2){
        return mapDiZhiHe.containsKey( Arrays.asList(di1, di2).toString());

    }

    public  static boolean isDiZhiChong(String di1, String di2){
        return listDiZhiChong.contains( Arrays.asList(di1, di2).toString());

    }

    public  static boolean isDiZhiSanHe(String di1,String di2,String di3){
        return mapDiZhiSanHe.containsKey( Arrays.asList(di1, di2, di3).toString());

    }

    public  static boolean isDiZhiSanHui(String di1,String di2,String di3){
        return mapDiZhiSanHui.containsKey( Arrays.asList(di1, di2, di3).toString());

    }

    public  static boolean isDiZhiSanXing(String di1,String di2,String di3){
        return listDiZhiSanXing.contains( Arrays.asList(di1, di2, di3).toString());

    }

    public  static boolean isDiZhiZiXing(String di1,String di2){
        return di1.equals(di2);

    }


    /**
     * 两柱是否双合
     * @param zhu1
     * @param zhu2
     * @return
     */
    public  static boolean isShuangHe(String zhu1,String zhu2){

        boolean tianGanHe = isTianGanHe(zhu1.substring(0, 1), zhu2.substring(0, 1));
        if(!tianGanHe)
            return false;

        boolean diZhiHe = isDiZhiHe(zhu1.substring(1, 2), zhu2.substring(1, 2));
        return diZhiHe;

    }

    public  static boolean isShuangChong(String zhu1,String zhu2){

        boolean tianGanKe = isTianGanKe(zhu1.substring(0, 1), zhu2.substring(0, 1));
        if(!tianGanKe)
            return false;

        boolean diZhiChong = isDiZhiChong(zhu1.substring(1, 2), zhu2.substring(1, 2));
        return diZhiChong;

    }

    /**
     * 获取天干长生诀
     * @param gan
     * @param changshengName 如长生 禄
     * @return
     */
    public  static String getTianGanChangShengJue(String gan,String changshengName){

        //获取天干索引
        int ganIndex = listTianGan.indexOf(gan);

        if (mapChangShengJueName.containsKey(changshengName)) {
                    changshengName = mapChangShengJueName.get(changshengName);
        }
        int changshengIndex = listChangShengJue.indexOf(changshengName);

        return tableTianGanChangShengJue[ganIndex][changshengIndex];


    }

    /**
     * 判断五行是否生
     * @param me
     * @param other
     * @param name: 生克名称,如 生我，我生，克我，我克，比和
     * @return
     */
    public  static Boolean isWuXingShengKe(String me,String other,String name){

        //获取天干索引
        int meIndex = listWuXing.indexOf(me);
        int otherIndex = listWuXing.indexOf(other);
        String nameShengKe = tableWuXingShengKe[meIndex][otherIndex];
        return nameShengKe.equals(name);

    }

    /**
     * 获取六十甲子的五行
     * @param jiazi
     * @return
     */
    public  static String getJiaZiWuXing(String jiazi){

        LiuShiJiaZiEnum liuShiJiaZiEnum = mapLiuShiJiaZi.get(jiazi);
        if (liuShiJiaZiEnum!=null) {
            return liuShiJiaZiEnum.getWuXing().getName();
        }
        return null;

    }





}
