package com.demo.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitSkip {
public static void main(String[] args) {
	List<Integer> asList = Arrays.asList(22,12,12,4,5,6,7,8,8,9,0);
	List<Integer> limit = asList.stream().limit(4).collect(Collectors.toList());
	System.out.println("limit>>"+limit);
	
	List<Integer> skip = asList.stream().skip(5).collect(Collectors.toList());
	System.out.println("skip>>"+skip);
}
}
