package com.class9;

public class Exercise {

	public static void main(String[] args) {
		//task1
		for(int a=5; a>=0; a--) {
			for(int b=0; b<=a; b++) {
				System.out.print(a);
			}System.out.println();
		}
		System.out.println("_______________________________");
		//task2
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}for(int c=4; c>=0; c--) {
			for(int d=1; d<=c; d++) {
				System.out.print("*");
			}System.out.println();
		}
	
	}

}
