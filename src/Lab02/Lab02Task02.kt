fun main() {
    print("Enter a: ")
    val a = readln().toInt()
    print("Enter b: ")
    val b = readln().toInt()

    val quotient = a / b              // целочисленное деление
    val remainder = a % b             // остаток
    val exact = a.toDouble() / b      // превращаем a в Double ДО деления

    println("quotient = $quotient")
    println("remainder = $remainder")
    println("exact = $exact")
}