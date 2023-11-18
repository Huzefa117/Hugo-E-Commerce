package com.ecommerce.hugo.controller;

import com.ecommerce.hugo.model.User;
import com.ecommerce.hugo.service.UserService.UserInterface;
import com.ecommerce.hugo.service.UserService.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/user")
public class UserController {

  @Autowired
  private UserInterface userInterface;

  @PostMapping(value = "/signupUser")
  public User signupUser(@RequestBody User userAccount){
    return userInterface.saveUser(userAccount);
  }

  @PostMapping(value = "/verifyUser")
  public Map<String, Object> verifyUser(@RequestBody Map<String, String> userMap){
    return  userInterface.getUserByEmail(userMap);
  }
}
