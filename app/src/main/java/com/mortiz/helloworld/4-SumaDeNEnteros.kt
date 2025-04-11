package com.mortiz.helloworld

fun main() {
     println("Ingrese un numero entero: ")
     val input = readln()
     val numero: Int? = input.toIntOrNull()

     if(numero!=null)
          println("La suma es: " + sumaEnteros(numero))
     else println("No se ingreso un entero4")
}

fun sumaEnteros(n:Int): Int {
     var suma = 0
     for(i in 1..n){
          suma+=i
     }
     return suma
}