package com.mortiz.helloworld

fun main() {
    println("Ingrese un numero entero: ")
    val input = readln()
    val num : Int ? = input.toIntOrNull()

    if (num!=null) {
        if (esPrimo(num))
            println("El numero es primo.")
        else println("El numero no es primo.")
    } else println("No se ingreso un entero.")
}

fun esPrimo(n:Int):Boolean{
    var result = true
    for(i in 1 .. n)
        if (n%i == 0 && i!=n && i!=1)
            result= false
    return result;
}