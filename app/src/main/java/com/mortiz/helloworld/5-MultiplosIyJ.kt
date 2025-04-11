package com.mortiz.helloworld

fun main() {
    print("Ingrese un numero: ")
    val input1 = readln()
    val numero1: Int? = input1.toIntOrNull()
    print("Ingrese el segundo numero: ")
    val input2 = readln()
    val numero2: Int? = input2.toIntOrNull()
    print("Ingrese el tercer numero: ")
    val input3 = readln()
    val numero3: Int? = input3.toIntOrNull()

    if(numero1!=null && numero2!=null && numero3!=null)
        multiplos(numero1,numero2,numero3)
    else println("Algun caracter ingresado no es numero3")
}

fun multiplos(i:Int, j:Int, n:Int) {
    var k=1
    var num=1
    println("Los multiplos son: ")
    while(num <= n){
        println(i*k)
        num++
        println(j*k)
        num++
        k++
    }
}