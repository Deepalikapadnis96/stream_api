package com.demo.test.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Example1 {
public static void main(String[] args) {
	Supplier<LocalDateTime> supplier=()->LocalDateTime.now();
	System.out.println(supplier.get());
}
}
