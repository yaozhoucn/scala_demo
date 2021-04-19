package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/19 10:47
  */
object Scala01_TestFun {
  def main(args: Array[String]): Unit = {
    def sayHi(name : String): String = {
      return "hello - ->" + name
    }
    println(sayHi("lisi"))
  }

  /**
    * --函数和方法
    *  函数=》将完成某个特殊功能的代码块
    *
    *  方法:
    *  定义在类下面的函数是方法；
    *
    *  方法支持重载，函数不支持；
    */



    //重载:对调用者而言可以屏蔽因为参数不同而造成的差异


}
