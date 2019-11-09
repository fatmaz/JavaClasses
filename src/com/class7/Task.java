package com.class7;

public class Task {

	public static void main(String[] args) {
		//print only odd number from 50 to 100
		//print only even numbers from 100 to 1
		
		int a=50;
		while(a<=100) {
			if(a%2!=0) {
				System.out.println(a);
				
			}a++;

	}
		
		int b=1;
		while(b<=100) {
			if(b%2==0) {
				System.out.print(b+" ");
			}b--;
		}
		

}
}