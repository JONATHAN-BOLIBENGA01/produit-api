FROM eclipse-temurin:17-jdk-alpine

LABEL authors="jonathan bolibenga"

WORKDIR /app

COPY target/produit.jar ./produit.jar

EXPOSE 8083

CMD ["java", "-jar", "produit.jar"]