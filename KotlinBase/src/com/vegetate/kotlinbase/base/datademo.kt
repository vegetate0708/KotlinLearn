package com.vegetate.kotlinbase.base

/**
 * 使用data关键字声明一个数据类
 */
data class User(val name : String, val pwd : String)

fun main() {
    val mUser = User("kotlin","123456")
    val mUser1=User("kotlin","123456")
    println(mUser)
    println("mUser==mUser1:"+ (mUser==mUser1))
    val mNewUser = mUser.copy(name = "new Kotlin")
    println(mNewUser)
}