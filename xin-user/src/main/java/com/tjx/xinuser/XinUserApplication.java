package com.tjx.xinuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
public class XinUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(XinUserApplication.class, args);
	}

}
