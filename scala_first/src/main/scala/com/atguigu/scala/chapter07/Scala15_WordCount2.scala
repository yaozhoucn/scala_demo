package com.atguigu.scala.chapter07

/**
 * Created by WXHang on HANG at 2022/1/17 16:28
 */
object Scala15_WordCount2 {
  def main(args: Array[String]): Unit = {
    //复杂版本
    val tupleList: List[(String, Int)] = List(("hello spark scala world", 4), ("hello spark scala", 3), ("scala world", 2), ("hello", 1))
    //1.将元组（字符串，次数），转换为字符串
    val stringList: List[String] = tupleList.flatMap((t: (String, Int)) => {
      ((t._1 + " ") * t._2).split(" ")
    })
    //println(stringList)
    //2.将list分组
    val groupWord: Map[String, List[String]] = stringList.groupBy(word => word)
    //println(groupWord)
    //3.计算相同单词的个数
    val mapWord: Map[String, Int] = groupWord.map(elem => {
      (elem._1, elem._2.size)
    })
    //println(mapWord)
    //4.对数量进行排序
    println(mapWord.toList.sortBy(elem => elem._2).reverse.take(3))
  }
}
