package com.soloshow.welcomesoloshow.controller;

import com.soloshow.welcomesoloshow.util.AesUtil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author xsw
 * @since 2018/11/29
 */
@Controller
@MultipartConfig
@Slf4j
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap map) {
        return "index2";
    }

    @RequestMapping("/video")
    public String videoHtml(ModelMap map) {
        map.put("state", 1);
        return "video";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/hello.html")
    public String hello (ModelMap map) {
        map.put("name", "邢世伟");
        return "hello";
    }
    /**
     * 关于我
     */
    @GetMapping(value = "/about.html")
    public String aboutMe(ModelMap map) {
        map.put("name", "邢世伟");
        return "/blog/about";
    }

    /**
     * 内容
     */
    @GetMapping(value = "/blog-post.html")
    public String blogPost(ModelMap map) {
        return "/blog/blog-post";
    }
}


