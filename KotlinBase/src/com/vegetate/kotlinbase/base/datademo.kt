package com.vegetate.kotlinbase.base

/**
 * 使用data关键字声明一个数据类
 */
data class User(val name : String, val pwd : String)

/**
 * object修饰关键的类为单例类
 */
object  Singleton{
    fun singletonTest(){
        println("单例类")
    }
}
fun main(args:Array<String>) {
    val mUser = User("kotlin","123456")
    val mUser1=User("kotlin","123456")
    println(mUser)
    println("mUser==mUser1:"+ (mUser==mUser1))
    val mNewUser = mUser.copy(name = "new Kotlin")
    println(mNewUser)
    Singleton.singletonTest()
}