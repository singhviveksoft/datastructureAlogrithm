package com.demoexample.alogorithmsanddatastructure.alogritms

private fun countMaxElementCountInArray(a: Array<Int>) {
    var temp = a[0]
    var count = 0
    for (i in 1 until a.size) {
/*
        if (temp >= a[i]) {
            temp = a[i]

        }
*/
        if (temp <=a[i]) {
            temp = a[i]


        }
    }
    for (j in 0..a.size - 1) {
        if (temp == a[j]) {
            count += 1
        }
    }


    a.forEach {
        print("$it,")
    }
    println()
    println(temp)
    println(count)

}

//using kotlin collections
fun count(a:Array<Int>):Int{
   var count=a.maxOrNull()
return  a.count {
    it==count
}

}

fun main() {
  //  countMaxElementCountInArray(arrayOf(18, 90, 90, 13, 90, 75, 90, 8, 90, 43))
  print(  count(arrayOf(18, 90, 90, 13, 90, 75, 90, 8, 90, 43)))
}