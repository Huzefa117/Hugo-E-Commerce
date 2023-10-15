package com.ecommerce.hugo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class FirstController {

  @GetMapping(value = "/hello")
  public String hello(){return "This is a Hugo E-commerce Platform";}
}
