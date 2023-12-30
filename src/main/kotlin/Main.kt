import java.awt.SystemTray

fun main(args: Array<String>) {
    val collectionController = CollectionController()
    collectionController.mapsCollections()
    collectionController.setCollections()
    collectionController.listCollections()

    //exercise 1,count two sets
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount)

    //exercise 2,
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported =  requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")

    //display variable types
    variableTypes()


    // Try adding program arguments via Run/Debug configuration.
    println("Program arguments: ${args.joinToString()}")
}

fun variableTypes() { // Variable declared without initialization
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
    println("Hello World!")
    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    var customers = 8
    var customer1 = 10 // There are 10 customers in the queue
    val customer2 = 10
    println("There are $customers customers")
    // There are 10 customers

    println("There are ${customers + 1} customers")

    println(customer1)
    println(customer2)
    println(customers)
}

