package com.atguigu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangge
 * @date 2019/1/18 - 15:10
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","你好");
        return "success";
    }
}
