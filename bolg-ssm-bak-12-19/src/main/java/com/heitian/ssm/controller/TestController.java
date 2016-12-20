package com.heitian.ssm.controller;

import com.heitian.ssm.model.Test;
import com.heitian.ssm.service.TestService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Demon on 16/12/19.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test01")
    public  String test01(HttpServletRequest request, Model model,String Params1)
    {
        List<Test> testList = testService.getAllTest();
        model.addAttribute("testList",testList);
        String str1 = "str1str1str1";
        model.addAttribute("str1",Params1);

        return "test01";
    }

}
