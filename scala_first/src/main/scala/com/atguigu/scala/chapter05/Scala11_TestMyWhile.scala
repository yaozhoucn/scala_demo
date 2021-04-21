package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/21 11:50
  */
object Scala11_TestMyWhile {
  def main(args: Array[String]): Unit = {
    //while循环
    var n:Int = 10
//    while (n >= 1){
//      println(n)
//      n-=1
//    }

    //while(循环条件){循环体}

    //使用柯里化实现mywhile
    /*def myWhile(循环条件)(循环体):Unit={
      println(n)
    }*/

    def myWhile(condition: => Boolean)(op: => Unit ):Unit={
      if (condition){
        op
        myWhile(condition)(op)
      }
    }
    myWhile(n >= 1){
      println("mywhile - ->"+ n)
      n -=1
    }
  }
}
