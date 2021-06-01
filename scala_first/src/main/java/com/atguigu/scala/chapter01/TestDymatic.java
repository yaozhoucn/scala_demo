package com.atguigu.scala.chapter01;

/**
 * Created by WXHang on HANG at 2021/6/1 17:11
 * Desc：通过静态动态绑定和动态绑定说明多态
 *
 *  -多态
 *      >同一个对象，多种不同形态
 *      >父类引用指向子类对象\接口指向实现类
 *      >只能调用其引用类型中定义的方法--编译看左
 *           --静态绑定(编译器绑定)：在Java中，在程序编译的时候，确定属性所有的类型
 *      >在运行的时候，会执行子类中覆盖的方法--运行看右
 *           --动态绑定(运行期绑定)：在程序执行的时候，看实际创建对象的，然后进行调用，方法属于动态绑定
 */
public class TestDymatic {
    public static void main(String[] args) {
        //不存在多态的情况
        /*Teacher11 teacher11 = new Teacher11();
        System.out.println(teacher11.name);
        teacher11.hello();*/

        //存在多态的情况

        Person11 tea = new Teacher11();
        System.out.println(tea.name);
        tea.hello();

        //编译看左，运行看右
        //tea.sayHi();
    }
}

class Person11{
    String name = "person";
    public void hello(){
        System.out.println("hello person");
    }
}

class Teacher11 extends Person11{
    String name = "teacher";
    @Override
    public void hello(){
        System.out.println("hello teacher");
    }
    public void sayHi(){
        System.out.println("say hello");
    }
}

