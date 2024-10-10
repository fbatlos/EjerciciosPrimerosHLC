package Ejercicios.Act5

import Ejercicios.Consola

class LevelCharacter {

    fun ShowLevel(consola: Consola,lvel:Int){
        when{
            lvel<9 -> {consola.PrintOut("Personaje principiante.")}

            lvel in 10..20 -> {consola.PrintOut("Personaje intermedio.")}

            lvel > 20 -> {consola.PrintOut("Personaje avanzado.")}

        }
    }
}