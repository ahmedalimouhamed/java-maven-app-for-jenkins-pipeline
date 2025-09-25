# Étape 1 : utiliser un JDK léger pour exécuter l'application
FROM openjdk:17-jdk-slim

# On définit le répertoire de travail
WORKDIR /app

# Copier le jar généré par Maven (nom exact à adapter)
COPY target/mon-app-java-maven-1.0-SNAPSHOT.jar app.jar

# Port si ton app écoute quelque part (optionnel)
EXPOSE 8080

# Commande pour démarrer ton jar
ENTRYPOINT ["java","-jar","app.jar"]
