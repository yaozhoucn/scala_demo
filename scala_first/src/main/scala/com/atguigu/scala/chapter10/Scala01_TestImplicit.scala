package com.atguigu.scala.chapter10

/**
 * Created by WXHang on HANG at 2022/1/20 13:59
 *
 * desc：隐式函数
 *    - 可以动态的扩展来的功能
 *    -当编译器第一编译失败的时候，会在当前环境中查找能让编译通过的方法，该方法将类型进行转换，转换之后，对代码进行二次编译
 *    实现对类的扩展
 *
 *    -- 在方法前面加Implicit
 */
object Scala01_TestImplicit {
  //将int类型转换为MyRichInt
  implicit def convert(a:Int):MyRichInt={
    new MyRichInt(a)
  }
  def main(args: Array[String]): Unit = {
    println(2.MyMin(5))
  }
}

class MyRichInt(var self:Int){
  def MyMax(i:Int): Int ={
    if (i>self) i else self
    //if (i<self) self else i
  }

  def MyMin(i:Int): Int ={
    if (i<self) i else self
    //if (i>self) self else i
  }
}
