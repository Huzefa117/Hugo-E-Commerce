package com.ecommerce.hugo.controller;

import com.ecommerce.hugo.helper.ProductHelper;
import com.ecommerce.hugo.model.Product;
import com.ecommerce.hugo.staticConstants.staticDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
  @Autowired
  private ProductHelper productHelper;

  @GetMapping(value = "/fetchProducts")
  public List<Product> fetchProduct(){
    return staticDetails.productList;
  }

  @PostMapping(value = "/saveProducts/{userType}")
  public String saveProducts(@RequestBody Product product, @PathVariable String userType){
   return productHelper.saveProducts(product, userType);
  }
}
