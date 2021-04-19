package com.atguigu.scala.chapter04

import scala.util.control.Breaks

//import scala.util.control.Breaks._

/**
  * Created by WXHang on HANG at 2021/4/12 17:25
  */
object Scala04_Break {
  def main(args: Array[String]): Unit = {
//    try{
//      for (i <- 1 to 10){
//        if (i == 3) throw RuntimeException
//        println(i)
//      }
//    }catch{
//      //捕获异常，并对其进行处理
//      case  e:Exception=>
//    }
//    for (elem <- 1 to 10) {
//      if (elem % 2 == 1) {
//        println(elem)
//      } else {
//        println("continue")
//      }
//    }
    /**
      * 标记当前循环是可中断的
      */
    Breaks.breakable(
      for(i <- 1 to 5){
        if (i == 3){
          Breaks.break()
        }
        println(i)
      }
    )

    println("这是循环体之外的代码")
  }

}
