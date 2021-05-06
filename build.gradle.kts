plugins {
    java
    scala
    application
    groovy
    kotlin("jvm") version "1.4.32"
    jacoco
    pmd
//  checkstyle
}

repositories {
    mavenCentral()
}

dependencies{
    implementation("junit:junit:4.13.1")
    implementation("commons-io:commons-io:+")
    implementation("org.scala-lang:scala-library:2.12.2")      //SCALA
    implementation("org.codehaus.groovy:groovy-all:2.4.15")    //GROOVY
    implementation(kotlin("script-runtime"))                            //KOTLIN-kts

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

application {
    mainClass.set("tmp.pippo.plutp.paperinp.Main")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.named<Javadoc>("javadoc") {
    group = "Documentation"
    description = ("Generate Javadoc")
    source = sourceSets.main.get().allJava
}

jacoco {
    applyTo(tasks.run.get())
}

tasks.register<JacocoReport>("applicationCodeCoverageReport") {
    executionData(tasks.run.get())
    sourceSets(sourceSets.main.get())
}