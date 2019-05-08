package com.haruspring.sample.h2.service;

import com.haruspring.sample.h2.service.model.User;
import java.util.List;

public interface UserService {

  public List<User> selectAllUser();

  public List<User> searchUserByName(String keyword);
}
