package com.atguigu.scala.chapter08

/**
 * Created by WXHang on HANG at 2022/1/17 18:01
 * desc: 模式简单匹配，简单的两个整数运算
 */
object Scala01_TestMatch {
  def main(args: Array[String]): Unit = {
    var a:Int = 10
    var b:Int = 20
    var operator:Char = '+'

    val result: Any = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)
  }
}
