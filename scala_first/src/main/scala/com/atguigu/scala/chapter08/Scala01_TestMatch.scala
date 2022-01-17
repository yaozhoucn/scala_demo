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

    //模式匹配是有返回值
    //模式匹配中没有break关键字，case分支执行结束后直接跳出
    val result: Any = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)

    //模式守卫：通过模式首位，求一个整数的绝对值
    def abs(x: Int) = x match {

      //定义一个变量对传入的x进行接受
      case i:Int if i >= 0 => i
      case j:Int if j < 0 => -j
      case _ => "error"
    }

    println(abs(-5))

  }
}
