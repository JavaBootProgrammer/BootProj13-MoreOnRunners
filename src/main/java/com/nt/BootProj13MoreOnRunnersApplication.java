package com.nt;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootProj13MoreOnRunnersApplication {
	
	
	@Bean
	public   CommandLineRunner  createCMDRunner() {
		System.out.println("BootProj13MoreOnRunnersApplication.createCMDRunner()");
		CommandLineRunner  cr1=(args )->{
			System.out.println("LAMDA Command Line Runner");
		};
		return cr1;
	}
	
	@Bean
	public   ApplicationRunner  createAppRunner() {
		System.out.println("BootProj13MoreOnRunnersApplication.createAppRunner()");
		ApplicationRunner  ar1=(args )->{
			System.out.println("LAMDA Application Line Runner");
		};
		return ar1;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(BootProj13MoreOnRunnersApplication.class, args);
	}

}
