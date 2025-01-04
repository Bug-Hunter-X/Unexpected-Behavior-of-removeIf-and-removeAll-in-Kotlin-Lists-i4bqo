fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeAll { it > 2 }
    println(list2) // Output: [1, 2]
}