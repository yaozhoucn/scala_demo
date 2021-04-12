package com.atguigu.scala.chapter04

/**
  * Created by WXHang on HANG at 2021/4/12 17:25
  */
object Scala04_Break {
  def main(args: Array[String]): Unit = {
    try{
      for (i <- 1 to 10){
        if (i == 3) throw RuntimeException
        println(i)
      }
    }catch{
      //捕获异常，并对其进行处理
      case  e:Exception=>
    }

  }

}
