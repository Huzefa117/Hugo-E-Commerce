package com.ecommerce.hugo.controller;

import com.ecommerce.hugo.model.Product;
import com.ecommerce.hugo.staticConstants.staticDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class FetchController {

  @GetMapping(value = "/fetchProducts")
  public List<Product> fetchProduct(){
    return staticDetails.productList;
  }
}
