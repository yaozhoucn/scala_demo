package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/19 11:27
  *
  * desc:scala可变参数
  */
object Scala03_TestFun {
  def main(args: Array[String]): Unit = {
    //表示当前的参数个数是可变的
    def f1(s : String*):Unit={
      println(s)
      }
    f1("aaa","bbb","ccc")
    //WrappedArray(aaa, bbb, ccc)

    //参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f2(name : String = "zhangsan"):Unit={
      println(name)
    }
    f2("lisi")
    //f2()

    //带名参数
    def f4(sex : String,name : String = "zhangsan"):Unit = {
      println(name+"+++++++"+sex)
    }

    f4("男")
    f4(sex = "nv")

  }

}
