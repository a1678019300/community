package com.sdut.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
*created by Gao Peng on 2021/11/21
 */
@Controller
public class IndexController {

    //代表根，什么都不输入的时候默认访问下面的
    @GetMapping("/")
    public String index(){return "index";}
}
