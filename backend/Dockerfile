# Usando imagem Quarkus JVM
#FROM quay.io/quarkus/ubi-quarkus-native-image:3.31.3
# Copiar o jar do build Maven
#COPY target/*-runner.jar /app/app.jar
# Comando para rodar
#CMD ["java","-jar","/app/app.jar"]
#FROM quay.io/quarkus/quarkus-jvm:3.31.3
#COPY target/quarkus-app/lib/ /app/lib/
#COPY target/quarkus-app/*.jar /app/
#COPY target/quarkus-app/app/ /app/app/
#COPY target/quarkus-app/quarkus/ /app/quarkus/
#WORKDIR /app
#CMD ["java", "-jar", "quarkus-run.jar"]


# Etapa 1: build do JAR
FROM maven:3.9.3-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml ./
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: imagem de runtime Java
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

COPY --from=build /app/target/quarkus-app /app/quarkus-app

# expõe a porta 8080
EXPOSE 8080

CMD ["java", "-jar", "/app/quarkus-app/quarkus-run.jar"]