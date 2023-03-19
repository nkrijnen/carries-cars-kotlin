package com.carriesCars.pricingEngine

import com.carriesCars.pricingEngine.Duration.Companion.fromString
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class DurationTest {
    @Test
    fun `Duration is at least one minute`() {
        assertFailsWith<IllegalArgumentException> {
            val lessThan1 = 0L
            Duration.ofMinutes(lessThan1)
        }
    }

    @Test
    fun `Converts from and to text`() {
        val someDuration = Duration.ofMinutes(3)
        assertEquals(someDuration, fromString(someDuration.toString()))
    }
}