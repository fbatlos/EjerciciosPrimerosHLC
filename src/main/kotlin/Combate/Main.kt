package org.example.Combate

fun main() {
    val character1 = Character(100, 10)
    val character2 = Character(100, 20)

    var winner = ""

    while (!character2.IsDead() && !character1.IsDead()){

        character2.ReduceHeal(character1.Atack())

        if (!character2.IsDead()) {
            character1.ReduceHeal(character2.Atack())
        }

    }

    if (character1.IsDead()){winner += "El personaje2 ha ganado."}
    else{winner+="El personaje1 ha ganado."}

    println(winner)
    println("Se queda con ${character2.vida} Hp")


}