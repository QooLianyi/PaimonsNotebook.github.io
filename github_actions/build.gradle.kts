plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "com.lianyi"
version = "1.0-SNAPSHOT"

application{
    mainClass.set("com.lianyi.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // https://mvnrepository.com/artifact/org.jsoup/jsoup
    implementation("org.jsoup:jsoup:1.18.1")
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.11.0")
    // https://mvnrepository.com/artifact/org.openjdk.nashorn/nashorn-core
    implementation("org.openjdk.nashorn:nashorn-core:15.4")
    // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}