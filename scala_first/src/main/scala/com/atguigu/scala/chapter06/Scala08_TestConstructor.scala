package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/1 10:09
  *
  * desc:构造器
  */
object Scala08_TestConstructor {
  /**
    * 构造器：构造方法--主要作用
    * 1.构造对象
    * 2.初始化属性（给对象的属性赋值）
    * -java中的构造器
    *   1.方法名以类名保持一致
    *   2.构造方法没有返回值类型
    *   3.构造方法可以有多个（重载，参数可传多个）
    *
    *   -sacla中的构造器
    *     1.主构造方法
    *       --在声明类的同时，定义了主构造方法
    *       --在一个类中，主构造方法只能有一个
    *     2.辅助构造方法
    *       --方法名必须叫this
    *       --在辅助构造方法开始（第一行）必须直接或者间接的调用主构造方法
    *       --辅助构造方法可以重载
    */
  def main(args: Array[String]): Unit = {
    val std :Student08 = new Student08("jingjing",18)


  }

}


class Student08{
    println("0.-----Student08的主构造方法被调用了")

    var name:String = _

    var age:Int = _

  //声明辅助构造方法
  def this(name: String){
      //直接调用主构造方法
    this()
    println("1.-----Student08的辅助构造方法被调用了")
    this.name = name
  }

  def this(name: String,age:Int){
    //间接调用主构造方法
    this(name)
    println("2.-----Student08的辅助构造方法被调用了")
    this.age = age
  }

  //以下写法不是构造方法
  def Student08(): Unit ={
    println("Student08的构造方法被调用了")
  }
}
