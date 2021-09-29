fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
    testWhen(5)
}

fun testWhen(input: Any) { // Any аналогично типу Object
    when (input) {
        1 -> println("Это число один")
        in 10..20 -> println("Введено число и оно в диапазоне от 10 до 20")
        is String -> println("Котлин сам делает даункаст до String. Длина строки = ${input.length}")
        else -> println("Что-то еще")
    }
}
