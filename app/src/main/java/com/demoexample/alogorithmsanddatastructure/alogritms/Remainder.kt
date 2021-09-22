package com.demoexample.alogorithmsanddatastructure.alogritms

fun main(){
  println(gradingStudents(arrayOf(29,37,38,33)).joinToString())

}

private fun gradingStudents(grades: Array<Int>): Array<Int> {

   for (i in grades.indices){
       if(grades[i]>37){
           var rounded = (grades[i] + 4) / 5 * 5;
          var diff=rounded - grades[i]
           if (diff<3){
               grades[i]=rounded
           }
       }

   }

    return grades

}
