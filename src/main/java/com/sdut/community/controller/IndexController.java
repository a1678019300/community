package com.sdut.community.controller;

import com.sdut.community.dto.PaginationDTO;
import com.sdut.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
 *created by Gao Peng on 2021/11/21
 */
@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    //代表根，什么都不输入的时候默认访问下面的
    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size) {
        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination", pagination);
        return "index";
    }
}
