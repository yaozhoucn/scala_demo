package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/1 11:32
  */
object Scala10_TestExtends {
  def main(args: Array[String]): Unit = {
    //val std:Student10 = new Student10("name",20,"620523") 1,3,4
    val std:Student10 = new Student10("name",20,"620523")

    println(std.name)
    println(std.age)
    println(std.stdNo)

  }

}

class Person10{
  println("1-父类的主构造方法被调用了")
  var name:String = _
  var age:Int = _

  //辅助构造方法
  def this(name:String,age:Int){
    this()//调用主构造方法
    println("2-父类的辅助构造方法被调用了")
    this.name = name
    this.age = age
  }
}

class Student10(name:String,age:Int) extends Person10(name,age){
  println("3-子类的主构造方法被调用了")

  var stdNo:String = _

  def this(name:String,age:Int,stdNo: String){
    this(name,age)
    println("4-子类的辅助构造方法被调用了")
    this.stdNo = stdNo
  }
}
