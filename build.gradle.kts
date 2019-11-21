import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.50"
}

group = "br.com.trf"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}