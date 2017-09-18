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


    //定格局诀
    def dinggejujue(BaZi bazi, CommonAlgorithm commonAlgorithm){

        def mapResult = [:]
        def yueZhi =bazi.getYueZhi()

        def riGan = bazi.getRiGan()


        if (riGan=="甲"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["甲日寅月是建禄"]
            }else if (yueZhi=="卯"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["卯月羊刃可堪凭"]
            }else if (yueZhi=="辰"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["三月财星藏辰库"]
            }else if (yueZhi=="巳"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["巳为食神财暗伏"]
            }else if (yueZhi=="午"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["午月丁火伤官格"]
            }else if (yueZhi=="未"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["未月杂气取财星"]
            }else if (yueZhi=="申"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["七月申提七杀论"]
            }else if (yueZhi=="酉"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["酉为正气官星得"]
            }else if (yueZhi=="戌"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["九月戌中惟杂气"]
            }else if (yueZhi=="亥"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["十月偏印格局真"]
            }else if (yueZhi=="子"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["十一月取正印格"]
            }else if (yueZhi=="丑"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["丑中杂气仔细详"]
            }

        }else if (riGan=="乙"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["乙曰寅月号伤官"]
            }else if (yueZhi=="卯"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["卯为建禄格中真"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["三月财官俱杂气"]
            }else if (yueZhi=="巳"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["巳中伤官财星端"]
            }else if (yueZhi=="午"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["午提丁火食神格"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["未中杂气曰财官"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["申月正气官星论"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["八月酉中作杀推"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["戌内财官俱杂气"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["亥月正印便扶身"]
            }else if (yueZhi=="子"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["子癸之中偏印是"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]   = ["杂气推来在丑中"]
            }

        }else if (riGan=="丙"){
            if(yueZhi=="寅"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["丙日逢寅偏印生"]
            }else if (yueZhi=="卯"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["卯月正印喜官星"]

            }else if (yueZhi=="辰"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["辰初杂气用食神"]
            }else if (yueZhi=="巳"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["巳中定取建禄格"]
            }else if (yueZhi=="午"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["午火羊刃又伤官"]
            }else if (yueZhi=="未"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["未取伤官宜伤尽"]
            }else if (yueZhi=="申"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["申是偏财喜旺神"]
            }else if (yueZhi=="酉"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["酉月财旺生官格"]
            }else if (yueZhi=="戌"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["戌上杂气为食神"]
            }else if (yueZhi=="亥"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["亥月偏印七杀真"]
            }else if (yueZhi=="子"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["子中正官宜官旺"]
            }else if (yueZhi=="丑"){
               mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["丑宫分明杂气生"]
            }

        }else if (riGan=="丁"){
            if(yueZhi=="寅"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丁日寅提正印评"]
            }else if (yueZhi=="卯"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯上偏印格局真"]
            }else if (yueZhi=="辰"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰初杂气末伤官"]
            }else if (yueZhi=="巳"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳上伤官便生财"]
            }else if (yueZhi=="午"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午中建禄分明取"]
            }else if (yueZhi=="未"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未月食神独可嗔"]
            }else if (yueZhi=="申"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申内正财生官格"]
            }else if (yueZhi=="酉"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉月偏财可追寻"]
            }else if (yueZhi=="戌"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气未伤官"]
            }else if (yueZhi=="亥"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥月正官及正印"]
            }else if (yueZhi=="子"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子月偏官七杀真"]
            }else if (yueZhi=="丑"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑月杂气是财官"]
            }

        }else if (riGan=="戊"){
            if(yueZhi=="寅"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戊藏寅月杀拘印"]
            }else if (yueZhi=="卯"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯是正官寻贵气"]
            }else if (yueZhi=="辰"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰内杂气财官格"]
            }else if (yueZhi=="巳"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳上亦取号建禄"]
            }else if (yueZhi=="午"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午月刃取正印格"]
            }else if (yueZhi=="未"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未上杂气作官印"]
            }else if (yueZhi=="申"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["七月食神生财旺"]
            }else if (yueZhi=="酉"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["八月伤官喜遇财"]
            }else if (yueZhi=="戌"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气分明取"]
            }else if (yueZhi=="亥"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥月财杀格中真"]
            }else if (yueZhi=="子"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子提正财生官格"]
            }else if (yueZhi=="丑"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑上杂气号财官"]
            }

        }else if (riGan=="己"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["己生寅月正官印"]
            }else if (yueZhi=="卯"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯推七杀便是真"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰是杂气取财官"]
            }else if (yueZhi=="巳"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳中正印格可清"]
            }else if (yueZhi=="午"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午中建禄居此位"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未土杂气借财杀"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月伤官真论此"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉中食神亦可寻"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌月借取杂气格"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥上正财生官格"]
            }else if (yueZhi=="子"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子月偏财明怕劫"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑月杂气取财官"]
            }

        }else if (riGan=="庚"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["庚到寅宫评财杀"]
            }else if (yueZhi=="卯"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯月正财便生官"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰初杂气用偏印"]
            }else if (yueZhi=="巳"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳火七杀号偏官"]
            }else if (yueZhi=="午"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午月炎天寻正官"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未中杂气用正印"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申中便取建禄格"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉用羊刃格中寻"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气用偏印"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥上食神喜身强"]
            }else if (yueZhi=="子"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子月伤官真可论"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑中只可作杂气"]
            }

        }else if (riGan=="辛"){
            if(yueZhi=="寅"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辛日寅财旺生官"]
            }else if (yueZhi=="卯"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯月偏财是福基"]
            }else if (yueZhi=="辰"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰是杂气未正印"]
            }else if (yueZhi=="巳"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳上正官及正印"]

            }else if (yueZhi=="午"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午月偏官喜枭神"]
            }else if (yueZhi=="未"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未取杂气用偏印"]
            }else if (yueZhi=="申"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月借取伤官格"]
            }else if (yueZhi=="酉"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉是建禄怕逢冲"]
            }else if (yueZhi=="戌"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气戊是印"]
            }else if (yueZhi=="亥"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥日伤官喜见财"]
            }else if (yueZhi=="子"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子月之中求食神"]
            }else if (yueZhi=="丑"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑上下旬论偏印"]
            }

        }else if (riGan=="壬"){
            if(yueZhi=="寅"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["壬逢寅地号食神"]
            }else if (yueZhi=="卯"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯上见印取伤官"]
            }else if (yueZhi=="辰"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰是杂气为七杀"]
            }else if (yueZhi=="巳"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳取偏财并偏官"]
            }else if (yueZhi=="午"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午月财官正两全"]

            }else if (yueZhi=="未"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未上杂气取财官"]
            }else if (yueZhi=="申"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月偏印无别论"]
            }else if (yueZhi=="酉"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉取正印怕逢财"]
            }else if (yueZhi=="戌"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌月杂气为七杀"]
            }else if (yueZhi=="亥"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥末建禄用食神"]
            }else if (yueZhi=="子"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子月之中羊刃格"]
            }else if (yueZhi=="丑"){
                 mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑中杂气是财官"]
            }

        }else if (riGan=="癸"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["癸日寅月取伤官"]
            }else if (yueZhi=="卯"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯月食神定是真"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰中杂气是正官"]
            }else if (yueZhi=="巳"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳月正财官便是"]

            }else if (yueZhi=="午"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午月偏财又偏官"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["六月杂气是七杀"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月正印怕逢寅"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉月偏印忌见比"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气是财官"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥月借取伤官格"]
            }else if (yueZhi=="子"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子中建禄定其真"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑中杂气为七杀"]
            }

        }

        mapResult

    }

    //子平真全
    def zipingzhenquan(BaZi bazi, CommonAlgorithm commonAlgorithm){

        def mapResult = [:]

        def yueZhi =bazi.getYueZhi()

        def riGan = bazi.getRiGan()

        def geju = [

                "建禄格":["建禄者，月建逢禄堂也，禄即是劫。或以禄堂透出，即可依以用者，非也。故建禄与月劫，可同一格，不必加分，皆以透干支，别取财官煞食为用。 "
                       ,"  禄格用官，干头透出为奇，又要财印相随，不可孤官无辅。有用官而印护者，如庚戌、戊子、癸酉、癸亥，金丞相命是也。有用官而财助者，如丁酉、丙午、丁巳、壬寅，李知府命是也。"
                       ,"  有官而兼带财印者，所谓身强值三奇，尤为贵气。三奇者，财官印也，只要以官隔之，使财印两不相伤，其格便大，如庚午、戊子、癸卯、丁巳，王少师命是也。"
                       ,"  禄劫用财，须带食伤，盖月令为劫而以财作用，二财相克，必以伤食化之，始可转劫生财，如甲子、丙子、癸丑、壬辰，张都统命是也。 "
                       ,"  至于化劫为财，与化劫为生，尤为秀气。如己未、已巳、丁未、辛丑，丑与巳会，即以劫财之火为金局之财，安得不为大贵？所谓化劫为财也。如高尚书命，庚子、甲申、庚子、甲申，即以劫财之金，化为生财之水，所谓化劫为生也。 "
                       ,"  禄劫用煞，必须制伏台，如娄参政命，丁巳、壬子、癸卯、己未，壬合丁财以去其党煞，卯未会局以制伏是也。 "
                       ,"  至用煞而又财，本为不美，然能去煞存财，又成贵格。戊辰、癸亥、壬午、丙午，合煞存财，袁内阁命是也。"
                       ,"  其禄劫之格，无财官而用伤食，泄其太过，亦为秀气。唯春木秋金，用之则贵，盖木逢火则明，金生水则灵。如张状元命，甲子、丙寅、甲子、丙寅，木火通明也；又癸卯、庚申、庚子、庚辰，金水相涵也。"
                       ,"  更有禄劫而官煞竞出，必取清方为贵格。如一平章命，辛丑、庚寅、甲辰、乙亥、合煞留这也；如辛亥、庚写、甲申、丙寅，制煞留官也。"
                       ,"  倘或两官竞出，亦须制伏，所谓争正官不可无伤也。"
                       ,"  若夫用官而孤官无辅，格局更小，难于取贵，若透伤食便不破格。然亦有官伤并透而贵者，何也？如己酉、乙亥、壬戌、庚子，庚合乙而去伤存官，王总兵命也"
                       ,"  用财而不透伤食，便难于发端，然干头透一位而不杂，地支根多，亦可取富，但不贵耳。"
                       ,"  用官煞重而无制伏，运行制伏，亦可发财，但不可官煞太重，致令身危也。 "
                       ,"建禄月劫取运"
                       ,"  禄劫取运，即以禄劫所成之局，分而配之。禄劫用官，印护者喜财，怕官星之逢合，畏七煞这相乘。伤食不能为害，劫比未即为凶。"
                       ,"  禄劫用财而带伤食，财食重则喜印绶，而不书法比肩；财食轻则宜助财，而不喜印比。逢煞无伤，遇官非福。"
                       ,"  禄劫用煞食制，食重煞轻，则运宜助煞；食轻煞重，则运喜助食。"
                       ,"  若用煞而带财，命中合煞存财，则伤食为宜，财运不忌，透官无虑，身旺亦亨。若命中合财存煞，而用食制，煞轻则助煞，食轻则助食则已。 "
                       ,"  禄劫而用伤食，财运最宜，煞亦不忌，行印非吉，透官不美。若命中伤食太重，则财运固利，而印亦不忌矣。"
                       ,"  禄劫而官煞并出，不论合煞留官，存官制煞，运喜伤食，比肩亦宜，印绶未为良图，财官亦非福运。"
                       ,"  "

                ]

                ,"阳刃格":["阳刃者，劫我正财之神，乃正财之七煞也。禄前一位，惟五阳有之，故为旭刃。不曰劫而曰刃，劫之甚也。刃宜伏制，官煞皆宜，财印相随，尤为贵显。夫正官而财印相随美矣，七煞得之，夫乃甚乎？岂知他格以煞能伤身，故喜制伏，忌财印；阳刃用之，则赖以制刃，不怕伤身，故反喜财印，忌制伏也。 "
                        ,"  然同是官煞制刃，而格亦有高低，如官煞露而根深，其贵也大；官煞藏而不露，或露而根浅，其贵也小。若己酉、丙子、壬寅、丙午，官透有力，旺财生之，丞相命也。又辛酉、甲午、丙申、壬辰，透煞根浅，财印助之，亦丞相命也。 "
                        ,"  然亦有官煞制刃带伤食而贵者，何也？或是印护，或是煞太重而裁损之，官煞轻而取清之，如穆同知命，甲午、癸酉、庚寅、戊寅，癸水伤寅午之官，而戊以合之，所谓印护也，如贾平章命，甲寅、庚午、戊申、甲寅，煞两透而根太重，食以制之，所谓裁损也。如丙戌、丁酉、庚申、壬午，官煞竞出 ，而壬合丁官，煞纯而不杂。况阳刃之格，利于留煞，所谓取清也。"
                        ,"  其于丙生午月，内藏己土，可以克水，尤宜带财佩印，若戊生午月，干透丙火，支会火乙，则化刃为印，或官或煞，透则去刃存印其格愈清。倘或财煞并透露，则犯去印存煞之忌，不作生煞制煞之例，富贵两空矣。"
                        ,"  更若阳刃用财，格所不喜，然财根深而用伤食，以转刃生财，虽不比建禄月劫，可以取贵，亦可就富。不然，则刃与财相搏，不成局矣。 "
                        ,"阳刃取运"
                        ,"  阳刃用官，则运喜助官，然命中官星根深，则印绶比劫之方，反为美运，但不喜伤食合官耳。"
                        ,"  阳刃用煞，煞不甚旺，则运喜助煞；煞若太重，则运喜身旺印绶，伤食亦不为忌。 "
                        ,"  阳刃而官煞并出，不论去官去煞，运喜制伏，身旺亦利，财地官乡反为不吉也。 "
        ]
                ,"正官格":[
                "官以克身，虽与七煞有别，终受彼制，何以切忌刑冲破害，尊之若是乎？岂知人生天地间，必无矫焉自尊之理，虽贵极天子，亦有天 祖临之。正官者分所当尊，在国有君，在家有亲，刑冲破害，以下犯上，乌乎可乎？"
                ,"  以刑冲破害为忌，则以生之护之为喜矣。存其喜而去其忌则贵，而贵之中又有高低者，何也？"
                ,"  以财印并透者论之，两不相碍，其贵也大,二者相合，仍以孤官无辅论。"
                ,"  若财印不以两用，则单用印不若单用财，以印能护官，亦能泄官，而财生官也。"
                ,"  若化官为印而透财，则又为甚秀，大贵之格也。"
                ,"  遇伤在于佩印，混煞贵乎取清."
                ,"  官格透伤用印者，又忌见财，以财能去印，未能生官，而适以护伤故也."
                ,"大运:"
                ,"    正官而用财印，身稍轻则取助身，官稍轻则助官。若官露而不可逢合，不可杂煞，不可重官"
                ,"    正官用财，运喜印受身旺之地，切忌食伤。若身旺而财轻官弱，即仍取财官运可也。"
                ,"    正官佩印，运喜财乡，伤食反吉。若官重身轻而佩印，则身旺为宜，不必财运也。"
                ,"    正官带伤食而用印制，运喜官旺印旺之乡，财运切忌。若印绶叠出，财运亦无害矣。"
                ,"    正官而带煞，伤食反为不碍。其命中用劫合煞，则财运可行，伤食可行，身旺，印绶亦可行，不宜复露七杀"
                ,"     若命用伤官合煞，则伤食与财俱可行，而不宜逢印矣（不可言：此处的伤官主要还是合杀的伤官，照应前文’混煞贵乎取清‘，七杀一定要合，阳日主甲用乙阳刃合，阴日主 如乙木用丙伤合。）"
                ,"     （不可言：若不配印，首要看官和身的强弱，参考通考的病药原理。没有讨论露食神的问题。）"
        ]
                ,"七杀格":["煞以攻身，似非美物，百大贵之格，多存七煞。盖控制得宜，煞为我用，如大英雄大豪杰，似难驾驭，而处之有方，则惊天动地之功，忽焉而就。此王侯将相所以多存七煞也。 "
                        ,"七煞之格局亦不一："
                        ,"  煞用食制者，上也，煞旺食强而身健，极为贵格。如乙亥、乙 酉、乙卯、丁丑，极等之贵也。 "
                        ,"  煞用食制，不要露财透印，以财能转食生煞，而印能去食护煞也。然而财先食后，财生煞而食以制之，或印先食后，食太旺而印制，则格成大贵。如脱脱丞相命，壬辰、甲胡、丙戌、戊戌，辰中暗煞，壬以透之，戊坐四支，食太重而透甲印，以损太过，岂非贵格？若煞强食泄而印露，则破局矣。 "
                        ,"  有七煞用印者，印能护煞，本非所宜，而印有情，便为贵格。如何参政命，丙寅、戊戌、壬戌、辛丑，戊与辛同通月令，是煞印有情也。 "
                        ,"  亦有煞重身轻，用食则身不能当，不若转而就印，虽不通根月令，亦为无情而有情。格亦许贵，但不大耳。 "
                        ,"  有煞而用财者，财以党煞，本非所喜，而或食被制，不能伏煞，而财以去印存食，便为贵格。如周丞相命，戊戌、甲子，丁未、庚戌，戊被制不能伏煞，时透庚财，即以清食者，生不足之煞。生煞即以制煞，两得其用，尤为大贵。"
                        ,"  又有身重煞轻，煞又化印，用神不清，而借财以清格，亦为贵格。如甲申、乙亥、丙戌、庚寅，刘运使命是也。"
                        ,"  更有杂气七煞，干头不透财以清用，亦可取贵。"
                        ,"  有煞而杂官者，或去官，或去煞，取清则贵。如岳统制命，癸卯、丁巳、庚寅、庚辰，去官留煞也。夫官为贵气，去官何如去煞？岂知月令偏官，煞为用而官非用，各从其重。若官格杂煞而去官留煞，不能如是之清矣。如沈郎中命，丙子、甲午、辛亥、辛卯，子冲午而克煞，是去煞留官也。 "
                        ,"  有煞无食制而用印当者，如戊辰、甲寅、戊寅、戊午、赵员外命是也。 "
                        ,"  至书有制煞不可太过之说，虽亦有理，然运行财印，亦能发福，不可执一也，乃若弃命从煞，则于外格详之。 "
                        ,"偏官取运，即以偏官所成之局分而配之。"
                        ,"  煞用食制，煞重食轻则助食，煞轻食重则助煞，煞食均而日主根轻则助身。忌正官之混杂，畏印绶之夺食。"
                        ,"  煞用印绶，不利财乡，伤官为美，印绶身旺，俱为福地。"
                        ,"  七煞用财，其以财而去印存食者，不利劫财，伤食皆吉，喜财怕印，透煞亦顺。"
                        ,"  其以财而助煞不及者，财已足，则喜食印与帮身；财未足，则喜财旺而露煞。"
                        ,"  煞带正官，不论去官留煞，去煞留官，身轻则喜助身，食轻则喜助食。莫去取清之物，无伤制煞之神。"
                        ,"  煞无食制而用刃当煞，煞轻刃重则喜助煞，刃轻煞重，则宜制伏，无食可夺，印运何伤？七煞既纯，杂官不利。"
                        ,"  "
                        ,"  "
                        ,"  "

        ]
                ,"财格":[
                "财为我克，使用之物也，以能生官，所以为美。为财帛，为妻妾，为才能，为驿马，皆财类也。"
                ,"财喜根深，不宜太露，然透一位以清用，格所最喜，不为之露。即非月令用神，若寅透乙、卯透甲之类， 一亦不为过，太多则露矣。然而财旺生官，露亦不忌，盖露不忌，盖露以防劫，生官则劫退，譬如府库钱粮，有官守护，即使露白，谁敢劫之？如葛参政命，壬申、壬子、戊午、乙卯，岂非财露？唯其生官，所以不忌也。"
                ,"财格之贵局不一，有财旺生官者，身强而不透伤官，不混七煞，贵格也。"
                ,"有财用食生者，身强而不露官，略带一位比劫，益觉有情，如壬寅、壬寅、庚辰、辛巳，杨待郎之命是也。透官身弱，则格坏矣。"
                ,"有财格佩印者，盖孤财不贵，佩印帮身，即印取贵。如乙未、甲申、丙申、庚寅，曾参政之命是也，然财印宜相并，如乙未、己卯、庚寅、辛巳，乙与己两不相能，即有好处，小富而已。"
                ,"有用食而兼用印者，食与印两不相碍，或有暗官而去食护官，皆贵格也。如吴榜眼命，庚戌、戊子、戊子、丙辰，庚与丙隔两戊而不相克，是食与印不相碍也。如平江伯命，壬辰、乙巳、癸巳、辛酉，虽食印相克，而欲存巳戊官，是去食护官也。反是则减福矣。"
                ,"有财用伤官者，财不甚旺而比强，辂露一位伤官以化之，如甲子、辛未、辛酉、壬辰，甲透未库，逢辛为劫，壬以化劫生财，汪学士命是也，财旺无劫而透伤，反为不利，盖伤官本非美物，财轻透劫，不得已而用之。旺而露伤，何苦用彼？徒使财遇伤而死生官之具，安望富贵乎？"
                ,"有财带七煞者，或合煞存财，或制煞生财，皆贵格也，如毛状元命，乙酉、庚辰、甲午、戊辰，合煞存财也；李御史命，庚辰、戊子、戊寅、甲寅，制煞生财也。"
                ,"有财用煞印者，党煞为忌，印以化之，格成富局，若冬土逢之亦贵格。如赵侍郎命，乙丑、丁亥、乙亥，化煞而即以解冻，又不露财以杂其印，所以贵也。若财用煞印而印独，财煞并透，非特不贵，亦不富也。"
                ,"至于壬生午月，癸生巳月，单透财而亦贵，又月令有暗官也。如丙寅、癸巳、癸未、壬戌，林尚书命是也。又壬生巳月，单透财而亦贵，以其透丙藏戊，弃煞就财，美者存在赠者弃也。如丙辰、癸巳、壬戌、壬寅，王太仆命是也。"
                ,"至于劫刃太重，弃财就煞，如一尚书命，丙辰、丙申、丙午、壬辰，此变之又变者也。"
                ,"大运:"
                ,"  财格取运，即以财格所就之局，分而配之。其财旺生官者，运喜身旺印缓，不利七煞伤官；若生官而后透印，伤官之地 ，不甚有害。至于生官而带食破局，则运喜印绶，而逢煞反吉矣。"
                ,"  财用食生，财食重而身轻，则喜助身；财食轻而身重，则仍行财食。煞运不忌，官印反晦矣。 "
                ,"  财格佩印，运喜官乡，身弱逢之，最喜印旺。"
                ,"  财用食印，财轻则喜财食，身轻则喜比印，官运有碍，煞反不忌也。"
                ,"  财带伤官，财运则亨，煞运不利，运行官印，未见其美矣。"
                ,"  财带七煞。不论合煞制煞，运喜食伤身旺之方。"
                ,"  财用煞印，印旺最宜，逢财必忌。伤食之方，亦任意矣。"

        ]
                ,"印格":["印绶喜其生身，正偏同为美格，故财与印不分偏正，同为一格而论之。印绶之格局亦不一，有印而透官者，正官不独取其生印，而即可以为用，与用煞者不同。故身旺印强，不愁太过，只要官星清纯，如丙寅、戊戌、辛酉、戊子，张参政之命是也。"
                       ,"然亦有带伤食而贵者，则如朱尚书命，丙戌、戊戌、辛未、壬辰，壬为戊制，不伤官也。又如临淮侯命，乙亥、己卯、丁酉、壬寅，己为乙制，己不碍官也。 "
                       ,"有印而用伤食者，身强印旺，恐其太过，泄身以为秀气。如戊戌、乙卯、丙午、乙亥，李状元命也，若印浅身轻，而用层层伤食，则寒贫之局矣。 "
                       ,"有用偏官者，偏官本非美物，藉其生印，不得已而用之。故必身重印轻，或身轻印重，有所不足，始为有性。如茅状元命，己巳、癸酉、癸未、庚申，此身轻印重也。马参政命，壬寅、戊申、壬辰、壬寅，此身重印轻也。若身印并重而用七煞，非孤则贫矣。 "
                       ,"有用煞而兼带伤食者，则用煞而有制，生身而有泄，不论身旺印重，皆为贵格。"
                       ,"有印多而用财者，印重身强，透财以抑太过，权而用之，只要根深，无防财破。如辛酉、丙申、壬申、辛亥，汪侍郎命是也。若印轻财重，又无劫财以救，则为贪财破印，贫贱之局也。 "
                       ,"即或印重财轻而兼露伤食，财与食相生，轻而不轻，即可就富，亦不贵矣。然亦有带食而贵者，何也？如庚寅、乙酉、癸亥、丙辰，此牛监薄命，乙合庚而不生癸，所以为贵，若合财存食，又可类推矣。如己未、甲戌、辛未、癸已，此合财存食之贵也。 "
                       ,"又有印而兼透官煞者，或合煞，或有制，皆为贵格。如辛亥、庚子、甲辰、乙亥，此合煞留官也；壬子、癸卯、丙子、己亥、此官煞有制也。"
                       ,"至于化印为劫；弃之以就财官，如赵知府命，丙午、庚寅、丙午、癸巳，则变之又变者矣。"
                       ,"更有印透七煞，而劫财以存煞印，亦有贵格，如庚戌、戊子、甲戌、乙亥是也。然此格毕竟难看，宜细详之。 "
                       ,"印格取运，即以印格所成之局，分而配之。"
                       ,"   其印绶用官者，官露印重，财运反吉，伤食之方，亦为最利。"
                       ,"   若用官而带伤食，运喜官旺印绶之乡，伤食为害，逢煞不忌矣。 "
                       ,"   印绶而用伤食，财运反吉，伤食亦利，若行官运，反见其灾，煞运则反能为福矣。"
                       ,"   印用七煞，运喜伤食，身旺之方，亦为美地，一见财乡，其凶立至。"
                       ,"   若用煞而兼带伤食，运喜身旺印绶之方，伤食亦美，逢官遇财，皆不吉也。 "
                       ,"   印绶遇财，运喜劫地，官印亦亨，财乡则忌。 "
                       ,"   其印格而官煞竞透，运喜食神伤官，印旺身旺，行之亦利。若再透官煞，行财运，立见其灾矣。"
                       ,"   印用食伤，印轻者亦不利见财也。"
                       ,"   其印绶用官者，官露印重，财运反吉，伤食之方，亦为最利。"
        ]
                ,"食神格":["食神本属泄气，以其能生正财，所以喜之。故食神生财，美格也。财要有根，不必偏正叠出，如身强食旺而财透，大贵之格。"
                        ,"藏食露伤，主人性刚如丁亥、癸卯、癸卯、甲寅，沈路分命是也。偏正叠出，富贵不巨，职甲午、丁卯、癸丑、丙辰，龚知县命是也。"
                        ,"夏木用财，火炎土燥，贵多就武。如己未、己巳、甲寅、丙寅，黄都督之命是也。"
                        ,"若不用财而就煞印，最为威权显赫。如辛卯、辛卯、癸酉、己未，常国公命是也。若无印绶而单露偏官，只要无财，亦为贵格，如戊戌、壬戌、丙子、戊戌，胡会元命是也。"
                        ,"若金水食神而用煞，贵而且秀，职丁亥、壬子、辛巳、丁酉，舒尚书命是也。至于食神忌印，夏火太炎而木焦，透印不碍，\n" +
                                "如丙午、癸巳、甲子、丙寅，钱参政命是也。食神忌官，金水不忌，即金水伤官可见官之谓。"
                        ,"至若单用食神，作食神有气，有财运则富，无财运则贫。"
                        ,"更有印来夺食，透财以解，亦有富贵，须就其全局之势而断之。至于食神而官煞竞出，亦可成局，但不甚贵耳。"
                        ,"更有食神合煞存财，最为贵格。"
                        ,"至若食神透煞。本忌见财，而财先煞后，食以间之，而财不能党煞，亦可就贵。如刘提台命，癸酉、辛酉、己卯、乙亥是也。其余变化，不能尽述，类而推之可也。"
                        ,"食神取运，即以食神所成之局，分而配之。"
                        ,"  食神生财，财重食轻，则行财食，财食重则喜帮身。官煞之方，俱为不美。"
                        ,"  食用煞印，运喜印旺，切忌财乡。身旺，食伤亦为福运，行官行煞，亦为吉也。"
                        ,"  食伤带煞，喜行印绶，身旺，食伤亦为美运，财则最忌。若食太重而煞轻，印运最利，逢财反吉矣。"
                        ,"  食神太旺而带印，运最利财，食伤亦吉，印则最忌，官煞皆不吉也。"
                        ,"  若食神带印，透财以解，运喜财旺，食伤亦吉，印与官煞皆忌也。"
        ]
                ,"伤官格":["伤官虽非吉神，实为秀气，故文人学士，多于伤官格内得之。而夏木见水，冬金见火，则又为秀之尤秀者也。其中格局比他格多，变化尤多，在查其气候，量其强弱，审其喜忌，观其纯杂，微之又微，不可执也。 "
                        ,"  故有伤官用财者，盖伤不利于民，所以为凶，伤官生财，则以伤官为生官之具，转凶为吉，故最利。只要身强而有根，便为贵格，如壬午、己酉、戊午、庚申，史春芳命也。"
                        ,"  至于化伤为财，大为秀气，如罗状元命，甲子、乙亥、辛未、戊子，干头之甲，通根于亥，然又会未成局，化水为木，化之生财，尤为有情，所以伤官生财，冬金不贵，以冻水不能生木。若乃化木，不待于生，安得不为殿元乎？ "
                        ,"  至于财伤有情，与化伤为财者，其秀气不相上下，如秦龙图命，己卯、丁丑、丙寅、庚寅，已与庚同根月令是也。 "
                        ,"  有伤官佩印者，印能制伤，所以为贵，反要伤官旺，身稍弱，始为秀气。如孛罗平章命，壬申、丙午、申午、壬申、伤官旺，印根深，身又弱，又是夏木逢润，其秀百倍，所以一品之贵。然印旺极深，不必多见，偏正叠出，反为不秀，故伤轻身重而印绶多见，贫穷之格也。"
                        ,"  有伤官兼用财印者，财印相克，本不并用，只要干头两清而不相碍；又必生财者，财太旺而带印，佩印者印太重而带财，调停中和，遂为贵格。如丁酉、己酉、戊子、壬子，财太重而带印，而丁与壬隔以戊已，两不碍，且金水多而觉寒，得火融和，都统制命也。又如壬戌、己酉、戊午、丁巳，印太重而隔戊已，而丁与壬不相碍，一丞相命也。反是则财印不并用而不秀矣。 "
                        ,"  有伤官用煞印者，伤多身弱，赖煞生印以邦身而制伤，如己未、丙子、庚子、丙子，蔡贵妃也。煞因伤而有制，两得其宜，只要无财，便为贵格，如壬寅、丁未、丙寅，夏阁老命是也。"
                        ,"  有伤官用官者，他格不用，金水独宜，然要财印为辅，不可伤官并透。如戊申、甲子、庚午、丁丑，藏癸露丁，戊甲为辅，官又得禄，所以为丞相之格。若孤官无辅，或官伤并透，则发福不大矣。"
                        ,"  若冬金用官，而又化伤为财，则尤为极秀极贵。如丙申、己亥、辛未、己亥，郑丞相命是也。 "
                        ,"  然亦有非金水而见官，何也？化伤为财，伤非其伤，作财旺生官而不作伤官见官，如甲子、壬申、己亥、辛未，章丞相命也。"
                        ,"  至于伤官而官煞并透，只要干头取清，金水得之亦清，不然则空结构而已。"
                        ,"伤官取运，即以伤官所成之局，分而配之。"
                        ,"  伤官用财，财旺身轻，则利印比；身强财浅，则喜财运，伤官亦宜。 "
                        ,"  伤官佩印，运行官煞为宜，印运亦吉，伤食不碍，财地则凶。 "
                        ,"  伤官而兼用财印，其财多而带印者，运喜助印，印多而带财者，运喜助财。 "
                        ,"  伤官而用煞印，印运最利，伤食亦亨，杂官非吉，逢财即危。"
                        ,"  伤官带煞，喜印忌财，然伤重煞轻，运喜印而财亦吉。惟七根重，则运喜伤食，印绶身旺亦吉，而逢财为凶矣。 "
                        ,"  伤官用官，运喜财印，不利食伤，若局中官露而财印两旺，则比劫伤官，未绐非吉矣。"

            ]
        ]


        //格局论
        if (riGan=="甲"){
            if(yueZhi=="寅"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="卯"){
                mapResult["【阳刃格】"] = geju["阳刃格"]
            }else if (yueZhi=="辰"){
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="巳"){
                mapResult["【食神格】"] = geju["食神格"]
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="午"){
                mapResult["【伤官格】"] = geju["伤官格"]
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="未"){
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="申"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="酉"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="戌"){

            }else if (yueZhi=="亥"){
                mapResult["【印格】"] = geju["印格"]
            }else if (yueZhi=="子"){
                mapResult["【印格】"] = geju["印格"]
            }else if (yueZhi=="丑"){

            }

        }else if (riGan=="乙"){
            if(yueZhi=="寅"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="卯"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="辰"){
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="巳"){
                mapResult["【伤官格】"] = geju["伤官格"]
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="午"){
                mapResult["【食神格】"] = geju["食神格"]
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="未"){
                mapResult["【杂气取-正官格】"] = geju["正官格"]
                mapResult["【杂气取-财格】"] = geju["财格"]
            }else if (yueZhi=="申"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="酉"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="戌"){
                mapResult["【杂气取-正官格】"] = geju["正官格"]
                mapResult["【杂气取-财格】"] = geju["财格"]
            }else if (yueZhi=="亥"){
                mapResult["【印格】"] = geju["印格"]
            }else if (yueZhi=="子"){
                mapResult["【印格】"] = geju["印格"]
            }else if (yueZhi=="丑"){
                mapResult["【杂气取-正官格】"] = geju["正官格"]
                mapResult["【杂气取-财格】"] = geju["财格"]
            }

        }else if (riGan=="丙"){
            if(yueZhi=="寅"){
                mapResult["【印格】"] = geju["印格"]
            }else if (yueZhi=="卯"){
                mapResult["【印格】"] = geju["印格"]

            }else if (yueZhi=="辰"){
                mapResult["【食神格】"] = geju["食神格"]

            }else if (yueZhi=="巳"){

                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="午"){
                mapResult["【阳刃格】"] = geju["阳刃格"]
                mapResult["【伤官格】"] = geju["伤官格"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["未取伤官宜伤尽"]
            }else if (yueZhi=="申"){
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="酉"){
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="戌"){
                mapResult["【杂气-食神】"] = geju["食神格"]

            }else if (yueZhi=="亥"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="子"){

                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"]  = ["丑宫分明杂气生"]
            }

        }else if (riGan=="丁"){
            if(yueZhi=="寅"){
                mapResult["【印格】"] = geju["印格"]
            }else if (yueZhi=="卯"){
                mapResult["【印格】"] = geju["印格"]
            }else if (yueZhi=="辰"){

                mapResult["【伤官格】"] = geju["伤官格"]
            }else if (yueZhi=="巳"){

                mapResult["【伤官格】"] = geju["伤官格"]
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="午"){
                mapResult["【建禄格】"] = geju["建禄格"]
                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="未"){

                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="申"){
                mapResult["【财格】"] = geju["财格"]
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="酉"){

                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="戌"){

                mapResult["【伤官格】"] = geju["伤官格"]
            }else if (yueZhi=="亥"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="子"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="丑"){
                mapResult["【财格】"] = geju["财格"]
                mapResult["【正官格】"] = geju["正官格"]
            }

        }else if (riGan=="戊"){
            if(yueZhi=="寅"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="卯"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰内杂气财官格"]
            }else if (yueZhi=="巳"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="午"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["午月刃取正印格"]
                mapResult["【印格】"] = geju["印格"]
                mapResult["【阳刃格】"] = geju["阳刃格"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未上杂气作官印"]
            }else if (yueZhi=="申"){

                mapResult["【食神格】"] = geju["食神格"]
                mapResult["【财格】"] = geju["财格"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["八月伤官喜遇财"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气分明取"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥月财杀格中真"]
            }else if (yueZhi=="子"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子提正财生官格"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑上杂气号财官"]
            }

        }else if (riGan=="己"){
            if(yueZhi=="寅"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="卯"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰是杂气取财官"]
            }else if (yueZhi=="巳"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["巳中正印格可清"]
            }else if (yueZhi=="午"){
                mapResult["【建禄格】"] = geju["建禄格"]

            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未土杂气借财杀"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月伤官真论此"]
            }else if (yueZhi=="酉"){

                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌月借取杂气格"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥上正财生官格"]
            }else if (yueZhi=="子"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子月偏财明怕劫"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑月杂气取财官"]
            }

        }else if (riGan=="庚"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["庚到寅宫评财杀"]
            }else if (yueZhi=="卯"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯月正财便生官"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰初杂气用偏印"]
            }else if (yueZhi=="巳"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="午"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未中杂气用正印"]
            }else if (yueZhi=="申"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉用羊刃格中寻"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气用偏印"]
            }else if (yueZhi=="亥"){

                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="子"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["子月伤官真可论"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑中只可作杂气"]
            }

        }else if (riGan=="辛"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辛日寅财旺生官"]
            }else if (yueZhi=="卯"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯月偏财是福基"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰是杂气未正印"]
            }else if (yueZhi=="巳"){
                mapResult["【正官格】"] = geju["正官格"]

            }else if (yueZhi=="午"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未取杂气用偏印"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月借取伤官格"]
            }else if (yueZhi=="酉"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气戊是印"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥日伤官喜见财"]
            }else if (yueZhi=="子"){

                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑上下旬论偏印"]
            }

        }else if (riGan=="壬"){
            if(yueZhi=="寅"){

                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="卯"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["卯上见印取伤官"]
            }else if (yueZhi=="辰"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["辰是杂气为七杀"]
            }else if (yueZhi=="巳"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="午"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["未上杂气取财官"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月偏印无别论"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉取正印怕逢财"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌月杂气为七杀"]
            }else if (yueZhi=="亥"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="子"){
                mapResult["【阳刃格】"] = geju["阳刃格"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑中杂气是财官"]
            }

        }else if (riGan=="癸"){
            if(yueZhi=="寅"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["癸日寅月取伤官"]
            }else if (yueZhi=="卯"){

                mapResult["【食神格】"] = geju["食神格"]
            }else if (yueZhi=="辰"){
                mapResult["【正官格】"] = geju["正官格"]
            }else if (yueZhi=="巳"){
                mapResult["【正官格】"] = geju["正官格"]

            }else if (yueZhi=="午"){
                mapResult["【七杀格】"] = geju["七杀格"]
            }else if (yueZhi=="未"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["六月杂气是七杀"]
            }else if (yueZhi=="申"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["申月正印怕逢寅"]
            }else if (yueZhi=="酉"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["酉月偏印忌见比"]
            }else if (yueZhi=="戌"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["戌中杂气是财官"]
            }else if (yueZhi=="亥"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["亥月借取伤官格"]
            }else if (yueZhi=="子"){
                mapResult["【建禄格】"] = geju["建禄格"]
            }else if (yueZhi=="丑"){
                mapResult["【"+riGan+"日"+yueZhi+"月定格】"] = ["丑中杂气为七杀"]
            }

        }



    }
    //四明丁丑版 栏江网
    def simingdingchou(BaZi bazi, CommonAlgorithm commonAlgorithm){

        /**
         *  先..后...:
         *  露:
         *  透:
         *  藏:
         *  一片:
         *  叠:
         * [2017-09-07 add by longzhiyou]
         */
        def mapResult = [:]
        def yueZhi =bazi.getYueZhi()

        def riGan = bazi.getRiGan()

        if (riGan=="甲"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "木值春生，乃欣欣向荣之象。"
                        ,"期届寅正，犹凛凛凝寒之气。"
                        ,"干有丙火，冠盖可比王谢。"
                        ,"兼透癸水，鼎钟出于贵戚。"
                        ,"岁于癸而时干丙，厥是南宫名宿。"
                        ,"年月丙而时见癸，可称东观英才。"
                        ,"四柱庚辛会局，不免鼓盆之凄，丧朋之痛。"
                        ,"满盘壬癸无制，定有封甑之尘，豈尽天年。"
                        ,"无庚透丁，才智如春耕营室。"
                        ,"有丁见癸，迂执同夏虫语冰。"
                        ,"支成火局泻气多，虽耿直亦愚鲁带疾。"
                        ,"柱多癸水火神灭，李义府藏笑中之刀。"
                        ,"亥卯未全，得庚为贵，失庚为闲。"
                        ,"申子辰备，得庚为贵，无戊则贫。"
                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "时透庚金运逢财，弹筝祝寿。"
                        ,"干遇癸水用受困，吹箫乞量。"
                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透庚并透壬，廟廊决策。"
                        ,"有壬并有癸，黌宇论文。"
                        ,"柱有戊己支局土，无水混淆，堪羡從财有托。"
                        ,"干见二丙支藏庚，用神暗损，可叹祖业无归。"
                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "先用癸而后用丁，若遇庚金嫌太多，壬透可解"
                        ,"柱无壬又无丁庚，只见丙戊或辛金，命不逢辰"
                        ,"一庚二丙，课耕督织。"
                        ,"癸丁齐庚，出仕知名。"
                        ,"藏癸露庚丁，纳粟拜爵。"
                        ,"透壬并庚丁，营运起家。"
                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透癸又透庚，官迁显秩。"
                        ,"叠丙又逢丁，历任封疆。"
                        ,"干多庚，透出丙丁或壬癸，诚良工琢玉。"
                        ,"柱叠金，若无克制反生扶，乃痴钝寒蝇。"
                        ,"壬水高透运逢印，贫夭相继。"
                        ,"甲己双合支有辰，富贵可期。"
                        ,"二己合一甲，男主蓬飘逐水。"
                        ,"两女争一夫，女主杨花舞风。"

                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "先有丁而后有庚，为凌风之秋鹗。"
                        ,"既逢丁而再逢癸，乃啼月之寒鸟。"

                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "入秋之甲，偏宜阴火。"
                        ,"带火之木，兼爱阳金。"
                        ,"行运復背逐，亦清贫之辈。"

                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丁庚高透，留官为贵。"
                        ,"癸水若见，克火无功。"
                        ,"透丙不见癸，食神得力。"
                        ,"透丙若见丁，门户自毁。"
                        ,"有丙又有庚，可射利于江淮。"
                        ,"无丁兼无丙，乃托钵于沙门。"
                        ,"支会巳丑干有庚，膏肓暗藏二堅子。"
                        ,"干露丙火逢见癸，茅塞不开一愚人"



                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丁壬癸同透，若见戊已，如鱼躍龙门。"
                        ,"火水土全备，旺扶庚金，乃画龙点睛。"
                        ,"比肩无庚制，为白丁之士。"
                        ,"行运復背逐，亦清贫之辈。"

                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "庚丁逢戊，贵为元首。"
                        ,"庚戊缺丁，富而期颐。"
                        ,"见壬不见戊，到处寻寻觅觅。"
                        ,"支有申亥干戊己，小贵可取。"
                        ,"见戊又透甲，终日戚戚。"
                        ,"苟无戊土只有己，大福难载。"

                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "庚丁得寅巳，见戊兮，高攀桂苑之枝。"
                        ,"癸水伤丁火，无土兮，常染连绵之疾。"
                        ,"重重壬水无丁合，蛙居井底。"
                        ,"支会水局飘木去，魂寄客舍。"

                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "庚丁透天干，戎装赫奕。"
                        ,"丁火藏地支，儒服斯文。"
                        ,"丁火重重比肩透。缙绅子弟。"
                        ,"独木磷磷火多，田舍公郎。"

                ]
            }

        }else if (riGan=="乙"){
            if(yueZhi=="寅"){

                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "得丙以生香，得癸以润色。"
                        ,"癸多丙少，学虽优终贫。"
                        ,"丙多癸少，田舍翁俗富。"
                        ,"有丙不见癸，每多快意。"
                        ,"有癸若见己，反苦羁身。"



                ]
            }else if (yueZhi=="卯"){

                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透丙露癸不见官，门迎三千珠履。"
                        ,"无杀有印独透庚，屏列十二金钗。"
                        ,"一丙一癸亥未全，龙门显达。"
                        ,"若水若火戊土多，雪窗孤寒。"


                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "先癸而后丙，无己庚者，美才鹊起。"
                        ,"露丙兼透戊，成水局者，景运鸿升。"
                        ,"己庚混丙癸，家无宿量。"
                        ,"无己独有庚，圃有桑麻。"
                        ,"月时并见庚辰，穷途落魄。"
                        ,"岁干透出丁火，虎帐请缨。"


                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "癸水潺潺齐庚辛，眉飞双彩。"
                        ,"丙戊重重支火局，两目无瞳。"
                        ,"丙癸得甲以制戊，游庠食粟。"
                        ,"丙辛居未以化水，荒唐倾家。"



                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "至前阳极，先癸后丙。"
                        ,"至后阴生，丙癸并用。"
                        ,"年庚辛而时癸水，位列三台。"
                        ,"得官杀而失印绶，难拾一芹。"
                        ,"痼疾缠身，丙透干而支合火。"
                        ,"侥幸获救，癸当头而或见壬。"


                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "柱多金水支本局，得癸则显，缺癸则困。"
                        ,"杂乱戊己干透土，有比则吉，无比则凶。"
                        ,"土多不见甲，难钟灵秀。"
                        ,"丁透无丙癸，终是凡庸。"
                        ,"丙癸得甲以制戊，游庠食粟。"
                        ,"丙辛居未以化水，荒唐倾家。"


                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "申庚当令，己土为宜。"
                        ,"透癸蔵丙，乃文书之士。"
                        ,"透癸无丙，为刀笔之吏。"
                        ,"支无丙己多庚癸，老死户牖。"
                        ,"时落庚辰化乙木，少人公卿。"


                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "时在白露前，专用癸水为宜。"
                        ,"节届秋分后，当以丙火为尊。"
                        ,"癸丙齐透，关中秉銊。"
                        ,"水火俱无，林下投簪。"
                        ,"透癸无壬，一生衣食无缺。"
                        ,"局金蔵丁，中年名利有成。"
                        ,"干齐丙丁并透戊，功名得之异路。"
                        ,"柱有癸水时透丙，文章入于词林。"
                        ,"透丙无癸，稍能如意。"
                        ,"透癸无丙，决不称心。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透癸辛杀印显，无癸则辱，无辛则贱。"
                        ,"柱包戊己财星透，无劫则富，有劫别贫。"


                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透丙戊无刑冲，名重四方。"
                        ,"支多阳火入南离，声振寰宇。"
                        ,"有丙无戊，身入儒林为伍。"
                        ,"无丙无己，殃及妻子可悲。"


                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "支藏阳火透双丙，若无癸水，可得恩封末秩。"
                        ,"干透壬癸支局水，倘无火土，必受饥寒终身。"
                        ,"独丁难解寒冻，若重重阴火，反成奸滑且多子。"
                        ,"壬癸消尽火气，倘支多水象，若非天折即孤寒。"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "一丙高悬无刑克，九重命驾。"
                        ,"若失丙兮，则丧车引发。"
                        ,"众已满柱无比劫，千倾连陌。"
                        ,"倘运夺兮，贫无立錐之地。"


                ]
            }

        }else if (riGan=="丙"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙火得寅为可贵，壬庚透干为最奇。"
                        ,"透庚支藏壬，损职迁爵。"
                        ,"透壬支藏庚，异路求名。"
                        ,"壬多丙少有戊藏，凶顽变吉。"
                        ,"杀重身轻无土制，刁恶不悛。"
                        ,"年时皆是辛，登徒色艺。"
                        ,"戊多不见甲，酸馁气冲。"


                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透壬有根，名高望重。"
                        ,"透己无壬，衣暖食丰。"
                        ,"日坐丙子時辛卯，败尽祖业。"
                        ,"丁破辛金存壬水，超出人群。"


                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬甲透天干，蟾宫稳步。"
                        ,"庚金破甲木，麟阁难登。"
                        ,"壬透甲藏，富有金帛。"
                        ,"甲透壬缺，蝇头觅利。"
                        ,"藏壬无甲者，少年落魄。"
                        ,"无壬无甲者，百业无踪。"


                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬庚透丁无刑冲，恩荫袭爵。"
                        ,"天干无水成孤阳，金榜除名。"
                        ,"见庚并见癸，白玉为堂金作屋。"
                        ,"无癸又无壬，寒门流雀户流萤。"
                        ,"丙叠叠兮无壬，早登泉路。"
                        ,"火炎炎而失水，幼入空门。"


                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬庚两透，才如囊中脱颕。"
                        ,"戊己混壬，功至幕下请缨。"
                        ,"杂乱火土若逢癸，乃盲目之孤独。"
                        ,"满盘丙丁不见水，为削发之尼僧。"
                        ,"干露庚金逢癸水，财殊富厚。"
                        ,"齐透甲乙背西北，家素高明。"


                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "有壬并庚，乃陨风劲鸟。"
                        ,"见戊缺壬，乃失水子巨鳞。"
                        ,"透壬无庚戊，辉联奎壁。"
                        ,"得戊制壬水，器宇条畅。"


                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬戊齐天干，为九苞之灵凤。"
                        ,"一土化众水，是千里之神驹。"
                        ,"杀众不见戊，定朝秦而暮楚。"
                        ,"戊多少见壬，乃意马而心猿。"
                        ,"(财格最忌见杀 现在杀旺而没有制 合 不从杀 则贫苦之人 朝秦而暮楚：比喻人反复无常，没有原则。亦比喻行踪不定或生活不安定)"



                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "四柱多丙，壬透可披青矜。"
                        ,"地支藏壬，隐杀终是白衣。"
                        ,"见辛合丙兮，幼饥寒而老贫苦。"
                        ,"遇丁制辛兮，男好诈而女淫贱。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙衰三秋透甲壬，龙城飞将。"
                        ,"火近重阳透甲癸，虎帐骁骑。"
                        ,"庚戊困木水，三灵降谴。"
                        ,"壬癸兼庚辛，二堅施灾。"


                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "甲戊并透兼有庚，掇魏科如拾芥。"
                        ,"辛金高透支带辰，取高第似探囊。"


                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "一阳来復，壬戊同济。"
                        ,"三冬送旧，水土有功。"
                        ,"多壬少土，只可随声附影。"
                        ,"得甲济戊，到处遼志适情。"
                        ,"无戊见己，也是出类拔萃。"
                        ,"多壬无甲，定然特殊超群。"
                        ,"与丑月同"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "一阳来復，壬戊同济。"
                        ,"三冬送旧，水土有功。"
                        ,"多壬少土，只可随声附影。"
                        ,"得甲济戊，到处遼志适情。"
                        ,"无戊见己，也是出类拔萃。"
                        ,"多壬无甲，定然特殊超群。"
                        ,"与子月同"


                ]
            }

        }else if (riGan=="丁"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "甲木透干，乃燃灯添油。"
                        ,"金水列柱，为洗釜调羹。"
                        ,"天干并见丁壬，男命得之极贵。"
                        ,"四柱透出金水，，己土制之有功。"
                        ,"全甲无庚，众母养成骄子。"
                        ,"全水无金，众鬼侮辱病躯。"


                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "先财后取印，火金比华。"
                        ,"透庚又透甲，风月有情。"
                        ,"透庚藏甲，求名如在蜗角。"
                        ,"透甲藏庚，觅利可获蝇头。"
                        ,"官印财食遇杀旺，运入西北，如浓霜盖雪。"
                        ,"庚辛壬甲要己藏，运至东南，乃光日穿云。"


                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "阳壬独透支局水，云泉遗憾。"
                        ,"戊己并出柱无冲，轩冕希荣。"


                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "见甲透庚兮，乃席间之吉士。"
                        ,"见癸破格兮，为堂下之走仆。"
                        ,"庚戊同透不见申，盈门车马。"
                        ,"阳土独出无水木，满腹经纶。"
                        ,"多木多水，两足何曾闲逸。"
                        ,"多丙无水，一身奚得从容。"
                        ,"二丁一丙出天干，封侯万里。"
                        ,"二巳一午见地支，食禄千钟。"


                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "有庚有壬带寅戌，命贵龙姿。"
                        ,"无刑无冲透癸水，万里封侯。"
                        ,"丁日丙时无滴水，梵利宣教。"
                        ,"木生金助有壬癸，帷幄运筹。"


                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透甲会木支藏水，文章惊人。"
                        ,"多水弱火柱无木，终生庸碌。"


                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透甲丙支有庚，男多荣贵。"
                        ,"柱明木火支藏金，女多财帛。"


                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干见甲庚丙，名立千古。"
                        ,"柱无刑害破，威震三台。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "甲庚并透，利比陶公。"
                        ,"丙火兼加，名齐萧曹。"
                        ,"庚丙壬无甲，志存三千逍遥。"
                        ,"壬癸水有戊，势成独立擎天。"
                        ,"透丁透辛不透庚，名曰从财。"
                        ,"见壬见癸不见戊，号为离魂。"


                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "三冬丁火，凭取甲木。"
                        ,"凌寒之烛，全赖灯油。"
                        ,"丙火夺丁无光，藏壬可解。"
                        ,"甲庚济火有助，见己无功。"
                        ,"厥命清贵，因支藏有金水。"
                        ,"年月透癸时逢辛，乃金枝玉叶。"
                        ,"年月透癸支局木，必袭爵誥封。"
                        ,"有水无金，司书簿吏。"
                        ,"有财兼印，达官名臣。"
                        ,"丁火十月、十一月、十二月论相同"


                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "三冬丁火，凭取甲木。"
                        ,"凌寒之烛，全赖灯油。"
                        ,"丙火夺丁无光，藏壬可解。"
                        ,"甲庚济火有助，见己无功。"
                        ,"厥命清贵，因支藏有金水。"
                        ,"年月透癸时逢辛，乃金枝玉叶。"
                        ,"年月透癸支局木，必袭爵誥封。"
                        ,"有水无金，司书簿吏。"
                        ,"有财兼印，达官名臣。"
                        ,"丁火十月、十一月、十二月论相同"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "三冬丁火，凭取甲木。"
                        ,"凌寒之烛，全赖灯油。"
                        ,"丙火夺丁无光，藏壬可解。"
                        ,"甲庚济火有助，见己无功。"
                        ,"厥命清贵，因支藏有金水。"
                        ,"年月透癸时逢辛，乃金枝玉叶。"
                        ,"年月透癸支局木，必袭爵誥封。"
                        ,"有水无金，司书簿吏。"
                        ,"有财兼印，达官名臣。"
                        ,"丁火十月、十一月、十二月论相同"


                ]
            }

        }else if (riGan=="戊"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "有丙无甲癸，乃春旱不毛。"
                        ,"无丙有甲癸，是枯寒无成。"
                        ,"多丙透甲不见癸，晚岁通达。"
                        ,"有火会局无滴水，一世孤寒。"
                        ,"甲庚两透会木局，厥为英豪，兼且荣显。"
                        ,"杀神独出无比食，若非贼盗，亦多灾横。"
                        ,"戊土一月、二月论同"


                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "有丙无甲癸，乃春旱不毛。"
                        ,"无丙有甲癸，是枯寒无成。"
                        ,"多丙透甲不见癸，晚岁通达。"
                        ,"有火会局无滴水，一世孤寒。"
                        ,"甲庚两透会木局，厥为英豪，兼且荣显。"
                        ,"杀神独出无比食，若非贼盗，亦多灾横。"
                        ,"戊土一月、二月论同"


                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "甲癸高透，宦途轻捷。"
                        ,"甲癸暗藏，家业绍兴。"
                        ,"多丙无癸，如春苗顿失泉水。"
                        ,"透水制火，乃秋麻骤逢甘霖。"
                        ,"甲乙透干支会水，见庚则富。"
                        ,"见火则贵，无庚无火必贫乏。"
                        ,"壬癸露干支火局，有逸而荣。"
                        ,"有劳而功，分逸分劳俱亨通。"


                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "甲丙伴戊，秩终五马。"
                        ,"水火济土，名著四海。"
                        ,"透癸藏壬，乃汾阳之贵，季伦之富。"
                        ,"局金透癸，有祖逖之志，定远之功。"


                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬甲齐干年透辛，处公侯加坐任席。"
                        ,"阳水独透支会火，取功名如反指掌。"

                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透癸透丙，青云起地。"
                        ,"无癸透丙，陈粟满仓。"
                        ,"癸带甲无丙，优闲自保。"
                        ,"癸与辛齐透，奇僬得功。"
                        ,"多土透甲不见金，独杀得权。"
                        ,"无丙无辛兼无甲，一盘皆空。"


                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙癸甲全，拜恩盈室。"
                        ,"丙癸甲无，托足无门。"
                        ,"丙甲两透支有辰，拾得昆山之玉。"
                        ,"水木齐干木无火，逍遥严陵之泮。"


                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干见丙癸者吉，柱无水火者凶。"
                        ,"丙藏癸透，一生安逸。"
                        ,"火暗水绝，百事蹉跎。"
                        ,"辛多无火，见癸则发。"
                        ,"土弱于酉，得火方兴。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透甲兮足食，透癸亦称心。"
                        ,"干有壬癸支局水，见比劫而反富。"
                        ,"干有金水支会火，无癸水而遭殃。"


                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "财官两得。乃天干甲丙明透。"
                        ,"鳌头独占，因地支壬水暗藏。"
                        ,"狮座韬辉，只因柱少丙甲。"
                        ,"虎榜標名，盖因木暗火明。"


                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙甲双透者，为夺魁之客。"
                        ,"木暗火明者，作入幕之宾。"
                        ,"有甲若无丙，贫而有廉。"
                        ,"透丙不见甲，富而成仁。"
                        ,"多丙透壬，白凤吐氲氤佳气。"
                        ,"多丙无壬，幽兰遇败逐秋风。"
                        ,"戊土十一月、十二月同"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙甲双透者，为夺魁之客。"
                        ,"木暗火明者，作入幕之宾。"
                        ,"有甲若无丙，贫而有廉。"
                        ,"透丙不见甲，富而成仁。"
                        ,"多丙透壬，白凤吐氲氤佳气。"
                        ,"多丙无壬，幽兰遇败逐秋风。"
                        ,"戊土十一月、十二月同"
                ]
            }

        }else if (riGan=="己"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "气寒地冻，须阳火为解。"
                        ,"水冷冰结，得戊土可医。"
                        ,"洪泛欺土，多贫贱夭折。"
                        ,"折陵止水，乃高贵清奇。"
                        ,"甲庚癸丙，得中和之道。"
                        ,"刑冲克害，乃破格之神。"
                        ,"火多不见水，富比王侯。"
                        ,"甲多无庚丁，病同相加。"


                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "甲癸忌合，水木宜春。"
                        ,"兼丙兮禄食上卿，见壬兮级降末等。"
                        ,"甲受庚制，体无雅骨。"
                        ,"壬被土伤，面满俗气。"


                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透丙癸甲，郭令公一身系天下。"
                        ,"柱无刑冲破，狄人杰独力匡朝廷。"
                        ,"透癸无丙甲，终日书空咄咄。"
                        ,"无甲有丙灵，毕竟文质彬彬。"
                        ,"满堂金玉，干有丙甲而无癸。"
                        ,"尘封釜甑，柱少水火共木神。"


                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "癸丙同透兼有辛，季子印佩六国。"
                        ,"癸丙同透兼有辛，季子印佩六国。"
                        ,"丁火克辛并多丙，颜回穷居陋巷。。"
                        ,"无丙曰孤阴不发，无癸曰亢旱不生。"
                        ,"己土四月、五月、六月同论"


                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "癸丙同透兼有辛，季子印佩六国。"
                        ,"癸丙同透兼有辛，季子印佩六国。"
                        ,"丁火克辛并多丙，颜回穷居陋巷。。"
                        ,"无丙曰孤阴不发，无癸曰亢旱不生。"
                        ,"己土四月、五月、六月同论"


                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "癸丙同透兼有辛，季子印佩六国。"
                        ,"癸丙同透兼有辛，季子印佩六国。"
                        ,"丁火克辛并多丙，颜回穷居陋巷。。"
                        ,"无丙曰孤阴不发，无癸曰亢旱不生。"
                        ,"己土四月、五月、六月同论"


                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "三秋田土，用丙以暖，用癸以润。"
                        ,"四库全支，透甲者富，无甲者贫。"
                        ,"有丙兼有癸，文坛飞将。"
                        ,"有丙若无癸，武科受官。"
                        ,"干透壬癸柱无丙，食粟常满。"
                        ,"支成金局干透癸，福利无穷。"
                        ,"己土七月、八月、九月同论"


                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "三秋田土，用丙以暖，用癸以润。"
                        ,"四库全支，透甲者富，无甲者贫。"
                        ,"有丙兼有癸，文坛飞将。"
                        ,"有丙若无癸，武科受官。"
                        ,"干透壬癸柱无丙，食粟常满。"
                        ,"支成金局干透癸，福利无穷。"
                        ,"己土七月、八月、九月同论"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "三秋田土，用丙以暖，用癸以润。"
                        ,"四库全支，透甲者富，无甲者贫。"
                        ,"有丙兼有癸，文坛飞将。"
                        ,"有丙若无癸，武科受官。"
                        ,"干透壬癸柱无丙，食粟常满。"
                        ,"支成金局干透癸，福利无穷。"
                        ,"己土七月、八月、九月同论"


                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "见火则不孤，有戊则不贫。"
                        ,"有丙兼有甲，博望侯兰薰桂馥。"
                        ,"多壬若透戊，常山王玉润金声。"
                        ,"己土十月、十一月、十二月 同论"


                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "见火则不孤，有戊则不贫。"
                        ,"有丙兼有甲，博望侯兰薰桂馥。"
                        ,"多壬若透戊，常山王玉润金声。"
                        ,"己土十月、十一月、十二月 同论"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "见火则不孤，有戊则不贫。"
                        ,"有丙兼有甲，博望侯兰薰桂馥。"
                        ,"多壬若透戊，常山王玉润金声。"
                        ,"己土十月、十一月、十二月 同论"


                ]
            }

        }else if (riGan=="庚"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙甲两透，文章盖世。"
                        ,"丙藏甲透，弱冠功名。"
                        ,"土多甲藏，田连阡陌。"
                        ,"土多甲透，官阶贵胄。"
                        ,"透丁有土不见水，官籍万斛。"
                        ,"见金伤木若带火，家业千金。"
                        ,"透壬有根支局火，才倾士衡。"
                        ,"支会午戌柱无水，疾叹伯牛。"


                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙辛丁齐干，支多水木，乃贵而无子。"
                        ,"阴火暗生支，干透丁甲，为官而有权。"


                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "双透甲丁，占鹊噪晨檐之喜。"
                        ,"一逢比肩，有鹃啼暮树之悲。"
                        ,"支藏甲丁兼藏丙，弃儒生而冠鹤盖。"
                        ,"干透癸水支局火，题柱客驷马高车。"
                        ,"透丁藏甲，班定远投笔而起。"
                        ,"透丁无甲，刘去华下第而归。"
                        ,"透甲无丁，求名如登蜀道。"
                        ,"甲丁俱无，谋利若涉瞿塘。"


                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "水火土全备，官至棘寺。"
                        ,"壬丙戊透干，节驻柏台。"
                        ,"干多丙火，透壬则荣，失壬则辱。"
                        ,"支藏庚辛，露丁则富，无丁则贫。"


                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透壬藏癸兼庚辛，唾珠扬名。"
                        ,"透癸露辛无冲克，投笔占功。"
                        ,"四柱无壬癸，困龙失水。"
                        ,"干头出戊己，枯树生华。"


                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "有官有财，另成气象。"
                        ,"透丁透甲，异样风光。"
                        ,"丁甲不齐，命如哀猿啼峡。"
                        ,"丁甲不见，悲似孤鹤唳空。"


                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透丁甲无壬癸，经纶满腹。"
                        ,"支成水局无木火，愚笨不发。"


                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丁甲丙齐无刑冲，文相武师。"
                        ,"孤丁独透多藏丙，名就利成。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "频邀引荐，甲壬须无合无克。"
                        ,"歌赋鹿鸣，甲壬或有明有暗。"
                        ,"有甲无壬，才逼太白敌手。"
                        ,"有壬无甲，识同愚叟移山。"
                        ,"戊多埋金无甲壬，倾荡祖业。"
                        ,"支若局水透丙火，首选文坛。"


                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丁甲透干，琼林赐宴。"
                        ,"丙火藏支，金殿传胪。"
                        ,"藏丁透甲，惠兰美质。"
                        ,"无丁透丙，瓦砾庸才。"


                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透丁甲支藏丙，平步丹墀，若无丙火居未秩。"
                        ,"柱无丙丁支会水，丰隆衣食，因伤官星少儿孙。"
                        ,"有丁无甲，可富可贵。"
                        ,"有甲无丁，且贱且贫。"
                        ,"透甲藏丁，车马驰逐。"
                        ,"藏丁透丙，飞骑金勒。"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙丁甲齐，世家望重。"
                        ,"丁甲无丙，才士名扬。"
                        ,"透丙无甲丁，纨绔得爵。"
                        ,"无甲透丙丁，白手成家。"


                ]
            }

        }else if (riGan=="辛"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透己壬支藏庚，秦庭献策。"
                        ,"柱无己庚干透土，吴市吹箫。"
                        ,"火局透庚壬，玉山映照。"
                        ,"藏甲透己土，珠浦联辉。"


                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬甲透干无冲破，高侍卫一箭双雕。"
                        ,"壬水藏支不透土，陶朱公三致千余。"


                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬甲两透，门庭车水马龙。"
                        ,"壬甲俱无，窗户蛛丝燕泥。"
                        ,"透壬藏甲，腴田接攘。"
                        ,"透甲藏壬，茂才联名。"
                        ,"四柱丙丁无壬癸，枯禅寂寂。"
                        ,"一滴癸水以济火，蝇头营利。"


                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透壬癸无刑冲，主人挾贵。"
                        ,"支藏壬癸及戊己，千里趋荣。"
                        ,"透火无水，寂寂空帏叹无儿。"
                        ,"得甲相救，恂恂乡里学神仙。"


                ]
            }else if (yueZhi=="午"){



                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透己壬支藏癸，泥金捷报。"
                        ,"柱无壬水只透己，玉徇参斑。"


                ]
            }else if (yueZhi=="未"){


                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬癸露天无刑冲，闻声中外。"
                        ,"壬己透干带庚金，名震公卿。"
                        ,"透戊无甲，乃寒酸之子。"
                        ,"透庚见甲，是庸贱之人。"


                ]
            }else if (yueZhi=="申"){



                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "柱多金水得戊甲，琼林宴会。"
                        ,"干透戊土无甲木，釜甑尘封。"


                ]
            }else if (yueZhi=="酉"){







                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透壬无火见庚甲，官拜冕旒。"
                        ,"见丁兮，蝇头索利。"
                        ," 透壬叠戊重比肩，身沐风雨。"
                        ," 见甲兮，白手成家。"
                        ,"透壬叠辛，才贯洛阳。"
                        ," 会巳丑局，名重都中。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬戊暗藏干透甲，龙门挾策。"
                        ,"甲壬并齐出天干，帝阙谈经。"


                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[

                        "壬丙同透，香芹能掇。"
                        ,"壬透丙藏，陈仓常盈。"
                        ,"壬戊同透，丰衣足食。"
                        ,"有壬无戊，四海飘零。"


                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[

                        " 戊癸绝迹透壬丙，春闱题名。"
                        ,"若见戊癸，便成春梦之叹。"
                        ,"戊甲丙显多壬水，秋榜题名。"
                        ," 若无丙戊，反感三秋之悲。"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙壬两透，吉士联登黄甲。"
                        ," 丙壬俱无，秀才难上青云。"
                        ,"透丙无壬，仓内堪积隨谷。"
                        ,"透壬无丙，釜中可数游鱼。"
                        ,"阳火煨珠玉，一水便能致富。"
                        ,"多丙无克制，透癸定可起家。"
                ]
            }

        }else if (riGan=="壬"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "天干庚戊丙，乃五陵之裘马。"
                        ,"四柱多戊土，拜万阅之衣冠。"
                        ,"僅有金土，高士原多卓识。"
                        ,"不见庚戊，常人鲜有通才。"






                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "戊辛两透，锦标可夺。"
                        ,"戊透辛藏，壮志能酬。"
                        ,"透庚藏戊辛，腰缠万贯。"
                        ,"透庚会木局，倚马千言。"
                        ,"透木多火无壬水，镜花难折。"
                        ,"有壬并干逢比劫，月桂可栽。"

                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透甲见癸，名疆逐逐。"
                        ,"透甲见庚，文思悠悠。"
                        ,"支藏一甲干无木，财雄数世。"
                        ,"柱有甲庚支不破，名高群僚。"
                        ,"四柱无甲，行为盗拓。"
                        ,"干支无庚，头脑多烘。"

                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "壬与辛并露，斯文潇洒。"
                        ,"癸辛甲同透，裘轻马肥。"
                        ,"壬乙夹干寅午巳，首朝北阙。"
                        ,"水火杂柱财星旺，坦腹东床。"






                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干头庚癸同透，身财俱相称。"
                        ,"柱中两壬夹庚，人命必主贵。"


                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "辛甲并透，公孙对策。"
                        ," 甲透辛藏，祖逖著鞭。"
                        ,"无辛无甲，可比辽东白豕。"
                        ,"透辛透壬，赛如冀北名骝。"






                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "戊丁透干，声华比敲金戛玉。"
                        ,"戊丁藏支，英俊超阵马风檣。"
                        ,"戊多见甲，一芹可采。"
                        ,"戊多无甲，三场无缘。"







                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "支见申亥，资囊绰绰。"
                        ,"时透甲木，经腹便便。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透甲戊，显居台阁。"
                        ,"柱无丙戊，困守饔室。"
                        ,"透丙多壬，士林怀宝。"
                        ," 多丙无壬，陋室悬磐。"






                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        " 戊庚透干，双雕叠中。"
                        ,"戊庚无踪，孤鹤独寒。"
                        ,"干透戊庚不见甲，三台列位。"
                        ,"干透戊甲不见庚，徒留四壁。"






                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "戊丙同透，权重资而货殖。"
                        ,"丙透戊缺，权奇算以贸迁。"


                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "木火解冻，雄图奋发。"
                        ,"丙甲齐干，壮志激昂。"


                ]
            }

        }else if (riGan=="癸"){
            if(yueZhi=="寅"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙辛并透无刑冲，锦衣荣达。"
                        ,"丙丁会火不见壬，老寂伤悲。"
                        ,"丙透辛透，科开殿选。"
                        ,"丙透辛藏，才举贤书。"
                        ,"柱无丙火支会水，呕心沥血。"
                        ,"支成水局干透丙，吐气扬眉，"








                ]
            }else if (yueZhi=="卯"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "庚辛齐透不见丁，高攀蟾宫丹桂。"
                        ,"庚辛暗藏无刑冲，直探骊窟明珠。"
                        ,"或明暗于干支，则磨砖亦可作镜。"
                        ,"若不见乎四柱，乃画饼焉能充饥。"

                ]
            }else if (yueZhi=="辰"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "辛丙壬齐在清明，才望如云蒸霞蔚。"
                        ,"癸辛丙透近谷雨，文章似虎绣龙雕。"
                        ,"四库全备干泛甲，壮志远达。"
                        ,"三刑见冲支无木，老泪纵横。"






                ]
            }else if (yueZhi=="巳"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "辛庚见壬，金榜题名。"
                        ,"辛庚见丁，麦饭充饥。"
                        ,"支藏辛金不见丁，有怀皆是白玉。"
                        ,"干透壬庚无刑克，无唾不成明珠。"
                        ,"火土杂柱无刃救，毕竟医求扁鹊。"
                        ,"庚金生主终力微，难免疾抱河鱼。"

                ]
            }else if (yueZhi=="午"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "庚辛透干并透壬，文同韩潮苏海。"
                        ,"庚辛透干支水局，才如宋艳班香。"
                        ,"多金少水，石季伦之豪富。"
                        ,"透金透水，郭汾阳之尊荣。"



                ]
            }else if (yueZhi=="未"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "庚辛叠丙丁，见壬兮，如奇花吐艳。"
                        ,"庚辛无比劫，见丁兮，乃鼠食充饥。"


                ]
            }else if (yueZhi=="申"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透丁甲，志存鸿鹄。"
                        ,"丁逢午火，名重骅骝。"
                        ,"柱多庚辛无丁制，鹑衣蔽体。"
                        ,"干有丁火无甲助，蜗角争名。"






                ]
            }else if (yueZhi=="酉"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "丙辛同透，焦桐遇蔡邕而暴发"
                        ,"丙透辛藏，锈铁逢薛烛以腾光。"


                ]
            }else if (yueZhi=="戌"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透辛甲支藏癸，乃屠龙之学士。"
                        ,"干透甲癸柱无破，为砾鼠之吏曹。"
                        ,"柱有甲癸无辛，可学端木理财。"
                        ,"柱无甲癸及辛，难免翁子负薪。"






                ]
            }else if (yueZhi=="亥"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "干透庚辛无刑伤，文呈班马。"
                        ,"支会木局透丁火，名落孙山。"
                        ,"多壬无戊，瘦躯如鹤"
                        ,"多戊无金，孤影如鸿。"

                ]
            }else if (yueZhi=="子"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透丙又透辛，凤毫映日。"
                        ,"见丙无辛壬，龙气成云。"
                        ,"有辛无丙，入水掬月。"
                        ,"无辛无丙，对镜寻花。"






                ]
            }else if (yueZhi=="丑"){
                mapResult[riGan+"日"+yueZhi+"月"]=[
                        "透壬出丙支离戊，贵极公侯。"
                        ,"失壬兮，职止吏佐。"
                        ,"透丙藏癸支水局，富夸乡里。"
                        ,"无丙兮，贫居陋巷。"






                ]
            }

        }

        return mapResult


    }
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


        mapResult["【神峰通考定格局诀】"] =  dinggejujue(bazi,commonAlgorithm)
        mapResult["【子平真诠】"] =  zipingzhenquan(bazi,commonAlgorithm)

        mapResult["【四明丁丑版 栏江网】"] =  simingdingchou(bazi,commonAlgorithm)




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