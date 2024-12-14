FROM openjdk:17-jdk-slim

WORKDIR /app

COPY calc-console/target/calc-console-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

CMD ["java", "-jar", "app.jar"]
