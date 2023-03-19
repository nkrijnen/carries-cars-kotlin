package com.carriesCars.pricingEngine

import com.carriesCars.pricingEngine.Duration.Companion.ofMinutes
import org.joda.money.CurrencyUnit
import org.joda.money.Money
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PricingEngineTest {
    @Test
    fun `CalculatePrice charged per minute`() {
        val pricingEngine = PricingEngine()
        val duration = ofMinutes(1)
        val pricePerMinute = Money.of(CurrencyUnit.EUR, 0.30)
        val actual = pricingEngine.calculatePrice(duration, pricePerMinute)
        assertEquals(pricePerMinute, actual)
    }
}