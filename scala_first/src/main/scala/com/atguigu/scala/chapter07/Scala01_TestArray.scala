package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/3 21:52
  * @Desc:
  */
object Scala01_TestArray {
  def main(args: Array[String]): Unit = {
    //创建不可变数组 方式1
    val array:Array[Int] = new Array[Int](5)
    array(1) = 10
    //创建不可变数组 方式2
    val array1: Array[Int] = Array(1, 2, 3, 4, 5)

    //访问数组的元素
    println(array(1))

    //修改数组中的数据
    array.update(1,30)
    println(array(1))

    //遍历数组中的元素
    //方式1：for循环
    for (elem:Int <- array) {
      println(elem)
    }
    //方式2：for循环
    for (elem2 <- 0 to array.length-1){
      //防止数据下标越界，数据的下标比数据的长度小1.从0开始
      //for (elem2 <- 0 until array.length)
      println(elem2)
    }
    println("********************************")
    //方式3：迭代器
    val iterator: Iterator[Int] = array.iterator
    while (iterator.hasNext){
      println(iterator.next())
    }
    //方式4：增强for循环 foreach的参数是一个函数，是对当前集合中的元素的操作
    array.foreach((elem2:Int) => {println(elem2)})
    //简写方式
    array.foreach(println(_))
    //极简方式
    array.foreach(println)

    //方式5：用指定的字符串连接数组中的元素，形成新的字符串
    println(array.mkString("*"))

    //往数据中添加元素
    //因为Array是不可变数组，所以在执行添加操作的时候，会创建新的数组对象
    val ints: Array[Int] = array.+:(30)
    println(ints.mkString("--"))

    val ints1: Array[Int] = array.:+(40)
    println(ints1.mkString("__"))
    //在Scala语言中，如果运算方法中包含冒号，并且冒号在后，运算顺序为从左到右；

    //简写
    val ints2: Array[Int] = 40 +: ints1
    println(ints2.mkString("--"))

  }


  
}
