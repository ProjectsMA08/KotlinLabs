fun main() {
    print("Enter age: ")
    val age = readln().toInt()

    print("Do you have a ticket (yes/no): ")
    val hasTicket = readln()

    if (age >= 12 && hasTicket == "yes") {
        println("Enter")
    } else if (age < 12) {
        println("Too young") // Возраст приоритетнее билета
    } else {
        println("Need a ticket")
    }
}