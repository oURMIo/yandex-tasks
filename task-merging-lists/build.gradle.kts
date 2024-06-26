plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.home.merging"

dependencies {
    implementation(project(":common"))
}

kotlin {
    jvmToolchain(21)
}