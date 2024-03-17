package com.demo.test.stream.predicate;

import java.util.function.Predicate;

public class Person {
	public static void main(String[] args) {
        Predicate < Person1 > predicate = (person) -> person.getAge() < 30;
		boolean test = predicate.test(new Person1("Deepali", 22));
		System.out.println(test);
	}
}

class Person1 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}