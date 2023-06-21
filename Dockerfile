FROM openjdk:20
EXPOSE 8080
COPY target/*.jar springboot-psql.jar
ENTRYPOINT [ "java" ,"-jar","springboot-psql.jar"]