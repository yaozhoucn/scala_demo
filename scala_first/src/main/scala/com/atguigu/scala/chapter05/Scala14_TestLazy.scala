package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/5/31 11:09
  */
object Scala14_TestLazy {
  def main(args: Array[String]): Unit = {
    //lazy 惰性加载，函数的执行会被拖延，什么时候用到结果，什么时候执行函数
    lazy val res: Int = sum(2,3)
    println("1.-------------------")
    println("2."+res)

  }
  def sum(a:Int,b:Int):Int={
    println("3.sum被执行")
    a + b
  }
}
