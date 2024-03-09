FROM openjdk:8-jre-alpine

LABEL org.opencontainers.image.authors="Bharathidasan"

COPY target/sql-resultset-rest-api.jar sql-resultset-rest-api.jar

ENTRYPOINT ["java","-jar","/sql-resultset-rest-api.jar"]
