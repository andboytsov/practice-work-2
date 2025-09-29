# Используем официальный образ OpenJDK
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем Java файл
COPY HelloWorld.java .

# Компилируем Java код
RUN javac HelloWorld.java

# Запускаем приложение
CMD ["java", "HelloWorld"]