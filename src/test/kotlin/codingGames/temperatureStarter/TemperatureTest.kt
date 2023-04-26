package codingGames.temperatureStarter

import codingGames.temperatureFinished.Temperature
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TemperatureTest {

    @Test
    fun testTemperatureNoTemp() {
        var temperature = Temperature()
        assertEquals(0,temperature.checkTemperature(intArrayOf()))
    }

    // Write me a test function for this input
    // No temp -> 0
    // 10 -> 0
    // -12 -5 -137 -> -5
    // 42 -5 12 21 5 24 -> 5
    // 42 5 12 21 -5 24 -> 5
    // -5 -4 -2 12 -40 4 2 18 11 5 -> 2
}