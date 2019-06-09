package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//read All args
		Set<String> optionkeys=args.getOptionNames();
		System.out.println(optionkeys);
		
		//one key related keys
		List<String> list=args.getOptionValues("ramesh");
		System.out.println(list);
		
		//check for key exist
		System.out.println(args.containsOption("nature"));
		
		//Non option
		List<String> nonop=args.getNonOptionArgs();
		System.out.println(nonop);
		
		//all args
		String[] arr=args.getSourceArgs();
		System.out.println(Arrays.asList(arr));
	}
}
