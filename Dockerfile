FROM openjdk:8
ADD target/springboot-docker-0.0.1.jar docker_container.jar
EXPOSE 9988
ENTRYPOINT ["java","-jar","docker_container.jar"]