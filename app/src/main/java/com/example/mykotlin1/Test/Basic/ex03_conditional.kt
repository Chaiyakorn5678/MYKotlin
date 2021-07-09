package com.example.mykotlin1.Test.Basic

fun main() {
    var expression1 = if (true) {
        1234
    } else {
        9999
    }
    ////
    var expression2 = if (true) 1234 else 9999
    ////

    //switch case
    val name = "iBlue"
    when (name){
        "iBlue" -> {
            //todo
        }
        "cat"->{
            //todo
         }
        "red","green","blue"->{
            //todo
        }
        else->{
            println("default case???")
        }
    }

    val score = 80
    if (score>= 100){
        //todo
    } else if (score >= 50){
        //todo
    } else if (score >= 80) {
        //todo
    } else{
        //todo
    }
    /////
    when{
        score >= 100 -> {
            //todo
        }
        score >= 80 -> {
            //todo
        }
        else -> {
            //todo
        }
    }
    ////
    when (score){
        in 0..10 -> {
            //todo
        }
        in 10..58 -> {
            //todo
        }
        55,66 -> {
            //todo
        }
        else -> {
            //todo
        }
    }
    ////
    val expression3 = when("name"){
        "name"-> "iBlue"
        "age" -> 30
        else-> true
    }
    ////




}