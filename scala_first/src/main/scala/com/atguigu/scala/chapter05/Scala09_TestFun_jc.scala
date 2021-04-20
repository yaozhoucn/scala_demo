package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/20 17:40
  */
object Scala09_TestFun_jc {
  def main(args: Array[String]): Unit = {
    println(jc(5))
  }
  //求阶乘
  def jc(n:Int):Int = {
    if (n==1){
      return 1
    }
    n * jc(n-1)
  }

}
