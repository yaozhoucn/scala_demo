package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 15:41
  * Desc：特质叠加(解决特质冲突钻石问题)
  */
object Scala20_TestTrait {
  def main(args: Array[String]): Unit = {
    val MyOp:MyOperation20 = new MyOperation20
    println(MyOp.describe())
    val MyOp2:MyOperation20_1 = new MyOperation20_1
    println(MyOp2.describe())

  }
}


trait OPeration{
  def describe(): String = {
    "插入数据_1_"
  }
}

trait DBOperation extends OPeration{
  override def describe(): String = {
    "向MySql数据库中_2_" + super.describe()
  }
}

trait HDFSOperation extends OPeration{
  override def describe(): String = {
    "向HDFS数据库中_3_" + super.describe()
  }
}


class MyOperation20 extends DBOperation with HDFSOperation {
  override def describe(): String = {
    //这个时候super不是调用父类中的方法了，而是调用特质叠加顺序下一个节点的方法
    "我的操作是："+ super.describe()
  }
}

class MyOperation20_1 extends HDFSOperation with DBOperation {
  override def describe(): String = {
    //这个时候super不是调用父类中的方法了，而是调用特质叠加顺序下一个节点的方法
    "我的操作是："+ super.describe()
  }

  /**
    * 特质的叠加顺序
    * 第一步：列出第一个混入特质的继承关系，作为临时叠加的顺序
    *      DBOperation-->OPeration
    * 第二步：列出第二个混入特质的继承关系，并且该顺序放到临时叠加顺序的前面，已经出现的特质不再出现
    *       HDFSOperation --> OPeration   DBOperation-->OPeration
    *
    *       ===> HDFSOperation->DBOperation->OPeration
    */
}