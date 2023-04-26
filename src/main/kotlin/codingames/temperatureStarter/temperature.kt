package codingames.temperatureStarter

class Temperature {

    /**
     * Write a program that prints the temperature closest to 0 among input data.
     * If two numbers are equally close to zero, positive integer has to be considered closest to zero
     * (for instance, if the temperatures are -5 and 5, then display 5).
     *
     * Your program must read the data from an integer table of temperature as integers ranging from -273 to 5526
     * Output:
     * display and return 0 (zero) if no temperatures are provided. Otherwise, display and return the temperature closest to 0.
     **/
    fun  checkTemperature(tableTemp: IntArray) : Int{

        var closest= 0

        // Your code here

        println("Lowest temp is $closest");
        return closest;
    }


}

fun main(args: Array<String>) {
    val temperature = Temperature();
    temperature.checkTemperature(intArrayOf(3,-2))
}

