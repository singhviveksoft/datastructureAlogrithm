package com.demoexample.alogorithmsanddatastructure.alogritms

//12 hrs to 24 hrs

fun timeConversion(s: String): String {
    // Write your code here

    var str1:String
    if (!s.substring(0,2).contains("12")&&s.contains("PM")){
        var  str=s.substring(0,2).toInt()
        str += 12
        str1=str.toString()
        str1=s.replaceRange(0..1,str1)
        str1=str1.removeRange(8..9)

    }
    else if (s.substring(0,2).contains("12")&&s.contains("AM")){

        str1=s.replaceRange(0..1,"00")
        str1=str1.removeRange(8..9)
    }

    else{
        str1=s.removeRange(8..9)
    }

    return str1

}
fun main(){
    timeConversion("12:40:22AM")
}