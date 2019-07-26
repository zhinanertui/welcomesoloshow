package com.soloshow.welcomesoloshow.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.*;

/**
 * @author xsw
 * @since  2018/12/04
 */
@RestController
@Slf4j
public class HelloController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @Scheduled(cron = "0 0 10 * * WED")
    @Async
    public void getList() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa1");
        list.add("aa2");
        log.info("集合:"+list);
    }

}
