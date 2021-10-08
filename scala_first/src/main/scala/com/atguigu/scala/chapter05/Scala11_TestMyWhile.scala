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
        //递归调用myWhile
        myWhile(condition)(op)
      }
    }
    //柯里化好处1：将一个参数列表里面的多个参数拆分成为多个参数列表
    //柯里化好处2：简化闭包代码的编写
    myWhile(n >= 1){
      println("mywhile - ->"+ n)
      n -=1
    }

    //使用闭包实现没有while循环
    //def mywhile2():(参数类型代码块) => 返回值类型
    def myWhile2(conditon: Boolean) : ( =>Unit ) =>Unit={
      def ff(op: => Unit) : Unit = {
        if (conditon){
          myWhile2(conditon)
          op
        }
      }
      ff _
    }
    myWhile2(n>=1){
      println("mywhile -- "+n)
      n -=1
    }
  }
}
