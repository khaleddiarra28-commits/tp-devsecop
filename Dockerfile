# Étape 1 : construire le JAR avec Maven
FROM maven:3.9.2-eclipse-temurin-17 AS build
WORKDIR /app
COPY devesecops-app/pom.xml .
COPY devesecops-app/src ./src
RUN mvn clean package -DskipTests

# Étape 2 : exécuter le JAR dans une image Java légère
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/devesecops-app-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
