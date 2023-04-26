package codingames.temperatureFinished

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

        // We check if the table of temperature is not empty, if it is we return 0
        var closest= 0

        // If there is only one temp, we return this one
        if(tableTemp.isNotEmpty()){
            closest = tableTemp[0]
        }
        for (i in 1 until tableTemp.size) {
            val current = tableTemp[i] // a temperature expressed as an integer

            // If the absolute value of the temperature we want to check is smaller than the closest we take it as closest, or if they are the same but it positive, we take it as the closest
            if (Math.abs(current) < Math.abs(closest) || (Math.abs(current) == Math.abs(closest) && current > closest)) {
                closest = current
            }

        }
        println("Lowest temp is $closest");
        return closest;
    }


}

fun main(args: Array<String>) {
    val temperature = Temperature();
    temperature.checkTemperature(intArrayOf(3,-2))
    temperature.checkTemperature(intArrayOf(5))
    temperature.checkTemperature(intArrayOf(1,-2,-8,4,5))

}

