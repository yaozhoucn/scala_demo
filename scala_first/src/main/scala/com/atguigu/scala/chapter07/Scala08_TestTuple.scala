package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/10 17:49
  * @Desc:
  */
object Scala08_TestTuple {
  def main(args: Array[String]): Unit = {
    //创建元组
    //数据类型：int /string / 函数=》  （参数类型）=> （返回值类型） / （代码块）
    val tuple: (String, String, Int) = ("100", "bobo", 18)
    //list里面套元组
    val tuples:List[(String, String, Int)] = List(("100", "bobo", 18), ("100", "bobo", 19), ("100", "bobo", 20))
    //访问元组中的数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    //通过索引访问数据
    println(tuple.productElement(1))
  }
}
