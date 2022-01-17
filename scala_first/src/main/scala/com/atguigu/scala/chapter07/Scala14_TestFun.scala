package com.atguigu.scala.chapter07

import scala.collection.mutable

/**
 * Created by WXHang on HANG at 2022/1/12 17:15
 */
object Scala14_TestFun {
  def main(args: Array[String]): Unit = {
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 4, "b" -> 5, "d" -> 6)
      //最终合并后的效果 Map（“a” -> 5,"b" -> 7,"c" -> 3,"d" -> 6 ）

    //技术选型：两个集合合并不属于集合内部元素聚合，所以fold更合适
    /*val map3: mutable.Map[String, Int] = map1.foldLeft(map2) (
      //mm:表示map2
      //kv:map1中的每一个元素
      (mm, kv) => {
        //指定合并规则
        val k: String = kv._1
        val v: Int = kv._2
        //根据map1中的元素key，到map2中获取value
        //赋值
        mm(k) = mm.getOrElse(k, 0) + v
        //返回mm
        mm
      }
    )
    println(map3)*/
    val map4: mutable.Map[String, Int] = map2.foldLeft(map1)((map, t) => {
      //折叠就是外部元素与内部元素之间的聚合
      //技术选型：两个集合合并不属于集合内部元素聚合，所以fold更合适
      //传两个参数进来，一个就是外部的元素map1，另一个就是内部元素map2里面的每一个键值对

      //Map2("a" -> 4, "b" -> 5, "d" -> 6)
      //Map1("a" -> 1, "b" -> 2, "c" -> 3)

      // fold方法使用了函数柯里化，存在两个参数列表
      // 第一个参数列表为 ： 零值（初始值）
      // 第二个参数列表为： 简化规则


      //map就是map1 (a1b2c3)
      //t就是map2中的每一个元素
      //t 中 a4，b5，d6
      val k: String = t._1
      val v: Int = t._2
      map(k) = map.getOrElse(k, 0) + v
      println(map)
      //map1("a" -> )
      map
    })
    println(map4)
  }

}
