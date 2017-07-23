package com.lzy.demo;

import com.lzy.core.CommonAlgorithm;
import org.junit.Test;

/**
 * User: longzhiyou
 * Date: 2016/11/28
 * Time: 10:12
 */
public class PythonTest {


    CommonAlgorithm commonAlgorithm = new CommonAlgorithm();

    @Test
    public void runPythonScript(){

//        PythonInterpreter interpreter = new PythonInterpreter();
//        interpreter.eval("print \"hello \" ");
        String str ="list1 = ['physics', 'chemistry', 1997, 2000];\n" +
                "list2 = [1, 2, 3, 4, 5, 6, 7 ];\n" +
                "\n" +
                "print \"list1[0]: \", list1[0]\n" +
                "print \"list2[1:5]: \", list2[1:5]";
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("python");
//        try {
//            engine.eval(str);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

    }




}