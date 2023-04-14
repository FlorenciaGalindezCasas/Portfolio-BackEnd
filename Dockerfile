FROM amazoncorretto:19-alpine-jdk

MAINTAINER Florencia

COPY target/galindez.jar galindez-app.jar

ENTRYPOINT ["java","-jar","/galindez-app.jar"]
