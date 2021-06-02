package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 10:23
  * Desc：创建对象的方式
  *   - java
  *   1.new
  *   2.反射
  *   3.工厂
  *   4.克隆
  *   5.反序列化
  *   - scala
  *   1.new 底层调用类的构造方法
  *   2.类（） 底层调用的是apply方法
  *         --apply方法定义在类的伴生对象中
  */
object Scala15_TestCreateObject {
  def main(args: Array[String]): Unit = {
    //通过构造方法创建对象
    val std1 : Student15 = new Student15()
    println(std1)
    val std2 : Student15 = new Student15("atguigu",20)
    println(std2)

    var std:Student15 = Student15()
  }

}
//为student15的伴生类
object Student15{
  //通过apply方法创建对象
  def apply(): Student15 = new Student15()

  def apply(name:String,age:Int): Student15 = new Student15(name,age)
}

class Student15{

  var name:String = _
  var age:Int = _

  def this(name:String,age:Int){
    this()
    this.name = name
    this.age = age

  }
  override def toString = s"Student15($name, $age)"
}
//单例设计模式
//1.构造方法私有化
//2.提供私有的静态属性，接收单例对象
//3.公共的，静态的getInstance方法获取实例