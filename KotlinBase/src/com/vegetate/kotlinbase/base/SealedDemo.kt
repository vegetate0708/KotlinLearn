package com.vegetate.kotlinbase.base



/**
 * Created by vegetable on 2019/11/6.
 */


fun main(args: Array<String>) {
    var s1=Son1("son1")
    var s2=Son2("son2")
    println(eval(s1))
}
 fun eval(expr: Son): String = when (expr) {
    is Son1 -> expr.name
    is Son2 -> expr.name
}
/**
 * 密封类
 * 密封类是用来表示受限的类继承结构
 * 密封类是不能被实例化的
 */
sealed class Son
data class Son1(val name:String):Son()
data class Son2(val name:String):Son()


fun test():()->Unit{
    var  i=3;
    return fun(){
        i++
        println(i)
    }
}

class z{
    private lateinit var study:Study
}