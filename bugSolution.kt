fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // Improved map handling
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    val keysToRemove = map.filter { it.key > 2 }.map { it.key }
    keysToRemove.forEach { map.remove(it) }
    println(map) //Output: {1=a, 2=b}

    //Alternative solution using filter
    val map2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    val filteredMap = map2.filter { it.key <=2 }
    println(filteredMap) //Output: {1=a, 2=b}
} 