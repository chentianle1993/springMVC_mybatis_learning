package com.ay.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author Ay
 * @date 2018/04/02
 */
@Controller
@RequestMapping(value = "/test")
public class AyTestController {

    @GetMapping("/sayHello")//即@RequestMapping(method =RequestMethod.GET）
    public String sayHello(Model model){
        return "hello";
    }
}
