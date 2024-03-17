package com.demo.test.lmb;

public class WithTwoParam {
public static void main(String[] args) {
	A obj = (int x, int y)-> x+y;
	int show = obj.show(4, 9);
	System.out.println("-->"+show);
	
}
@FunctionalInterface
interface A{
	int show(int x, int y);
}
}
