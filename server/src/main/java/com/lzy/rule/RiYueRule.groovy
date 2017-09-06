package com.lzy.rule

import com.lzy.core.BaZi
import com.lzy.core.CommonAlgorithm

/**
 *  日月规则
 *  格局论
 *  调侯论
 * Created by bukeyan on 2017/6/18.
 */
public class RiYueRule implements BaseRule{

    @Override
    def matchRule(BaZi bazi, CommonAlgorithm commonAlgorithm) {

        def mapResult = [:]
        def mapRule = [:]
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

        def listMingGan = bazi.getListMingGan()
        def listMingZhi = bazi.getListMingZhi()
        def listMingZhu = bazi.getListMingZhu()

        def luZhi = commonAlgorithm.getLuZhi(riGan)

        def renZhi = commonAlgorithm.getShiShenDiZhi(riGan, "刃")
        def yinZhi = commonAlgorithm.getShiShenDiZhi(riGan, "印")
        def jiecai = commonAlgorithm.getTianGanShiShen(riGan, "劫财")
        def bijian = commonAlgorithm.getTianGanShiShen(riGan, "比肩")


        /**
         *
         * 神峰通考定格局诀
         *  甲日定格
         *      甲日寅月是建禄，卯月羊刃可堪凭。三月财星藏辰库，
         *      巳为食神财暗伏。午月丁火伤官格，未月杂气取财星。
         *      七月申提七杀论，酉为正气官星得。九月戌中惟杂气，
         *      十月偏印格局真。十一月取正印格，丑中杂气仔细详。
         *  乙日定格
         *      乙曰寅月号伤官，卯为建禄格中真。三月财官俱杂气，
         *      巳中伤官财星端。午提丁火食神格，未中杂气曰财官。
         *      申月正气官星论，八月酉中作杀推。戌内财官俱杂气，
         *      亥月正印便扶身。子癸之中偏印是，杂气推来在丑中。
         *  丙日定格
         *      丙日逢寅偏印生，卯月正印喜官星。辰初杂气用食神，
         *      巳中定取建禄格。午火羊刃又伤官，未取伤官宜伤尽。
         *      申是偏财喜旺神，酉月财旺生官格。戌上杂气为食神，
         *      亥月偏印七杀真。子中正官宜官旺，丑宫分明杂气生。
         *  丁曰定格
         *      丁日寅提正印评，卯上偏印格局真。辰初杂气未伤官，
         *      巳上伤官便生财。午中建禄分明取，未月食神独可嗔。
         *      申内正财生官格，酉月偏财可追寻。戌中杂气未伤官，
         *      亥月正官及正印。子月偏官七杀真，丑月杂气是财官。
         *  戊日定格
         *      戊藏寅月杀拘印，卯是正官寻贵气。辰内杂气财官格，
         *      巳上亦取号建禄。午月刃取正印格，未上杂气作官印。
         *      七月食神生财旺，八月伤官喜遇财。戌中杂气分明取，
         *      亥月财杀格中真。子提正财生官格，丑上杂气号财官。
         *  己日定格
         *      己生寅月正官印，卯推七杀便是真。辰是杂气取财官，
         *      己中正印格可清。午中建禄居此位，未土杂气借财杀。
         *      申月伤官真论此，酉中食神亦可寻。戌月借取杂气格，
         *      亥上正财生官格。子月偏财明怕劫，丑月杂气取财官。
         *  庚日定格
         *      庚到寅宫评财杀，卯月正财便生官。辰初杂气用偏印，
         *      巳火七杀号偏官。午月炎天寻正官，未中杂气用正印。
         *      申中便取建禄格，酉用羊刃格中寻。戌中杂气用偏印，
         *      亥上食神喜身强。子月伤官真可论，丑中只可作杂气。
         *  辛日定格
         *      辛日寅财旺生官，卯月偏财是福基。辰是杂气未正印，
         *      巳上正官及正印。午月偏官喜枭神，未取杂气用偏印。
         *      申月借取伤官格，酉是建禄怕逢冲。戌中杂气戊是印，
         *      亥日伤官喜见财。子月之中求食神，丑上下旬论偏印。
         *  壬日定格
         *      壬逢寅地号食神，卯上见印取伤官。辰是杂气为七杀，
         *      巳取偏财并偏官。午月财官正两全，未上杂气取财官。
         *      申月偏印无别论，酉取正印怕逢财。戌月杂气为七杀，
         *      亥未建禄用食神。子月之中羊刃格，丑中杂气是财官。
         *  癸日定格
         *      癸日寅月取伤官，卯月食神定是真。辰中杂气是正官，
         *      巳月正财官便是。午月偏财又偏官，六月杂气是七杀。
         *      申月正印怕逢寅，酉月偏印忌见比。戌中杂气是财官，
         *      亥月借取伤官格。子中建禄定其真，丑中杂气为七杀。
         * [2017-09-06 add by longzhiyou]
         */

        def zipingzhenquangeju = [
                "建禄格":[
                        "要点":["建禄者，月建逢禄堂也，禄即是劫。或以禄堂透出，即可依以用者，非也。故建禄与月劫，可同一格，不必加分，皆以透干会支，别取财官煞食为用。"]
                        ,"禄格用官，干头透出为奇，又要财印相随，不可孤官无辅。":[
                            "1.有用官而印护者":["运:禄劫用官，印护者喜财，怕官星之逢合，畏七煞之相乘。伤食不能为害，劫比未即为凶。"]
                            ,"2.有用官而财助者":["运：财生喜印，宜官星之植根，畏伤食之相侮，逢财愈见其功，杂煞岂能无碍？"]
                            ,"3.有官而兼带财印者，所谓身强值三奇，尤为贵气。三奇者，财官印也，只要以官隔之，使财印两不相伤，其格便大":[""]
                            ,"4.若夫用官而孤官无辅，格局便小，难于取贵，若透伤食，便为破格。然亦有官伤并透而贵者，何也？如己酉、乙亥、壬戌、庚子，庚合乙而去伤存官，王总兵命也。":[""]
                            ,"5.倘或两官竞出，亦须制伏，所谓争正官不可无伤也。":[""]
                        ]
                        ,"禄劫用煞":[
                            "1.禄劫用煞，必须制伏.至于用煞而又有财，本为不美，然能去煞存财，又成贵格。":[" 运：若用煞而带财，命中合煞存财，则伤食为宜，财运不忌，透官无虑，身旺亦亨。若命中合财存煞，而用食制，煞轻则助煞，食轻助食则已。"]
                            ,"2.更有禄劫而官煞竞出者，必取清方为贵格。如一平章命，辛丑、庚寅、甲辰、乙亥、合煞留官也；如辛亥、庚寅、甲申、丙寅，制煞留官也。":["运：禄劫而官煞并出，不论合煞留官，存官制煞，运喜伤食，比肩亦宜，印绶未为良图，财官亦非福运。"]
                            ,"3.用官煞重而无制伏，运行制伏，亦可发财，但不可官煞太重，致令身危也。":[""]
                        ]
                        ,"禄劫用财":[
                            "1.禄劫用财，须带食伤,盖月令为劫而以财作用，二者相克，必以伤食化之，始可转劫生财":["  运： 禄劫用财而带伤食，财食重则喜印绶，而不忌比肩；财食轻则宜助财，而不喜印比。逢煞无伤，遇官非福。"]
                            ,"2.至于化劫为财与化劫为生，尤为秀气。如己未、己巳、丁未、辛丑，丑与巳会，即以劫财之火为金局之财，安得不为大贵？所谓化劫为财也。如高尚书命，庚子、甲申、庚子、甲申，即以劫财之金，化为生财之水，所谓化劫为生也。":[""]
                            ,"3.用财而不透伤食，便难于发端，然干头透一位而不杂，地支根多，亦可取富，但不贵耳。":[""]
                        ]
                        ,"其禄劫之格，无财官而用伤食":[
                        "其禄劫之格，无财官而用伤食，泄其太过，亦为秀气。唯春木秋金，用之则贵，盖木逢火则明，金生水则灵":["运：禄劫而用伤食，财运最宜，煞亦不忌，行印非吉，透官不美。若命中伤食太重，则财运固利，而印亦不忌矣。"]

                    ]
                ],
                "阳刃":["阳刃，月建逢禄堂也，禄即是劫。或以禄堂透出，即可依以用者，非也。"]
        ]

        //格局论
        if (riGan=="甲"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["甲日寅月是建禄"]
                mapResult["【子平真诠-建禄格】"] = zipingzhenquangeju["建禄格"]

            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["卯月羊刃可堪凭"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["三月财星藏辰库"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["巳为食神财暗伏"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["午月丁火伤官格"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["未月杂气取财星"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["七月申提七杀论"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["酉为正气官星得"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["九月戌中惟杂气"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["十月偏印格局真"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["十一月取正印格"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-甲日定格】"] = ["丑中杂气仔细详"]
            }

        }else if (riGan=="乙"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["乙曰寅月号伤官"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["卯为建禄格中真"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["三月财官俱杂气"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["巳中伤官财星端"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["午提丁火食神格"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["未中杂气曰财官"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["申月正气官星论"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["八月酉中作杀推"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["戌内财官俱杂气"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["亥月正印便扶身"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["子癸之中偏印是"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-乙日定格】"] = ["杂气推来在丑中"]
            }

        }else if (riGan=="丙"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["丙日逢寅偏印生"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["卯月正印喜官星"]

            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["辰初杂气用食神"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["巳中定取建禄格"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["午火羊刃又伤官"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["未取伤官宜伤尽"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["申是偏财喜旺神"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["酉月财旺生官格"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["戌上杂气为食神"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["亥月偏印七杀真"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["子中正官宜官旺"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-丙日定格】"] = ["丑宫分明杂气生"]
            }

        }else if (riGan=="丁"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["丁日寅提正印评"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["卯上偏印格局真"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["辰初杂气未伤官"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["巳上伤官便生财"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["午中建禄分明取"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["未月食神独可嗔"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["申内正财生官格"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["酉月偏财可追寻"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["戌中杂气未伤官"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["亥月正官及正印"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["子月偏官七杀真"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-丁日定格】"] = ["丑月杂气是财官"]
            }

        }else if (riGan=="戊"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["戊藏寅月杀拘印"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["卯是正官寻贵气"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["辰内杂气财官格"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["巳上亦取号建禄"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["午月刃取正印格"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["未上杂气作官印"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["七月食神生财旺"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["八月伤官喜遇财"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["戌中杂气分明取"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["亥月财杀格中真"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["子提正财生官格"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-戊日定格】"] = ["丑上杂气号财官"]
            }

        }else if (riGan=="己"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["己生寅月正官印"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["卯推七杀便是真"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["辰是杂气取财官"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["巳中正印格可清"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["午中建禄居此位"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["未土杂气借财杀"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["申月伤官真论此"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["酉中食神亦可寻"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["戌月借取杂气格"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["亥上正财生官格"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["子月偏财明怕劫"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-己日定格】"] = ["丑月杂气取财官"]
            }

        }else if (riGan=="庚"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["庚到寅宫评财杀"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["卯月正财便生官"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["辰初杂气用偏印"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["巳火七杀号偏官"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["午月炎天寻正官"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["未中杂气用正印"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["申中便取建禄格"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["酉用羊刃格中寻"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["戌中杂气用偏印"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["亥上食神喜身强"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["子月伤官真可论"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-庚日定格】"] = ["丑中只可作杂气"]
            }

        }else if (riGan=="辛"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["辛日寅财旺生官"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["卯月偏财是福基"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["辰是杂气未正印"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["巳上正官及正印"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["午月偏官喜枭神"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["未取杂气用偏印"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["申月借取伤官格"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["酉是建禄怕逢冲"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["戌中杂气戊是印"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["亥日伤官喜见财"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["子月之中求食神"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-辛日定格】"] = ["丑上下旬论偏印"]
            }

        }else if (riGan=="壬"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["壬逢寅地号食神"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["卯上见印取伤官"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["辰是杂气为七杀"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["巳取偏财并偏官"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["午月财官正两全"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["未上杂气取财官"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["申月偏印无别论"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["酉取正印怕逢财"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["戌月杂气为七杀"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["亥末建禄用食神"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["子月之中羊刃格"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-壬日定格】"] = ["丑中杂气是财官"]
            }

        }else if (riGan=="癸"){
            if(yueZhi=="寅"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["癸日寅月取伤官"]
            }else if (yueZhi=="卯"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["卯月食神定是真"]
            }else if (yueZhi=="辰"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["辰中杂气是正官"]
            }else if (yueZhi=="巳"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["巳月正财官便是"]
            }else if (yueZhi=="午"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["午月偏财又偏官"]
            }else if (yueZhi=="未"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["六月杂气是七杀"]
            }else if (yueZhi=="申"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["申月正印怕逢寅"]
            }else if (yueZhi=="酉"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["酉月偏印忌见比"]
            }else if (yueZhi=="戌"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["戌中杂气是财官"]
            }else if (yueZhi=="亥"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["亥月借取伤官格"]
            }else if (yueZhi=="子"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["子中建禄定其真"]
            }else if (yueZhi=="丑"){
                mapResult["【神峰通考定格局诀-癸日定格】"] = ["丑中杂气为七杀"]
            }

        }

        //调后用神表

        if (riGan=="甲"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="乙"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="丙"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="丁"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="戊"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="己"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="庚"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="辛"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="壬"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="癸"){
            if(yueZhi=="寅"){

            }else if (yueZhi=="卯"){

            }else if (yueZhi=="辰"){

            }else if (yueZhi=="巳"){

            }else if (yueZhi=="午"){

            }else if (yueZhi=="未"){

            }else if (yueZhi=="申"){

            }else if (yueZhi=="酉"){

            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){

            }else if (yueZhi=="子"){

            }else if (yueZhi=="丑"){

            }

        }

        return mapResult
    }
}