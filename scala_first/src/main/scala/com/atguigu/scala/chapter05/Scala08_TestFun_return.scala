package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/20 11:12
  */
object Scala08_TestFun_return {
  def main(args: Array[String]): Unit = {
    def f1():(Int)=>Int = {
      var a:Int = 10
      def f2(b:Int):Int = {
        a+b
      }
      //建函数作为返回值进行返回，就是函数名称加空格加下划线
      f2 _
    }
  //调用f2,执行f1函数将返回值f2赋值给变量ff
    val ff: Int => Int = f1()

    //调用ff函数，其实就是调用f2
    println(ff(10))

    //也可以直接通过以下方式调用
    println(f1()(40))
  }


}
