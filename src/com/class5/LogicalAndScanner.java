package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {
	public static void main(String[] args) {
		/* ask user to enter age
		 * if age is from 1-3--> you are a baby
		 * if age is from 3-5--> you are a toddler
		 * if age is from 5-12--> you are a kid
		 * if age is from 12-19--> you are a teenager
		 * if age>20--> you are an adult
		 */
		int age;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		String human;
		if(age>=1&& age<3) {
			human="baby";
			System.out.println("You are a "+human);
		}
	}
}