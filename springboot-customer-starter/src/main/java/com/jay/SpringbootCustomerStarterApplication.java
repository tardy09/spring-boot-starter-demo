package com.jay;

import com.jay.annotation.EnableHello;
import com.jay.annotation.EnableSelectorHelloWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


//@EnableSelectorHelloWorld(isLinux = false)
//@EnableHello
@SpringBootApplication
@Slf4j
public class SpringbootCustomerStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCustomerStarterApplication.class, args);
		log.info("**********************项目启动成功*******");
	}

}
