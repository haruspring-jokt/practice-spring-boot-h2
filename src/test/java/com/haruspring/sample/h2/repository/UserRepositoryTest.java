package com.haruspring.sample.h2.repository;

import static org.junit.Assert.assertEquals;

import com.haruspring.sample.h2.repository.dao.User;
import java.util.List;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

  @Autowired private UserRepository userRepository;

  @Test
  public void testFindAll() {

    List<User> list = userRepository.findAll();
    assertEquals(list.size(), 5);
  }

  @Test
  public void testFindByFirstNameOrLastName() {

    List<User> list = userRepository.findByFirstNameOrLastName("棚");
    assertEquals(list.size(), 1);
    assertEquals(list.get(0).getLastName(), "棚橋");
    assertEquals(list.get(0).getFirstName(), "弘至");
  }
}
