package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm
import com.lzy.core.CoreAlgorithm

/**
 *  年时系统规则
 * Created by bukeyan on 2017/6/18.
 */
class NianShiRule implements BaseRule{

   @Override
    def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

       def mapResult = [:]

       def matchStr = ""
       def ruleValue ;
       def tempShow=""

       def  nianGan = bazi.getNianGan()
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

       /**
        *  年时吉祥对照表
        *  https://wenku.baidu.com/view/fc6ea9bc4693daef5ff73d16.html
        * [2017-09-20 add by longzhiyou]
        */


//       def nianzhuIndex = CoreAlgorithm.jiazi.indexOf(nianZhu)
//       def mapRule = []
//       int size = CoreAlgorithm.jiazi.size()
//       for(int i=0;i<size;i++){
//           if (shiZhu==CoreAlgorithm.jiazirulematrix[nianzhuIndex][i]) {
//               mapRule.push(CoreAlgorithm.jiazirule[i])
//
//           }
//       }
//
//       if (mapRule.size()>0) {
//           mapResult["【年时吉祥规则】"]=mapRule
//       }



       return mapResult
   }
}