package com.vegetate.kotlinbase.base

import java.util.*

/**
 * Created by vegetable on 2019/7/16.
 */
fun main(args:Array<String>){
    var name="zz"
    val h="ss"  //val 用来定义常量，常量不能重新赋值
//    println("hello kotlin"+"::"+name+ add(1,9))
//    println(eq("and","AnD",true))
//    println(eq("and","AnD",false))
//    println(heat(null))
//    switch(9,2)
//    range(null)
//    listandset(null)
//    map(null)
   // println(fact(20000))
    println(alladd(20000,0))
}
//Unit 无返回值，也可以不写
fun add(a:Int,b:Int):Int{
    return  a+b
}

fun eq(a:String,b:String,c:Boolean):Boolean{
    return a.equals(b,c);//equals方法的第二个参数表示是否忽略大小写
}

//null值处理
fun heat(arg:String?):String{//接收一个参数为非空的值，加上问号表示参数可以为空
    //return "热"+arg
    return "热$arg"
}

//if语句缩写形式，其本来形式与java相同
fun largerNumber(num1:Int,num2:Int)=if(num1>num2) num1 else num2

/**
 *  when与java中的switch语句一样
 *  格式为  匹配值  ->  {执行逻辑}
 */
fun switch(arg:Int,number:Number){
    when(arg){
        10 -> println("满分")
        9  -> println("高分")
        8  -> println("高分")
        6  -> println("及格")
        else -> println("不及格")
    }
    // 使用is关键字进行类型匹配 相当于java里面的instanceof关键字
    when(number){
        is Int -> println("number is Int")
        is Double ->  println("number is Int")
        else -> println("number not support")
    }
}
//采用无参数形式时可以对数据处理
fun get(name:String)= when {
    name.startsWith("李")-> 90
    name == "梅梅" -> 88
    else -> 0
}

/**
 * for-in 循环
 */
fun range(arg:String?){
    var nums=1 .. 15 //声明数组
    for (num in nums){ //for循环
        println(num)
    }
    var nums1=nums.reversed()//数组顺序反转
    for (num in nums1){ //for循环
        println(num)
    }
    var nums2=1 until 10 //这种写法为1-9
    for (num2 in nums2 step 2){ //for循环 间隔2
        println(num2)
    }
    //downTo 是降序关键字 将打印出10到1
    for(i in 10 downTo 1){
        println(i)
    }
}
//list集合
fun listandset(arg:String?){
    //listof setof mapof初始化的集合不能修改， 加上mutable之后才可以被修改
    val lists= listOf("1","p","k")
    val mutablelist= mutableListOf("pp")
    val sets= setOf("1","2","1")
    mutablelist.add("111")
    for (list in lists){
        println(list)
    }
    //set集合不会打印出重复元素，打印出1,2
    for (set in sets){
        println(set)
    }
    //打印出下标以及内容
    for ((i,e) in lists.withIndex()){
        println("$i $e")
    }
}
//map集合
fun map(arg: String?){
    var maps= TreeMap<String,String>()
    val map1= mapOf("100" to "完美","90" to "很好")
    maps["100分"]="满分"
    maps["80分"]="高分"
    maps["60分"]="及格"
    maps["40分"]="不及格"
    println(maps["60分"])
}

fun fact(num: Int):Int=if(num==1) 1 else num+fact(num-1)

//tailrec 尾递归优化，返回值应该为函数本身
tailrec fun alladd(num: Int,result:Int):Int{
    println("第 $num 次,结果为 $result")
    if (num==0){
        return result
    }else{
        return alladd(num-1,result+num)
    }
}

fun getText(text:String){
    val n=""
    if (n!=null){
        n.length
    }
    //想当与以上操作
    n?.length
    var a=1
    var b=1
    //var c=if (a!=null){a}else {b}
    val c=a?:b
}
fun getTextLength(text:String?)=text?.length?:0