package com.class9;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[]args) {

	 Scanner scan=new Scanner(System.in);
     int user;
     do {
         System.out.println("Guess the secret number between 1 and 20");
         user=scan.nextInt();
         if(user>8) {
             System.out.println("The number you guessed is larger than the secret number");
         }else if(user<8) {
             System.out.println("The number you guessed is smaller than the secret number");
         }
         
     }while(user!=8);
         System.out.println("Congratulations!!. You got it!");
}}

