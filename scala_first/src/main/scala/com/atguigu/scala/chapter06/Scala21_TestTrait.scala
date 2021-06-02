package com.atguigu.scala.chapter06

/**
  * Created by WXHang on HANG at 2021/6/2 16:04
  * Desc：特质自身类型
  *     1.实现了依赖注入的功能
  *     2.要求混入该特质的同时要混入特质的自身类型
  */
object Scala21_TestTrait {
  def main(args: Array[String]): Unit = {
    val userControllor = new UserControllor
    userControllor.regist(new User("atguigu",20))
  }
}
class User(var name:String,var age:Int)
//和数据打交道，完成用户crud

trait TraitA3{
  def m1():Unit = {
    println("m1")
  }
}
trait UserDao{
  _:TraitA3 =>
  def insert(user:User):Unit={
    println("insert into dataDB + " + user.name)
  }
}

trait OrderDao{

  def insert2(user:User):Unit={
    println("OrderDao" + user.name)
  }
}

//控制层（应用层）
class UserControllor extends UserDao with OrderDao with TraitA3 {
  //1.实现依赖注入功能
  //_:UserDao =>
  //可以注入多个
  //_:UserDao with OrderDao=>
  //用户注册
  def regist(user: User):Unit={
  insert(user)
  }
}
// 2.要求混入该特质的同时要混入特质的自身类型
//所有的java接口，都可以当做特质被混入
class MyClass21 extends UserDao with TraitA3{
  override def insert(user: User): Unit = super.insert(user)
}