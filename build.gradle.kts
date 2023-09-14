plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

    id("com.google.dagger.hilt.android") version "2.47" apply false
}
buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.47")
    }
}
