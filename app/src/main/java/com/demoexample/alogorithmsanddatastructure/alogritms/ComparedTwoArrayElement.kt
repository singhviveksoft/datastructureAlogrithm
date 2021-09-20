package com.demoexample.alogorithmsanddatastructure.alogritms

fun main(){
    val t1=arrayOf(1,2,3)
    val t2= arrayOf(4,5,6)
    val result=compareaArays(t1,t2)
    println(result.joinToString(" "))
}

// array of size 3
// a array element is greater than b element array increment item1 by 1 or vice versa
private fun compareaArays(a: Array<Int>,b:Array<Int>):Array<Int> {
    var item1 = 0
    var item2 = 0

    for (i in 0..2) {

        if (a[i] < b[i]) {
            item2 = item2 + 1
        }


        if (a[i] > b[i]) {
            item1 = item1 + 1
        }


    }
    return arrayOf(item1, item2)

}


