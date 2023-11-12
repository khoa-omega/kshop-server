FROM eclipse-temurin:17-jdk-alpine as build
COPY . .
RUN chmod +x gradlew
RUN ./gradlew bootJar

FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
