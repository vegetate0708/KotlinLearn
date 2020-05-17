package com.vegetate.kotlinbase.Util

fun String.lettersCount():Int{
    var count=0
    for (char in this){
        if (char.isLetter()){
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
   val s="ZZXXllll2222".lettersCount()
   println(s)
}