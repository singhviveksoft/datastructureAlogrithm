package com.demoexample.alogorithmsanddatastructure.alogritms

/*      *
        **
        ***
        ****
        *****
        ******  */

/*
        *****
        ****
        ***
        **
        *

*/

 /* ---#
  --##
  -###
  ####   */


private fun printPattern1(n:Int){
    for (i in 1..n){
        println()
        for (j in 1..i){
            print("*")
        }

    }
}

private fun printPattern2(n:Int){

    for (i in 1..n){
        println()
        for (j in n downTo i){
            print("*")

        }
    }

}

private fun printPattern3(n:Int){

    for (i in 1..n){
        for (j in n downTo i){
            if (i==j){
                for (k in 1..j){
                    print("*") }
             println()
                break

            }
            else{
                print(" ")
            }
        }

    }

}

fun main(){

//printPattern1(6)
    printPattern3(5)

}