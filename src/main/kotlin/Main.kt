import Ejercicios.Act2.HealCharacter
import Ejercicios.Act3.MultiAtack
import Ejercicios.Act4.Teasure
import Ejercicios.Consola

fun main() {

    val consola = Consola()
    var option = AskOption(consola)

    var exit = false

    while (!exit){

        when (option){
            "1" -> {consola.PrintOut("Hola,Mundo!!")}
            "2" -> {
                HealCharacter().ShowHeal(consola,100)
            }
            "3" -> {
                val numbre = AskNumber(consola,"Dime el daño que vamos amultiplicar : ")
                MultiAtack().Ready(consola,numbre)
            }
            "4" -> {
                Teasure().GetGold(consola)
            }
            "5" -> {

            }
            "6" -> {}
            "7" -> {}
            "8" -> {}
            "9" -> {}
            "10" -> {}
            "11" -> {}
            else -> {}
        }

        if (option != "11"){
            option = AskOption(consola)
        }else{
            exit = true
        }

    }

}


fun AskOption(consola: Consola):String{
    consola.PrintOut("Dime el ejercicio del 1-10 : " ,false)
    val option = readln()
    return option

}

fun AskNumber(consola: Consola,text:String): Int {
    consola.PrintOut(text,false)
    val number = readln()
    if (IsANumber(number)){
        return number.toInt()
    }else{
        return 0
    }
}

fun IsANumber(numbre:String):Boolean{
    return  numbre.all{it.isDigit()}
}