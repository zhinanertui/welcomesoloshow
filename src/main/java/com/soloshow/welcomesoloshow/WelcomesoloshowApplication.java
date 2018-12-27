package com.soloshow.welcomesoloshow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling
public class WelcomesoloshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomesoloshowApplication.class, args);
    }
}
