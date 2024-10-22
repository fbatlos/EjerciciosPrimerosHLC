package org.example.Combate

class Character(var vida:Int, val danio:Int) {

    var lvl = 1
    var experiene = 0
    private var inventory = mutableListOf<String>()

    fun Atack():Int{
        if (CriticDamage()){
            return danio*2
        }
        return danio
    }

    private fun CriticDamage():Boolean{
        if (danio >= 50){
            return true
        }else{
            return false
        }
    }

    fun addItem(item:String){
        inventory.add(item)
    }

    fun deleteItem(item:String){
        inventory.remove(item)
    }

    fun showItems(){
        inventory.forEach { println(it) }
    }

    fun getExperience(){
        experiene += 50

        if (experiene >= 200){
            experiene -= 200
            levelUP()
        }
    }

    fun levelUP(){
        lvl++
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