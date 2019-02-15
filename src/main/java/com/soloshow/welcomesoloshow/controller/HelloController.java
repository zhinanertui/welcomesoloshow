package com.soloshow.welcomesoloshow.controller;

import com.soloshow.welcomesoloshow.aspect.annimation.Test;
import com.soloshow.welcomesoloshow.test.entity.Userinfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.*;

/**
 * @Author xsw
 * @Date 2018/12/04
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @Scheduled(cron = "0 0 10 * * WED")
    @Async
    public List<String> getlist() {

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa1");
        list.add("aa2");
        return list;
    }

}
