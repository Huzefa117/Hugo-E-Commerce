package com.ecommerce.hugo.service.UserService;

import com.ecommerce.hugo.model.Seller;
import com.ecommerce.hugo.model.User;

import java.util.Map;

public interface UserInterface {

  User saveUser(User user);

  Seller saveSeller(Seller account);

  Map<String, Object> getUserByEmail(Map<String, String> userMap);
}
