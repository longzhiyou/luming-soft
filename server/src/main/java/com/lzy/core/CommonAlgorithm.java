package com.lzy.core;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.lzy.common.DiZhiEnum;
import com.lzy.common.LiuShiJiaZiEnum;
import com.lzy.common.TianGanEnum;
import com.lzy.common.WuXingEnum;
import org.raistlic.common.permutation.Permutation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 通用算法
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

    //天干禄地支
    public final static ImmutableMap<String,String> mapTianGanLu = ImmutableMap.<String,
            String>builder()
            .put("甲","寅")
            .put("乙","卯")
            .put("丙","巳")
            .put("丁","午")
            .put("戊","巳")
            .put("己","午")
            .put("庚","申")
            .put("辛","酉")
            .put("壬","亥")
            .put("癸","子")

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
            .put(LiuShiJiaZiEnum.BINGSHEN.getName(), LiuShiJiaZiEnum.BINGSHEN)
            .put(LiuShiJiaZiEnum.DINGYOU.getName(), LiuShiJiaZiEnum.DINGYOU)
            .put(LiuShiJiaZiEnum.WUXU.getName(), LiuShiJiaZiEnum.WUXU)
            .put(LiuShiJiaZiEnum.JIHAI.getName(), LiuShiJiaZiEnum.JIHAI)
            .put(LiuShiJiaZiEnum.GENGZI.getName(), LiuShiJiaZiEnum.GENGZI)
            .put(LiuShiJiaZiEnum.XINCHOU.getName(), LiuShiJiaZiEnum.XINCHOU)
            .put(LiuShiJiaZiEnum.RENYIN.getName(), LiuShiJiaZiEnum.RENYIN)
            .put(LiuShiJiaZiEnum.GUIMAO.getName(), LiuShiJiaZiEnum.GUIMAO)
            .put(LiuShiJiaZiEnum.JIACHEN.getName(), LiuShiJiaZiEnum.JIACHEN)
            .put(LiuShiJiaZiEnum.YISI.getName(), LiuShiJiaZiEnum.YISI)
            .put(LiuShiJiaZiEnum.BINGWU.getName(), LiuShiJiaZiEnum.BINGWU)
            .put(LiuShiJiaZiEnum.DINGWEI.getName(), LiuShiJiaZiEnum.DINGWEI)
            .put(LiuShiJiaZiEnum.WUSHEN.getName(), LiuShiJiaZiEnum.WUSHEN)
            .put(LiuShiJiaZiEnum.JIYOU.getName(), LiuShiJiaZiEnum.JIYOU)
            .put(LiuShiJiaZiEnum.GENGXU.getName(), LiuShiJiaZiEnum.GENGXU)
            .put(LiuShiJiaZiEnum.XINHAI.getName(), LiuShiJiaZiEnum.XINHAI)
            .put(LiuShiJiaZiEnum.RENZI.getName(), LiuShiJiaZiEnum.RENZI)
            .put(LiuShiJiaZiEnum.GUICHOU.getName(), LiuShiJiaZiEnum.GUICHOU)
            .put(LiuShiJiaZiEnum.JIAYIN.getName(), LiuShiJiaZiEnum.JIAYIN)
            .put(LiuShiJiaZiEnum.YIMAO.getName(), LiuShiJiaZiEnum.YIMAO)
            .put(LiuShiJiaZiEnum.BINGCHEN.getName(), LiuShiJiaZiEnum.BINGCHEN)
            .put(LiuShiJiaZiEnum.DINGSI.getName(), LiuShiJiaZiEnum.DINGSI)
            .put(LiuShiJiaZiEnum.WUWU.getName(), LiuShiJiaZiEnum.WUWU)
            .put(LiuShiJiaZiEnum.JIWEI.getName(), LiuShiJiaZiEnum.JIWEI)
            .put(LiuShiJiaZiEnum.GENGSHEN.getName(), LiuShiJiaZiEnum.GENGSHEN)
            .put(LiuShiJiaZiEnum.XINYOU.getName(), LiuShiJiaZiEnum.XINYOU)
            .put(LiuShiJiaZiEnum.RENXU.getName(), LiuShiJiaZiEnum.RENXU)
            .put(LiuShiJiaZiEnum.GUIHAI.getName(), LiuShiJiaZiEnum.GUIHAI)
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


    public final static  ImmutableList<String> listDiZhiSanXing = ImmutableList.of(
            "[寅, 巳, 申]", "[寅, 申, 巳]",
            "[巳, 寅, 申]", "[巳, 申, 寅]",
            "[申, 寅, 巳]", "[申, 巳, 寅]",

            "[丑, 戌, 未]", "[丑, 未, 戌]",
            "[戌, 丑, 未]", "[戌, 未, 丑]",
            "[未, 丑, 戌]", "[未, 戌, 丑]"
    );


    //天干隔一
    final static ImmutableMap<String,String> mapTianGanGe =
            ImmutableMap.<String, String>builder()
                    .put("[甲, 丙]","乙")
                    .put("[丙, 甲]","乙")

                    .put("[乙, 丁]","丙")
                    .put("[丁, 乙]","丙")

                    .put("[丙, 戊]","丁")
                    .put("[戊, 丙]","丁")

                    .put("[丁, 己]","戊")
                    .put("[己, 丁]","戊")

                    .put("[戊, 庚]","己")
                    .put("[庚, 戊]","己")

                    .put("[己, 辛]","庚")
                    .put("[辛, 己]","庚")

                    .put("[庚, 壬]","辛")
                    .put("[壬, 庚]","辛")

                    .put("[辛, 癸]","壬")
                    .put("[癸, 辛]","壬")


                    .put("[壬, 甲]","癸")
                    .put("[甲, 壬]","癸")

                    .put("[癸, 乙]","甲")
                    .put("[乙, 癸]","甲")

                    .build();

    //地支隔一
    final static ImmutableMap<String,String> mapDiZhiGe =
            ImmutableMap.<String, String>builder()
                    .put("[子, 寅]","丑")
                    .put("[寅, 子]","丑")

                    .put("[丑, 卯]","寅")
                    .put("[卯, 丑]","寅")

                    .put("[寅, 辰]","卯")
                    .put("[辰, 寅]","卯")

                    .put("[卯, 巳]","辰")
                    .put("[巳, 卯]","辰")

                    .put("[辰, 午]","巳")
                    .put("[午, 辰]","巳")

                    .put("[巳, 未]","午")
                    .put("[未, 巳]","午")

                    .put("[午, 申]","未")
                    .put("[申, 午]","未")

                    .put("[未, 酉]","申")
                    .put("[酉, 未]","申")


                    .put("[申, 戌]","酉")
                    .put("[戌, 申]","酉")

                    .put("[酉, 亥]","戌")
                    .put("[亥, 酉]","戌")

                    .put("[戌, 子]","亥")
                    .put("[子, 戌]","亥")

                    .put("[亥, 丑]","子")
                    .put("[丑, 亥]","子")

                    .build();

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


    //十神名称转换名称
    public final static ImmutableMap<String,String> mapShiShenName = ImmutableMap.<String,
            String>builder()
            .put("比","比肩")
            .put("禄","比肩")
            .put("劫","劫财")
            .put("刃","劫财")
            .put("阳刃","劫财")
            .put("羊刃","劫财")
            .put("食","食神")
            .put("伤","伤官")
            .put("才","偏财")
            .put("财","正财")
            .put("官","正官")
            .put("杀","七杀")
            .put("煞","七杀")
            .put("枭","偏印")
            .put("枭神","偏印")
            .put("印","正印")



            .build();


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
    public   String getShiShenRelation(String me, String otherGan){

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
    public   String getTianGanShiShen(String gan, String shishenName){

        int ganIndex = listTianGan.indexOf(gan);

        if (mapShiShenName.containsKey(shishenName)) {
            shishenName = mapShiShenName.get(shishenName);
        }
        String tianganShiShen="";
        for(int i=0;i<10;i++){
            if(shishenName.equals(tableShiShen[ganIndex][i]))
                tianganShiShen = listTianGan.get(i);

        }
        return tianganShiShen;


    }

    /**
     * 获取十神对应的地支禄位
     * 地支禄位代表,火土同宫
     * @param gan
     * @param shishenName
     * @return 地支禄位对应的食神
     */
    public   String getShiShenDiZhi(String gan, String shishenName){


        String tianganShiShen=getTianGanShiShen(gan,shishenName);
        //获取本天干对应的禄位置
        String luZhi = getTianGanChangShengJue(tianganShiShen, "禄");
        return luZhi;


    }

    public   TianGanEnum getTianGan(String sTianGan){

        return mapTianGan.get(sTianGan);
    }

    /**
     * 判断天干是否合
     * @param gan1
     * @param gan2
     * @return
     */
    public   boolean isTianGanHe(String gan1,String gan2){

        return mapTianGanHe.containsKey( Arrays.asList(gan1, gan2).toString());

    }

    /**
     *
     * @param gan1
     * @param gan2
     * @return 如果不是相合返回null
     */
    public   String getTianGanHeWuXing(String gan1,String gan2){

        String s = mapTianGanHe.get(Arrays.asList(gan1, gan2).toString());
        return s;

    }

    /**
     * 判断是否是阳干
     * @param gan1
     * @return
     */
    public   boolean isYangGan(String gan1){

        TianGanEnum tianGanEnum = mapTianGan.get(gan1);
        return tianGanEnum.isYang();
    }

    /**
     * 获取天干五行
     * @param gan
     * @return
     */
    public   String getTianGanWuXing(String gan){

        TianGanEnum tianGanEnum = mapTianGan.get(gan);
        return tianGanEnum.getWuXing().getName();
    }

    /**
     * 判断天干是否克
     * @param gan1
     * @param gan2
     * @return
     */
    public   boolean isTianGanKe(String gan1,String gan2){

        return listTianGanKe.contains( Arrays.asList(gan1, gan2).toString());


    }

    public   boolean isDiZhiHe(String di1, String di2){
        return mapDiZhiHe.containsKey( Arrays.asList(di1, di2).toString());

    }

    /**
     * 判断地支中是否包含六合
     * @param combinationList 需要组合的地支列表 如八字地支列表
     * @return
     */
    public   boolean containsDiZhiHe(List<String> combinationList){
        for(List<String> list : Permutation.of(combinationList, 2)){
            if (mapDiZhiHe.containsKey( list.toString())){
                return true;
            }
        }

        return false;

    }

    public   boolean isDiZhiChong(String di1, String di2){
        return listDiZhiChong.contains( Arrays.asList(di1, di2).toString());

    }

    public   boolean isDiZhiSanHe(String di1,String di2,String di3){
        return mapDiZhiSanHe.containsKey( Arrays.asList(di1, di2, di3).toString());

    }

    public Set<String> getDiZhiSanHe(List<String> listDiZhi){

        Set<String> result = new HashSet<String>();
        //先排列组合
        for(List<String> list : Permutation.of(listDiZhi, 3)){

            String key =list.toString();
            if(mapDiZhiSanHe.containsKey(key)){

                result.add(mapDiZhiSanHe.get(key));

            }

        }

        return result;

    }



    public   boolean isDiZhiSanHui(String di1,String di2,String di3){
        return mapDiZhiSanHui.containsKey( Arrays.asList(di1, di2, di3).toString());

    }

    /**
     * 获取地支三会
     * @param listDiZhi：要匹配的地支列表
     * @return 对应的五行
     */
    public Set<String> getDiZhiSanHui(List<String> listDiZhi){

        Set<String> result = new HashSet<String>();
        //先排列组合
        for(List<String> list : Permutation.of(listDiZhi, 3)){

            String key =list.toString();
            if(mapDiZhiSanHui.containsKey(key)){

                result.add(mapDiZhiSanHui.get(key));

            }

        }

        return result;

    }

    public   boolean isDiZhiSanXing(String di1,String di2,String di3){
        return listDiZhiSanXing.contains( Arrays.asList(di1, di2, di3).toString());

    }


    public   boolean isDiZhiZiXing(String di1,String di2){
        return di1.equals(di2);

    }


    /**
     * 两柱是否双合
     * @param zhu1
     * @param zhu2
     * @return
     */
    public   boolean isShuangHe(String zhu1,String zhu2){

        boolean tianGanHe = isTianGanHe(zhu1.substring(0, 1), zhu2.substring(0, 1));
        if(!tianGanHe)
            return false;

        boolean diZhiHe = isDiZhiHe(zhu1.substring(1, 2), zhu2.substring(1, 2));
        return diZhiHe;

    }

    public   boolean isShuangChong(String zhu1,String zhu2){

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
     * @return 对应的地支
     */
    public   String getTianGanChangShengJue(String gan,String changshengName){

        //获取天干索引
        int ganIndex = listTianGan.indexOf(gan);

        if (mapChangShengJueName.containsKey(changshengName)) {
                    changshengName = mapChangShengJueName.get(changshengName);
        }
        int changshengIndex = listChangShengJue.indexOf(changshengName);

        return tableTianGanChangShengJue[ganIndex][changshengIndex];


    }

    /**
     * 获取五行在地支的长生诀
     * @param wuxing
     * @param dizhi
     * @return 对应的名称
     */
    public   String getWuXingChangShengJueName(String wuxing,String dizhi){

        //获取五行索引
        int wuxingIndex = listWuXing.indexOf(wuxing);
        int dizhiIndex = listDiZhi.indexOf(dizhi);

        for(int i=0;i<12;i++){
            String zhi = tableWuXingChangShengJue[wuxingIndex][i];
            if (dizhi.equals(zhi)) {
                //根据索引获取长生诀名称
                return listChangShengJue.get(i);
            }
        }
        return "";
    }



    /**
     * 判断五行是否生
     * @param meWuXing
     * @param otherWuXing
     * @param name: 生克名称,如 生我，我生，克我，我克，比和
     * @return
     */
    public   Boolean isWuXingShengKe(String meWuXing,String otherWuXing,String name){

        //获取天干索引
        int meIndex = listWuXing.indexOf(meWuXing);
        int otherIndex = listWuXing.indexOf(otherWuXing);
        String nameShengKe = tableWuXingShengKe[meIndex][otherIndex];
        return nameShengKe.equals(name);

    }

    /**
     * 纳音克我五行
     * @param meJiaZi
     * @param otherJiaZi
     * @return
     */
    public  Boolean isNaYinWuXingKe(String meJiaZi,String otherJiaZi){

        String name = "克我";
        String me = getJiaZiWuXing(meJiaZi);
        String other = getJiaZiWuXing(otherJiaZi);

        return isWuXingShengKe(me, other, name);


    }

    /**
     * 暗带
     * @param gan1
     * @param gan2
     *
     * @return
     */
    public  String getAnDai(String gan1,String gan2,String zhi1,String zhi2){

        String result="";
        String gange = mapTianGanGe.get(Arrays.asList(gan1, gan2).toString());
        if (gange==null)
            return result;
        String zhige = mapDiZhiGe.get(Arrays.asList(zhi1, zhi2).toString());
        if (zhige==null)
            return result;

        return gange+zhige;

    }




    /**
     * 获取六十甲子的五行
     * @param jiazi
     * @return
     */
    public   String getJiaZiWuXing(String jiazi){

        LiuShiJiaZiEnum liuShiJiaZiEnum = mapLiuShiJiaZi.get(jiazi);
        if (liuShiJiaZiEnum!=null) {
            return liuShiJiaZiEnum.getWuXing().getName();
        }
        return "";

    }

    /**
     * 判断是否在一旬
     * @param jiazi1
     * @param jiazi2
     * @return
     */
    public   Boolean isYiXun(String jiazi1,String jiazi2){

        LiuShiJiaZiEnum jiaZiEnum1 = mapLiuShiJiaZi.get(jiazi1);
        LiuShiJiaZiEnum jiaZiEnum2 = mapLiuShiJiaZi.get(jiazi2);
        return jiaZiEnum1.getKongwang().toString().equals(jiaZiEnum2.getKongwang().toString());

    }

    /**
     * 获取天干禄位
     * @param gan
     * @return
     */
    public   String getLuZhi(String gan){

       return mapTianGanLu.get(gan);
    }

    /**
     * 地支是否包含藏干
     * @param gan
     * @return
     */
    public   boolean containsCangGan(String gan,String zhi){
        DiZhiEnum diZhiEnum = mapDiZhi.get(zhi);
        ImmutableSet<String> cangganSet = diZhiEnum.getCanggan();
        for (String canggan : cangganSet) {
            if(canggan==gan)
                return true;
        }

        return false;
    }






}
