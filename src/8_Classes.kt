fun main() {
    val p1 = Person("Tom", "Jones", 65)
    println(p1.firstName)
    val p2 = Person("Jack", "Donn", 135, p1)

    val rect1 = Rectangle(5.0, 2.0)
    println("Perimeter is ${rect1.perimeter}")
    val rect2 = Rectangle(5.0, 2.0)
    println(rect1 == rect2) // тк автоматически создан equals

}


//Primary constructor
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() //ArrayList

    init {
        println("Инит блок отрабатывает при создании объекта после Первичного конструктора")
    }

    //Вториыный конструктор
    constructor(firstName: String, lastName: String, age: Int, child: Person):
            this(firstName, lastName, age) { //вторичный конструктор обязательно должен вызывать первичный конструктор
        children.add(child)
    }

    //Конструктор без аргументов
    constructor(): this("", "", -1)
}


//

//data - автоматически создает equals(), hashCode()
data class Rectangle(var height: Double, var length: Double) {

    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 //this.поле
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}