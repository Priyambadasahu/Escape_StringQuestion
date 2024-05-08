# Use an existing Docker image as a base
FROM openjdk:11-slim

# Set the working directory in the container
WORKDIR /Demo Escape

# Create directory structure for the package
RUN mkdir -p com/kodnest

# Copy the Java application source code into the container at Demo Escape/com/kodnest
COPY Hy.java/Demo Escape/com/kodnest

# Compile the Java application
RUN javac com/kodnest/Hy.java

# Define the default command to run the Java application
CMD ["java", "-classpath", ".", "com.kodnest.Hy"]