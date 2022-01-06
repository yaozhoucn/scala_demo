package com.atguigu.scala.chapter07

/**
 * Created by WXHang on HANG at 2022/1/6 17:56
 * desc:Map集合
 */
object Scala07_TestMap {
  def main(args: Array[String]): Unit = {
    //创建Map集合
    val map:Map[String,Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)

    //遍历map的集合中的元素
    map.foreach((kv:(String,Int)) => {
      println(kv)
    })
    //简写
    map.foreach(println)

    //获取map中的keys
    for (key<-map.keys){
      println(
        key +"-----"+map.get(key).get
      )
    }
    //在scala语言中为了防止控制针异常，如果获取的内容有可能为空，可以用Option来表示
    println(map.get("d"))

    //如果这个值为空则赋一个默认值
    println("======"+map.get("f").getOrElse(0))
    //获取map中的value
     for (value <- map.values){
       println(value)
     }
  }
}
