package com.class15;

import java.util.Scanner;

public class StringManTask {

	public static void main(String[] args) {
		/*
		 * lets ask user to enter browser based on the input we
		 * say"Your selected browser is -----"
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser=scan.next();
		
		String same="Your selected browser in";
		switch(browser.toUpperCase()) {
		case "firefox":
			System.out.println("Your selected browser in"+browser);
			break;
		case"safari":
			System.out.println(same+browser);
			break;
			default:
				System.out.println("Please enter valid browser");
		}

	}

}
