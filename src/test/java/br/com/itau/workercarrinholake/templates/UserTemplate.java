package br.com.itau.workercarrinholake.templates;

import com.github.ruyjfs.examplejavakafka.User;
import lombok.Getter;
import com.github.javafaker.Faker;

public class UserTemplate extends BaseTemplate{
  @Getter
  private static final UserTemplate instance = new UserTemplate();

  public User getUser() {
    User user = new User();
    user.setName(faker.name().fullName());
    user.setAge(faker.random().nextInt(1, 99));
    return user;
  }
}
