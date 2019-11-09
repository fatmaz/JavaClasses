package com.class3;

public class IfElseIf {
	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 99;

		if (num1 > num2) {
			System.out.println("Num1 larger than num2.");
		} else if (num1 == num2) {
			System.out.println("Num1 is equal num2.");
		} else {
			System.out.println("Num1 is smaller than num2");
		}
		int day = 6;
		if (day == 1) {
			System.out.println("Today is Monday, I have to go to the work.");
		} else if (day == 2) {
			System.out.println("Today is Tuesday. I have SDLC class.");
		} else if (day == 3) {
			System.out.println("Today is Wednesday. I have JAVA revieww class.");
		} else if (day == 4) {
			System.out.println("Today is Thrusday. I have SDLC class.");
		} else if (day == 5) {
			System.out.println("Today is Friday. Almost weekend.");
		} else {
			System.out.println("I dont know any other day.");
			// if any number matching it will go to else part
		}
	}
}
