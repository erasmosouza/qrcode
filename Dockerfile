FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/kotlin-rest-docker-1.0-SNAPSHOT.jar kotlin-rest-docker-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "kotlin-rest-docker-1.0-SNAPSHOT.jar"]