package com.class12;

public class concat {

	public static void main(String[] args) {
		/*This method appends one STring to the end of another
		 * The method returns a a String with the value of the
		 * string passes in to the method appended to the end
		 * of the String used to invoke this method
		 */
		String str3="Hello ";
		String str4="World ";
		String str5="people";
		
		System.out.println(str3+str4+str5);
		System.out.println(str3.concat(str4).concat(str5));

	}

}
