package codingames.temperatureFinished

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TemperatureTest {


    @Test
    fun testNoTemperature() {
        val temperature = Temperature()
        assertEquals(0, temperature.checkTemperature(intArrayOf()))
    }

    @Test
    fun testTemperatureSimple() {
        var temperature = Temperature()
        assertEquals(1,temperature.checkTemperature(intArrayOf(1,-2,-8,4,5)))
    }

    // Write me a test function for this input 3 ,-12 -5 -137
    @Test
    fun testTemperatureSimple2() {
        var temperature = Temperature()
        assertEquals(-5,temperature.checkTemperature(intArrayOf(-12,-5,-137)),)
    }

    @Test
    fun testRightTemp() {
        val temperature = Temperature()
        assertEquals(5, temperature.checkTemperature(intArrayOf(42, -5, 12, 21, 5, 24)))
    }

    @Test
    fun testRightTemp2() {
        val temperature = Temperature()
        assertEquals(5, temperature.checkTemperature(intArrayOf(42, 5, 12, 21, -5, 24)))
    }

    @Test
    fun testComplex() {
        val temperature = Temperature()
        assertEquals(2, temperature.checkTemperature(intArrayOf(-5, -4, -2, 12, -40, 4, 2, 18, 11, 5)))
    }


}