import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
    application
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
    maven(url = "https://oss.jfrog.org/artifactory/oss-snapshot-local/")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.61")
    implementation("io.arrow-kt:arrow-annotations:0.10.5")
    implementation("com.github.jengelman.gradle.plugins:shadow:5.2.0")
    //implementation(files("/Users/mattmoore/source/arrow-meta/idea-plugin/build/libs/idea-plugin-1.3.61-SNAPSHOT.jar"))
}

application {
    // Define the main class for the application.
    mainClassName = "io.mattmoore.patternMatch.AppKt"
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf(
          "-Xplugin=/Users/mattmoore/source/arrow-meta/compiler-plugin/build/libs/compiler-plugin-1.3.61-SNAPSHOT.jar"
        )
    }
}
