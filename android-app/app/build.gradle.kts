val releaseGroup: String by project
val releaseArtifact: String by project
val releaseVersion: String by project

plugins {
    alias(libs.plugins.android.application)
    checkstyle
    jacoco
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(libs.versions.jdk.get().toInt()))

android {
    namespace = "$releaseGroup.$releaseArtifact"
    testNamespace = "$namespace.test"
    compileSdk = libs.versions.sdk.target.get().toInt()
    defaultConfig {
        minSdk = libs.versions.sdk.min.get().toInt()
        targetSdk = libs.versions.sdk.target.get().toInt()
        version = releaseVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
        applicationId = namespace
    }
    compileOptions {
        targetCompatibility = JavaVersion.toVersion(libs.versions.jdk.get())
        sourceCompatibility = JavaVersion.toVersion(libs.versions.jdk.get())
    }
    buildTypes {
        debug {
            enableAndroidTestCoverage = true
        }
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    testOptions.unitTests.isIncludeAndroidResources = true
}

checkstyle {
    toolVersion = libs.versions.checkstyle.get()
    configFile = rootDir.resolve("rulebook_checks.xml")
}

dependencies {
    checkstyle(libs.rulebook.checkstyle)

    implementation(libs.material)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.multidex)

    testImplementation(libs.bundles.androidx.test)
}

tasks.register<Checkstyle>("checkstyle") {
    group = LifecycleBasePlugin.VERIFICATION_GROUP
    source("src")
    include("**/*.java")
    exclude("**/gen/**", "**/R.java")
    classpath = files()
}
