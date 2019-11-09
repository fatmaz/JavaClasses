package com.class9;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
        System.out.println("Please enter your start point: ");
        int sPoint = input.nextInt();
        System.out.println("Please enter your end point: ");
        int sumEven=0;
        int sumOdd=0;
        int ePoint = input.nextInt();
       for(int i=sPoint; i<=ePoint; i++) {
    	   if(i%2==0) {
    		   sumEven=sumEven+i;
    	   }else {
    		   sumOdd=sumOdd+i;
    	   }
       }
       System.out.println("Sum of the even numbers: "+sumEven );
       System.out.println("Sum of the even numbers: "+sumOdd );
	}

}
