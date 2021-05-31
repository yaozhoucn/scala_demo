package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/5/31 12:04
  * desc:对象和类
  */
object Scala01_TestObject {
  def main(args: Array[String]): Unit = {
     //在自然界中客观存在的都是对象(万物皆对象)
    //对大量对象共性进行抽象，抽象类
    // >有什么，属性
    // >能做什么，方法
    // >属性和方法虽然定义在类中，单数属于每一个对象
    // -在scala|java语言中，类是创建对象的模板
    // -类是客观事物，在人脑中的主观反应


    //创建对象
    val std:Student01 = new Student01()
    println(std.name)
    std.study()
    shareMethod()
  }
  class Student01{
    var name:String = "cangcang"

    def study():Unit = {
      println(s"${name}在学习")
    }
  }

}
