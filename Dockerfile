FROM openjdk:17-jdk
WORKDIR /app
COPY target/math-utils-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
