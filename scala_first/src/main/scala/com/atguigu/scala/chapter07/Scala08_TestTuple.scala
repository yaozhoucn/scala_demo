package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/10 17:49
  * @Desc:
  */
object Scala08_TestTuple {
  def main(args: Array[String]): Unit = {
    //创建元组
    //数据类型：int /string / 函数=》  （参数类型）=> （返回值类型） / （代码块）
    val tuple: (String, String, Int) = ("100", "bobo", 18)
    //list里面套元组
    val tuples:List[(String, String, Int)] = List(("100", "bobo", 18), ("100", "bobo", 19), ("100", "bobo", 20))
    //访问元组中的数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    //通过索引访问数据
    println(tuple.productElement(1))
    //通过迭代器的方式访问数据
    for (elem <- tuple.productIterator) {
      println(elem)
    }
    //Map集合中的键值对是一种特殊的元组，元组中的元素个数是两个，我们称之为对偶元组
    val map1: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    //  -> 是一个方法，得到一个对偶元组
    val map2: Map[String, Int] = Map(("a", 1), ("b", 2))
    println(map1)
    println(map2)
    val tuple1: (String, String, Int, (String, String, String)) = ("100", "bobo", 18, ("bbo1", "bobo2", "bobo3"))
    println(tuple1._4._3)
  }
}
