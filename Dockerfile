FROM eclipse-temurin:17-jdk
COPY target/first-docker-app.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "first-docker-app.jar"]