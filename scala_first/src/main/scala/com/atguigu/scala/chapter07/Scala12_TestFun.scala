package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/10 20:22
  * @Desc:  集合计算高级函数
  */
object Scala12_TestFun {
  def main(args: Array[String]): Unit = {
    //    （1）过滤
    //    遍历一个集合并从中获取满足指定条件的元素组成一个新的集合
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list.filter(elem => elem % 2 == 0))
//    （2）转化/映射（map）
//    将集合中的每一个元素映射到某一个函数
    println(list.map(elem => elem * 2))
    println(list.map(_ * 2))
//    （3）扁平化 flatten :::
    val nestList = List(List(1, 2, 4), List(3, 4, 5), List(8, 9, 10))
    nestList.flatten.foreach(print)
    //    （4）扁平化+映射 注：flatMap相当于先进行map操作，在进行flatten操作
    //    集合中的每个元素的子元素映射到某个函数并返回新集合
    val stringList: List[String] = List("hello atguigu", "hello bobo", "hello xian", "hello yaozhou")
    //stringList.flatMap(s => s.split(" ")).foreach(println)
    //val flatten: List[String] = stringList.map(elem => elem.split(" ")).flatten
    //flatten.foreach(println)
    val stringList2: List[Array[String]] = stringList.map(elem => elem.split(" "))
    println(stringList2.flatten)
//    （5）分组(group)
//    按照指定的规则对集合的元素进行分组
    println(list.groupBy(elem => elem % 2==0))

    val stringLists: List[String] = List("test", "type", "xian", "xiye", "yaozhou", "bobo", "but")
    val groupByMap: Map[Char, List[String]] = stringLists.groupBy(elem => elem.charAt(0))
    println(groupByMap)
//    （6）简化（归约）

//    （7）折叠
  }

}
