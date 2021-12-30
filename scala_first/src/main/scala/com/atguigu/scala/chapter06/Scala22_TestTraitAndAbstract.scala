package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 16:48
  * Desc：抽象类中可以定义抽象属性，抽象方法，非抽象属性，非抽象方法
  * 特质中可以定义抽象属性，抽象方法，非抽象属性，非抽象方法
  * 抽象类和特质都不能被实例化
  *   >抽象类有构造方法
  *   >抽象类也有构造方法
  *
  *   -如果需要给构造方法进行传参的话，使用抽象类，因为特质不支持带参的构造
  *   -优先选择特质，在scala中是单继承，如果直接继承不方便后续的继承
  *
  *   -对大量对象共性进行抽象---->类---->对大量类共性进行抽象---->抽象类
  *   -一般子类和父类之间应该满足 is-a 原则
  *   特质一般是对行为进行抽象，定义规范
  */
object Scala22_TestTraitAndAbstract {
  def main(args: Array[String]): Unit = {
    new Myclass22
  }

}

trait Trait22{
  println("特质的构造方法")
  def m1:Unit
}


abstract class MyAbstract22{
  println("抽象类的构造方法")
  def m1:Unit
}

class Myclass22 extends MyAbstract22 with Trait22 {
  println("myclass的构造方法")
  override def m1: Unit = {
    println("myclass")
  }

}