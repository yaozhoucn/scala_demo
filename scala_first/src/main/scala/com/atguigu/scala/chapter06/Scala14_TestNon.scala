package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 10:16
  * Desc：匿名子类（匿名内部类）
  */
object Scala14_TestNon {
  def main(args: Array[String]): Unit = {
    //抽象类不能被实例化，可以通过匿名子类创建对象
    val per :Person14 = new Person14 {
      override var name: String = "atguigu"
      override var m1: Unit = {
        println("hello atguigu")
      }
    }
    per.m1
    println(per.name)
  }
}

abstract class Person14{
  var name:String
  var m1:Unit
}