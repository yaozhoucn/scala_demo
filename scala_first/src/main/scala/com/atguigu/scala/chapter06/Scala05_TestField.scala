package com.atguigu.scala.chapter06

/**
 * Created by WXHang on HANG at 2021/5/31 22:59
 */
object Scala05_TestField {
  def main(args: Array[String]): Unit = {
    val std: Student = new Student
    //通过对象.的方式访问类的属性
    println(std.name)

  }
class Student{
  //在scala语言中，属性，方法，类默认的修饰就是public
  //但是public不是显式加，类似java中的default
  //底层生成的字节码文件对属性进行private进行修饰，提供了公开的获取属性/设置属性的方法
  var name:String = "zhangsan"
}

}
