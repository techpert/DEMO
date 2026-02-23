# Lightweight Java 17 runtime
FROM eclipse-temurin:17-jdk-alpine

# Create app directory
WORKDIR /app

# Copy jar
COPY target/*.jar app.jar

# Expose default Spring Boot port
EXPOSE 80

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
