package com.soloshow.welcomesoloshow;

import com.soloshow.welcomesoloshow.test.entity.Userinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelcomesoloshowApplicationTests {

    @Test
    public void contextLoads() {
//        String add = rootBean.add();
//        System.out.println(add);
        String a = " 邢 伟";
        String trim = a.trim();
        String s = a.replaceAll(" ", "");
        System.out.println(s);

        int length = s.length();
        System.out.println(trim);
        System.out.println(length);
        int i = 2 ^ 1;
        System.out.println(i);
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
//        long l = System.currentTimeMillis();
//        System.out.println(3);
//        long l2 = System.currentTimeMillis();
//        System.out.println(l);
//        System.out.println(l2);

        Userinfo u = new Userinfo();
        u.setName("1");
        u.setType(1);

        Userinfo u2 = new Userinfo();
        u2.setName("2");
        u2.setType(2);

        Userinfo u3 = new Userinfo();
        u3.setName("3");
        u3.setType(2);

        List<Userinfo> userInfos = Arrays.asList(u, u2, u3);
        //新集合
        List<Userinfo> list = new ArrayList<>();
        for (int i = 0; i < userInfos.size(); i++) {
            if (userInfos.get(i).getType() != null) {
                if (userInfos.get(i).getType().equals(2)) {
                    list.add(userInfos.get(i));
                }
            }

        }
        //新集合
        System.out.println(list);

    }

}



