import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("com.ncorti.ktfmt.gradle") version "0.8.0"
    application
}

repositories {
    mavenCentral()
    mavenLocal()
}

allprojects { repositories { maven("https://jitpack.io") } }

buildscript {
    repositories {
        maven("https://packages.confluent.io/maven/")
        maven("https://plugins.gradle.org/m2/")
        maven("https://jitpack.io")
    }
}

group = "de.otto.search.di"
version = "0.0.1-SNAPSHOT"

val javaVersion = JavaVersion.VERSION_1_8

dependencies {
    // terraform
    implementation("com.hashicorp:cdktf:0.12.1")
    implementation("software.constructs:constructs:10.1.79")
    implementation("com.hashicorp:cdktf-provider-aws:9.0.15")

    // test
    testImplementation("io.kotest:kotest-runner-junit5:5.4.1")
    testImplementation("io.kotest:kotest-assertions-core:5.4.1")
    testImplementation("io.kotest.extensions:kotest-extensions-testcontainers:1.3.4")
    testImplementation("io.kotest:kotest-framework-datatest:5.4.1")
    testImplementation("io.mockk:mockk:1.12.5")
    testImplementation("org.testcontainers:localstack:1.17.3")
    testImplementation("com.amazonaws:aws-java-sdk-s3:1.12.273")
}

java {
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = javaVersion.toString()
    kotlinOptions.javaParameters = true
}

tasks.withType<Test> {
    useJUnitPlatform()
}

ktfmt {
    maxWidth.set(130)
    removeUnusedImports.set(true)
}

application {
    mainClass.set("de.otto.di.ApplicationKt")
}
