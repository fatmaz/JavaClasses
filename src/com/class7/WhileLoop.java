package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		int time=8;
		if(time<12) 
		{System.out.println("Good morning");//code executes 1
		}
		System.out.println("------------------");
		while(time<12) {//if condition true
			System.out.println("Good morning");//code executes infinitely
			time++;
		}
		//I want to print good morning 5 times
		
		int i=-1;
		while(i<4) {
			System.out.println("Good morning");
			i++;
		}
		System.out.println("Outside of the while");
		
	}

}
