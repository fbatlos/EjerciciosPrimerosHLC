package Ejercicios.Act4

import Ejercicios.Consola

class Teasure {

    fun GetGold(consola: Consola){
        var totalMoney=0
        for (i in 1..10){
            totalMoney+=5
        }
        consola.PrintOut("Has recogido $totalMoney")
    }

}