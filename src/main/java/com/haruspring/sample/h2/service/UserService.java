package com.haruspring.sample.h2.service;

import com.haruspring.sample.h2.repository.dao.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

  public List<User> selectAllUser();

  public List<User> searchUserByName(String keyword);
}
