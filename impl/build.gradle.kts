import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
    id("maven-publish")
}

dependencies {
    implementation(project(":api"))
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource.srcDirs)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            groupId = "me.kggilmer"
            artifactId = "thing-impl"
            version = "1.1"
            from(components["java"])
            artifact(sourcesJar.get())
        }
    }
}
