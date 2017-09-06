[![Build Status](https://api.travis-ci.org/dravec/SpringAndDocked.svg?branch=master)](https://travis-ci.org/dravec/SpringAndDocked)

# Spring boot example

### How to run in Docker container 
mvn clean package && docker build -f Dockerfile -t docker-spring-boot . && docker run -p 9988:9988 docker-spring-boot
docker:build
### How to run in console without Docker container
mvn clean intsall && java -jar target/springboot-docker-0.0.1.jar
### How to check maven dependency versions
mvn versions:display-dependency-updates
