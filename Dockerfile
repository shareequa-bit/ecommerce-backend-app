FROM openjdk:17

COPY /target/com.ecommerce.orders-0.0.1-SNAPSHOT.jar  /usr/my-app/

WORKDIR /usr/my-app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "com.ecommerce.orders-0.0.1-SNAPSHOT.jar"]

