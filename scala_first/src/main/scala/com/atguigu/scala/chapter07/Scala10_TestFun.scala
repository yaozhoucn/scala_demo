package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/10 19:04
  * @Desc: 衍生集合
  */
object Scala10_TestFun {
  def main(args: Array[String]): Unit = {
    //    （1）获取集合的头
    val ints1: List[Int] = List(1, 2, 3, 4, 5)
    val ints2 = List(3, 4, 5, 6, 7)
    println(ints1.head)
//    （2）获取集合的尾（不是头的就是尾）
    println(ints1.tail)
//    （3）集合最后一个数据
    println(ints1.last)
//    （4）集合初始数据（不包含最后一个）
    println(ints1.init)
//    （5）反转
    println(ints1.reverse)
//    （6）取前（后）n个元素
    println(ints1.take(3))
    println(ints1.takeRight(2))
//    （7）去掉前（后）n个元素
    println(ints1.drop(3))
    println(ints1.dropRight(1))
//    （8）并集
val ints: List[Int] = ints1.union(ints2)
    println(ints)
//    （9）交集
    println(ints1.intersect(ints2))
//    （10）差集
    println(ints1.diff(ints2))
//    （11）拉链 注:如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用（两两配对）
    println(ints1.zip(ints2))
//    （12）滑窗
    for (elem <- ints1.sliding(3)) {
      println(elem)
    }
    ints1.sliding(3,2).foreach(println)
  }
}
