plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "tasks-and-solutions"

include(
    "common",
    "task-stones-decorations",
    "task-consecutive-units",
    "task-removing-duplicates",
    "task-bracket-sequences",
    "task-anagrams",
    "task-merging-lists"
)
