package com.carriesCars.pricingEngine

import org.joda.money.Money

class PricingEngine {
    fun calculatePrice(duration: Duration, pricePerMinute: Money): Money =
        pricePerMinute.multipliedBy(duration.durationInMinutes)
}
