package com.demoexample.alogorithmsanddatastructure.alogritms

fun main() {
    minAndMax(arrayOf(1,3,5,7,9))
}

private fun minAndMax(array: Array<Int>) {
    //take one element from the array and compare the element from each element in array to get max and min

    var sum = 0L
    var min = array[0]
    var max = array[0]

    for (nos in array) {
        sum += nos
        if (nos > max){ // agar max se baara hai nos ka value
            max = nos
        }
        if (nos < min) {  //agar minimum se chota hai nos ka value
            min = nos
        }


    }
    println("${sum-max} ${sum-min}")
}

