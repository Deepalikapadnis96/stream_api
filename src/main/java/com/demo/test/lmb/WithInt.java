package com.demo.test.lmb;

public class WithInt {
public static void main(String[] args) {
A obj = (x)-> System.out.println("hello: " + x);	
obj.show(4);
}

@FunctionalInterface
interface A{
	void show(int x);
}
}
