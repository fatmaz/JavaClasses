package com.class6;

import java.util.Scanner;

public class classTask {

	public static void main(String[] args) {
		/*ask user to enter the month they were born
		 * based on the month define the season
		 * if user is born in jan feb dec--> winter
		 * if mar apr may--> spring
		 * if jun july augut-->summer
		 * if sep oct nov--> fall
		 * otherwise -->unknown
		 * at the end of the program 
		 * "you were born in___"
		 */
		String month;
		Scanner input;
		String season;
		input=new Scanner(System.in);
		month=input.nextLine();
		System.out.println("Please enter your month of you were born");
		
		if(month.equals("jan")|| ("feb")||("dec")) {
			month="winter";
			
		}else if(month.contentEquals("march")|| ("may")||("april")) {
			
		}else if(month.contentEquals("september")||("October")||("november")) {
			
		}
			
		
		
		
	}

}
