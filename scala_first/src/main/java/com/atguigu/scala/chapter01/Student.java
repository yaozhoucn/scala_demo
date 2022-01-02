package com.atguigu.scala.chapter01;

/**
 * @Author: HANG
 * @Date: 2022/1/2 15:02
 * @Desc: java中的equals方法重写
 */
public class Student {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

}
