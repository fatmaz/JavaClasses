package com.class14;

public class Task {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new
		// String without any spaces.
		// Create a String that should be combination of letters, numbers and special
		// characters. Find out how many alpha characters are there in the String.
		// You have a String a=”Is it saturday? Is it raining? Do we have a Java Class
		// today?” How would you find out how many sentences are in that String?

		String task1 = "I love Java";
		String str = task1.replace(" ", "");
		System.out.println(str);

//task2

		String task2 = "fatma$%^&*alkan@#$12345";

		String solve = task2.replaceAll("^A-Za-z", "");
		System.out.println(solve.length());

//task3

		String a = "Is it Staurday? Is it raining? Do we have a Java class today?";
		String[] task3 = a.split("\\?");

		System.out.println(task3.length);

	}
}