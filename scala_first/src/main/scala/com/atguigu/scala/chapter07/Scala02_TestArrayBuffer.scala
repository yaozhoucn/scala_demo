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

    //向数组中添加元素 建议：在操作集合的时候，不可变用符号，可变用方法
    val value:ArrayBuffer[Int]= arrayBuffer.+=(40)
    //println(arrayBuffer.mkString("--"))
    arrayBuffer.append(100)

    arrayBuffer.insert(2,89)
    println(value.mkString("**"))

    //注意:并不是数据是可变的，在操作数据对象的时候，就不能创建新的数组对象了。也可以调用相关方法，去创建新的对象
    val ints: ArrayBuffer[Int] = arrayBuffer.+:(30)
    //创建了新的数据ints
    println(ints)

    //删除数组中的函数
    arrayBuffer.remove(2)
    println(arrayBuffer)
    //从1的位置开始删除，删除的个数为2个
    arrayBuffer.remove(1,2)
    println(arrayBuffer)
  }
}
