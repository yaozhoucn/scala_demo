package com.atguigu.scala.chapter01;

/**
 * Created by WXHang on HANG at 2021/4/7 17:40
 */
public class DataType01 {
    public static void main(String[] args) {
        String name = "abc";
        String name2 = new String("abc");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

    }
}
