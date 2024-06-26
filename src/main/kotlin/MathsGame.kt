import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    println("Hello,Good afternoon. What's your name?")
    var name = readLine()?.toUpperCase()
    println("Okay $name, are you ready to test your Maths skills today?")
    var answer = readln()

    if (answer == "yes") {

        var num1 = Random.nextInt(0, 100)
        var num2 = Random.nextInt(0, 100)
        var total = num1 + num2

        println("What is $num1 + $num2 ?")
        var responce = readLine()?.toIntOrNull()
        //responce?.toIntOrNull()

        while(responce != total) {
            println("Wrong answer, try agin. \n what is $num1 + $num2 ?")
            responce = readLine()?.toIntOrNull()
        }
        println("Correct!!, indeed $num1 + $num2 = $responce")

    }
    else if(answer == "no"){
        println("Alright, Come back when you are ready")
        exitProcess(0)
    }
    else{
        //while (answer != "no" && answer != "yes")
        println("We did not get your response, try again")
        //answer = readLine().toString()
    }

}