package com.soloshow.welcomesoloshow.test.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author xsw
 * @since  2018/12/04
 */
@Data
public class Userinfo {
    private Long id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datetime;

    private Integer type;
}
