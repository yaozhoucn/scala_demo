package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/10 19:34
  * @Desc: 集合计算初级函数
  */
object Scala11_TestFun {
  def main(args: Array[String]): Unit = {
//    （1）求和
val list = List(1, 2, 3, -4, 5, 6, 7)
    println(list.sum)
//    （2）求乘积
    println(list.product)
//    （3）最大值
    println(list.max)
//    （4）最小值
    println(list.min)
//    （5）排序 sorted sortBy  sortWith
    // （5.1）按照元素大小排序
      println(list.sorted.reverse)
      println(list.sortBy(x => x))
      println(list.sortBy(elem => elem))
    // （5.2）按照元素的绝对值大小排序
    println(list.sortBy(x => x.abs))
      // _ 会获取最近表达式的元素
      println(list.sortBy(_.abs))
      //还原
      println(list.sortBy(s => s.abs).reverse)

    // （5.3）按元素大小升序排序
    list.sortWith((a:Int,b:Int)=> {a < b})
    println(list.sortWith((x, y) => (x < y)))
    // （5.4）按元素大小降序排序
    println(list.sortWith((x, y) => (x > y)))
  }

}
