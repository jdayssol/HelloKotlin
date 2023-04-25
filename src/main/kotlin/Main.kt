fun main(args: Array<String>) {
    println("Hello Kotlin!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val myAge : Int = 37
    val isTeenager : Boolean
    if(myAge <= 19 && myAge >= 13 ){
        isTeenager = true
    }else{
        isTeenager = false
    }
    println("isTeenager $isTeenager");
}