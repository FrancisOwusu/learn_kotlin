class Lambda_functions {
    init {

    }
    fun filters(){
        var numbers = listOf(1, -2, 3, -4, 5, -6)
        var positives = numbers.filter { x -> x > 0 }
        var negatives = numbers.filter { x-> x<0 }
        println(negatives)
        println(positives)
    }

    fun map(){
        val numbers = listOf(1, -2, 3, -4, 5, -6)
        val doubled = numbers.map { x -> x * 2 }
        val tripled = numbers.map { x -> x * 3 }
        println(doubled)
// [2, -4, 6, -8, 10, -12]
        println(tripled)
// [3, -6, 9, -12, 15, -18]
    }
}