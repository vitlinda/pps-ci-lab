plugins {
    java
    scala
    application
}

repositories {
    mavenCentral()
}

dependencies{
    implementation("commons-io:commons-io:+")
    implementation("org.scala-lang:scala-library:2.12.2")
    implementation("junit:junit:4.13.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
