package com.demo.test.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Example2 {
	public static void main(String[] args) {
		System.out.println(list().get());
	}

	public static Supplier<List<Example2Pojo>> list() {
		Supplier<List<Example2Pojo>> ex = () -> {
			List<Example2Pojo> prodList = new ArrayList<>();
			prodList.add(new Example2Pojo("HP", "1", "3000"));
			prodList.add(new Example2Pojo("lenovo", "2", "3500"));
			prodList.add(new Example2Pojo("mac", "3", "113000"));
			return prodList;
		};
		return ex;
	}
}
