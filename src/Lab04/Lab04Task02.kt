fun main() {
    val items = mutableListOf("milk", "bread")

    println("Enter an item:")
    val newItem = readln()
    items.add(newItem)

    items[0] = "oat milk"

    println(items)
    println("size = ${items.size}")
}