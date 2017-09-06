1. How to run in Docker container 
mvn clean package docker:build
2. How to run in console without Docker container
mvn package && java -jar target/springboot-docker-0.0.1-SNAPSHOT.jar