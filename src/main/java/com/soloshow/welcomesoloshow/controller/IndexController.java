package com.soloshow.welcomesoloshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author  xsw
 * @since  2018/11/29
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap map){
        return "index";
    }
}
