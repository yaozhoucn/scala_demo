package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/5/24 11:08
  * desc:回顾闭包与柯里化
  */
object Scala13_ClosureAndCu {
  def main(args: Array[String]): Unit = {

    //存在函数嵌套
     def f1():Int=>Int={
       var a:Int = 10
       def f2(b:Int):Int={

         a + b
       }
       //以函数为返回值传递
       f2 _
     }
    //调用f1，返回值是f2
    //声明一个名为ff的常量，返回值是Int => Int ,返回值类型为函数，函数主要包括两个
    //部分，参数与返回值，在int => int 中，参数为int类型，返回值为int类型的函数
    val ff: Int => Int = f1()

    println(ff(20))
    println(f1()(20))

    //柯里化，简化代码编写
    def ff1()(b:Int):Int={
      var a:Int = 2
      a + b
    }
    def ff2()={
      var a:Int = 10
          //(b:int)类似为一个函数
      (b:Int) => a+b
    }

    println(ff1()(30))
    println(ff2()(10)+"----------------")
  }

}
