package com.vegetate.kotlinbase.base

/**
 * Created by vegetable on 2019/7/25.
 * 函数的声明方法
 */
fun main(args: Array<String>) {
    println(add1(7,8))
    println(add2(7))
    println(add3(y=7))
    var i={x:Int,y:Int -> x+y}
    var result=i(9,9)
    println(result)

    var j:(Int,Int)->Int={x,y->x+y}
    var result2=j(9,3)
    println(result2)

    var 周长= 获取圆周的周长(3.14159f,2f)
    println(周长)
    //默认参数的使用方式
    var 周长2= 获取圆周的周长2(直径=4f)//使用这种函数的时候要加上参数名
    println(周长2)

    val initorder=InitOrderDemo("z")
    //键盘输入交互
    println("请输入第一个数字：")
    var num1str= readLine()
    println("请输入第二个数字：")
    var num2str= readLine()
    var num1:Int=num1str!!.toInt()//加上感叹号表示不为空
    var num2:Int=num2str!!.toInt()
    println("${num1}+${num2}=${num1+num2}")



}

fun add1(x:Int,y:Int):Int=x+y
fun add2(x:Int,y:Int=1):Int=x+y
fun add3(x:Int=1,y:Int):Int=x+y
//下面是函数的默认参数和具名参数

fun 获取圆周的周长(PI:Float,半径:Float):Float{
    return 2*PI*半径
}
val pi=3.14159f
fun 获取圆周的周长2(PI:Float= pi, 直径:Float):Float{
    return PI*直径
}

class Person constructor(firstName: String){
}
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}
