package com.demo.test.stream;

import java.security.Identity;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCode {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 4, 5, 1, 9, 3);
		int result = num.stream().filter(n -> n % 2 == 1)// will filter odd num,filter has obj of predicate,predicate
				// is funcational interface and it return true/false
				.sorted().map(n -> n * 2).reduce(0, (a, b) -> a + b);
		System.out.println(result);
		// .forEach(n -> System.out.println("-->"+n)); //here we are using stream not
		// working with existing list
		// once we consume the stream we cant use it again
		// Stream<Integer> sorted = data.sorted();
		// data.forEach(n -> System.out.println("-->"+n));
	}
}
