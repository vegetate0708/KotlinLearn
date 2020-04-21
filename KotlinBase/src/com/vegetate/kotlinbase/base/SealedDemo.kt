package com.vegetate.kotlinbase.base

/**
 * Created by vegetable on 2019/11/6.
 */
fun main(args: Array<String>) {
    var s1=Son.儿子1()
    var s2=Son.儿子1()
    var s3=Son.儿子2()
    println(s1.z)
    s1.sayHello()
    val list= listOf<Son>(s1,s2,s3)
    for (v in list){
        if (v is Son.儿子1){
            v.sayHello()
        }
    }

    var t= test()
    t()
    t()
}
/**
 * 密封类
 * 密封类是用来表示受限的类继承结构
 * 密封类是不能被实例化的
 */

sealed class Son{
    fun sayHello(){
        println("大家好")
    }
    class 儿子1():Son(){
        var z="zzz"
    }
    class 儿子2():Son(){
        var p="ppp"
    }
}

fun test():()->Unit{
    var  i=3;
    return fun(){
        i++
        println(i)
    }
}