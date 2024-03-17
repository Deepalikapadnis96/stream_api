package com.demo.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MAp {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("1", "2", "3", "5");
		List<Integer> d1 = asList.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(d1);
	}
}
