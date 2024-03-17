package com.demo.test.stream.predicate;

import java.util.function.Predicate;

public class One {
	public static void main(String[] args) {
		Predicate<Integer> p = t -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(p.test(88));
	}
}
