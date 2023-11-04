package com.ecommerce.hugo.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private Long id;
  private String description;
  private String image;
  private int price;
  private String review;
  private boolean stockStatus;
  private String category;
  private String seller;
}
