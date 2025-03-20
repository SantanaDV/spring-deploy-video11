# Imagen base con Java 17
FROM eclipse-temurin:17-jdk-alpine

# Copiamos el contenido del proyecto
COPY . /app
WORKDIR /app

# Damos permisos al Maven Wrapper
RUN chmod +x mvnw

# Compilamos el proyecto (omitir -DskipTests si quieres correr tests)
RUN ./mvnw clean package -DskipTests

# Configura la variable de entorno PORT si vas a usarla en Spring
EXPOSE 8080

# Arrancamos la aplicación
CMD ["java", "-jar", "target/spring-deploy-video10-1.0.jar"]
