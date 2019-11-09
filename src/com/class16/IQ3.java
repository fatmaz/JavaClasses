package com.class16;

public class IQ3 {

	public static void main(String[] args) {
		//find out how many alp characters in a string
		String str="Hello world#$%^";
		String str1=str.replaceAll("[^A-Za-z]", "");
		System.out.println(str1.length());
		

	}

}
