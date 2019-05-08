package com.haruspring.sample.h2.service.model;

import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

  @Id private Integer id;

  private String firstName;

  private String lastName;

  private String email;

  private LocalDate birthday;

  public User() {}

  public User(Integer id, String firstName, String lastName, String email, LocalDate birthday) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.birthday = birthday;
  }
}
