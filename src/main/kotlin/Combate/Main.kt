package org.example.Combate

fun main() {
    val character1 = Character(100, 30)
    val character2 = Character(100, 20)
    val character3 = Character(500, 10)

    var winner = ""

    var round = 1

    while (!character2.IsDead() && !character1.IsDead() && !character3.IsDead()) {

        character3.ReduceHeal(character1.Atack())

        character3.ReduceHeal(character2.Atack())

        if (round%2 ==0){
            character1.ReduceHeal(character3.Atack())
        }else{
            character2.ReduceHeal(character3.Atack())
        }
        round++

    }

    if (!character3.IsDead()){winner += "El personaje3 ha ganado."}
    else{winner+="El personaje 1 y personaje 2 ha ganado."}

    println(winner)
    println(character1.vida)
    println(character2.vida)
    println(character3.vida)


}