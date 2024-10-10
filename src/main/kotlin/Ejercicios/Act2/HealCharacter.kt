package Ejercicios.Act2

import Ejercicios.Consola
import org.example.Combate.Character

class HealCharacter {
    fun ShowHeal(consola: Consola ,life : Int){
        val  character: Character =Character(life,10)
        consola.PrintOut("La vida del personaje es ${character.vida}")

    }
}