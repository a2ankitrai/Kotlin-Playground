fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
//    println("Program arguments: ${args.joinToString()}")

    println(sum(2,4))
}

/***
 * Defining a simple function
 */
fun sum(a: Int, b: Int): Int{
    return a + b;
}

fun localVariables(): Int{

    val a: Int = 1;
    val b = 2;
    val c:Int

    c = 1;
    return a + b + c;
}