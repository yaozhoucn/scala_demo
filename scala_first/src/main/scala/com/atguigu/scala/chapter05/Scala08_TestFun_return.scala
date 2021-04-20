package com.atguigu.scala.chapter05

/**
  * Created by WXHang on HANG at 2021/4/20 11:12
  */
object Scala08_TestFun_return {
  def main(args: Array[String]): Unit = {
    def f1():(Int)=>Int = {
      var a:Int = 10
      def f2(b:Int):Int = {
        a+b
      }
      //建函数作为返回值进行返回，就是函数名称加空格加下划线
      f2 _
    }
  //调用f2,执行f1函数将返回值f2赋值给变量ff
    val ff: Int => Int = f1()

    /**
      * 闭包：内层函数f2要访问外层函数f1的局部变量a，当外层函数f1执行结束之后，f1会释放栈内存，但是会
      * 自动延长f1函数局部变量的生命周期，和内存函数形成一个闭合的效果，我们将这种闭合效果称之为闭包；
      */

    //闭包 = 外层函数的局部变量  +  内层函数
    //如果存在闭包，那么编译器会生成包含$anonfun$的字节码文件（闭包专用）

    //调用ff函数，其实就是调用f2
    println(ff(10))

    //也可以直接通过以下方式调用
    println(f1()(40))


    //以上代码可以简化为以下代码
    def f3():(Int)=> Int ={
      val b:Int = 10
      def f4(a: Int):Int={
        a + b
      }
      f4 _
    }
/*    def f4()={
      val b:Int= 10
          //使用匿名函数
      (a:Int)=>{
        a+b
      }
    }*/
    println("-----------------------------------------------------------------")

  //柯里化（简化函数的定义）
    //将一个函数中一个参数列表中红的多个参数拆分成为多个参数列表
    def f4()(a:Int):Int={
      var b:Int = 30
      a + b
    }
    println(f4()(15))
  }


}
