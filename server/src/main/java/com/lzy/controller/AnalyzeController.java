package com.lzy.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: longzhiyou
 * Date: 2017/6/9
 * Time: 10:03
 */

@RestController
@RequestMapping(value ="/analyze")
public class AnalyzeController {
    @RequestMapping(method= RequestMethod.GET)
    public String index(@RequestParam String niangan,@RequestParam String nianzhi
                        ,@RequestParam String yuegan,@RequestParam String yuezhi
                        ,@RequestParam String rigan,@RequestParam String rizhi
                        ,@RequestParam String shigan,@RequestParam String shizhi
    ) {

        return "analyze:index";

    }
}
