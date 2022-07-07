FROM openjdk:8
ADD ./target/swagger-spring-1.0.0.jar /usr/src/swagger-spring-1.0.0.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "swagger-spring-1.0.0.jar"]
