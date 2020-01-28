package com.example.swagger2.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberApiController {
    @Test
    public void shuffleTest () {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;

        for (int i=0; i<10; i++) {
            map = new HashMap<>();
            map.put(String.valueOf(i), String.valueOf(i));
            map.put("key_"+i, "val_"+i);

            list.add(map);
        }

        System.out.println("===================================");

        Collections.shuffle(list);

        for (Map<String, String> data : list) {
            System.out.println("-> "+data.toString());
        }
    }

    @Test
    public void test01 () {
        String txt = "1,2";

        if (txt.contains("0")) {
            System.out.println("0");
        }

        if (txt.contains("1")) {
            System.out.println("1");
        }

        if (txt.contains("11")) {
            System.out.println("11");
        }

        if (txt.contains("12")) {
            System.out.println("12");
        }

        if (txt.contains("22")) {
            System.out.println("22");
        }

        if (txt.contains("2")) {
            System.out.println("2");
        }
    }

    @Test
    public void test02 () {
        String[] a = {"1111","2222","3333","4444"};

        String[] b = {"3333","2221","4444","1112"};

        String[] c = {"aaaa","bbbb","cccc","dddd"};

        for (String data : b) {
            int index = Arrays.asList(a).indexOf(data);

            System.out.println("index :: "+index);
        }

        String aa = "";

        System.out.println(aa.length());
    }

    @Test
    public void test03 () {
        String str = "1";
        switch (str) {
            case "1":
            case "2":
            case "3": System.out.println("3"); break;
            case "4": System.out.println("4"); break;
            case "5": System.out.println("5"); break;
            case "6": System.out.println("6"); break;
        }

        int i = 61;
        int j = 79;

        double test = Math.round(((double)i/(double)j * 100)*100)/100.0;

        System.out.println("test : "+test);

        double pie = (double)i/(double)j * 100;
        System.out.println("pie : "+pie);
        double test2 = Math.round(pie*100)/100.0;

        System.out.println("test2 : "+test2);
    }
}
