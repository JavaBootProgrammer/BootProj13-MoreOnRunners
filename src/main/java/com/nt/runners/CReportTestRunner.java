package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class CReportTestRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===CReport Test Runner --- run(-) method===");
		System.out.println("cmd line args::"+Arrays.toString(args));
		System.out.println("----------------------");
		 for(String arg:args) {
			 System.out.println(arg);
		 }

	}
	
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
