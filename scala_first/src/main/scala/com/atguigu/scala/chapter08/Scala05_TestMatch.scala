package com.atguigu.scala.chapter08

import com.atguigu.scala.chapter01.Student

/**
 * Created by WXHang on HANG at 2022/1/19 16:02
 *
 * desc：样例类 在类前面加case
 */
case class Student(val name:String,val age:Int){}
object Scala05_TestMatch {
  def main(args: Array[String]): Unit = {
    /*样例类仍然是类，和普通类相比，只是其自动生成了伴生对象，
    并且伴生对象中自动提供了一些常用的方法，如apply、unapply、toString、equals、hashCode和copy。
    样例类是为模式匹配而优化的类，因为其默认提供了unapply方法，因此，样例类可以直接使用模式匹配，而无需自己实现unapply方法。
    构造器中的每一个参数都成为val，除非它被显式地声明为var（不建议这样做）*/
    val stu1: Student = Student("cangcang", 30)
    val str: String = stu1 match {
      case User("test", 30) => "success"
      case _ => "fail"
    }
    println(str)
  }
}
