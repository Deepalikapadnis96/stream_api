package com.demo.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public class flatMap {
public static void main(String[] args) {
	List<Integer> even= Arrays.asList(2,4,6);
	List<Integer> odd= Arrays.asList(1,3,5);
	List<Integer> prime= Arrays.asList(11,23);
	List<Integer> num =Stream.of(even,odd,prime)
							 .flatMap(list->list.stream())
							 .collect(Collectors.toList());
	System.out.println(num);

}
}
