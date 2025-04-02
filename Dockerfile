# Use official OpenJDK base image
FROM eclipse-temurin:17-jdk

# Set work directory
WORKDIR /app

# Copy built JAR from Jenkins Maven stage (adjust if needed)
COPY target/*.jar app.jar

# Expose the port your app runs on (change if not 8080)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
