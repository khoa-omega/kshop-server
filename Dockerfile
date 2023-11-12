FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY build/libs/*.jar kshop-server.jar
ENTRYPOINT ["java","-jar","/kshop-server.jar"]
EXPOSE 8080
