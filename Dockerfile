FROM eclipse-temurin:17-jdk-alpine as build
COPY . .
RUN ./gradlew bootJar

FROM eclipse-temurin:17-jdk-alpine
COPY build/libs/*.jar kshop-server.jar
ENTRYPOINT ["java","-jar","/kshop-server.jar"]
EXPOSE 8080
