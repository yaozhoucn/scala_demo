package com.atguigu.scala.chapter06

/**
  * @Author: HANG
  * @Date: 2022/1/2 16:03
  * @Desc:  扩展
  */
class Person23{

}
object Scala23_TestExt {
  def main(args: Array[String]): Unit = {
      //创建一个person对象
      val person:Any = new String
      //any类型:有可能为传过来的对象
      //判断person是否为person23类型
      val res: Boolean = person.isInstanceOf[Person23]
      println(res)
    if (res) {
      //将any类型的对象person强制转换为person23类型  注意:强转需要存在继承关系
      val person2: Person23 = person.asInstanceOf[Person23]
    }
    //获取类型
    val clz: Class[Person23] = classOf[Person23]
    println(clz)
    val clazz: Class[_] = (new Person23).getClass
    println(clazz)
  }
}
// 枚举类
object Color extends Enumeration {
  val RED = Value(1, "red")
  val YELLOW = Value(2, "yellow")
  val BLUE = Value(3, "blue")
}
//应用类
object Test20 extends App{
  println("XXXXXXXXXXXXX")
}


//type类型可以为类型取别名
object Test21{
  type MyString = String
  private val abc: MyString = "abc"
}