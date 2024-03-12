# Use a base image with Java installed
FROM openjdk:17-oracle 

# Set the working directory inside the container
WORKDIR /usr/src/demo

# Copy jar file from Source to Destination 
COPY .  /usr/src/demo 

# Run  jar file
CMD [ "java" , "-jar", "demo2-0.0.1-SNAPSHOT.jar"]

# open port 
EXPOSE 9002
