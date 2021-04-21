package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/20 17:59
  */
object Scala10_TestControl_Abstract {
  /**
   * desc：控制抽象
   *  - 值调用
   *  将函数计算后的值进行传递
   *
   *  -名调用
   *   传递是代码块
   */
  def main(args: Array[String]): Unit = {
    //值传递，将函数计算后的值进行传递
    def foo(a:Int):Int = {
      10 + a
    }

    def f (b:Int) :Int = {
      println("f.......")
      b + 20
    }

    println(foo(f(10)))

    println("。。。。。。。。。。。。。。。。。。。。。")

    //名调用：代码块
    //数据类型  int，string，函数  参数类型            =>返回值类型，代码块 把f1整体当作代码传过去
    def fooo(a : =>Int):Unit={
      println(a)
      println(a)
    }

    def f1():Int={
      println(".......f")
      10
    }

    fooo(f1)
    fooo(f1())
  }

}
