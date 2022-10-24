FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD invoice-service-1/target/invoice*.jar /app.jar
CMD ["java","-jar","/app.jar","--spring.profiles.active=prod"]
EXPOSE 8980