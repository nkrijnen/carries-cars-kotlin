plugins {
    kotlin("jvm") version "1.6.20"
}

repositories {
    mavenCentral()
}

dependencies {
    api("org.joda:joda-money:1.0.1")
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

group = "com.carriesCars"
version = "1.0-SNAPSHOT"
description = "carries-cars-kotlin"
