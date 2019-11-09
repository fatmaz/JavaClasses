package com.class16;

public class IQ4 {

	public static void main(String[] args) {
		//HOW TO FIND OUT THE PART OF THE STRING FROM A STRING? wHAT IS A SUBSTRING? fIND NUMBER OF WORDS IN SSTRING?
		
		String str="Today is awesome";
		String str1=str.substring(0,5);
		System.out.println(str1);
		//logic: Step1:split--array of string--basd on the space
		//step2: find the length of the array
		
		String[] str2=str.split(" ");
System.out.println(str2.length);
	}

}
