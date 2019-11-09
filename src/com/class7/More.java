package com.class7;

public class More {

	public static void main(String[] args) {
	//I want to print only even numbers
		//1st way-increment value by 2
		int z=2;
		
		while(z<=20) {
			System.out.println(z);
			z+=2;
		}
		//2nd way-using modules
		
		int q=1;
		while(q<=20) {
			if(q%2==0) {
				System.out.print(q);
			}
			q++;
		}

	}

}
