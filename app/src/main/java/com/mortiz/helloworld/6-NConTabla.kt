package com.mortiz.helloworld

fun main() {
    println("Ingrese un numero entero: ")
    val input = readln()
    val numero: Int? = input.toIntOrNull()

    if(numero!=null)
        tabla12(numero)
    else println("No se ingreso un entero")
}

fun tabla12(n:Int){
    println("La tabla de multiplos es: ")
    for (i in 1..12)
        println(n*i)
}