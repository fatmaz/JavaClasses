package com.class3;

public class RelationalOperators {
	public static void main(String[] args) {
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("******");
		
		//Realational and equality operators
		// The result of relationa eaquality 
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);//false
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		
		
		int expectedHours=15;
		int actualHours=20;
		
		if(actualHours>expectedHours) {
			System.out.println("You will succeed");
		}else {
			System.out.println("please study more");
			
			double teaPrice=4.99;
			double allowedPrice=5.99;
		
					//if price is more that I can afford I will NOT buy 
					//if price is less or matches what I can afford then I will buy tea
					
					if(allowedPrice>=teaPrice) {
						System.out.println("I will buy tea");
					}else {
						System.out.println("I can not afford. I need to study more");
						System.out.println("I will go back to study more");
					
					}
		}
	}
}
		
		
	
