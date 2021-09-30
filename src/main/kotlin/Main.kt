import java.lang.NumberFormatException

fun main(args: Array<String>) {
    //val c = Calcul();
    parser(args)
    val val1 = Integer.parseInt(args[0]);
    val val2 = Integer.parseInt(args[2]);

    val result = calculate(val1, args[1], val2);
    print("Result is: $result");
    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")
}
fun calculate(val1: Int, operator: String, val2: Int): Int {

    var result = when (operator) {
        "+" -> val1 + val2
        "-" -> val1 - val2
        "*" -> val1 * val2
        "/" -> val1 / val2
        else -> 0
    }
    return result;
}
fun parser(args: Array<String>): Boolean {

    if (args.size !=3){
        throw ArrayIndexOutOfBoundsException ("Arg format is: val1 +|-|*|/ val2")
    }
    val isVal1Int = isInt(args[0])
    if (!isVal1Int){
        throw NumberFormatException ("Val1 is not int")
    }
    val isVal2Int = isInt(args[2])
    if (!isVal2Int){
        throw NumberFormatException ("Val2 is not int")
    }
    val operator = args[1]
    val val2 = Integer.parseInt(args[2]);
    if ("/" == operator && val2==0){
        throw ArithmeticException ("You cannot divide by zero!")
    }
    if ("+" == operator ||
        "-" == operator ||
        "/" == operator ||
        "*" == operator){
        return true
    } else {
        throw NumberFormatException ("Operator not found")
    }

}

fun isInt(arg: String): Boolean{

    return try {
        Integer.parseInt(arg)
        true
    } catch (NumberFormatException: Exception) {
        false
    }
}