package com.atguigu.scala.chapter09

import java.io.FileNotFoundException

/**
 * Created by WXHang on HANG at 2022/1/20 12:13
 *
 * desc:异常处理
 *
 * --java异常
 * >异常的体系结构
 *  -Throwable
 *    & Error
 *    & Exception
 *      #编译时异常
 *      #运行时异常
 *
 * > 异常处理原理
 *    程序运行过程中，如果发生了异常，那么底层会创建对应的异常类型对象，通过throw关键字将异常
 *    向上抛出；JVM会找到能够对异常处理的代码（对异常进行捕获），将异常交给对应的处理代码进行处理；
 *
 * > 异常处理的方式
 *   &：通过throws关键字声明异常，抛出
 *   &：通过try...catch进行捕获处理
 *   try{
 *   可能发生异常的代码
 *   }catch(异常类型 变量名){
 *    范围小的异常处理的代码
 *   }catch(异常类型 变量名){
 *    范围大的异常处理的代码
 *   }finally{
 *   不管是否发生异常都会执行的代码
 *   一般用于资源的释放
 *   }
 *
 *
 *   --Scala异常
 *    > Scala中不区分编译时异常与运行时异常
 *    > Scala在进行异常捕获的时候，只有一个catch块，在catch块中，通过模式匹配，来匹配不同类型的异常。
 *      而且在进行匹配的时候，就算是将大范围的异常放在前面，也不会报错，但是不建议这样做。
 *    > 通过@Throws注解标记方法可能会发生异常
 *
 */
object Scala01_TestException {
  def main(args: Array[String]): Unit = {
    try {
      10/0
      println("程序正常执行")
    }catch{
      case e:ArithmeticException => println("发生算数异常了"+e.getMessage)
      case e:Exception => println("发生异常了"+e.getMessage)
    }finally {
      //不管是否发生异常都会执行
      println("finally被执行了")
    }
    println("异常之外的代码")
  }

    //通过注解处理异常

/*  @throws(classOf[FileNotFoundException])
  def ff()={
    throw FileNotFoundException
  }*/
}
