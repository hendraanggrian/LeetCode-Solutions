plugins {
    `java-library`
    checkstyle
    jacoco
    alias(libs.plugins.maven.publish)
}

dependencies {
    checkstyle(libs.rulebook.checkstyle)

    testImplementation(libs.truth)
}
