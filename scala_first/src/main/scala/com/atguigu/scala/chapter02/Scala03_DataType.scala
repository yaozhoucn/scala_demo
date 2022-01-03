package com.atguigu.scala.chapter02

/**
  * Created by WXHang on HANG at 2021/4/7 14:39
  */
object Scala03_DataType {
  def main(args: Array[String]): Unit = {
    var b:Int = 10 + 20;
    println(b)

    val name="James"
    println(s"Hello,$name")
    //Hello,James 此例中，$name嵌套在一个将被s字符串插值器处理的字符串中。
    // 插值器知道在这个字符串的这个地方应该插入这个name变量的值，
    // 以使输出字符串为Hello,James。使用s插值器，
    // 在这个字符串中可以使用任何在处理范围内的名字。

  }
}
