# Jetty-Jersey-Gradle Example

Example code for getting up and running for running a lightweight REST API using Jersey on an embedded Jetty server.  THe code will built using Gradle.

## Getting Started

Build the jar
```
$ .gradlew build
```

Launch the jar
```
$ java -jar build/libs/jetty-jersey-gradle-all.jar
```

### Testing

If you are on linux and have access to curl 
```
$ curl localhost:8080/api/hello/Dean
```

Or open a browser and enter the following URL
```
http://localhost:8080/api/hello/Dean
```