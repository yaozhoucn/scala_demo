package com.atguigu.scala.chapter06

/**
 * Created by WXHang on HANG at 2021/5/31 23:38
 *
 * desc : 访问权限
 */
object Scala06_TestPrivilege {
  /**
    * java：
    * 1.private 只能在当前类中被访问
    * 2.default（默认） 当前类以及同包的其他类
    * 3.protected 当前类以及同包的其他类以及非同包的子类
    * 4.public 所有类
    *
    * scala：
    * -在scala中，类方法、属性默认就是public修饰，但是没有public关键字
    * -private
    *   私有的，只能在当前类以及伴生对象中使用
    * -protected
    *   受保护的，比Java 中的权限设置更加严格，同类、子类可以访问，同包其它类不能访问
    * -private[包名]包访问权限， 在指定的包下的其它类也可以访问
    */

}

class Person06{
  private var name:String = "zhangsan"
  protected var age:Int = 20
  private[chapter06] var sex:String = "男"
  var idCard:Int = 620523
}
