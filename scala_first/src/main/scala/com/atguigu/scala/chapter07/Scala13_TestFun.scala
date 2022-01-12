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
    //简化(归约)
    println(list.reduce((x, y) => x - y))
    val res: Int = list.reduceLeft((a: Int, b: Int) => {
      a + b
    })
    println(res)
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))
    println(list.reduceLeft(_ - _)) //-8
    println(list.reduceRight(_ - _)) //-2

    val list2: List[Int] = List(3, 4, 7, 9)
    val res2: Int = list2.reduceRight((a: Int, b: Int) => {
      a - b
    })
    println(res2)

    //折叠
    println(list.fold(10)((a:Int,b:Int) => {a+b}))
    // List(4,3,2,1)
    //4-5 = -1 3-(-1)=4 2-4=-2 1-(-2) =3
    println(list.foldRight(5)(_ - _))

  }

}
