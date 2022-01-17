package com.atguigu.scala.chapter08

/**
 * Created by WXHang on HANG at 2022/1/17 19:02
 *
 * desc:模式匹配
 */
object Scala02_TestMatch {
  def main(args: Array[String]): Unit = {
    //匹配常量

    /*def describe(x:Any): Any = {
      x match {
        case 5 => "Int five"
        case "hello" => "String hello"
        case true => "Boolean true"
        case '+' => "Char +"
        case _ => "输入不合法"
      }
    }
*/


    //匹配类型

    //接收匹配类型的语法格式，定义对应类型的变量去接收
    def describe(x: Any) = x match {

      case i: Int => "Int"
      case s: String => "String hello"
      case m: List[_] => "List"
      case c: Array[Int] => "Array[Int]"
      //如果以上case都没有匹配上的话，那么下面可以用下划线来表示默认情况，但是通过下划线没有办法获取到匹配的内容
      //如果想要获取匹配的值，那么可以定义一个变量去接收
      case someThing => "something else " + someThing
    }
    //泛型擦除，在匹配的时候和泛型无关
    //println(describe(List("a","b","c")))
    //println(describe(List(1, 2, 3)))
    //泛型擦除和数组无关，可保留泛型
    //println(describe(Array(1, 2, 3)))
    //println(describe(Array("a", "b", "c")))
    //println(describe(Array("abc")))


    //匹配数组
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90))) {
      //对一个数组集合进行遍历
      val result = arr match {
        case Array(0) => "0" //匹配Array(0) 这个数组
        case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
        case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
        case _ => "something else"
      }
      println("result = " + result)
    }
  }

}
