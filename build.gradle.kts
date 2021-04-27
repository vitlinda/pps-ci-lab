plugins {
    java
    scala
    application
    groovy
    kotlin("jvm") version "1.4.32"
}

repositories {
    mavenCentral()
}

dependencies{
    implementation("commons-io:commons-io:+")
    implementation("org.scala-lang:scala-library:2.12.2")
    implementation("org.codehaus.groovy:groovy-all:2.4.15")
    implementation("junit:junit:4.13.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(kotlin("script-runtime"))

}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
