FROM anapsix/alpine-java
LABEL author="thomas phan"
WORKDIR /home
EXPOSE 8080
COPY ./target/dronelogfile-0.0.1-SNAPSHOT.jar /home/dronelogfile-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/dronelogfile-0.0.1-SNAPSHOT.jar"]