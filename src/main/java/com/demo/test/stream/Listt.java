package com.demo.test.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Listt {
	public static void main(String[] args) {
		List<String> collect = Stream.of("deepali", "neha", "monal")
				.collect(Collectors.toList());
		Long collect2 = collect.stream().collect(Collectors.counting());
		System.out.println(collect + " count: " + collect2);
	}
}
