package com.ecommerce.hugo.helper;


import com.ecommerce.hugo.model.Seller;
import com.ecommerce.hugo.model.User;
import com.ecommerce.hugo.service.UserService.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.ecommerce.hugo.constants.WebConstants.customer;
import static com.ecommerce.hugo.constants.WebConstants.seller;

@Service
public class UserHelper {
  @Autowired
  private UserInterface userInterface;

  public Map<String, Object> saveAccountDetails(Map<String, String> userMap){
    Map<String, Object> resultMap = new HashMap<>();
   try{
     String userName = userMap.get("userName");
     String password = userMap.get("password");
     String email = userMap.get("email");
     String address = userMap.get("address");
     String type = (userMap.get("type").equals("seller")) ? seller : customer;
     String phoneNumber = userMap.get("phoneNumber");

     User user = User.builder()
                .userName(userName)
                .email(email).password(password).address(address)
                .type(type).phoneNumber(phoneNumber).build();
     User savedUser = userInterface.saveUser(user);

     if(userMap.get("type").equals("seller")){
       String businessInfo = userMap.get("businessInfo");
       Seller seller = Seller.builder().userId(savedUser.getId()).businessInfo(businessInfo).build();
       Seller savedSeller = userInterface.saveSeller(seller);
     }
     resultMap.put("userId", savedUser.getId());
     resultMap.put("name", savedUser.getUserName());
     resultMap.put("type", savedUser.getType());

   }catch (Exception e){
     System.out.println(e);
     resultMap.put("message", "Something went wrong!!!");
   }
   return resultMap;
  }
}
