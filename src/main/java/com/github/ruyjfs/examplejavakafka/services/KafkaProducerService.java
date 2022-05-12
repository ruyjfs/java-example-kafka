package com.github.ruyjfs.examplejavakafka.services;

import com.github.ruyjfs.examplejavakafka.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducerService {

  @Value("${custom.kafka.topics.user-created}")
  private String TOPIC_USER_CREATED;

  @Value("${custom.kafka.topics.user-updated}")
  private String TOPIC_USER_UPDATED;

  @Value("${custom.kafka.topics.user-all}")
  private String TOPIC_USER_ALL;

  @Autowired
  private KafkaTemplate<Object, Object> kafkaTemplate;

  public boolean create(User payload) {
    log.info("LOG -> status=START KafkaProducerService.create -> topic{}", TOPIC_USER_CREATED);
    kafkaTemplate.send(TOPIC_USER_CREATED, payload);
    log.info("LOG -> status=END KafkaProducerService.create -> payload={}", payload);
    return true;
  }

  public void update(User payload) {
    log.info("LOG -> status=START KafkaProducerService.update -> topic{}", TOPIC_USER_UPDATED);
    kafkaTemplate.send(TOPIC_USER_UPDATED, payload);
    log.info("LOG -> status=END KafkaProducerService.update -> payload={}", payload);
  }

  public void all(Object payload) {
    log.info("LOG -> status=START KafkaProducerService.all -> topic{}", TOPIC_USER_ALL);
    kafkaTemplate.send(TOPIC_USER_ALL, payload);
    log.info("LOG -> status=END KafkaProducerService.all -> payload={}", payload);
  }
}
