class Player(
    var name: String,
    var score: Int = 0,
    var healthPoints: Int = 100,
    var armor: Int = 0,
    var mana: Int = 100
) {
    fun rename(name: String) {
        this.name = name
    }

    fun earnPoints(points: Int) {
        this.score += points
    }

    fun takeDamage(damage: Int) {
        var realDamage = damage - this.armor
        if (realDamage < 0) realDamage = 0

        this.healthPoints -= realDamage
        if (this.healthPoints < 0) this.healthPoints = 0
    }

    fun addHealth(points: Int) {
        this.healthPoints += points
    }

    fun fly() {
        if (this.mana >= 30) {
            this.mana -= 30
            println("${this.name} полетел! Осталось маны: ${this.mana}")
        } else {
            println("Мало маны для полета!")
        }
    }

    fun heavyStrike() {
        if (this.mana >= 50) {
            this.mana -= 50
            println("${this.name} сделал сильный удар! Осталось маны: ${this.mana}")
        } else {
            println("Мало маны для сильного удара!")
        }
    }
}

fun main() {
    val player1 = Player(name = "Alia", score = 100, healthPoints = 100, armor = 5, mana = 60)

    println("Игрок: ${player1.name}, Мана: ${player1.mana}")

    player1.takeDamage(20)
    player1.earnPoints(30)
    player1.addHealth(50)

    player1.fly()
    player1.heavyStrike()

    println("Итоговый счет: ${player1.score}")
    println("Здоровье: ${player1.healthPoints}")
    println("Мана: ${player1.mana}")
}