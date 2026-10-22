fun main() {
    var choice: Int

    do {
        println("1) Hello  2) Quit")
        choice = readln().toInt()

        if (choice == 1) {
            println("Hello!")
        } else if (choice != 2) {
            println("Unknown")
        }
    } while (choice != 2)
}