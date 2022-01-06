package com.atguigu.scala.chapter07

import scala.collection.mutable.ListBuffer

/**
 * Created by WXHang on HANG at 2022/1/6 17:15
 */
object Scala05_TestListBuffer {
  def main(args: Array[String]): Unit = {
    //创建可变集合对象
    //1.通过构造方法
    val listBuffer:ListBuffer[Int] = new ListBuffer[Int]()

    //2.通过apply方法
        val listBuffer2: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    //向集合中添加元素  建议：可变用方法，不可变用符号
    listBuffer2.append(6)

    listBuffer.insert(0,20)
    listBuffer.+=(30)
    //修改元素
    listBuffer2.update(0,11)
    listBuffer2(1) = 12


    val listBuffer1: ListBuffer[Int] = listBuffer.+:(21)

    //删除数据
    listBuffer2.remove(2)

    println(listBuffer2)
    println(listBuffer)
  }

}
