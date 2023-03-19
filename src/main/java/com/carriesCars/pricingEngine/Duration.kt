package com.carriesCars.pricingEngine

@JvmInline
value class Duration private constructor(val durationInMinutes: Long) {

    override fun toString(): String = durationInMinutes.toString()

    companion object {
        @JvmStatic
        fun ofMinutes(length: Long): Duration {
            require(length >= 1) { "Sorry, Duration should be at least one minute." }
            return Duration(length)
        }

        @JvmStatic
        fun fromString(textRepresentation: String): Duration {
            return ofMinutes(textRepresentation.toLong())
        }
    }
}
