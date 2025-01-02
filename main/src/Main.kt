//Main.kt
//Author: John Botonakis
// Desc: Handles the processing of user inputs, and acts as intermediary between
//       input and calculation.

const val running = true
val acceptedCalcValues = listOf(
        "+","-","/","*"
    )
val acceptedAlphaValues = listOf(
            "H","h","T","t","Q","q"
        )

//alphaBehavior: When the input is alphabetical, the behavior is changed from operations to information display.
fun alphaBehavior(input: String, tickerTape: List<String>) {
    //Ticker Tape: Print out all the past equations
    if (input == "t") {
        if (tickerTape.isEmpty()){
            println("Empty! Try running some equations!")
        }else{
            for ((index, equation) in tickerTape.withIndex()) {
                println("Equation $index): $equation")
            }
        }
        println(" ")
        Thread.sleep(2000)

    }else if (input == "h") {
        println("Welcome! This is a calculator")
        Thread.sleep(1500)
        println("To navigate, use the symbol in the parentheses next to the operation you want to use to select it")
        Thread.sleep(1500)
        println("Once in the operation, it will direct you to enter your first number, followed by the next number.")
        Thread.sleep(1500)
        println("To quit, at any time hit 'Q'!")
        Thread.sleep(1500)
        println("Happy Calculating!")
        Thread.sleep(3000)

    }
}


//Main: Begins, ends, and handles inputs for the program
fun main() {
    val tickerTape = mutableListOf<String>()
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

//Reads in the input and saves it as a variable ONLY if it's a string
    var operatorSelection = readlnOrNull().toString()
        //Validate the input; If not part of acceptedCalcValues, or acceptedAlphaValues, error out
        if (acceptedCalcValues.contains(operatorSelection)) {
            print("Enter your first number: ")
            val addNumberOne= readlnOrNull()?.toDoubleOrNull() ?: 0.0
            print("Enter your second number: ")
            val addNumberTwo= readlnOrNull()?.toDoubleOrNull() ?: 0.0
            val result = calculate(addNumberOne,addNumberTwo, operatorSelection)
            tickerTape.add(result.equation)

            println("Result: ${result.result}")
            Thread.sleep(2000)

        }else if (acceptedAlphaValues.contains(operatorSelection)) {
            operatorSelection = operatorSelection.lowercase()
            if (operatorSelection.lowercase() != "q") {
                alphaBehavior(operatorSelection, tickerTape)
            }else{
                println("Thank you for using this calculator!")
                break
            }

        }
        else if (operatorSelection.isBlank()  || !acceptedCalcValues.contains(operatorSelection)) {
            println("Sorry what you entered was invalid. Please refer to the symbol in parentheses to choose your operation:")
            continue
        }
    }
}