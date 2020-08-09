plugins {
    kotlin("js") version kotlinVersion
}

group = "com.github.samgarasx"
version = "0.1.0"

repositories {
    mavenCentral()
    jcenter()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlinx")
    }
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
    }
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))

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
