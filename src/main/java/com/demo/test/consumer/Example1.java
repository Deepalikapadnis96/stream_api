package com.demo.test.consumer;

import java.util.function.Consumer;

public class Example1 {
public static void main(String[] args) {
	Consumer<String> consumer =t->System.out.println(t);
	consumer.accept("deepali");
}
}
