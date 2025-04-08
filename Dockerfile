FROM openjdk:17
WORKDIR /app
COPY target/user-service.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "/app/app.jar"]