package com.ets.tkmybatistest;

import org.springframework.util.CollectionUtils;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2019/10/31 15:15
 **/
public class Test {



    private static void test() {
        /***
         * 字符串排序 结果：从小到大排序
         */
       /*String[] str = {"123","122","126","225","012"};
       Arrays.sort(str);
        for (int i = 0;i<str.length;i++){
            System.out.println(str[i]);
        }*/

        /***
         * 遍历map的key 然后通过key获取value
         */
       /* Map<String, String> map = new HashMap<>();
        map.put("111", "111-1");
        map.put("222", "222-2");
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }*/


        /***
         * 遍历map的entry 获取entry的key和value
         */
       /* Map<String, String> map = new HashMap<>();
        map.put("111", "111-1");
        map.put("222", "222-2");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/


        /***
         * 判断list是否为空 empty   底层源码是： return size == 0; 不能判断list是否为null
         */
        /*List<Integer> list = new ArrayList<>();
        if (list.isEmpty()){
            System.out.println("list is empty");
        }else {
            System.out.println("list is null");
        }*/


        /***
         * 判断list是否为null  底层为 return collection == null || collection.isEmpty();   null也返回true empty也返回true
         */
       /* List<Integer> list = new ArrayList<>();
        if (CollectionUtils.isEmpty(list)){
            System.out.println("list is null");
        }*/


        /***
         * 集合截取
         */
        /*List<Integer> list = new ArrayList<>();
        for (int i = 0;i<1500;i++){
            list.add(i);
        }
        List<Integer> list1 = list.subList(0, 999);
        List<Integer> list2 = list.subList(999, 1600);
        System.out.println(list1);
        System.out.println(list2);*/


        /***
         * 集合顺序反转
        */
        /*List<Integer> list = new ArrayList<>();
        for (int i = 0;i<1500;i++){
            list.add(i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);*/


        /**
         * 解决精度问题
        */
       /* Long l = 2056L;
        double v = Double.parseDouble(new DecimalFormat("#0.000").format(Double.parseDouble(String.valueOf(l * 0.001))));
        System.out.println(v);*/

       /**
        *字符串中间插入字符
       */
       /*String ss = "111";
       StringBuilder sb = new StringBuilder(ss);
       sb.insert(1,"0").insert(3,"0").insert(5,"0");
       System.out.println(sb.toString());*/

       /**
        * 写数据到指定文件
       */
       /* File f = new File("D:\\xixi.txt");
        String s = "大川";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(s);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }



    public static void main(String[] args) {
        test();
    }



}

