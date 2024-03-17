package com.demo.test.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("deepali");
		list.add("deep");
		list.add("akans");
		list.add("monal");
		list.add("Neha");
		list.add("neeti");
		
		list.stream().map(i->i.toLowerCase())
		.filter(i->(i.startsWith("d"))||(i.startsWith("n"))).map(i->i.toUpperCase())
		.forEach(System.out::println);

	}
}
