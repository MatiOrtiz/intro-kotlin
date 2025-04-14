package com.mortiz.helloworld

//Implementar una funci´on dividir dos enteros n, m. Retornar un Float. Si m es 0, retornar NaN.
//No utilizar if o when.
var num1: Int? = null
var num2: Int? = null

fun main() {
    println("Ingrese el numerador: ")
    val input1 = readln()
    println("Ingrese el segundo denominador: ")
    val input2 = readln()
    noNulo(input1, input2)
    dividir(num1, num2)
}

fun noNulo(inp1: String, inp2: String): Boolean {
    num1 = inp1.toIntOrNull()
    num2 = inp2.toIntOrNull()
    return num1!=null && num2!=null;
}

fun dividir(n: Int?, m: Int?): Float {
    var result = 0.0F
    result= (n/m)F
    return result
}
