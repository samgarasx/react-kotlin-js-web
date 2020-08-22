plugins {
    kotlin("js") version kotlinVersion
}

group = "com.github.samgarasx"
version = "0.1.0"

repositories {
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlinx")
    maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:${kotlinxHtmlJsVersion}")
    implementation("org.jetbrains:kotlin-react:${kotlinReactVersion}")
    implementation("org.jetbrains:kotlin-react-dom:${kotlinReactDomVersion}")
    implementation("org.jetbrains:kotlin-styled:${kotlinStyledVersion}")
}

kotlin {
    js {
        browser {
            binaries.executable()

            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }
        }
    }
}
