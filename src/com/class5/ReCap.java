package com.class5;

import java.util.Scanner;

public class ReCap {

	public static void main(String[] args) {
		boolean isDisplayed=true;
		String buttonText="Sign  in";
		if(isDisplayed) {
			System.out.println("Button is displayed");
		
			if(buttonText.equals("Sign in")){
				System.out.println("Test case pass");
				
			}else {
				System.out.println("Wrong test is displayed");
			}
			}else {
				System.out.println("Button is not displayed");
			}
}
}