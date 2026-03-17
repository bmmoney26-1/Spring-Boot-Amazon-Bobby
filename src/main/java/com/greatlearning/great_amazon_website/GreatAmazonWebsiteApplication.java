package com.greatlearning.great_amazon_website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.greatlearning.great_amazon_website")
//@EnableAutoConfiguration
public class GreatAmazonWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatAmazonWebsiteApplication.class, args);
	}


}
