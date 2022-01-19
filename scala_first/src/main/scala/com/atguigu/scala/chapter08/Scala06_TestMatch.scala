package com.atguigu.scala.chapter08

/**
 * Created by WXHang on HANG at 2022/1/19 16:28
 * desc:偏函数
 */
object Scala06_TestMatch {
  def main(args: Array[String]): Unit = {
    //需求：将集合中的int元素+1操作，字符串类型去掉
    val list = List(1,2,3,4,5,6,"test")
    val newList: List[Any] = list.map(elem => {
      elem match {
        case i: Int => i + 1
        case s: String => s
        case _ => "error"
      }
    })
    println(newList.filter(elem => elem.isInstanceOf[Int]))

    //偏函数
    List(1, 2, 3, 4, 5, 6, "test").collect { case x: Int => x + 1 }.foreach(println)
  }
}
