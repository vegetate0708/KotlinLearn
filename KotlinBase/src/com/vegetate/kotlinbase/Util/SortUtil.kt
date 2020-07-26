package com.vegetate.kotlinbase.Util

fun insertionSort(input:Array<Int>):Array<Int>{
    val maxindex=input.size-1
    /**
     * 最外层控制次数
     * 内层循环排序的次数检查
     */
//    for (i in 1..maxindex){
//        for (j in i downTo 1){
//            if (input[j]<input[j-1]){
//                var tem=input[j-1]
//                input[j-1]=input[j]
//                input[j]=tem
//            }
//        }
//    }
    for (i in 1..maxindex){
        var d=input[i]//待插入的元素
        for (j in i-1 downTo 0){
            if (input[j]>d){//从已排好的最大数依次向最小说比较d,如果比d大就将较大数往后移动一位
                input[j+1]=input[j]
                input[j]=d
            }
        }
    }
    return input
}

fun bubbleSort(input:Array<Int>):Array<Int>{
    val maxindex=input.size-1
    for (i in 1..maxindex){
        for (j in 0..maxindex-i){
            if (input[j]>input[j+1]){
                var tem=input[j]
                input[j]=input[j+1]
                input[j+1]=tem
            }
        }
    }


    return input
}

fun main(args: Array<String>) {
   var  a= arrayOf(9,4,3,7,2,5,8)
    //insertionSort(a)
    bubbleSort(a)
    for (z in a){
        println(z)
    }
}