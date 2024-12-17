fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    // Correct way to remove from Map
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = map.filter { it.value % 2 == 0 }.keys
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, c=3}
    
    //Alternative using a new map
    val newMap = map.filter { it.value % 2 != 0 }
    println(newMap) //Output: {a=1, c=3}
}