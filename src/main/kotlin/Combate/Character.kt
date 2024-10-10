package org.example.Combate

class Character(var vida:Int, val danio:Int) {

    fun Atack():Int{
        return danio
    }

    fun ReduceHeal(ataque :Int):Int{
        vida -= ataque
        return vida
    }

    fun IsDead():Boolean{
        if (vida <= 0){
            return true
        }else{
            return false
        }
    }

}