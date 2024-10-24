plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// Task to create JAR for layered architecture
tasks.register<Jar>("layeredJar") {
    archiveFileName.set("ColorStateEffect.jar")
    destinationDirectory.set(file("../Assignment-01-SAP/layered/plugins"))
    from(sourceSets.main.get().output) {
        include("sap/ass01/layered/**")
    }
}

// Task to create JAR for hexagonal architecture
tasks.register<Jar>("hexagonalJar") {
    archiveFileName.set("ColorStateEffect.jar")
    destinationDirectory.set(file("../Assignment-01-SAP/hexagonal/plugins"))
    from(sourceSets.main.get().output) {
        include("sap/ass01/hexagonal/**")
    }
}