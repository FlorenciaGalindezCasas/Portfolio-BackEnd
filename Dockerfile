FROM amazoncorretto:19-alpine-jdk

MAINTAINER Florencia

COPY target/galindez.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
