package com.ecommerce.hugo.repository.User;

import com.ecommerce.hugo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
  List<User> findByEmail(String email);
}
