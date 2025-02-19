description = "Displays HTTPS configuration information."

zapAddOn {
    addOnName.set("HttpsInfo")
    zapVersion.set("2.11.0")

    manifest {
        author.set("ZAP Dev Team")
        url.set("https://www.zaproxy.org/docs/desktop/addons/https-info-add-on/")
    }
}

dependencies {
    implementation("com.github.spoofzu:DeepViolet:5.1.16")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.1") {
        // Provided by ZAP.
        exclude(group = "org.apache.logging.log4j")
    }
}

crowdin {
    configuration {
        val resourcesPath = "org/zaproxy/zap/extension/httpsinfo/resources/"
        tokens.set(mutableMapOf(
            "%addOnId%" to "httpsinfo",
            "%messagesPath%" to resourcesPath,
            "%helpPath%" to resourcesPath))
    }
}
