//Fizz Buzz: Escribir un programa que imprima los n´umeros del 1 al 100. Pero, para los m´ultiplos
//de 3 imprimir “Fizz” en vez del n´umero, y para m´ultiplos de 5 imprimir “Buzz”. Para los
//n´umeros que son multiples de 3 y de 5, imprimir “FizzBuzz”.

fun main() {
    println("Hola! Esta es la funcion FizzBuzz: ")
    fizzBuzz()
}

fun fizzBuzz(){
    for(i in 1..100){
        if(i%3==0 && i%5==0)
            println("FizzBuzz")
        else if(i%3==0)
            println("Fizz")
        else if (i%5==0)
            println("Buzz")
        else println(i)
    }
}