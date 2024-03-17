package com.demo.test.lmb;

public class Greeter {
	@FunctionalInterface
	interface Mylmb {
		void foo();
	}
	@FunctionalInterface
	interface Add {
		int addData(int a, int b);
	}
	public static void main(String[] args) {
		
		Mylmb myLambdaExp =()->System.out.println("hey..!");
		myLambdaExp.foo();
		
		Add add =(int a, int b) ->  a + b;
		//add.addData(12, 11);
		System.out.println( add.addData(12, 11));
		
		
	}
}
