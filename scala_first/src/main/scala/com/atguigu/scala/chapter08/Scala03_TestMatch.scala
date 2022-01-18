package com.atguigu.scala.chapter08

/**
 * Created by WXHang on HANG at 2022/1/18 12:03
 *
 * desc:模式匹配扩展案例
 */
object Scala03_TestMatch {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3))

    //对list进行遍历，输出第一个元素
//    for (elem <- list) {
//      println(elem._1)
//    }
    //特殊的模式匹配 1
    for ((word,count) <- list){
      //println(word)
    }

    /*for ((word,_) <- list){
      println(word)
    }*/

    for (("a",count) <- list){
      println(count)
    }
    //特殊的模式匹配 2  给元组元素命名

    var (id,name,age): (Int, String, Int) = (100, "yaozhou", 20)
    //println((id,name,age))
    println(name)

    //特殊的模式匹配3   遍历集合中的元组，给count * 2
//    val newList: List[(String, Int)] = list.map((t: (String, Int)) => {
//
//      (t._1, t._2 * 2)
//    })
//    println(newList)

        val newList: List[(String, Int)] = list.map {
              //当只有一个参数时，可用{}代替（）
      t => {
        t match {
          case (word, count) => (word, count * 2)
        }
      }
    }
    //简化

    //1.如果匿名函数中，使用模式匹配case，必须使用花括号 {} 括起来
    //2.如果一个函数列表中只有一个参数，那么参数列表的小括号（）可以花括号{}代替
    val newList2: List[(String, Int)] = list.map {
      case (word, count) => (word, count * 2)
    }
    println(newList2)

    //特殊匹配 4
    var list1 = List(("a", ("a", 1)), ("b", ("b", 2)), ("c", ("c", 3)))
    val list2: List[(String, (String, Int))] = list1.map {
      case (groupkey, (word, count)) => (groupkey, (word, count * 2))
    }
    println(list2)
  }
}
