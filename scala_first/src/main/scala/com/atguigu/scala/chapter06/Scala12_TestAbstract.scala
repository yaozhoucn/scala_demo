package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/1 15:04
  */
object Scala12_TestAbstract {

}

abstract class Person12{
  //非抽象属性
  val name:String = "zhangsan"
  //抽象属性
  var age:Int

  //非抽象方法
  def eat(): Unit ={
    println("person is eat")
  }
  //抽象方法
  def sleep(): Unit
}

class Student12 extends Person12{
  //对父类的非抽象方法进行重写

  override def eat(): Unit = {

    //可以通过super关键字，取调用父类的方法，da
    //override关键字不能省略，必须得加
    super.eat()

  }

  //在scala语言中除了方法可以重写，书属性也可以重写
  //在子类中，如果重写的是抽象属性和方法，那么override关键字可以省略
  override var age: Int = 18

   def sleep(): Unit = {
    println("bobo is sleep")
  }
  //在资类中，对父类的非抽象属性进行重写
  //父类声明了抽象属性，子类对属性进行优化
  //如果子类对父类的属性进行重写的话，属性只能是val修饰
  //override var name:String= "bobo"
  override  val name:String= "bobo"
}
