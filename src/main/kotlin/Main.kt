fun main(args: Array<String>) {
    // Объекты класса
    val person = Person("Max", 30)
    val car = Car("Some brand", "Some model")
    // Обращения к свойствам и методам классов
    println(person.plus(1, 2))
    person.job = "New job"
    println(person.job)
    car.price = "Some price"
    println(car.price)

    val str = "Hello"
    str.addPrefix("World")

    // Список
    val list = listOf(1, 2, 4)
    val mutableList = mutableListOf(1, 2, 4)
    mutableList.add(0, 21)

    // Множество
    val set = setOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet.add(6)

    // Асоциативный массив
    val map = mapOf("name" to "Max", "age" to 30)
    val mutableMap = mutableMapOf("name" to "Max", "age" to 30)
}

// Первичный конструктор
class Person(val name: String, val age: Int) {
    // Геттер и сеттер
    var job = "Some job"
        get() = field
        set(value) {
            field = value + " is cool"
        }

    // Метод класса
    fun plus(a: Int, b: Int): Int {
        return a + b
    }
}

class Car {
    var model = ""
    var brand = ""

    // Переменная с поздней инициализацией
    lateinit var price: String

    // Вторичный конструктор
    constructor(brand: String, model: String) {
        this.model = model
        this.brand = brand
    }
}

// Открытый класс
open class Animal(val nam: String)

// Класс, наследуемый открытый класс
class Dog(name: String) : Animal(name)

// Абстрактный класс
abstract class Shape {
    abstract fun area(): Double
}

// Интерфейс
interface Drawable {
    fun draw()
}

// Расширение для класса String
fun String.addPrefix(prefix: String) {
    println("$this $prefix")
}