FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} srvangular.jar
ENTRYPOINT ["java","-jar","/srvangular.jar"]
