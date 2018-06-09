pluginManagement {
	repositories {
		gradlePluginPortal()
		maven("https://dl.bintray.com/kotlin/kotlin-dev/")
	}
	resolutionStrategy {
		eachPlugin {
			if (requested.id.id == "org.jetbrains.kotlin.jvm") {
				useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
			}
		}
	}
}

rootProject.name = "spring-fu-build"

include("bootstraps",
		"core",
		"dependencies",
		"docs",
		"modules",
		"modules:cors",
		"modules:logging",
		"modules:logging-logback",
		"modules:dynamic-configuration",
		"modules:jackson",
		"modules:mongodb",
		"modules:mongodb-coroutine",
		"modules:mustache",
		"modules:test",
		"modules:webflux",
		"modules:webflux-coroutine",
		"modules:webflux-netty",
		"modules:webflux-jetty",
		"modules:webflux-tomcat",
		"modules:webflux-undertow",
		"modules:webflux-test-common",
		"samples:coroutine-webapp",
		"samples:minimal-webapp",
		"samples:reactive-webapp")
