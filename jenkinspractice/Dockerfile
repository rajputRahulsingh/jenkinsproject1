FROM maven:3.9.6-eclipse-temurin-21

WORKDIR /app

RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    chromium-browser \
    chromium-chromedriver \
    && rm -rf /var/lib/apt/lists/*

COPY . .

RUN mvn clean install -DskipTests

CMD ["mvn","test"]