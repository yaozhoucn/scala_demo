package com.atguigu.scala.chapter01;

/**
 * Created by WXHang on HANG at 2022/1/20 16:08
 * @author HANG
 * desc: 泛型
 */

class Parent{

}

class Child extends Parent{

}

class SubChild extends Child{


}
    /**
     * 泛型模板
     * @param <T>
     */
class Student2<T>{

}
/**
 * @author HANG
 */
public class TestGeneric {
    public static void main(String[] args) {
     //泛型的不可变性
     Student2<Child> student = new Student2<Child>();
     //Student2<Parent> student1 = new Student2<Child>();
     //Student2<SubChild> student2 = new Student2<Child>();
        test(Child.class);
        test(Parent.class);
    }


    /**
     * 泛型通配符  ? 下界（下限）
     * 后面跟super则就限定了是child或者是child的父类
     */
    public static void test(Class<? super Child> c){
        System.out.println(c.getName());
    }

}