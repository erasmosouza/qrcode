FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/qrcode-1.0-SNAPSHOT.jar qrcode-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "qrcode-1.0-SNAPSHOT.jar"]