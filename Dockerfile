FROM maven:3.5-alpine as constructor
COPY PersonaRest /demo
RUN cd /demo && mvn:package
FROM openjdk:8-alpine
COPY --from=constructor /demo/target/demo-0.0.1-SNAPSHOT.jar /misjars/mijar.jar
CMD java -jar /misjars/mijar.jar