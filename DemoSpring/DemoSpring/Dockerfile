FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target .
EXPOSE 8080
ENTRYPOINT ["java","-jar","/DemoSpring-0.0.1-SNAPSHOT.jar"]