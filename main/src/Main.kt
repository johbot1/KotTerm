//Main.kt
//Author: John Botonakis
// Desc: Handles the processing of user inputs, and acts as intermediary between
//       input and calculation.
const val running = true

const val tickerTapeSeparator = "\n"
    val acceptedValues = listOf(
        "+","-","/","*","H","h"
    )


fun addition(a: Double, b: Double): Pair<Double, String> {
    val c = a + b
    val t = " $a + $b = $c "
    return Pair(c,t)
}


fun main() {
    var tickerTape = ""
    //Introductory Information
    println("Calculator")
    println("For help, press (H) to view the FAQ")
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


        }else if (operatorSelection.isNullOrBlank()  || !acceptedValues.contains(operatorSelection)) {
            println("Sorry what you entered was invalid. Please refer to the symbol in parentheses to choose your operation:")
            continue
        }

    }
    println("Thank you for using this calculator!")
}