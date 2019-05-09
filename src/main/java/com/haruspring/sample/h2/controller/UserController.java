package com.haruspring.sample.h2.controller;

import com.haruspring.sample.h2.repository.dao.User;
import com.haruspring.sample.h2.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

  @Autowired private UserService userService;

  @GetMapping("list")
  public List<User> listUser() {
    return userService.selectAllUser();
  }

  @GetMapping("search")
  public List<User> searchUserByName(@RequestParam("keyword") String keyword) {
    return userService.searchUserByName(keyword);
  }
}
