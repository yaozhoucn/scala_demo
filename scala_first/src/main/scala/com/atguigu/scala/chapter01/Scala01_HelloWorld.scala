package com.atguigu.scala.chapter01

/**
  * Created by WXHang on HANG at 2021/4/7 9:44
  *
  *
  *
  *
  *object 名称:从语法角度讲，上面语法表示声明了一个伴生对象
  *
  * 伴生对象
  * 伴随类产生的一个对象
  * 当我们对源文件进行编译之后，默认会生成两个字节码文件，一个是伴生类，另一个是伴生对象所属类
  */
object Scala01_HelloWorld {
  def main(args: Array[String]): Unit = {
    /**
      * main：主方法
      * args:参数名称
      * Array：参数类型
      * String：string类型数据--指定泛型
      * Unit：返回值类型（返回值为空）
      */
    println("Hello Scala")
    System.out.println("hello_world")
  }

}
