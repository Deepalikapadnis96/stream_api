package com.demo.test.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NUmOfOccuranceOFWordInString {
public static void main(String[] args) {
	String str ="My Name Is Is Deepali Kapadnis";
	List<String> asList = Arrays.asList(str.split(" "));
	Map<String, Long> collect = asList.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(">>"+collect);
}
}
