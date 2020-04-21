package com.vegetate.kotlinbase.OOP

/**
 * Created by vegetable on 2019/10/28.
 */
fun main(args: Array<String>) {
    var s= sun()
    println("儿子的性格${s.chactor}")
    s.action()
}
//可以被继承的类必须添加open
open class father{
    var chactor:String="内向"
    open fun action(){
          println("老年人爱打牌")
    }
}

class sun: father(){//被继承的类必须加上open 关键字
   override fun action(){//重写方法加上override
       println("年轻人爱逛街")
   }
}
//接口
interface  Iman{
    fun voice()
}
//抽象类
abstract class Human{
   abstract fun eat()
}

class Man: Human(), Iman {
    override fun voice() {
        println("声音雄厚")
    }

    override fun eat() {
        println("男人大口吃饭")
    }
}