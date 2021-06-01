package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/1 10:31
  * desc：构造方法的参数
  */
object Scala09_TestConstructor {
  def main(args: Array[String]): Unit = {

  }


//只提供无参的构造，单独定义
class Student09{
  var name:String = _
  var age:Int = _
}
  //在Scala语言中，以下写法比较少，如果这样写，那就是受java毒害太深了

  //在声明主构造方法参数的时候， 如果参数前什么也不加， 那么参数就作为当前类的局部变量使用,不能作为类的属性被访间
  //如果需要将参数作为属性被访问的话，那么在参数声明前加var或者val关键字

class Student09_01(name:String,age:Int){
  //参数可做为当前类的局部变量使用
  def m1(): Unit ={
    println(name)
    println(age)
  }
}

  //同时提供主，辅助构造方法

  //同时提供带参与无参的构造方法，在创建对象的时候都可使用
class Student09_03(){
    var name:String = _
    var age:Int = _

    def this(name:String,age:Int){
      this()
      this.name = name
      this.age = age
    }
  }
}
