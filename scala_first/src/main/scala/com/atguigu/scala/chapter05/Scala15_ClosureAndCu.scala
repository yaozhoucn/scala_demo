package com.atguigu.scala.chapter05

/**
  * @Author: HANG
  * @Date: 2021/10/28 15:23
  * @Desc: 回顾闭包和柯里化
  */
object Scala15_ClosureAndCu {
  def main(args: Array[String]): Unit = {
    def f1(): Int => Int ={
      var a:Int = 10
      def f2(b:Int):Int = {
          a + b
      }
      //f2()作为f1（）的返回值进行传递
      f2 _
    }
    //调用f1，返回的是f2,此处 2 为f2（2）传值参数
    var ff = f1()(2)
    println(ff)

    //返回值为函数类型（函数包括参数和返回值int:int）：ff为参数为int类型，返回值为int类型的函数，这个函数是f1（）执行完毕后返回的结果；
    var ff2: Int => Int = f1()
    println(ff2(20))
  }

}
