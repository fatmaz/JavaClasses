package com.class4;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please print any number"); 
		/*nextnt();-> for numbers
		 * nextLine(); Strings
		 * nextDouble();-> double	 
		 */
		
		int number=scan.nextInt();
		System.out.println("Entered number is "+number);
		System.out.println("*************");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good afternoon " +name);
         
		
	}

}
