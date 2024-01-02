class ControlFlow {
    init {
        ranges()

    }

    fun ifAndWhen() {
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

    fun ranges() {
        for (number in 1..5) {
            println(number)
        }
    }

    fun forControl() {
        val cakes = listOf("carrot", "cheese", "chocolate")

        for (cake in cakes) {
            println("Yummy, it's a $cake cake!")
        }
    }

    fun whileControl() {
        var cakesEaten = 0
        while (cakesEaten < 3) {
            println("Eat a cake")
            cakesEaten++
        }
    }

    fun doWhile() {
        var cakesEaten = 0
        var cakesBaked = 0
        while (cakesEaten < 3) {
            println("Eat a cake")
            cakesEaten++
        }
        do {
            println("Bake a cake")
            cakesBaked++
        } while (cakesBaked < cakesEaten)
    }

    fun ex1() {
        var pizzaSlices = 0
        while (pizzaSlices < 7) {
            pizzaSlices++
            println("There's only $pizzaSlices slice/s of pizza :(")
        }
        pizzaSlices++
        // End refactoring here
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    }

    fun ex2() {
// Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed to output.
        val button = "A"

        println(
            when (button) {
                "A" -> "Yes"
                "B" -> "No"
                "X" -> "Menu"
                "Y" -> "Nothing"
                else -> "There is no such button"
            }
        )
    }


    fun ex3() {
// Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz". Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
        for (number in 1..100) {
            println(
                when {
                    number % 15 == 0 -> "fizzbuzz"
                    number % 3 == 0 -> "fizz"
                    number % 5 == 0 -> "buzz"
                    else -> {
                        number.toString()
                    }
                }
            )
        }
    }

    fun ex4() {
        //You have a list of words. Use for and if to print only the words that start with the letter l
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        for (w in words) {
            println(w.startsWith('l'))
        }
    }

}