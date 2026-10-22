fun main() {
    println("Enter numbers:")
    val line = readln()
    val parts = line.split(" ")

    var sum = 0
    for (p in parts) {
        if (p.isNotEmpty()) {
            sum += p.toInt()
        }
    }

    println("Sum = $sum")
}