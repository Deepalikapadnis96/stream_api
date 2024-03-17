package com.demo.test.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(22, 12, 3, 43, 21, 22, 43, 12, 3, 46, 58, 95);
		Set<Integer> s = new HashSet<>();
		//will print the first duplicate then second then third
		asList.stream().filter(x -> !s.add(x)).forEach(System.out::println);
		//will print in descding ordr
		System.out.println("--duplicate not---");
		asList.stream().filter(x -> !s.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

	}
}
