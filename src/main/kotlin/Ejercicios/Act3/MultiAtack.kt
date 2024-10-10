package Ejercicios.Act3

import Ejercicios.Consola

class MultiAtack {

    fun Ready(consola: Consola ,damage:Int){

        var totalDamage = 0

        for (i in 1..3){

            totalDamage+= damage*5

        }

        consola.PrintOut("El daño es : $totalDamage")

    }
}