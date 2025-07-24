// Top-level build file where you can add configuration options common to all sub-projects/modules.


buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.13")
        classpath("com.github.ben-manes:gradle-versions-plugin:0.42.0")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51.1")
        classpath("gradle.plugin.com.onesignal:onesignal-gradle-plugin:0.14.0")
    }
}




plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.github.ben-manes.versions") version "0.42.0" apply false
}
