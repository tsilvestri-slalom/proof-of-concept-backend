FROM public.ecr.aws/docker/library/openjdk:17-jdk-slim

WORKDIR /app

# Copy your application files here
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]