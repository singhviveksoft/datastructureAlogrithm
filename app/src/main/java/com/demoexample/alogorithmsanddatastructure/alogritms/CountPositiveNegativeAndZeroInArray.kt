package com.demoexample.alogorithmsanddatastructure.alogritms

fun main() {
    countPositiveNegativeAndZeroInArray(arrayOf(1,2,3,-4,-5,6,0,0,0,))
}

private fun countPositiveNegativeAndZeroInArray(array: Array<Int>) {
    //its returns number of element count base on the lambada condition
    val postive = array.count { it > 0 }
    val negative=array.count { it<0 }
    val zero=array.count { it==0}

    val size=array.size.toDouble()


    println("%.6f".format(postive/size))
    println("%.6f".format(negative/size))
    println("%.6f".format(zero/size))


}


/*
private fun calculateDialognalDifference() {
    val a = arrayOf(1, 2, 3)
    val b = arrayOf(4, 5, 6)
    val c = arrayOf(1, 2, 3)

    val array: Array<Array<Int>> = arrayOf(a, b, c)

  */
/*  println(array[0])
    println(array[1])
    println(array[2])*//*


*/
/*
    array.forEach {
        println(it[0][0])
    }
*//*

}*/
