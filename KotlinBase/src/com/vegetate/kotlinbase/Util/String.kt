package com.vegetate.kotlinbase.Util

import java.util.*

fun String.lettersCount():Int{
    var count=0
    for (char in this){
        if (char.isLetter()){
            count++
        }
    }
    return count
}

operator fun String.times(n:Int)=repeat(n)

fun main(args: Array<String>) {
   val s="ZZXXllll2222".lettersCount()
   println(s)
    val numbel=Random().nextInt(10)
    val zjy="zjy"* numbel
    println(zjy)
}