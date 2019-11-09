package com.class8;

import java.util.Scanner;

public class moreBreak1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	for(int a=1; a<=10; a++) {
		
	System.out.println("Would you like to apply for credit card?");
	
	 String answer; 
	answer=scan.nextLine();
	  if(answer.equals("yes")) {
		  break;
	  
		  
	  }

	}

}
}
