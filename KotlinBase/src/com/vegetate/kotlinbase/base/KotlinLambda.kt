package com.vegetate.kotlinbase.base

var lamada1={ name:String -> println(name) }
fun main(args: Array<String>) {
    val names= listOf<String>("tom","jake","lucy")
    //第一种方法
    names.forEach(lamada1)
    //第二种
    names.forEach{
        a -> println(a)
    }
    //第二种的简洁形式
    names.forEach{
        println(it)
    }

   println( names.maxBy { it.length })


    println(女生团.filter {
        (it.age>20)and (it.height>160)
    })
}
data class Girl(var name: String,var age:Int,var height:Int,var address:String)
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