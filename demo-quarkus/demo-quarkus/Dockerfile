FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/quarkus-app .
EXPOSE 8080
ENTRYPOINT ["java","-jar","/quarkus-run.jar"]