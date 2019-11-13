package com.soloshow.welcomesoloshow.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author xsw
 * @since 2018/12/04
 */
@Slf4j
@Component
public class ScheduledController {

//    @Scheduled(cron = "0/1 * * * * ?")
    public void task01() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " | task01 " + new Date().toLocaleString());
        Thread.sleep(2000);
    }

//    @Scheduled(cron = "0/1 * * * * ?")
    public void task02() {
        System.out.println(Thread.currentThread().getName() + " | task02 " + new Date().toLocaleString());
    }

}
