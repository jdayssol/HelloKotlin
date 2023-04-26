package concept

/**
 * Create a class named concept.Course that takes a className String parameter
 * Add a private lateinit variable for the Teacher's name
 * Then create a setTecherName function that sets that variable
 */

// Your solution here
class Course (var className : String){
    lateinit var teacherName : String

    fun initTeacherName(teacherName : String) {
        this.teacherName = teacherName
    }

}

/**
 * Add a codingGames.temperatureFinished.main function, create a concept.Course and set the teacher name
 */
fun main(args: Array<String>) {

// Your solution here
    var math = Course("Math")
    math.initTeacherName("Joseph")
    println(math.className +" " +math.teacherName)

}