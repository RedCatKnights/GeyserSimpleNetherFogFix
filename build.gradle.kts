plugins {
    java
}

group = "com.example"
version = "2.1.1"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.opencollab.dev/main/") }
    maven { url = uri("https://repo.opencollab.dev/maven-snapshots/") }
}

dependencies {
    // Geyserコアを 2.11.1-SNAPSHOT に変更
    compileOnly("org.geysermc.geyser:core:2.11.1-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
