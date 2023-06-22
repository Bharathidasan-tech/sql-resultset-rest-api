FROM openjdk:8-jre-alpine

LABEL org.opencontainers.image.authors="Bharathidasan"

COPY target/sql-rest-api.jar sql-rest-api.jar

ENTRYPOINT ["java","-jar","/sql-rest-api.jar"]
