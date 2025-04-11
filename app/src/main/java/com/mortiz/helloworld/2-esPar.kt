package com.mortiz.helloworld

fun main() {
    println("Ingresa un numero entero: ")
    val input = readln()
    val numero: Int? = input.toIntOrNull()
    var result: Boolean

    if (numero != null){
        result = esPar(numero)
        if (result)
            println("El numero es par.")
        else println("El numero es impar.")
    }
    else println("No ingresaste un número entero")

}

fun esPar(a:Int):Boolean {
    var result : Boolean
    if (a%2 == 0)
        result = true
    else result = false
    return result;
}