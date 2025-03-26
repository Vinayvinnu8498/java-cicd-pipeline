# Use a Java base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the local directory contents into the container at /app
COPY . /app

# Compile the Java code
RUN javac MathUtils.java MathUtilsApplication.java

# Set the command to run your app
CMD ["java", "-cp", "out", "myapp.MathUtilsApplication"]
