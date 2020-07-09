package com.mike.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mike.sharding.service.DemoService;

@SpringBootApplication
public class ShardingApplication {

	public static void main(String[] args) {
//		try (ConfigurableApplicationContext applicationContext = SpringApplication.run(ShardingApplication.class, args)) {
//			applicationContext.getBean(DemoService.class).queryDistinct();
//		}catch(Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
		
		SpringApplication.run(ShardingApplication.class, args);
	}
}
