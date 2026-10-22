fun main() {
    print("Enter price: ")
    val price = readln().toDouble()
    print("Enter quantity: ")
    val quantity = readln().toInt()

    var total = price * quantity
    total = total * 0.9

    println("Total after discount: $total")
}