package com.soloshow.welcomesoloshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author  xsw
 * @since  2018/11/29
 */
@Controller
@MultipartConfig
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap map){
        return "index";
    }

    @RequestMapping("/video")
    public String videoHtml() {
        return "video";
    }

    @RequestMapping("/uploadHtml")
    public String uploadHtml() {
        return "upload";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
    @PostMapping("/uploadFile")
    @ResponseBody
    public Map<String,Integer> uploadFile(MultipartFile file,String ids) {
        String fileName = file.getOriginalFilename();
        String filePath = "D:/videos/";
        // 提取文件拓展名\
        String fileNameExtension = "";
        if(fileName!=null){
            fileNameExtension= fileName.substring(fileName.indexOf("."));
        }
        //重命名
        String realName = UUID.randomUUID().toString() + System.currentTimeMillis() + fileNameExtension;
        File file1 = new File(filePath + realName);
        Map<String, Integer> map = new HashMap<>(500);
        System.out.println();
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
            map.put("code", 500);
            return map;
        }
        map.put("code", 200);
        return map;
    }

    @GetMapping("/hellos")
    @ResponseBody
    public String hello() {
        return "测试";
    }
}

