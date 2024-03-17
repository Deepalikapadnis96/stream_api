package com.demo.test.function;

import java.util.function.Function;

public class ApplyMethod {
	public static void main(String[] args) {
		Function<Integer, Double> function = a -> a / 2.0;
		System.out.println(function.apply(8));
	}
}
