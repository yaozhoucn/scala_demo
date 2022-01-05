package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/5 17:58
  * @Desc:
  */
object Scala03_TestMulArray {
  def main(args: Array[String]): Unit = {
    //创建二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](3, 4)
    array(0)(1) = 22
    for (i <- array) {
      for (j <- i) {
        print(j+" ")
      }
      println()
    }
  }

}
