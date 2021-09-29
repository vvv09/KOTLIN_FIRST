fun main() { // точка входа как и в Java
    var a: String = "Hello"
    // a = null //- ошибка компиляции, т.к. NPE исключен в Kotlin
    a.length

    var b: String? = "Test"
    b = null // теперь null положить можно
    // b.length //- ошибка компиляции, т.к. потенциально может быть NPE

    //safe call
    b?.length //вернет длинну строки, или, если b=null, то null (никаких NPE!)

    // Elvis оперфтор - ?:
    val l = b?.length ?: -1 // если b=null, то в l запишется -1

    b = if ((0..10).random() > 5) "string" else null
    // !! - выбрасывает NPE если в переменной null
    val r = b!!.length
}