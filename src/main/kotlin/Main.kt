

const val NAME_BOT = "Kolek"
const val DATE_OF_CREATION = "February 2023"

fun main() {
    println("Hello! My name is $NAME_BOT.")
    println("I was created in $DATE_OF_CREATION.")
    println("Please, remind me your name")
    print("> ")
    val name = readln()
    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7")
    print("> ")
    val remainder3 = readLine()!!.toInt()
    print("> ")
    val remainder5 = readLine()!!.toInt()
    print("> ")
    val remainder7 = readLine()!!.toInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")
    print("> ")
    val num = readLine()!!.toInt()
    var count = 0
    while(count in 0 ..num){
        println("$count!")
        count += 1
    }
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    while (true) {
        val answer = readLine()!!.toInt()
        if (answer == 2) break
        else println("Please, try again.")
    }
    println("Congratulations, have a nice day!")

}