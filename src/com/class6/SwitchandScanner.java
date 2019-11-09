package com.class6;

import java.util.Scanner;

public class SwitchandScanner {

	public static void main(String[] args) {
		/*ask user to enter their gender f and m
		 * based on the input provide
		 * if f--female
		 * if m--male
		 * otherwise--unknown
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please eneter your gender");
		char gender=scan.next().charAt(0);
		String userGender;
		switch(gender) {
		case 'F':
			userGender="Female";
			break;
		case 'M':
			userGender="Male";
			break;
			default:
userGender="unknown";
	}
		System.out.println("Your gender is "+ userGender);

}
}