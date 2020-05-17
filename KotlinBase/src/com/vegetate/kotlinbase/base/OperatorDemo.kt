package com.vegetate.kotlinbase.base

/**
 * Kotlin允许我们将所有的运算符甚至其他的关键字进行重载，从而扩展这些运算符合关键字的用法
 *
 * 运算符重载需要使用的 operator 关键字
 *
 * 常用语法糖表达式和实际调用函数对照表
 *
 *  a+b      a.plus(b)
 *  a-b      a.minus(b)
 *  a*b      a.times(b)
 *  a/b      a.div(b)
 *  a%b      a.rem(b)
 *  a++      a.inc()
 *  a--      a.dec()
 *  +a       a.unaryPlus()
 *  -a       a.unaryMinus()
 *  !a       a.not()
 *  a==b     a.equals(b)
 *  a>b
 *  a<b
 *  a>=b     a.compareTo(b)
 *  a<=b
 *  a..b     a.rangeTo(b)
 *  a[b]     a.get(b)
 *  a[b]=c   a.set(b,c)
 *  a in b   a.contains(b)
 *
 *
 */
class  Money(val value:Int){
    operator fun plus(money: Money):Money{
        val sum=value+money.value
        return Money(sum)
    }
    operator fun plus(newValue: Int):Money{
        val sum=value+newValue
        return Money(sum)
    }
}
fun main(args: Array<String>) {
    val money1=Money(1)
    val money2=Money(2)
    val money3=money1+money2+3
    println(money3.value)
}