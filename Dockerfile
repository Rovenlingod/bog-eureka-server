FROM openjdk:11
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY target/bog-eureka-server-0.0.1-SNAPSHOT.jar docker-spring.jar
EXPOSE 8661
CMD ["java", "-jar", "docker-spring.jar"]