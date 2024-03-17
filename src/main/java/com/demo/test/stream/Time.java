package com.demo.test.stream;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

public class Time {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in)	;
System.out.println("enter: ");
int nextInt = sc.nextInt();
nextInt=nextInt%10;
System.out.println(nextInt);
stringData();
}
public static void stringData(){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string: ");
	String next = sc.nextLine();
	System.out.println("-"+next);
	String[] split = next.split(" ");
	for(int i=0;i<next.split(" ").length;i++) {
		split[i]+=split[i];
		System.out.println(">>"+ split[i]);
		int parseInt = Integer.parseInt(split[i]);
		//System.out.println("int:"+parseInt);
		parseInt+=parseInt%10;
		System.out.println(" :"+parseInt);
	}		

	
}
}
