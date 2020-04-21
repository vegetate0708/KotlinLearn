package com.vegetate.kotlinbase.OOP

/**
 * Created by vegetable on 2019/11/5.
 */
fun main(args: Array<String>) {
    var small= SmallFather()
    //small.washing()
     Mother(small).washing()
}

interface IWashBowl{
    fun washing()
}

class BigHeadSon:IWashBowl{
    override fun washing() {
        println("大头儿子开心的洗碗，一次1块钱")
    }
}

class SmallFather:IWashBowl by BigHeadSon(){
    override fun washing() {
        println("我是小头爸爸，一次洗碗10块钱")
        BigHeadSon().washing()
        println("小头爸爸看着大头儿子洗完碗")
    }
}
//通过by 关键字将方法转移到持有对象里面去 代理
class Mother(i:IWashBowl):IWashBowl by i