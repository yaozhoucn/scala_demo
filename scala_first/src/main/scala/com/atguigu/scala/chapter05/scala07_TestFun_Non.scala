package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/20 9:35
  *
  * desc:函数可以作为参数进行传递，匿名函数
  *
  *   --扩展函数的功能
  *   --提高函数的灵活度
  */
object scala07_TestFun_Non {
  def main(args: Array[String]): Unit = {

    //需求：提供一个函数，对数组中的元素进行处理，处理完毕后返回一个新的数组，  处理方式：数组+1
    //创建一个数组对象，var arr:Arry[Int] = Arry[1,2,3,4]

    def operationArry(arr:Array[Int],op:Int=>Int):Array[Int]={
      //遍历数组中的元素
      for (elem <- arr) yield op(elem)
    }

    def op(elem:Int):Int={
      elem +1
    }

    val newArry:Array[Int] = operationArry(Array(1,2,3,4),op)
    println(newArry.mkString(","))

    //通过匿名函数进行调用，对数据元素 * 3

    //val ints: Array[Int] = operationArry(Array(1,2,3,4),(elem:Int)=>{elem * 3})
    //至简原则
    val ints: Array[Int] = operationArry(Array(1,2,3,4),_ * 3)
    println(ints.mkString(","))

  }

}
