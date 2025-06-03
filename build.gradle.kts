plugins { id("java-library") }

dependencies.constraints {
    api("org.apache.commons:commons-csv:1.14.0") {
        because("org.apache.commons.csv")
    }
    api("commons-io:commons-io:2.16.1") { because("org.apache.commons.io") }
}
