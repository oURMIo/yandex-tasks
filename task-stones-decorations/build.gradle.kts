plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.home.consecutive"

dependencies {
    implementation(project(":common"))
}

kotlin {
    jvmToolchain(21)
}