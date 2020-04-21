package com.vegetate.kotlinbase.base

/**
 * Created by vegetable on 2019/11/6.
 */
enum class Week{
    星期一 ,星期二 ,星期三,星期四,星期五,星期六,星期天
}

fun main(args: Array<String>) {
    println(Week.星期一.ordinal)
}