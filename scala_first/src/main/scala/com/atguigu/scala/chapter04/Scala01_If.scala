package com.atguigu.scala.chapter04

import scala.io.StdIn

/**
  * Created by WXHang on HANG at 2021/4/8 16:26
  */
object Scala01_If {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
   val age = StdIn.readInt()
//    if (age < 18){
//      println("童年")
//    }else if(age >= 18 && age < 30){
//      println("成年")
//    }else{
//      println("老年")
//    }
    //案例：通过if else模拟三元运算符实现，res = 条件表达式？ 值1：值2
    val res:Any = if(age < 18) "童年" else "成年"
    println(res)
  }
}