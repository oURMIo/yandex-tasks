plugins {
    kotlin("jvm") version "1.9.23"
    application
}

version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")

    java.sourceCompatibility = JavaVersion.VERSION_21
    java.targetCompatibility = JavaVersion.VERSION_21

    repositories {
        mavenCentral()
    }

    kotlin {
        jvmToolchain(21)
    }

    dependencies {
        implementation("ch.qos.logback:logback-classic:1.5.6")
        implementation("io.github.microutils:kotlin-logging:3.0.5")
        testImplementation(kotlin("test"))
    }
}

val bankIntgTypeList = listOf(
    "task-consecutive-units",
    "task-removing-duplicates",
    "task-stones-decorations",
    "task-bracket-sequences",
    "task-anagrams",
    "task-merging-lists"
)

tasks.named("clean") {
    dependsOn(cleanMyDirectory)
}

val cleanMyDirectory by tasks.register<Delete>("cleanMyDirectory") {
    delete(file("common/out"))

    bankIntgTypeList.forEach {
        /* delete out */
        delete(file("${it}/out"))
        /* delete logs */
        delete(file("${it}/logs"))
        delete(file("${it}/src/main/resources/output.txt"))
    }
}

