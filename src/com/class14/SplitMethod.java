package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/*.split
		 * This method splits this string around matched of the given regular expression
		 */

		String str="Video provides a powerful way to help you prove our point";
		
		String[] array=str.split(" ");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
