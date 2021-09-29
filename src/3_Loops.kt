fun main() {

    /* FOR EACH */

    val items = listOf("apple", "banana", "orange") // List.of() Java 9 - неизменяемый
//    mutableListOf("apple", "banana", "orange") // ArrayList - изменяемый

    for (item in items)
        println(item)


    /* WHILE */
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    /* Диапазоны (как в Python) */
    println(5 in 3..10) //лечит ли 5 в диапазоне от 3 до 10 включительно

    for (i in 1..10)
        println(i)

    for (i in 1 until 10)
        println("until : $i")

    for (i in 10 downTo 1)
        println("downTo : $i")

    for (i in 0..100 step 10)
        println("step : $i")

}
