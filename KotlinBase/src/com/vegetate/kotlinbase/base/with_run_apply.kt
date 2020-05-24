package com.vegetate.kotlinbase.base

fun main(args: Array<String>) {
    val list= listOf("A","B","C")
    //with函数接收一个StringBuild对象和一个Lambda表达式，然后在Lambda表达式中调用对象的方法
    val result= with(StringBuilder()){
        append("----")
        for ( i in list){
            append(i)
        }
        append("-----")
        toString()
    }
    //run函数只接收一个Lambda表达式，其他与with相同
    val result2= StringBuilder().run{
        append("----")
        for ( i in list){
            append(i)
        }
        append("-----")
        toString()
    }
    //apply函数只接收一个Lambda表达式，apply函数无法指定返回值，而是自动返回调用对象本身
    val result3= StringBuilder().apply{
        append("----")
        for ( i in list){
            append(i)
        }
        append("-----")
    }
    println("result:"+result+"...result2:"+result2+"...result3:"+result3.toString())

}