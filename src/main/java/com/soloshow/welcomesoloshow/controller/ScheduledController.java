package com.soloshow.welcomesoloshow.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author xsw
 * @Date 2018/12/04
 */
@Slf4j
@Component
public class ScheduledController {

        // @Scheduled(cron = "0 11 17 * * * ")
        // @Async
        // public void scheduled(){
        //     log.info("我想5点11分启动");
        // }
        // @Scheduled(fixedRate = 5000)
        // @Async
        // public void scheduled1() {
        //     log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
        // }
        // @Scheduled(fixedDelay = 5000)
        // @Async
        // public void scheduled2() {
        //     log.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
        // }
    }
