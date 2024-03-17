package com.demo.test.stream.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Three {
	public static void main(String[] args) {
		Predicate<String> p1 = x -> x.length() == 3;
		Predicate<String> p2 =x -> x.startsWith("D");
		
		List<String> asList = Arrays.asList("Dee","Deep","axba","ccs","Sd");
		List<String> collect = asList.stream().filter(p1.or(p2)).collect(Collectors.toList());
		System.out.println(collect);
	}
}
