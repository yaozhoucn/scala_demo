package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/10 18:38
  * @Desc: 基本属性和常用操作
  */
object Scala09_TestFun {
  def main(args: Array[String]): Unit = {
    //    （1）获取集合长度
    val ints: List[Int] = List(1, 2, 3, 4, 5)
    println(ints.length)
//    （2）获取集合大小
    println(ints.size)
//    （3）循环遍历
    ints.foreach(print)
//    （4）迭代器
  val iterator: Iterator[Int] = ints.iterator
    while (iterator.hasNext){
      println(iterator.next())
    }
//    （5）生成字符串
    println(ints.toString())
    println(ints.mkString("__"))
//    （6）是否包含
    println(ints.contains(4))
  }

}
