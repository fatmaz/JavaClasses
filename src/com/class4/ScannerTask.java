package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		Scanner loan=new Scanner(System.in);
		System.out.println("What is the amount of loan");
		int amount=loan.nextInt();

if(amount<200000) {
	System.out.println(" you are eligible for the loan");
	}else {
		System.out.println("You are not eligible for the loan");
		}
	}

}
