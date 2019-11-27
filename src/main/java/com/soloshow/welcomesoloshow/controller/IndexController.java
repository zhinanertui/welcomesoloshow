package com.soloshow.welcomesoloshow.controller;

import com.soloshow.welcomesoloshow.util.AesUtil;
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
        return "index";
    }

    @RequestMapping("/video")
    public String videoHtml(ModelMap map) {
        map.put("state", 1);
        return "video";
    }

    @RequestMapping("/uploadHtml")
    public ModelAndView uploadHtml() {
//        return "upload";
        return new ModelAndView("upload");
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/uploadFile")
    @ResponseBody
    public Map<String, Integer> uploadFile(MultipartFile file, String ids) {
        String fileName = file.getOriginalFilename();
        String filePath = "D:/videos/";
        // 提取文件拓展名\
        String fileNameExtension = "";
        if (fileName != null) {
            fileNameExtension = fileName.substring(fileName.indexOf("."));
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
    public void hello() {
        log.info("关闭了浏览器,触发方法");
    }

    @PostMapping(value = "/test1")
    @ResponseBody
    public String test(String 名字) {
        System.out.println(名字);
        return 名字;
    }

    @PostMapping(value = "test2")
    @ResponseBody
    public String test2(MultipartFile file,String xuu, HttpServletRequest request) {
        String hashToken = request.getHeader("hashToken");
        String xUs = "";
        try {
            xUs = AesUtil.decrypt(hashToken, "shboth");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (xUs.equals(xuu)) {
            return "https://windyeel.oss-cn-shanghai.aliyuncs.com/ssfx/1df90ad2-b4b6-44fb-90b4-4f61e9778b71.png";
        } else {
            return "";
        }
    }
}

