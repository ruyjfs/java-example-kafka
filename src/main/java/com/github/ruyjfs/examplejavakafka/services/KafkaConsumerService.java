package com.github.ruyjfs.examplejavakafka.services;

import java.io.IOException;

import com.github.ruyjfs.examplejavakafka.User;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.WakingKafkaConsumerTimingAdjuster;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumerService {

  @Autowired private KafkaProducerService kafkaProducerService;

  @KafkaListener(
      topics = {
        "${custom.kafka.topics.user-created}",
        "${custom.kafka.topics.user-updated}",
        "${custom.kafka.topics.user-changedPassword}",
        "${custom.kafka.topics.user-deleted}"
      },
      groupId = "${custom.kafka.group-id}")
  public void consumerAllTopics(ConsumerRecord<String, GenericRecord> payload, Acknowledgment ack) {
    log.info("LOG -> status=START M=KafkaConsumerService.consumerAllTopics  payload={}", payload);
    try {
      var value = payload.value();
      log.info(
          "LOG -> status=LOADING M=KafkaConsumerService.consumerAllTopics payload={}", value);
      this.kafkaProducerService.all(value);

    } catch (Exception e) {
      log.error(
          "LOG -> status=ERROR M=KafkaConsumerService.consumerAllTopics exception={}", e.getMessage());
      //      throw new IOException();
    } finally {
      ack.acknowledge();
      log.info("LOG -> status=END M=KafkaProducerService.consumerCreate  payload={}", payload);
    }
  }

  @KafkaListener(topics = "${custom.kafka.topics.user-all}", groupId = "${custom.kafka.group-id}")
  public void consumerAll(ConsumerRecord<String, GenericRecord> payload) throws IOException {
    log.info("LOG -> status=END M=KafkaConsumerService.consumerAll  payload={}", payload);
  }
}
