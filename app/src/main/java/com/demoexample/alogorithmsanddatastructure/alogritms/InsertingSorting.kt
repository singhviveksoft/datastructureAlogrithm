package com.demoexample.alogorithmsanddatastructure.alogritms

fun main(){

   val a= arrayOf(5,4,3,1,9)
    insertion_sort(a)
    
}

fun insertion_sort(A: Array<Int>) {
    var n = A.size
    var i: Int

    for (j in 1 until n) {
        var key = A[j]
        i = j - 1
        while (i >= 0 && A[i] > key) {
            A[i + 1] = A[i]
            i--
        }
        A[i + 1] = key
    }
    
    A.forEach {
        print("$it,")
    }
}