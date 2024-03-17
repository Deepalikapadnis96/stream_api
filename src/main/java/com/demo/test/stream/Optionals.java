package com.demo.test.stream;

import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		String str = null;
		Optional<String> ofNullable = Optional.ofNullable(str);
		if(ofNullable.isPresent()) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
	}
}
