FROM amazoncorretto:19-alpine-jdk

MAINTAINER Florencia

COPY out/artifacts/galindez_jar/galindez.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
