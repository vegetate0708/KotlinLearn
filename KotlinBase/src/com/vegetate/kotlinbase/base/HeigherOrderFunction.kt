package com.vegetate.kotlinbase.base

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * 如果一个函数接收另外一个函数作为参数，或者返回值的类型是另外一个函数，那么该函数就称为高阶函数。
 *  kotlin在整型，字符型等类型，增加了一个函数类型的概念。函数类型的语法基本规则如下：
 *（ String,Int） -> Unit
 */
//接收一个（Int,Int） -> Int 类型的函数作为参数
fun num1AndNum2(num1:Int,num2:Int,oper:(Int,Int)->Int):Int{
    val result=oper(num1,num2)
    return result
}

fun plus(num1: Int,num2:Int):Int{
    return num1+num2
}
fun minus(num1: Int,num2: Int):Int{
    return num1-num2
}

inline fun StringBuilder.build( block:StringBuilder.() -> Unit):StringBuilder{
    block()
    return  this
}

inline fun runRunnable(noinline block:()->Unit){
    val runnable= Runnable{
        block()
    }
    runnable.run()
}

//不适用noinline会报错
inline fun <T> mehtod(lock: Lock, noinline body: () -> T): T {
    lock.lock()
    try {
        otherMehtod(body)
        return body()
    } finally {
        lock.unlock()
    }
}

fun <T> otherMehtod(body: ()-> T){

}


fun main(args: Array<String>) {
    val num1=100
    val num2=80
    //::plus 这是一种函数引用方式的写法，表示将plus()和minus()作为参数传递给num1AndNum2()
    val result1= num1AndNum2(num1,num2,::plus)
    val result2= num1AndNum2(num1,num2,::minus)
    println("$result1"+":"+"$result2")

    val list= listOf("A","B","C")
    val result=StringBuilder().build{
        append("----")
        for ( i in list){
            append(i)
        }
        append("-----")
    }
    println(result)

    val lock = ReentrantLock()
    mehtod(lock,{"body方法体"})
}