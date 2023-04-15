FROM amazoncorretto:19-alpine-jdk

COPY target/galindez.jar galindez-app.jar

ENTRYPOINT ["java", "-jar","/galindez-app.jar"]