package com.atguigu.scala.chapter04

/**
  * Created by WXHang on HANG at 2021/4/9 10:00
  */
object Scala02_For {
  def main(args: Array[String]): Unit = {
//    for (res:Int <- 1 to 5){
//      if(res != 4){
//        println(res)
//      }
//
//    }
//    for (res:Int <- 1 to 5 ;if  res != 4 ){
//      println(res)
//    }
    /**
      * 设置步长
      */
    for (res : Int <- 1 to 10 by 2){
      println(res)
    }
  }
}
