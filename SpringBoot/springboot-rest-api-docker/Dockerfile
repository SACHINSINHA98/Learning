FROM eclipse-temurin:17

LABEL maintaner="thinkersachin@gmail.com"

WORKDIR /app

COPY target/springboot-docker-rest-api-0.0.1-SNAPSHOT.jar /app/sprinboot-docker-demo.jar

ENTRYPOINT [ "java" ,"-jar", "sprinboot-docker-demo.jar" ]

