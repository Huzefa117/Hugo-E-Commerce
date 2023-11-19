package com.ecommerce.hugo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Products")
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String description;
  private String image;
  private int price;
  private String review;
  private boolean stockStatus;
  private String category;
  private String seller;
}
