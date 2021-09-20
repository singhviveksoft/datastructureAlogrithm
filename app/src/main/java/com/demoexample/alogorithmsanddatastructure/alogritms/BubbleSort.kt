package com.demoexample.alogorithmsanddatastructure.alogritms

fun main(){
    var array= arrayOf(1,0,0,-14,6,3,9,18,33,1,8,0)

    bubbleSortAcensdingOrder(array)
  //  bubbleSortDecendingOrder(array)

}





private fun bubbleSortAcensdingOrder(array: Array<Int>){
    for (element in 0 until array.size-1){
      //  println("Round $element")

        for (index in 0 until (array.size-1-element)){
            if (array[index]>array[index+1]){
                var temp=array[index]
                array[index]=array[index+1]
                array[index+1]=temp
            }
        }
    }
    array.forEach {
        print("$it,")

    }
    println()
}

private fun bubbleSortDecendingOrder(array: Array<Int>){
    for (element in 0 until array.size-1){
      //  println("Round $element")

        for (index in 0 until (array.size-1-element)){
            if (array[index]<array[index+1]){
                var temp=array[index]
                array[index]=array[index+1]
                array[index+1]=temp
            }
        }
    }
    array.forEach {
        print("$it,")
    }
    println()
}

