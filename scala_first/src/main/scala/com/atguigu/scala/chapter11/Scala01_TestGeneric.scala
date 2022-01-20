package com.atguigu.scala.chapter11

/**
 * Created by WXHang on HANG at 2022/1/20 16:38
 *
 * desc : Scala泛型
 */

class Parent{

}

class Child extends Parent{

}

class SubChild extends Child{

}
/**
 * 泛型模板
 * 不可变性
 */
//class MyList[T]{}

//泛型的协变 可以放子类
//class MyList[+T]{}

//逆变  可以放父类
class MyList[-T]{}

object Scala01_TestGeneric {
  def main(args: Array[String]): Unit = {
    var s1:MyList[Child] = new MyList[Child]
    var s2:MyList[Child] = new MyList[Parent]
    //var s:MyList[Child] = new MyList[SubChild]
    test(classOf[Child])
  }

  //泛型通配符:  下界 A 只能是child或者child的父类
  def test[A >: Child](a:Class[A]):Unit={
    println(a)
  }

}
