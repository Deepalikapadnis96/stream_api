package com.demo.test.function;

import java.util.function.Function;

public class AndThenMethod {

	public static void main(String[] args) {
		Function<Integer, Double> fun = a -> a / 3.0;
		fun = fun.andThen(a -> a * 2);
		System.out.println(fun.apply(9));
	}
}
