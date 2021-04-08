package com.atguigu.scala.chapter02

/**
  * Created by WXHang on HANG at 2021/4/7 17:10
  * desc:算数运算符
  */
object Scala06_Operator {
  def main(args: Array[String]): Unit = {
    val name:String = "abc";
    val str = new String("abc")

    //在java中 == 是比较的内存地址，equals比较的是内容
    //在scala中 == 与 equals 的方法一样，都是比较内容
    //在Scala中 ==  在底层调运的就是equals方法
     println(name == str)
     println(name.equals(str))
     println(name.eq(str))

  }
}
