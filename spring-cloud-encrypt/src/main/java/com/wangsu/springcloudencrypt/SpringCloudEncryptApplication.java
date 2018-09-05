package com.wangsu.springcloudencrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class SpringCloudEncryptApplication {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEncryptApplication.class, args);
	}
}
