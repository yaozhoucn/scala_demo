package com.atguigu.scala.chapter08


/**
 * Created by WXHang on HANG at 2022/1/19 15:15
 *
 * desc:匹配对象(样例类)
 */
class User(var name:String,var age:Int)

//user的伴生对象创建apply方法
object User{
  //根据属性创建对象
  def apply(name: String,age: Int):User = new User(name,age)

  //根据对象获取对象的属性
  //option里面有两个子类some null
  def unapply(user: User): Option[(String, Int)] = {
    if (user == null){
       return None
    }else{
       return Some(user.name,user.age)
    }
  }
}
object Scala04_TestMatch {
  def main(args: Array[String]): Unit = {
    //创建用户对象
    val user1: User = User("cangccang", 28)

    //对对象进行模式匹配
    val res: String = user1 match {
      case User("test", 20) => "yes"
      case _ => "no"
    }
    println(res)
        }
      }

