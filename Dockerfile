FROM openjdk:17.0.2-jdk-slim-buster
COPY target/*.jar edu-tracker-entity-0.0.1.jar
ENTRYPOINT ["java", "-jar", "edu-tracker-entity-0.0.1.jar"]