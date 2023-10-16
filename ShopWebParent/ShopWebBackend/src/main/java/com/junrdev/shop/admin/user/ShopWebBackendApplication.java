package com.junrdev.shop.admin.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.junrdev.common.entity", "com.junrdev.shop.admin.user"})
public class ShopWebBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopWebBackendApplication.class, args);
	}

}
