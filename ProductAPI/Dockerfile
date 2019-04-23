FROM openjdk:8

VOLUME /tmp
ADD target/api-product.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","app.jar"]
