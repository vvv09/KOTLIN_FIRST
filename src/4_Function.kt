fun main() {
    println(testSimple()) //10
    println(testSimpleLessCode()) //10
    println(testSimpleKotlinGuessType(4, 6)) //10
    println(testString(10))
    println(testNamedArguments(z = 3, x = 1, y = 2)) // переменные переданны в другом порядке, нежели объявлены в сигнатуре метода, поэтому указаны явно
    testDefaultArguments()
    testVararg(1, 2, 3, 4, 5, 6, 7, 8)
    //Оператор звездочка распределяет массив на аргументы, например
    testVararg(*intArrayOf(1, 2, 3, 4), 5, 6, 7, 8) // без * не работает
}


fun testSimple(): Int {
    return 5 + 5
}
//если функция в одну строку, то можно упростить так:
fun testSimpleLessCode(): Int = 5 + 5

//язык сам догадается до типа возвращаемого значения:
fun testSimpleKotlinGuessType(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//значения по умолчанию
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(listOf(x + y))
}

//VARARG - произвольное количество отднотипных аргументов
fun testVararg(vararg numbers: Int) {
    numbers.forEach { e -> if (e%2 == 0) println(e) }
}