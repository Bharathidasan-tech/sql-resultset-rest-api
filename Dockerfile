FROM openjdk:8-jre-alpine

LABEL org.opencontainers.image.authors="Bharathidasan"

COPY target/resultset-rest-api.jar resultset-rest-api.jar

ENTRYPOINT ["java","-jar","/resultset-rest-api.jar]
