fun main() {
    println("Enter text:")
    val line = readln()

    if (line.isEmpty()) {
        println("Empty input")
    } else {
        println("first = ${line[0]}")
        println("last = ${line[line.length - 1]}")
    }
}