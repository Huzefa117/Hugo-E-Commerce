package com.ecommerce.hugo.repository.Seller;

import com.ecommerce.hugo.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {
}
