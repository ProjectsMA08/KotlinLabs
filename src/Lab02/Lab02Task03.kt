fun main() {
    print("Enter total seconds: ")
    val total = readln().toInt()

    val hours = total / 3600
    val leftover = total % 3600
    val minutes = leftover / 60
    val seconds = leftover % 60

    println("H:M:S -> $hours:$minutes:$seconds")
}