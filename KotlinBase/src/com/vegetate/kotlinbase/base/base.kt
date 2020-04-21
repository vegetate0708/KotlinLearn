package com.vegetate.kotlinbase.base

import java.util.*

/**
 * Created by vegetable on 2019/7/16.
 */
fun main(args:Array<String>){
    var name="zz"
    val h="ss"  //val 用来定义常量，常量不能重新赋值
    //h="11"
    println("hello kotlin"+"::"+name+ add(1,9) +"::"+ sub(9,6))
    println(eq("and","AnD",true))
    println(eq("and","AnD",false))
    println(heat(null))
    switch(9)
    p(null)
    list(null)
    map(null)
    println(fact(5))
    alladd(10000,0)
}
//Unit 无返回值，也可以不写
fun add(a:Int,b:Int):Int{
    return  a+b
}
fun sub(a:Int,b:Int):Int{
    return  a-b
}

fun eq(a:String,b:String,c:Boolean):Boolean{
    return a.equals(b,c);//equals方法的第二个参数表示是否忽略大小写
}

//null值处理
fun heat(arg:String?):String{//接收一个参数为非空的值，加上问号表示参数可以为空
    //return "热"+arg
    return "热${arg}"
}
//when与java中的switch语句一样
fun switch(arg:Int){
    when(arg){
        10 -> println("满分")
        9  -> println("高分")
        8  -> println("高分")
        6  -> println("及格")
        else -> println("不及格")
    }
}
fun p(arg:String?){
    var nums=1 .. 15 //声明数组
    for (num in nums){ //for循环
        println(num)
    }
    var nums1=nums.reversed()//数组顺序反转
    for (num in nums1){ //for循环
        println(num)
    }
    var nums2=1 until 100 //这种写法为1-99
    for (num2 in nums2 step 2){ //for循环 间隔2
        println(num2)
    }
}
//list集合
fun list(arg:String?){
    var lists= listOf("1","p","k")
    for (list in lists){
        println(list)
    }
    for ((i,e) in lists.withIndex()){
        println("$i $e")
    }
}
//map集合
fun map(arg: String?){
    var maps= TreeMap<String,String>()
    maps["100分"]="满分"
    maps["80分"]="高分"
    maps["60分"]="及格"
    maps["40分"]="不及格"
    println(maps["60分"])
}

fun fact(num: Int):Int{
    if (num==1){
        return 1
    }else{
        return num* fact(num-1)
    }
}
//tailrec 尾递归优化，返回值应该为函数本身
tailrec fun alladd(num: Int,result:Int):Int{
    println("第${num}次,结果为${result}")
    if (num==0){
        return 1
    }else{
        return alladd(num-1,result+num)
    }
}