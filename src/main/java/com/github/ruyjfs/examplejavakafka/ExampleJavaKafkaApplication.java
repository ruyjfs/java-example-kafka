package com.github.ruyjfs.examplejavakafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ExampleJavaKafkaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExampleJavaKafkaApplication.class, args);
  }

}