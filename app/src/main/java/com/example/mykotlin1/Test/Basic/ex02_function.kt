package com.example.mykotlin1.Test.Basic

fun main() {
    nornalFuntion()
    argumentFuntion(1150,1112)
    println(returnFuntion1())
    println(returnFuntion2())
    returnFuntion3( 1150, 1122)


}

fun nornalFuntion(){
    println("nornalFuntion")
}
///////
fun argumentFuntion(x1: Int, x2: Int){
    println("sum: ${x1 + x2}")
}
///////
fun returnFuntion1(): String {
    return  "iBlurBlur"
}

fun returnFuntion2() = "iBlurBlur"

fun returnFuntion3(x1: Int, x2: Int = 0) {
    println("sum: ${x1 + x2}")

//Lamda Expression
    //val lamda1: { (Int,Int)-> x1 + x2}


}