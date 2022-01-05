package com.atguigu.scala.chapter07

import scala.collection.mutable.ArrayBuffer

/**
  * @Author: HANG
  * @Date: 2022/1/5 10:41
  * @Desc:  可变数组
  *       -> 可变数组，在执行添加或者删除操作的时候，不会创建新的数组，直接在原来的数组上操作
  */
object Scala02_TestArrayBuffer {
  def main(args: Array[String]): Unit = {
    //创建可变数组
    //val arrayBuffer:ArrayBuffer[Int] = new ArrayBuffer[Int](5)
    val arrayBuffer:ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

    //访问数据中的元素

    //println(arrayBuffer(1))

    //对数组元素进行修改
    arrayBuffer(1) = 20

    println(arrayBuffer(1))

    arrayBuffer.update(2, 30)

    /*for (elem <- arrayBuffer) {
      print(elem+"**")
    }*/

    //向数组中添加元素
    val value:ArrayBuffer[Int]= arrayBuffer.+=(40)
    println(arrayBuffer.mkString("--"))
    println(value.mkString("**"))
  }
}
