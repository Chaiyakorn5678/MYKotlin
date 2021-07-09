package com.example.mykotlin1.Test.Basic

class ex01_variable {
}
// comile time
const val CONST_1 = 1150
const val CONST_2: Int = 1150
fun main() {
    // Mutable (Implicit)
    var var1 = "iBlurBlur"
    var var2 = 1234
    var var3 = true
    var var4 = 10.55f // f or F
    var var5 = 12.55
    var1 = "cat"

    // Mutable (Explicit)
    var var6: String = "iBlurBlur"
    var var7: Int = 1234
    var var8: Boolean = true
    var var9: Float = 10.55f // f or F
    var var10: Double = 12.55
    var6 = "dog"

    println("result :"+ var1 +" , "+ var6)
    //String template
    println("result : $var1 , $var6")
    println("iBlurBlur"
    + "cat lover"
    + "<3")

    println("""
        iBlurBlur
        cat lover 
        <3
        """)
    var money = 100_000_000
    println(money)

    // Tmmutable (final) (runtime)
    val val1 = "iBlurBlur" //Implicit
    //val1 = cat

    val val2: String = "iBlurBlur" //Explicit
    //val2 = cat

    val val3: String
    val3 = "iBlurBlur"

    var any1: Any = 1234
    any1 = "iBlurBlur"
    any1 = true


    println(CONST_1)
    println(CONST_2)
}