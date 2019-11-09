package com.class12;

public class BooleanEmpty {

	public static void main(String[] args) {
		/*This method checks whether a String is empty or not.
		 * This method returns true if the given
		 * is empty, else it returns false
		 */
		String str="";
		System.out.println("Is this string empty="+str.isEmpty());
		String str2="Hello";
		System.out.println("Is this empty="+str2.isEmpty());
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}else {
			System.out.println("This is empty String");
		}
		
		String sentence="Each day has a promise to brighten up the day \n But you must allow the sun to come to your way";
		System.out.println(sentence);
	}

}
