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
//    for (res : Int <- 1 to 10 by 2){
//      println(res)

//      for(i <- 1 to 9 ; j <- 1 to i){
//          print(j +"*"+ i+ "=" + i*j+"\t")
//      }
//    println()
    /**
      * 练习1：打印九九乘法表
      */
//    for (i <- 1 to 9){
//
//      for (j <- 1 to i){
//        print(j+"*"+ i+ "=" + i*j+"\t")
//
//      }
//      println()
//    }
    /**
      * 练习2：打印等腰三角形
      */
    for (i<- 1 to 18 by 2;j=(18-i)/2 ){

        println(" "* j +"*"*i)
    }
  }
}
