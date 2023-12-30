class CollectionController : MapCollectionInterface{
    override fun mapsCollections(){
        // Read-only map
        val readOnlyJuiceMenu = mapOf("apple" to 100,"kiwi" to 190, "orange" to 100)
        println(readOnlyJuiceMenu)
        // {apple=100, kiwi=190, orange=100}

        //Mutable map with explicit type declaration
        val juiceMenu:MutableMap<String,Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(juiceMenu)
        // {apple=100, kiwi=190, orange=100};
//    To prevent unwanted modifications, obtain read-only views of mutable maps by casting them to Map:
        val juiceMenus: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        val juiceMenuLocked: Map<String, Int> = juiceMenus


//    To get the number of items in a map, use the .count() function
        // Read-only map

        println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
        // This map has 3 key-value pairs
        juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map
        println(juiceMenu)
        // {apple=100, kiwi=190, orange=100, coconut=150}

        juiceMenu.remove("orange")    // Remove key "orange" from the map
        println(juiceMenu)
        // {apple=100, kiwi=190, coconut=150}

//check if key exist in map
        println(readOnlyJuiceMenu.containsKey("kiwi"))
//    To obtain a collection of the keys or values of a map

        println(readOnlyJuiceMenu.keys)
// [apple, kiwi, orange]
        println(readOnlyJuiceMenu.values)
// [100, 190, 100]

//    To check that a key or value is in a map, use the in operator:
        println("orange" in readOnlyJuiceMenu.keys)
// true
        println(200 in readOnlyJuiceMenu.values)
// false
    }

    override fun setCollections() {
        // Read-only set
        val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
        // Mutable set with explicit type declaration
        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

        println(readOnlyFruit)
        // [apple, banana, cherry]
//        prevent unwanted modifications to set
       val fruitLocked: Set<String> = fruit

        println("This set has ${readOnlyFruit.count()} items")
        // This set has 3 items
//        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        fruit.add("dragonfruit")    // Add "dragonfruit" to the set
        println(fruit)              // [apple, banana, cherry, dragonfruit]

        fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
        println(fruit)
    }

    override fun listCollections() {
        // Read only list
        val readOnlyShapes = listOf("triangle", "square", "circle")
        println(readOnlyShapes)
        // [triangle, square, circle]

        // Mutable list with explicit type declaration
        val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        println(shapes)
        // [triangle, square, circle]


        //To prevent unwanted modification to list,this is also called casting
       val shapesLocked: List<String> = shapes
//        To add or remove items from a mutable list, use .add() and .remove() functions respectively:
       // Add "pentagon" to the list
        shapes.add("pentagon")
        println(shapes)
        // [triangle, square, circle, pentagon]

        // Remove the first "pentagon" from the list
        shapes.remove("pentagon")
        println(shapes)
        // [triangle, square, circle]
    }
}