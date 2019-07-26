package com.soloshow.welcomesoloshow;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Xing ShiWei
 * @version 1.0
 * @since 2019-07-24 15:42
 **/
@ConfigurationProperties(value = "user.properties")
@Component
public class UserBean {

    private Query query = new Query();

    public Query getQuery() {
        return this.query;
    }

    public static class Query {

        private String queryName = UUID.randomUUID().toString();

        private String name = "user";

        private Integer age = 18;

        public String getQueryName() {
            return queryName;
        }

        public void setQueryName(String queryName) {
            this.queryName = queryName;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
