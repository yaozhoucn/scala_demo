package com.atguigu.scala.chapter02

/**
  * Created by WXHang on HANG at 2021/4/7 10:45
  */
object Scala01_TestComm {
  def main(args: Array[String]): Unit = {
    var a:Int = 3;
    val b:Int = 4;
    var c = a + b;
    println(c);
    val name:String = "demo"
    val age:Int = 18
    var abc:String = "abc"
    val sql : String =
      s"""
        |select * from user where name = "$name" and age = ${age + 2}
      """.stripMargin

    println(sql)
  }
}
