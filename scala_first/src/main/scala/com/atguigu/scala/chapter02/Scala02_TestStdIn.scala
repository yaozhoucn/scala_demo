package com.atguigu.scala.chapter02

import scala.io.StdIn

/**
  * Created by WXHang on HANG at 2021/4/7 14:11
  *
  * 键盘输入问题
  *
  */
object Scala02_TestStdIn {
  def main(args: Array[String]): Unit = {
    println("请输入您的姓名：")
    val name:String = StdIn.readLine()
    println("请输入您的年龄：")
    val age:Int = StdIn.readInt()

    println(s"欢迎年龄${age}的${name}来到欢乐世界")
  }
}
