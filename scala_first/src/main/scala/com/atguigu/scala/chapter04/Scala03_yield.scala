package com.atguigu.scala.chapter04

/**
  * Created by WXHang on HANG at 2021/4/12 16:26
  */
object Scala03_yield {
  def main(args: Array[String]): Unit = {
//    val res = for (i <- 1 to 10)yield {
//      i*2
//    }
//    println(res)
    /**
      * 倒叙打印
      */
//    for (i <- 1 to 10 reverse){
//      println(i)
//    }

    for (i <- 1 to 10 reverse){
      println(i)
    }

    for (i<- 10 to 1 by -1){
      println(i)
    }
  }

}
