package com.nt.runners;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-1)
public class AReportTestRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("==ATestReportRunner :: run(-)===");
		List<String>  nonOptionArgs=args.getNonOptionArgs();
		System.out.println("Non Option args are::"+nonOptionArgs);
		
		Set<String>  optionArgs=args.getOptionNames();
		System.out.println("Option arg names and values::");
		for(String  name:optionArgs) {
			System.out.println(name+"===>"+args.getOptionValues(name));
		}
		

	}

}
