package com.haruspring.sample.h2.service.impl;

import com.haruspring.sample.h2.repository.UserRepository;
import com.haruspring.sample.h2.repository.dao.User;
import com.haruspring.sample.h2.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserRepository userRepository;

  @Override
  public List<User> selectAllUser() {
    return userRepository.findAll();
  }

  @Override
  public List<User> searchUserByName(String keyword) {
    return userRepository.findByFirstNameOrLastName(keyword);
  }
}
