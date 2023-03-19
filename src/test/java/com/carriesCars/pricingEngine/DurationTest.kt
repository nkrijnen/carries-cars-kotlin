package com.carriesCars.pricingEngine

import com.carriesCars.pricingEngine.Duration.Companion.fromString
import com.carriesCars.pricingEngine.Duration.Companion.ofMinutes
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class DurationTest {
    @Test
    fun `Duration is at least one minute`() {
        assertThrows(IllegalArgumentException::class.java) {
            val lessThan1 = 0L
            val duration = ofMinutes(lessThan1)
        }
    }

    @Test
    fun `Converts from and to text`() {
        val someDuration = ofMinutes(3)
        assertEquals(someDuration, fromString(someDuration.toString()))
    }
}