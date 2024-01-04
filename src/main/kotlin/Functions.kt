import kotlin.math.PI

class Functions {
    init {
        // lambda function
        println({string:String->string.uppercase()}("hello world"))
        println(circleArea2(5))
        println(sum(8, 4))
        printMessageWithPrefix(prefix = "Log", message = "Hello")
        printMessageWithPrefix("Hello", "Log")
        // [Log] Hello

        // Function called only with message parameter
        printMessageWithPrefix("Hello")
        // [Info] Hello
    }
//    fun printMessageWithPrefix(message: String, prefix: String) {
//        println("[$prefix] $message")
//    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int) = x + y


    fun circleArea(radius: Int): Double {
        // Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
        return PI * radius * radius
    }

    // Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
    fun circleArea2(radius: Int): Double = PI * radius * radius
    //lambda function
    fun uppercaseString(string: String): String {
        return string.uppercase()
    }

}