# Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk

# Information around who maintains the image
LABEL "org.opencontainers.image.authors"="siwar teyeb"

# Add the application's jar to the image
COPY target/marque-microservice-0.0.1-SNAPSHOT.jar marque-microservice-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "marque-microservice-0.0.1-SNAPSHOT.jar"]