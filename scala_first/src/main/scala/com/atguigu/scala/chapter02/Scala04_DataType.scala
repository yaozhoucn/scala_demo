package com.atguigu.scala.chapter02

/**
  * Created by WXHang on HANG at 2021/4/7 16:11
  */
object Scala04_DataType {
  def main(args: Array[String]): Unit = {
//    （1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。
//    （2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
//    （3）（byte，short）和char之间不会相互自动转换。
//    （4）byte，short，char他们三者可以计算，在计算时首先转换为int类型。

    //强制类型转换
    //(1)将数据由高精度转换为低精度，就需要强制转换；
    var n:Int = 2.5.toInt
    println(n)
    //(2)强制符号只针对最近的操作有效，往往回使用小括号提升优先级

    //字符串转数值
    val res = "2.5".toDouble
    println(res)
  }
}
