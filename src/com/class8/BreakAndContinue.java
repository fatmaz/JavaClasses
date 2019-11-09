package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		//break keyword breaks/exists the loop
		for (int i=0; i<10; i++) {
			if(i==2) {
				break;//as soon as you see a break, it stops
			}
			
			
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		for (int i=1; i<=5; i++) {
			if(i==3) {
				continue;
			}
		}System.out.println(i);
		System.out.println("I am out of the loop");

	}
	

	}


