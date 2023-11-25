package com.ecommerce.hugo.helper;

import com.ecommerce.hugo.model.Product;
import com.ecommerce.hugo.repository.Product.ProductRepo;
import org.springframework.stereotype.Service;

import static com.ecommerce.hugo.constants.WebConstants.customer;
import static com.ecommerce.hugo.constants.WebConstants.seller;

@Service
public class ProductHelper {

  private ProductRepo productRepo;
  public ProductHelper(ProductRepo productRepo) {
   this.productRepo = productRepo;
  }

  public String saveProducts(Product product, String userType){
    try {
      if (userType.equals(seller)) {
        productRepo.save(product);
        return "Product saved";
      } else if (userType.equals(customer)) {
        return "Cannot save the product";
      }
    }catch (Exception e){
      System.out.println(e);
      return "Something went wrong";
    }
    return "";
  }
}
