package com.demo.test.lmb;

public class Reverse {
	public static void main(String[] args) {
		MyInterface ref = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("reverse: " + ref.getData("abcd"));
	}
}

@FunctionalInterface
interface MyInterface {
	String getData(String n);
}
