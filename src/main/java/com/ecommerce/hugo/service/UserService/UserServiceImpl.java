package com.ecommerce.hugo.service.UserService;

import com.ecommerce.hugo.model.User;
import com.ecommerce.hugo.repository.User.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserInterface{

  @Autowired
  private UserRepo userRepo;

  @Override
  public User saveUser(User user) {
    return userRepo.save(user);
  }

  @Override
  public Map<String, Object> getUserByEmail(Map<String, String> userMap) {
    Map<String, Object> resultMap = new HashMap<>();
    try {
      String email = userMap.get("email");
      String password = userMap.get("password");
      if(!email.isEmpty() && !password.isEmpty()) {
        List<User> userList = userRepo.findByEmail(email);
        if (!userList.isEmpty() && userList != null) {
          User user = userList.get(0);
          if (user.getPassword().equals(password)){
            resultMap.put("id", user.getId());
            resultMap.put("name", user.getName());
            resultMap.put("email", user.getEmail());
          }else{
            resultMap.put("message", "Invalid Credentials");
          }
        }else{
          resultMap.put("message", "No user present");
        }
      }else{
        resultMap.put("message", "Data Not Proper");
      }
    }catch (Exception e){
      System.out.println(e);
      resultMap.put("message", "Something went wrong!!!");
    }
    return resultMap;
  }
}
