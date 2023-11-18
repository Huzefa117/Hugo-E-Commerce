package com.ecommerce.hugo.service.UserService;

import com.ecommerce.hugo.model.User;
import com.ecommerce.hugo.repository.User.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserInterface{

  @Autowired
  private UserRepo userRepo;

  @Override
  public User saveUser(User user) {
    return userRepo.save(user);
  }
}
