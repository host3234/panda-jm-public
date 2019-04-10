FROM java:openjdk-8-jdk
COPY target/application-1.0-SNAPSHOT.jar /application.jar
CMD java -jar application.jar
