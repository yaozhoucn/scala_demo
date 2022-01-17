package com.atguigu.scala.chapter07

import scala.collection.mutable

/**
 * Created by WXHang on HANG at 2022/1/17 17:06
 * desc:队列
 */
object Scala16_TestQueue {
  def main(args: Array[String]): Unit = {
    //Scala也提供了队列（Queue）的数据结构，队列的特点就是先进先出。进队和出队的方法分别为enqueue和dequeue
    val queue: mutable.Queue[String] = new mutable.Queue[String]()
    queue.enqueue("a","b","c")
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())

    val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}
    //并行集合：添加 par
    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}

    println(result1)
    println(result2)
  }

}
