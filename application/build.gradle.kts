@Suppress("DSL_SCOPE_VIOLATION") // https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins{
    alias(libs.plugins.javafx)
}

javafx {
    version = "17.0.1"
    modules("javafx.controls")
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":infrastructure")) // TODO: runtimeOnly
    implementation(libs.flatlaf) // TODO: Remove
}
