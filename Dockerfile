FROM maven:3.6.2-jdk-11-slim AS build

MAINTAINER="Pavel Seda"

COPY ./ /app
WORKDIR /app
RUN mvn clean package

FROM openjdk:11-jdk AS jdk
COPY --from=build /app/rest/target/sedaq-rest-trainining-*.jar /app/sedaq-rest.jar
COPY --from=build /app/etc/training.properties /app/etc/training.properties

WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "Dspring.config.location=/app/etc/training.properties", "-jar", "/app/sedaq-rest.jar"]
