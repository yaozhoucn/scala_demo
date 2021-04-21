package com.atguigu.scala.chapter05

/**
 * Created by WXHang on HANG at 2021/4/21 23:05
 *
 * desc:惰性加载
 */
object Scala12_TestLazy {
  def main(args: Array[String]): Unit = {

    //lazy：惰性加载，函数的执行会被延后，什么时候用到结果，什么执行函数

    def sum(a:Int,b:Int):Int={
      println("sum被执行了")
      a + b
    }

    println(sum(1, 2))
  }

}
