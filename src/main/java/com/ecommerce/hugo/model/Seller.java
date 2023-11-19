package com.ecommerce.hugo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Sellers")
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private int userId;
  private String businessInfo;

  //  // Name
  //Phone Number
  //    Email
  //    Address
  //   Img
}
