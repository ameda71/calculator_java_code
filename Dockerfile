# Use official OpenJDK base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built jar file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8085

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

