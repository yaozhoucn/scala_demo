package com.atguigu.scala.chapter08

/**
 * Created by WXHang on HANG at 2022/1/19 16:28
 * desc:偏函数
 */
case class Person(val name:String,val age:Int){}
object Scala06_TestMatch {
  def main(args: Array[String]): Unit = {
    //需求：将集合中的int元素+1操作，字符串类型去掉
    val list = List(1,2,3,4,5,6,"test")
    val newList: List[Any] = list.map(elem => {
      elem match {
        case i: Int => i + 1
        case s: String => s
        case _ => "error"
      }
    })
    //println(newList.filter(elem => elem.isInstanceOf[Int]))

    //偏函数
    //List(1, 2, 3, 4, 5, 6, "test").collect { case x: Int => x + 1 }.foreach(println)


    //变量声明中的模式匹配
    val (x, y) = (1, 2)
    println(s"x=$x,y=$y")

    val Array(first, second, _*) = Array(1, 7, 2, 9)
    println(s"first=$first,second=$second")

    val Person(name, age) = Person("zhangsan", 16)
    println(s"name=$name,age=$age")



    //for表达式中的模式匹配

    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map) { //直接将map中的k-v遍历出来
      println(k + " -> " + v) //3个
    }
    println("----------------------")

    //遍历value=0的 k-v ,如果v不是0,过滤
    for ((k, 0) <- map) {
      println(k + " --> " + 0) // B->0
    }

    println("----------------------")
    //if v == 0 是一个过滤的条件
    for ((k, v) <- map if v >= 1) {
      println(k + " ---> " + v) // A->1 和 c->3
    }
  }
}
