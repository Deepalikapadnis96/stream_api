package com.demo.test.stream.predicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//AND
public class Two {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2, 4, 5, 67, 3, 2, 9, 8, 20, 34, 23, 87, 90);
		Predicate<Integer> predicate2 = x -> x > 6;
		Predicate<Integer> predicate3 = x -> x > 44;
		asList.stream().filter(predicate2.and(predicate3)).collect(Collectors.toList())
		.forEach(System.out::println);
		Map<Character, Integer>map = new HashMap<>();
		Collection<Integer> values = map.values();
	}
}
