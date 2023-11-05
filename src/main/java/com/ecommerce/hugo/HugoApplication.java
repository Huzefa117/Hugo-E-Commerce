package com.ecommerce.hugo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HugoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HugoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
								.allowedOrigins("http://localhost:4200")
								.allowedMethods("GET", "POST", "PUT", "DELETE")
								.allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept", "Authorization")
								.maxAge(3600); // Optional: define max age for CORS preflight requests
			}
		};
	}
}
