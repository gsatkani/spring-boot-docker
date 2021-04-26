FROM openjdk
EXPOSE 8080  
ADD target/ust-global-wave36.jar ust-global-wave36.jar
ENTRYPOINT ["java","-jar","ust-global-wave36.jar"]

