package com.soloshow.welcomesoloshow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class WelcomesoloshowApplicationTests {

//    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        String[][] i = new String[3][3];
        i[0][0] = "1";
        i[0][1] = "2";
        i[0][2] = "3";
        System.out.println(Arrays.deepToString(i));

    }
}
