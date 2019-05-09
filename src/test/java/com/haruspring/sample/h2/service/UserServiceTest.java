package com.haruspring.sample.h2.service;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

  @Autowired UserService userService;

  @Test
  public void userServiceAutowired() {
    assertNotNull(userService);
  }
}
