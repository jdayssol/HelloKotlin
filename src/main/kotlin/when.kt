/**
 *
 */

fun main(args: Array<String>) {
/*
 ### when STATEMENTS
 
 Write a when statement that takes an age as an integer and prints out the life stage related to
 that age. You can make up the life stages, or use my categorization as follows: 0-2 years,
 Infant; 3-12 years, Child; 13-19 years, Teenager; 20-39, Adult;40-60, Middle aged; 61+, Elderly.
 */
val age : Int =70
    when(age){
        in 0..2 -> println("Infant")
        in 3..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle aged")
        in 61..110 -> println("Elderly")
        else -> println("Invalid Age")
    }


/*
 Write a when statement that takes a pair containing a string and an integer.
 The string is a name, and the integer is an age. Use the same cases that you used
 in the previous exercise and println out the name followed by the life stage.
 For example, for the author of these challenges, it would println out "Kevin is middle aged.".
 */

    val pair = Pair("Joseph", 37)
    val ageStatement = when(pair.second){
        in 0..2 -> ("Infant")
        in 3..12 -> ("Child")
        in 13..19 -> ("Teenager")
        in 20..39 -> ("Adult")
        in 40..60 -> ("Middle aged")
        in 61..110 -> ("Elderly")
        else -> ("Invalid Age")
    }
    print("${pair.first} is $ageStatement")


/*
 * Write a when expression using the same when(myAge) as above but
 * set the result to personsAge and then print it.
 */
    // Same as up
}
