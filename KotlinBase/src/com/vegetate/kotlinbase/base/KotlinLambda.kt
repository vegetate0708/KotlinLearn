package com.vegetate.kotlinbase.base

import java.util.*


fun main(args: Array<String>) {
    val names= listOf<String>("tom","jake","lucye")
    val lambda1={ name:String -> print(name+":") }
    //第一种方法
    names.forEach(lambda1)
    //首先，不需要专门定义一个lambda变量，可以直接将lambda表达式传入函数
    names.forEach({name:String -> print(name+":")})
    //如果是最后一个参数可以放外面
    names.forEach(){name:String -> print(name+":")}
    //如果是唯一参数时可以省略括号
    names.forEach{name:String -> print(name+":")}
    //kotlin的类型推导机制，可以在大多数情况下不用声明类型
    names.forEach{name -> print(name+":")}
    //当参数列表只有一个参数时，可以用it关键字来代替
    names.forEach{ println(it)}

    val names2=names.map{it.toUpperCase()}
    names2.forEach{ println(it)}

    val names3=names.filter { it.length<=4 }.map{it.toUpperCase()}
    names3.forEach{ println(it)}

    println( names2.maxBy {it.length})
    println(女生团.filter {
        (it.age>20)and (it.height>160)
    })
    Thread(object:Runnable{
        override fun run() {
            print(1)
        }
    }).start()
    //简写1
    Thread(Runnable { print(1) }).start()
    //简写2
    Thread{ print(1)}.start()

    doStudy()
}
data class Girl(var name: String,var age:Int,var height:Int,var address:String)

class  Study {
    fun doHomeWork(){
        print("doWork")
    }
    fun readBooks(){
        print("readBook")
    }
}

var study:Study?=null
fun doStudy(){
//    if (study!=null){
//        study.doHomeWork()
//        study.readBooks()
//    }
    //与上面的代码一样
    study?.let{
        study ->
        study.doHomeWork()
        study.readBooks()
    }
}

var 女生团= listOf<Girl>(
        Girl("小芳1",18,160,"湖北"),
        Girl("小芳2",22,163,"河南"),
        Girl("小芳3",28,156,"河北"),
        Girl("小芳4",19,162,"山东"),
        Girl("小芳5",38,170,"贵州"),
        Girl("小芳6",32,175,"广东"),
        Girl("小芳7",25,180,"浙江"),
        Girl("小芳8",30,165,"福建")
)