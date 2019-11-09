package com.class7;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nes");
		double no1=scan.nextDouble();
		double no2=scan.nextDouble();
		double no3=scan.nextDouble();
		
		
		if (no1>no2) {
			if(no1>no3) {//no1>no2&&no1>no3
			System.out.println("Largest number is first-");
		}else {//no1>no2&&no1<no3
			System.out.println("Largest number is third-");
		}
	}else {//assuming no2>no1
		if(no2>no3) {
			System.out.println("Largest number is second-");
			}else {
				System.out.println("Largest number is third");
			}
		}
	}


}