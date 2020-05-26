import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    maven(url = "https://oss.jfrog.org/artifactory/oss-snapshot-local/")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.61")
    implementation("io.arrow-kt:arrow-annotations:0.10.5")
}

application {
    // Define the main class for the application.
    mainClassName = "patternmatch.AppKt"
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xplugin=/Users/mattmoore/source/arrow-meta/compiler-plugin/build/libs/compiler-plugin-1.3.61-SNAPSHOT.jar")
    }
}
