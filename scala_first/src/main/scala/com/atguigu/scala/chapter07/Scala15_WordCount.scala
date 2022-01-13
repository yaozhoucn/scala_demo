package com.atguigu.scala.chapter07

/**
  * @Author: HANG
  * @Date: 2022/1/13 12:43
  * @Desc:
  */
object Scala15_WordCount {
  def main(args: Array[String]): Unit = {
    //单词计数：将集合中出现的相同的单词进行计数，取计数排名前三的结果
    val stringList: List[String] = List("hello world", "hello scala", "hello big data", "hello hive kafka", "hello hive hbase", "hello Scala big data")
    /*//1.将每一个字符串转换成一个单词
    //扁平化+映射
    val strings: List[String] = stringList.flatMap(elem => elem.split(" "))
    //2.将相同的单词放置在一起
    val words: Map[String, List[String]] = strings.groupBy(word => word)
    //println(words)
    //3.对相同的单词进行计数
    val stringToInt: Map[String, Int] = words.map(elem => (elem._1, elem._2.size))
    //4.对数据进行排序
    val sortList: List[(String, Int)] = stringToInt.toList.sortWith((l, r) => {
      l._2 > r._2
    })
    println(sortList)
    //5.对排序后的结果取前三名
    val listTake: List[(String, Int)] = sortList.take(3)
    println(listTake)*/


    //1.将每个字符串转化为每个单词
    val list: List[Array[String]] = stringList.map(elem => elem.split(" "))
    val flatten: List[String] = list.flatten

    //2.将相同的单词放到一起
    val wordsMap: Map[String, List[String]] = flatten.groupBy(word => word)
    //println(wordsMap)
    //3.计算相同单词的个数
    val stringToInt: Map[String, Int] = wordsMap.map(kv => (kv._1, kv._2.size))
    //4.进行排序
    val sortWords: List[(String, Int)] = stringToInt.toList.sortWith((x, y) => {
      x._2 > y._2
    })
    //5.取前三名
    println(sortWords.take(3))

  }

}
