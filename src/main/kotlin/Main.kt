fun main(args: Array<String>) {
    //display variable types
    variableTypes();

    println("Hello World!")
    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    var customers = 8
    var customer1 = 10 // There are 10 customers in the queue
    val customer2 = 10
    println("There are $customers customers")
    // There are 10 customers

    println("There are ${customers + 1} customers")
    // There are 11 customers
    // Some customers leave the queue

    println(customer1)
    println(customer2)
    println(customers);
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
fun variableTypes(){ // Variable declared without initialization
    val d: Int
    // Variable initialized
    d = 3
    val a = 1000
    val b = "log message"
    val c = 3.14
//    val d = 100_000_000_000_000
    val g = false
    val f = '\n'
    // Variable explicitly typed and initialized
    val e: String = "hello"

    // Variables can be read because they have been initialized
    println(d) // 3
    println(e)
 //hello
}

fun listCollections(){
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes);
// [triangle, square, circle]
 }
fun setCollections(){}
fun mapsCollections(){

}