package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/5 18:16
  * @Desc: 不可变集合
  */
object Scala04_TestList {
  def main(args: Array[String]): Unit = {
    //创建List集合，因为list为抽象的，只能通过apply创建
    val list:List[Int] = List(1, 2, 3,4)
    //向集合中添加元素
    //val newList: List[Int] = list.+:(3)
    val newList: List[Int] = list.::(50)

    //在Scala语言中List ===》Nil 表示空集合
    val newList2: List[Int] = 30 :: 20 :: 40 :: Nil
    println(newList)
    println(list)
    println(newList2)
    //向list中添加集合
    val list1 = List(1, 2, 3, 4)
    val list2 = List(5, 6)
    val newList3: List[Any] = list1 :: list2
      println(newList3)

    //扁平化处理
    val list3: List[Int] = list1 ::: list2
    println(list3)
    println(list3(4))
  }

}
