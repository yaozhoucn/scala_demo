package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/19 15:05
  *
  * desc ： 函数至简原则与匿名函数回顾
  */
object Scala05_TestFun_review {
  def main(args: Array[String]): Unit = {

//    //正常定义函数
//    def f0(name : String): String ={
//      return name
//    }
//
//    println(f0("atguigu"))
  }
    //省略return关键字
//  （1）return可以省略，Scala会使用函数体的最后一行代码作为返回值
  def f0(name : String): String ={
          name
     }
//  （2）如果函数体只有一行代码，可以省略花括号
  def f1(name : String): String = name

//  （3）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
  def f2(name : String) = name

//  （4）如果有return，则不能省略返回值类型，必须指定
  def f3(name: String):String = {
    return name
  }
//  （5）如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
//  （6）Scala如果期望是无返回值类型，可以省略等号
  def f4(s : String){
  //这个形式是一个过程
    println(s)
  }
//  （7）如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
  def f5():Unit={

  }
  f5
//  （8）如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
  def f6:Unit={

  }
  f6
  def ff:String={
    return "函数学习"
  }

  def ff1 = "函数学习"
  var ff2 = "函数学习"
//  （9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
  //1.扩展功能；
  //2.具体扩展的功能是通过参数函数来传递，灵活

//  （1）参数的类型可以省略，会根据形参进行自动的推导
//  （2）类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号。
//  （3）匿名函数如果只有一行，则大括号也可以省略
//  （4）如果参数只出现一次，则参数省略且后面参数可以用_代替

}
