package com.atguigu.scala

/**
  * Created by WXHang on HANG at 2021/5/31 16:56
  *
  * 包对象
  *
  */
package object chapter06 {
  //在包对象中声明的属性和方法，可以被当前包下的类和伴生对象共享
  var shareVla = "atguigu"
  def shareMethod():Unit={
    println(s"${shareVla}共享方法")
  }
}
