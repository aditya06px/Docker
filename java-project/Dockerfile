# Use a base image with Java installed
FROM openjdk:17-oracle

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code to the container
COPY Main.java /app

# Compile the Java code
RUN javac Main.java

# Set the entry point to run the Main class
ENTRYPOINT ["java", "Main"]

# you could also use this command to run java main class
# CMD ["java", "Main"]
