package com.authine.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Slf4j
public class Index {

//    @RequestMapping
    @GetMapping
    public String mainPage(ModelMap map){
//        map.addAttribute("index","");
        log.info("进入主页");
        return "aaa";
    }
}
