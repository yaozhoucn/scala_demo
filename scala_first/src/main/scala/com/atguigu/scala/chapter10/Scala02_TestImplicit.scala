package com.atguigu.scala.chapter10

/**
 * Created by WXHang on HANG at 2022/1/20 14:35
 *
 * desc:隐式参数
 */
object Scala02_TestImplicit {
  def main(args: Array[String]): Unit = {
    implicit var s:String = "hello world"
    def sayHi(implicit name:String)={
    //def sayHi(name:String="yaozhoujueqi")={
      println("name>-"+name)
    }
    //sayHi("BOBO")
    //如果函数如果有默认值的话，那么在调用函数的时候我们可以不传递参数

    //隐式参数在调用的时候，直接通过方法名称调用，不需要加（）
    sayHi

    //隐式类 ： 在类前面加implicit
    //（1）其所带的构造参数有且只能有一个
    //（2）隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的。
  }
}
