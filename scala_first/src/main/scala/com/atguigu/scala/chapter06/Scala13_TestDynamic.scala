package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 9:47
  * Desc：
  */
object Scala13_TestDynamic {
  def main(args: Array[String]): Unit = {
    //非多态形式
    val tea: Teacher13 = new Teacher13
    println(tea.name)
    tea.hello()
    println("=========00=========")
    //多态形式
    val per:Person13 = new Teacher13
    println(per.name)
    per.hello()

    //在scala中，不管是属性还是方法，都是动态绑定
  }

}


class Person13{
  val name:String = "person"
  def hello(): Unit ={
    println("hello person")
  }
}

class Teacher13 extends Person13{
  override val name:String = "teacher"

  override def hello(): Unit = {
    println("hello teacher")
  }
  def sayHi():Unit={
    println("sayHi")
  }
}