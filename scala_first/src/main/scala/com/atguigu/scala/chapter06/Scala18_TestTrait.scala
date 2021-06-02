package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 11:48
  * Desc：类和特质
  */
object Scala18_TestTrait {
  def main(args: Array[String]): Unit = {
    /*val std1:MyStudent18 = new MyStudent18
    std1.run()
    std1.Speak()*/
    //特质的动态混入
    val std2 = new MyStudent18 with TraitCBuyBJP {
      override def buy(): Unit = {
        println("上京东买")
      }
    }
    std2.buy()
  }
}

trait TraitA{
  def run():Unit
}

trait TraitB{
  def Speak(): Unit
}

trait TraitCBuyBJP{
  def buy(): Unit
}

class Super18{}

//不存在继承关系

/*class MyClass18 extends TraitA with TraitB{
  override def run(): Unit = {

  }



  override def Speak(): Unit = ???
}*/

//存在继承关系
//先继承类，再混入特质
class MyStudent18 extends Super18 with TraitA with TraitB{
  override def run(): Unit = {
    println("跑")
  }

  override def Speak(): Unit = {
    println("说")
  }
}