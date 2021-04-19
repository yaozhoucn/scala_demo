package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/19 16:48
  */
object Scala06_Fun_High {
  def main(args: Array[String]): Unit = {
    //函数的正常调用与定义
    def foo():Int={
      println(".....foo")
      10
    }

    //将foo函数的执行结果赋值给res变量
    val res:Int = foo()

    println(res)

    //函数作为值进行传递，语法：在函数名称面前 + 空格 加下划线
    //注意：将foo函数作为一个整体，赋值给f变量， f是函数类型 （）=》Int
    val f: () => Int = foo _
    println(f)

    //加括号调用函数
    println(f())

    val ff = foo //将值赋值给ff
    val ff1 = foo _ // 将函数本身作为值赋值给ff,果果明确了变量的类型，那么空格和下滑线可以省略

    var ff2:() => Unit = foo
    println(ff2)

    //函数可以最为参数进行传递，（大多数情况下为匿名函数的形式）

    //定义一个函数f0，该函数接受一个函数类型的参数f，f定义了对两个整数进行了一些操作
    def f0(f:(Int,Int)=> Int):Int={
        f(10,20)
    }

    def f1(a:Int,b:Int):Int={
      a+b
    }
//test1
    println(f0(f1))
    def calculator(a: Int,b:Int,op:(Int,Int)=>Int):Int={
      op(a,b)
    }
    def op(a:Int,b:Int):Int={
      a+b
    }

    calculator(10,20,op)
    //test2
    println(calculator(10, 20, (a: Int, b: Int) => {
      a - b
    }))
  }


}
