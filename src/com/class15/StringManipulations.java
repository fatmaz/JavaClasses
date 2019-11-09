package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
	//String class comes in Java Lang package. Developers already created for us.
		//String is a sequence of characters
		//2 ways to create a string
		String str="Hello";
		String str1= new String("hello");
		System.out.println(str);
		//find the number of charactes inside the String
		int length=str.length();
		System.out.println(length);
		//case conversion methods
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		//verify if the string is empty
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		//String myString1=null;//no value at all.It is equal to String myString
		//System.out.println(myString1.isEmpty());
		//how to verify existence of of characters in the string
		String a="Good evening students";
		boolean exist=a.contains("Students");
		System.out.println(exist);
		System.out.println(a.startsWith("student"));
	}

}
