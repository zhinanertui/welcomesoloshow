package com.soloshow.welcomesoloshow.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author Xing ShiWei
 * @version 1.0
 * @since 2019-08-05 16:40
 **/
@Configuration
public class MvcInterceptorConfig implements WebMvcConfigurer {

    @Resource
    private MyHandler myHandler;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myHandler).addPathPatterns("/**").excludePathPatterns("/");
    }
}
