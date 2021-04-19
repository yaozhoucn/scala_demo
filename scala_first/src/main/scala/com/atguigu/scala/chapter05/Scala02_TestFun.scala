package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/19 11:08
  *
  * desc:函数的定义
  */
object Scala02_TestFun {
  def main(args: Array[String]): Unit = {
    //1.函数1：无参，无返回值；
    def f1(): Unit ={
      println("无参，无返回值")
    }
    f1()
    //函数2：无参，有返回值
    def f2(): String ={
      println("无参，有返回值")
      return "参数"
    }

    println(f2())
    //函数3：有参，无返回值
    def f3(name:String):Unit={
      println("有参，无返回值")
    }

    println(f3("zhangsan"))
  }

}
