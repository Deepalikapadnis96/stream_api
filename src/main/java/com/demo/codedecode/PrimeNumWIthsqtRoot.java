package com.demo.codedecode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumWIthsqtRoot {
public static void main(String[] args) {
	List<Double> collect = Stream.iterate(1,i->i+1)
	.filter(PrimeNumWIthsqtRoot::isPrime).peek(x->System.out.println(x))
	.map(Math:: sqrt).limit(10).collect(Collectors.toList());
	System.out.println(collect);
}
	public static boolean isPrime(int num) {
		return IntStream.range(2, num).noneMatch(n->num%2==0);
	}
}
