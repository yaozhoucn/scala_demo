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
      case someThing => "something else " + someThing
    }
    println(describe(List("a","b","c")))

  }

}
