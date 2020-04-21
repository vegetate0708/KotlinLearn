package com.vegetate.kotlinbase.图像处理

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    var image=BufferedImage(100,100,BufferedImage.TYPE_INT_RGB)
    val h=0 .. 99
    val m=0..99
    image.apply {
        for (i in h){
            for (j in m){
                setRGB(i,j,0xff0000)
            }
        }
    }
    ImageIO.write(image,"bmp",File("a.bmp"))
}