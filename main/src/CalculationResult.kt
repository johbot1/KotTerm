//CalculationResult.kt
//Author: John Botonakis
// Desc: Handles the calculations via a data class, returning the found value
//       as well as a string version of the equation

data class CalculationResult(val result: Double, val equation: String)
var tickerTape = ""

fun calculate(num1: Double, num2: Double, operator: String): CalculationResult {
    //Kotlin Case/Switch Statement
    //Now it's a "when"/""->{} statement
    return when(operator){
        "+" -> CalculationResult(num1 + num2, " $num1 + $num2 = ${num1 + num2} ")
        "-" -> CalculationResult(num1 - num2, " $num1 - $num2 = ${num1 - num2} ")
        "*" -> CalculationResult(num1 * num2, " $num1 * $num2 = ${num1 * num2} ")
        "/" -> {
            if (num2 != 0.0) {
                CalculationResult(num1 / num2, " $num1 / $num2 = ${num1 / num2} ")
            } else {
                CalculationResult(0.0, "Error: Division by zero")
            }
        }
        else -> CalculationResult(0.0, "Invalid operator")
    }
}
