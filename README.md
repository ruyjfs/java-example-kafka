# Example Java Kafka

- [Português](###Português)
- [English](###English)

Um exemplo completo de como utilizar o Kafka com Java Springboot, Avro e muito mais com todas as suas necessidades e funcionalidades do Kafka.

## Estrutura

```
📦src
 ┣ 📂main
 ┃ ┣ 📂avro
 ┃ ┃ ┗ 📜user.avsc
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂github
 ┃ ┃ ┃ ┃ ┗ 📂ruyjfs
 ┃ ┃ ┃ ┃ ┃ ┗ 📂examplejavakafka
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controllers
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜IndexController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜KafkaUsersController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂services
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜KafkaConsumerService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜KafkaProducerService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleJavaKafkaApplication.java
 ┃ ┗ 📂resources
 ┃ ┃ ┣ 📜application-dev.yml
 ┃ ┃ ┣ 📜application-local.yml
 ┃ ┃ ┗ 📜application.yml
 ┗ 📂test
 ┃ ┗ 📂java
 ┃ ┃ ┗ 📂br
 ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┗ 📂itau
 ┃ ┃ ┃ ┃ ┃ ┗ 📂workercarrinholake
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleJavaKafkaApplicationTests.java
```

### Português

## Pré Requisitos

- Java 15
- Kafka
- Docker
- Docker Compose
- IDE VSCode / InteliJ

## Setup

Para montar o ambiente Kafka com todas tecnologias necessárias, basta clonar este repositório e rodar apenas um comando conforme está no próprio README.md dele.

Link: [https://github.com/ruyjfs/example-java-kafka/tree/main/app](https://github.com/ruyjfs/example-java-kafka/tree/main/app)

## Rodando

Apenas um comando

```
./install.sh
```

---

### English

## Links

- https://docs.confluent.io/platform/current/overview.html
- https://avro.apache.org/docs/1.10.2/gettingstartedjava.html#Serializing+and+deserializing+with+code+generation
- https://developer.confluent.io/learn-kafka/spring/hands-on-cloud-schema-registry/
- https://github.com/davidmc24/gradle-avro-plugin/blob/master/README.md
- https://docs.confluent.io/platform/current/schema-registry/connect.html
