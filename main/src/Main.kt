//Main.kt
//Author: John Botonakis
// Desc: Handles the processing of user inputs, and acts as intermediary between
//       input and calculation.

import kotlin.concurrent.thread //Used to delay the result to be able to see it.

const val running = true
      val acceptedValues = listOf(
        "+","-","/","*","H","h"
    )

//Addition: Adds two numbers together, returning their sum and the equation itself for reference
fun addition(a: Double, b: Double): Pair<Double, String> {
    val c = a + b
    val t = " $a + $b = $c "
    return Pair(c,t)
}

//Main: Begins, ends, and handles inputs for the program
fun main() {
    var tickerTape = ""
    //Introductory Information
    println("Calculator")
    println("For help, press (H) to view the FAQ")

    //Main Loop
    while (running) {
    println("Please select your operation:")
        println("""
    Addition (+)
    Subtraction (-)
    Multiplication (*)
    Division (/)
    Help (H)
    Ticker Tape (T)
    Quit (Q)
""")
//Reads in the input and saves it as a variable
    var operatorSelection = readlnOrNull()
        if (acceptedValues.contains(operatorSelection)) {
            operatorSelection = operatorSelection.toString()

//            TODO: Check if operatorSelection is a letter; implement behaviour based on that

            print("Enter your first number: ")
            val addNumberOne= readlnOrNull()?.toDoubleOrNull() ?: 0.0
            print("Enter your second number: ")
            val addNumberTwo= readlnOrNull()?.toDoubleOrNull() ?: 0.0
            val result = calculate(addNumberOne,addNumberTwo, operatorSelection)
            tickerTape += result.equation

            println("Result: ${result.result}")
            Thread.sleep(2000)



        } else if (operatorSelection.isNullOrBlank()  || !acceptedValues.contains(operatorSelection)) {
            println("Sorry what you entered was invalid. Please refer to the symbol in parentheses to choose your operation:")
            continue
        }

    }
    println("Thank you for using this calculator!")
}