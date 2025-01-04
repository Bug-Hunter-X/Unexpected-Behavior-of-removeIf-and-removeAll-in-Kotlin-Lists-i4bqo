fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println("removeIf: "+ list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeAll { it > 2 }
    println("removeAll: "+list2) // Output: [1, 2]

    //More complex scenario showcasing subtle differences
    val list3 = mutableListOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    list3.removeIf { it % 2 == 0 }
    println("removeIf complex: "+list3) // Output: [1, 3, 5, 1, 3, 5]

    val list4 = mutableListOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    list4.removeAll { it % 2 == 0 }
    println("removeAll complex: "+list4)// Output: [1, 3, 5, 1, 3, 5]
    
    //Illustrating the subtle difference in the order of removal
    val list5 = mutableListOf(1,2,3,4,5,6)
    list5.removeIf{ it > 3 && it < 6 }
    println("removeIf subtle: "+list5) // Output: [1, 2, 3, 6]  It removes 4 then 5
    
    val list6 = mutableListOf(1,2,3,4,5,6)
    list6.removeAll{ it > 3 && it < 6 }
    println("removeAll subtle: "+list6) //Output: [1, 2, 3, 6] It removes both 4 and 5 at once.
}