package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		//write a java program to reverse the string?
		//reverse a string word by word?
		String given="Welcome to the Java class";
		/*
		 * to reverse String
		 * split();
		 * Step1: split--array of string
		 * Step2: use for loop and use decrement to print  values
		 * 
		 */
		String[] array=given.split(" ");
		for(int i=array.length-1; i>=0; i--) {
		System.out.print(array[i]+" ");
		
		
		//write a java program to reverse sring
		//toCharArray(); charAt();
		String given1="Today is Java class";
		char[] charArray=given1.toCharArray();
		for(int j=charArray.length-1; j>=0; j--) {
			System.out.print(charArray[j]+" ");		
			}
		}
	
	}}

