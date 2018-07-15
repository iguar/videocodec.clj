FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/videocodec.jar /videocodec/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/videocodec/app.jar"]
