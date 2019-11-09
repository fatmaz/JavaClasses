package com.class4;

import java.util.Scanner;

public class ScannerTask1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		if(age>18) {
			System.out.println("You are eligible to get your driver licence");
		}else {
			System.out.println("You should get learners permit first");
		}
				
	}

}
