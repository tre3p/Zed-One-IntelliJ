plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.11.0"
}

group = "zed-one"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

sourceSets {
    main {
        resources.setSrcDirs(listOf("resources"))
    }
}

dependencies {
    intellijPlatform {
        local("/Applications/IntelliJ IDEA.app")
    }
}

intellijPlatform {
    publishing {
        token = providers.gradleProperty("intellijPlatformPublishingToken")
    }
}
