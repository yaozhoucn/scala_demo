package com.atguigu.scala.chapter10

import com.atguigu.scala.chapter10.Scala03_TestImplicit.Teacher

/**
 * Created by WXHang on HANG at 2022/1/20 15:42
 *
 * desc:隐式解析机制
 *
 *
 * 1）首先会在当前代码作用域下查找隐式实体（隐式方法、隐式类、隐式对象）。（一般是这种情况）
 * 2）如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。类型的作用域是
 *    指与该类型相关联的全部伴生对象以及该类型所在包的包对象。
 */
object Scala03_TestImplicit extends PersonTrait {
  def main(args: Array[String]): Unit = {

    //（1）首先会在当前代码作用域下查找隐式实体
    val teacher:Teacher = new Teacher()
    teacher.eat()
    teacher.say()

    //（2）如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。类型的作用域是指与该类型相关联的全部伴生模块，

}

class Teacher{
   def eat():Unit = {
     println("eat...")
   }
  }
}
trait PersonTrait {
  //特质也是一个类，对应特征的伴生对象object trait
}

object PersonTrait {
  // 隐式类 : 类型1 => 类型2
  implicit class Person5(user:Teacher) {

    def say(): Unit = {
      println("say...")
    }
  }
}
