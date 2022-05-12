package com.github.ruyjfs.examplejavakafka.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

  @GetMapping("/")
  public String index(@RequestParam(value = "name", defaultValue = "Kafka") String name) {
    return String.format("Example Java %s!", name);
  }
}
