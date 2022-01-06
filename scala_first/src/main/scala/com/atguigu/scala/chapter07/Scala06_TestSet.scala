package com.atguigu.scala.chapter07

import scala.collection.mutable

/**
 * Created by WXHang on HANG at 2022/1/6 17:36
 * set集合
 * desc:无序的，不能重复
 */
object Scala06_TestSet {
  def main(args: Array[String]): Unit = {

    //不可变
    //创建set集合
    val set:Set[Int] = Set(1,2,3,4,3,5,6)

    //往set集合中添加元素
    val s1: Set[Int] = set.+(34)
    println(s1)

    //创建可变集合
    val s2: mutable.Set[Int] = mutable.Set(1, 2, 3, 4)
    //添加元素
    val s3: mutable.Set[Int] = s2.+(6)
    s3.add(45)

    //删除元素
    s3.remove(1)
    println(s3)

  }

}
