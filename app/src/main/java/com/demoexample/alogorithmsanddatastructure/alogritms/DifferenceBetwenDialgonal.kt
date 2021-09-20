package com.demoexample.alogorithmsanddatastructure.alogritms

import kotlin.math.abs

fun main(){
    val a:Array<Int> = arrayOf(1,2,9)
    val b:Array<Int> = arrayOf(4,11,6)
    val c:Array<Int> = arrayOf(1,2,15)
    val m:Array<Array<Int>> = arrayOf(a,b,c)
 println(differenceBetwenDialgonal(m))

}

private  fun differenceBetwenDialgonal(a:Array<Array<Int>>):Int{
    val size = a.size
    var d1=0
    var d2=0

    for (i in 0 until size){
        d1+=a[i][i]
        d2+=a[i][(size-1)-i]
    }
    return abs(d1-d2)
}


/*

//----------------------------------------
  println(m[0])  //a  memory address
  println(m[1])  //b  memory address
  println(m[2])  //c  memory address
 //----------------------------------------
    println(a[0]) //1
    println(m[2][2])//3
 //----------------------------------------
*/
