package com.ecommerce.hugo.controller;

import com.ecommerce.hugo.helper.UserHelper;
import com.ecommerce.hugo.service.UserService.UserInterface;
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

  @Autowired
  private UserHelper userHelper;

  @PostMapping(value = "/signupUser")
  public Map<String, Object> signupUser(@RequestBody Map<String, String> userMap){
    return userHelper.saveAccountDetails(userMap);
  }

  @PostMapping(value = "/verifyUser")
  public Map<String, Object> verifyUser(@RequestBody Map<String, String> userMap){
    return  userInterface.getUserByEmail(userMap);
  }
}
