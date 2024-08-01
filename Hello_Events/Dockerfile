FROM openjdk:21
EXPOSE 8091
ADD target/dockerevents.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
