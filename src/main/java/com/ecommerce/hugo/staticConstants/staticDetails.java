package com.ecommerce.hugo.staticConstants;

import com.ecommerce.hugo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class staticDetails {
  public static List<Product> productList = new ArrayList<>();

  static {
    Product p1 = Product.builder().id(1L)
            .category("smartwatch")
            .description("HOUSE OF SOUND HOS Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/h/x/d/49-hos-1-android-house-of-sound-yes-original-imagt9bp4huqj3qs.jpeg?q=70")
            .price(999).review("Good").seller("sellerName").stockStatus(true).build();
    Product p2 = Product.builder().id(2L)
            .category("smartwatch")
            .description("Noise Colorfit Icon 2 1.8'' Display with Bluetooth Calling, AI Voice Assistant Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/l5ld8y80/smartwatch/f/k/q/-original-imagg8d9hbkhfffg.jpeg?q=70")
            .price(1199).review("Good").seller("sellerName").stockStatus(true).build();
    Product p3 = Product.builder().id(3L)
            .category("smartwatch")
            .description("Fastrack Revoltt X|1.83'' HD Display|SingleSync BT Calling|Advanced Chipset|Calculator Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/u/e/d/-original-imagtvj2pfm4haw6.jpeg?q=70")
            .price(1099).review("Good").seller("sellerName").stockStatus(true).build();
    Product p4 = Product.builder().id(4L)
            .category("smartwatch")
            .description("beatXP Marv Neo 1.85'' HD Display Bluetooth Calling Smart Watch, Health Tracking & IP68 Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/f/1/3/4-6-bxp-marv-neo-rosegold-android-ios-beatxp-yes-original-imagt9fsq8t4ymgm.jpeg?q=70")
            .price(899).review("Good").seller("sellerName").stockStatus(true).build();
    Product p5 = Product.builder().id(5L)
            .category("smartwatch")
            .description("Fire-Boltt Hurricane 1.3&quot; Curved Glass Display with 360 Health Training, 100+ Sports Modes Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/h/m/e/-original-imagkfm8fgvwjy8y.jpeg?q=70")
            .price(1199).review("Good").seller("sellerName").stockStatus(true).build();
    Product p6 = Product.builder().id(6L)
            .category("smartwatch")
            .description("Boult Crown 1.95'' Screen, BT Calling, Working Crown, Zinc Alloy Frame, 900 Nits, SpO2 Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/r/8/e/-original-imagr5kzfx45wggg.jpeg?q=70")
            .price(1299).review("Good").seller("sellerName").stockStatus(true).build();
    Product p7 = Product.builder().id(7L)
            .category("smartwatch")
            .description("Fire-Boltt Ninja Calling Pro Plus 1.83 inch Display Smartwatch Bluetooth Calling, AI Voice Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/f/x/c/-original-imagjvdyuxbj3men.jpeg?q=70")
            .price(1199).review("Good").seller("sellerName").stockStatus(true).build();
    Product p8 = Product.builder().id(8L)
            .category("smartwatch")
            .description("Noise Crew 1.38&quot; Round Display with Bluetooth Calling, Metallic finish, IP68 Rating Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/x/9/4/-original-imagtdqkhz3xdkdt.jpeg?q=70")
            .price(1199).review("Good").seller("sellerName").stockStatus(true).build();
    Product p9 = Product.builder().id(9L)
            .category("smartwatch")
            .description("Fire-Boltt Ninja Calling Pro Plus 1.83 inch Display Smartwatch Bluetooth Calling, AI Voice Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/m/r/t/-original-imagjvdyrfgx65zx.jpeg?q=70")
            .price(1199).review("Good").seller("sellerName").stockStatus(true).build();
    Product p10 = Product.builder().id(10L)
            .category("smartwatch")
            .description("boAt Storm Call 2 1.83'' HD Display,BT Calling,boAt Coins & DIY Watch Face Studio Smartwatch")
            .image("https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/p/x/0/-original-imagrc7zn78vdrkr.jpeg?q=70")
            .price(1299).review("Good").seller("sellerName").stockStatus(true).build();
    productList.add(p1);
    productList.add(p2);
    productList.add(p3);
    productList.add(p4);
    productList.add(p5);
    productList.add(p6);
    productList.add(p7);
    productList.add(p8);
    productList.add(p9);
    productList.add(p10);
  }

}
