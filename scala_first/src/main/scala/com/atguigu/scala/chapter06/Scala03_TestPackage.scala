package com.atguigu.scala.chapter06{
  package test01{
    object Outer{
      var outer:String = "outer"
    }
    package test02{
      object inner{
        var inner:String = "innner"
        def main(args: Array[String]): Unit = {
          //内层中的类可以直接访问外层中的类而不需要导包
          Outer
        }
      }
    }
  }
}

/**
  * Created by WXHang on HANG at 2021/5/31 16:34
  */
object Scala03_TestPackage {
  //一个源文件中，可以声明多个不同的包
  //子包中的类可以直接访问夫包中的类，而不需要进行导包


}
