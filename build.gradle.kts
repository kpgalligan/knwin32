buildscript {
    repositories {
        mavenCentral()
    }

    val kotlin_version: String by rootProject
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

allprojects {
    repositories {
        mavenCentral()
    }
}

