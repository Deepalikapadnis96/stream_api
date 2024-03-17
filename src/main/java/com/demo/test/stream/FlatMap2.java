package com.demo.test.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap2 {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("pune");
		list1.add("mumbai");
		FlatMap2Entity flat = new FlatMap2Entity("1", "TIA", list1);

		List<String> list2 = new ArrayList<>();
		list2.add("delhi");
		list2.add("pune");
		list2.add("bengaluru");
		FlatMap2Entity flat1 = new FlatMap2Entity("2", "ntt data", list2);

		List<String> list3 = new ArrayList<>();
		list3.add("chennai");
		list3.add("noida");
		FlatMap2Entity flat2 = new FlatMap2Entity("3", "wipro", list3);

		List<FlatMap2Entity> listData = new ArrayList<>();
		listData.add(flat1);
		listData.add(flat2);
		listData.add(flat);
		// here we are creating list of list here pune is repeated and we don want
		// repated then
		List<List<String>> collect = listData.stream().map(x -> x.getCompanyHeadquater()).collect(Collectors.toList());
		System.out.println("list of list data>> " + collect);

		// will create a SET still will get repeated
		Set<List<String>> collect2 = listData.stream().map(x -> x.getCompanyHeadquater()).collect(Collectors.toSet());
		System.out.println("list of data using set>> " + collect2);

		// by using flate map will not get repeated and while using flate map we need
		// to send output in stream only

		// if we will collect in list pune will get repeate use set
		List<String> collect3 = listData.stream().flatMap(x -> x.getCompanyHeadquater().stream())
				.collect(Collectors.toList());
		System.out.println("using flatmap>> " + collect3);

		Set<String> collect4 = listData.stream().flatMap(x -> x.getCompanyHeadquater().stream())
				.collect(Collectors.toSet());
		System.out.println("set + flatmap>> " + collect4);
	}
}