package com.atguigu.scala.chapter07

/**
 * Created by WXHang on HANG at 2022/1/12 12:52
 * desc: 简化（归约）-通过指定的逻辑将集合中的数据进行聚合，从而减少数据，最终获取结果。
 *   > reduce底层调用的的是reduceLeft
 *   > 函数参数类型以及返回值类型必须一致
 *   > reduceLeft 函数参数类型可以不一致
 *   > reduceRight 函数参数类型可以不一致
 *
 * -折叠
 */
object Scala13_TestFun {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    //println(list.reduce((x, y) => x - y))
    val res: Int = list.reduceLeft((a: Int, b: Int) => {
      a + b
    })
    println(res)
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))
    list.reduce((a:Int, b:Int)  => {
      while(a != 4){
        a + b
      }
    })
  }

}
