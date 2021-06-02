package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 11:18
  * Desc：单例设计模式
  */
object Scala16_TestSingleton {
  //单例设计模式
  //1.构造方法私有化
  //2.提供私有的静态属性，接收单例对象
  //3.公共的，静态的getInstance方法获取实例
  def main(args: Array[String]): Unit = {
    val std1: Student16 = Student16.getInstance()

    println(std1)
    val std2: Student16 = Student16.getInstance()
    println(std2)

  }
}
//懒汉式
/*object Student16{
  private var s:Student16 = null
  def getInstance():Student16={
    if (s == null){
      s = new Student16
    }
    s
  }
}*/
//饿汉式
object Student16{
  private val s = new Student16
  def getInstance():Student16={
    s
  }
}

//主构造方法私有化
class Student16 private(){

}
