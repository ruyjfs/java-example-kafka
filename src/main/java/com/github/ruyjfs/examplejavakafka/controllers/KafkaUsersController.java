package com.github.ruyjfs.examplejavakafka.controllers;

import com.github.ruyjfs.examplejavakafka.User;
import com.github.ruyjfs.examplejavakafka.services.KafkaProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka/user")
public class KafkaUsersController {

  @Autowired
  private KafkaProducerService service;

  @PostMapping(value = "/create")
  public void create(@RequestBody User data) {
    this.service.create(data);
  }

  @PostMapping(value = "/update")
  public void update(@RequestBody User data) {
    this.service.update(data);
  }

}
