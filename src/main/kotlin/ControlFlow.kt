class ControlFlow {
    init {
        val d: Int
        val check = true

        if (check) {
            d = 1
        } else {
            d = 2
        }

        println(d)


        //mo ternary condition in kotlin
        val a = 1
        val b = 2
        println(if (a > b) a else b)
        //when
        val obj = "Hello"
        when (obj) {
            //Checks whether obj equals to "1"
            "1" -> println("One")
            //Checks whether obj equals to "Hello"
            "Hello" -> println("Greetings")
            else -> println("Unknown")
        }

        //using when as expression
        val result = when (obj) {
//If obj equals "1",sets result to "one"
            "1" -> "One"
            //If obj equals "Hello",sets result to "Greeting"
            "Hello" -> "Greeting"
            else -> "Unknown"
        }
        println(result)

//        when is also useful when you need to check a chain of Boolean expressions:
        val temp = 18
        val description = when {
            //If temp <  is true,sets description to "very cold"
            temp < 0 -> "very cold"
            //If temp < 10 is true,sets description to a "a bit cold"
            temp < 10 -> "a bit cold"
//If temp < 20 is true,sets description to "warm"
            temp < 20 -> "warm"
//Sets description to "hot" if no previous condition is satisfied
            else -> "hot"
        }
        println(description)
    }
}