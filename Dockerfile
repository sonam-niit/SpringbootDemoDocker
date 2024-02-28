FROM openjdk:17

COPY ./target/SimpleRestAPI*.jar usr/app/dockerdemo.jar

WORKDIR usr/app

ENTRYPOINT ["java","-jar","dockerdemo.jar"]