package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 *  寿命规则
 *  A33木火通明:
 个人见解  算疾病有意义  算生死  意义不大，算出来了，相当于给求测的客户挂了一个倒计时的钟表。而且研究生死之关口，耗费的精力巨大。
 实务论命中  告诉客户什么时候  该颐养天年就好了
 金玉章会员专用:
 论灾不论死

 * Created by bukeyan on 2017/6/18.
 */
class ShouMingRule implements BaseRule{

   @Override
    def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {


//       八字对于人的生死，下面的理论有一定的道理，可以提供给大家思考：
//       　　1、从八字中反吟的角度看生死;
//       　　总的原则是：
                // 少年行运反吟到年柱，
                // 青年行运反吟到月柱，
                // 中年行运反吟到日柱，
                // 晚年行运反吟到时柱。因为八字中的反吟，足以体现出命局整体平衡态的倾斜，或者严重失衡，所以体现出一个人的灾祸。
                // 如果一个人，在相应的年龄段，反吟到自己的限运，就主这个人会有性命之忧。这个是第一步。

                //       　　剩下的就是找出哪个年份应凶。
                // 一般说来，应凶最严重的流年，应该是流年与大运或者命局伏吟之年，
                // 或者是日干墓地之年应凶。由于福报不同，有些人逢生死之灾并没有死亡，但是总有久死一生的味道，丁酉生死于千钧一发的时刻。

//       　　2、从八字伏吟的角度看生死;
//       　　伏吟论生死，其范围不限与同一时空段的大运与同一时空断的四柱。只是看大运与命局出现伏吟现象，表明此段大运有死人倒寿之象。
// 此种方法看生死，有时并不是本人有死亡之灾，很可能是近亲有死亡之灾。
    // 主要看用神，用神被克，是自己;
       // 否则是六亲。具体是何六亲，这就要看这个伏吟的在何柱，合神受克、受冲，受克无生，便是那个六亲有灾了。
//       　　确定哪部大运有生死之灾时，再推流年，一般发生在伏吟流年应灾。
// 注意伏吟并不只是岁运并临，也包括相同五行的阴阳不同的表现。还有一点的就是，并不是所有人都会伏吟之年面临生死之灾，
// 往往可能发生在伏吟逢合，恰恰合后之五行，又同属于伏吟之五行，也是应期。
//       　　3、从胎养生与死墓绝的角度看生死;
//       　　这个原则，比较着重于合会冲，要命中岁运有感应。如何感应呢?就是一定要日元或者十神所代表的亲人之胎养生或者死墓绝被冲出本命，或者外面冲入本命，或者在原命局中被运程冲掉。或者大运流年合入本命，合出本命。原来在命中有的东西，被岁运合掉、冲掉，都是失去的迹象。这个方法，不但可以适用日主，同样也可以适用相应六亲。
//       　　如果日主或者六亲在原局中，以及行运上，碰上死墓绝，在原局，大运占全，那么可以初步判断，这个大运，日主或者某个六亲会有生死之灾;在逢流年遇到死墓绝便是应期。
//       　　至于胎养生，最怕长生之反被冲掉，逢大运冲掉，必主有生死之灾，逢给主冲方加力之年便是应期;胎养亦是如此。《渊海子平》说：五行生死，人事参评。遇生怕死，遇死怕生;逢旺处生，则死处灭;逢死处生，必然旺处脱;也是一个判断指标。
//       　　另外，也有旺者怕更旺，生者怕重生。阳干与阴干有别，阳干怕衰，阴干怕旺。

//       《细批终身》一书中有讲到如何算生死运.一般都是犯旺运为生死运

       return null
   }
}