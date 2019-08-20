package com.soloshow.welcomesoloshow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelcomesoloshowApplicationTests {

    @Test
    public void contextLoads() {
//        String add = rootBean.add();
//        System.out.println(add);
        String a = "邢 伟      ";
        String trim = a.trim();
        String s = a.replaceAll(" ", "");
        System.out.println(s);

        int length = s.length();
        System.out.println(trim);
        System.out.println(length);
    }

    @Test
    public void test1() {
//        String[][] i = new String[3][3];
//        i[0][0] = "1";
//        i[0][1] = "2";
//        i[0][2] = "3";
//        i[1][0] = "4";
//        i[1][1] = "5";
//        i[1][2] = "6";
//        String []q  = i[0] ;
//        System.out.println(Arrays.deepToString(i));
//        System.out.println(Arrays.asList(q));
        long l = System.currentTimeMillis();
        System.out.println(3);
        long l2 = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l2);

    }


}
