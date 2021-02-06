FROM openjdk:8
ARG ENV
ENV ENV=$ENV
ADD build/libs//micservice-0.1-all.jar /micservice-0.1-all.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/micservice-0.1-all.jar"]