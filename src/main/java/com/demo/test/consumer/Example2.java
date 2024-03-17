package com.demo.test.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example2 {
public static void main(String[] args) {
	Consumer<String> consumer1 =t->System.out.println(t+ " jui");
	Consumer<String> consumer2 =t->System.out.println(t+ " deepali");
	consumer1.andThen(consumer2).accept("kapadnis");
	
	List<Integer> asList = Arrays.asList(2,3,4,5,6,7);
	asList.forEach(System.out::println);
}
}
