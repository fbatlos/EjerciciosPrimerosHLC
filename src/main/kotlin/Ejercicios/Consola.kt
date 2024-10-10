package Ejercicios

class Consola {

    fun PrintOut(text:String,line:Boolean = true){
        if (!line){
            print(text)
        }else{
            println(text)
        }

    }
}