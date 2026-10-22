fun main() {
    print("Enter first name: ")
    val firstName = readln()

    print("Enter last name: ")
    val lastName = readln()

    print("Enter city: ")
    val city = readln()

    // Используем шаблон со вставкой выражения или переменных в одну строку с \n
    println("Name: $firstName $lastName\nCity: $city")
}