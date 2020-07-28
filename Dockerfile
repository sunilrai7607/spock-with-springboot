FROM openjdk:8-jdk-alpine
MAINTAINER Sunil Rai <sunilrai7607@gmail.com>
VOLUME /app
ARG version
ENV version_number=$version
COPY ./build/libs/spock-with-springboot-$version_number.jar spock-with-springboot.jar
ENTRYPOINT ["java", "-jar","/spock-with-springboot.jar"]