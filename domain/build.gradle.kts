plugins {
    `java-library`
}

dependencies {
    implementation(libs.annotations)
    api(libs.algoutils.student)
    testImplementation(libs.junit.core)
}

tasks {
    test {
        val runDir = File("build/run")
        doFirst {
            runDir.mkdirs()
        }
        workingDir = runDir
        useJUnitPlatform()
    }
}
