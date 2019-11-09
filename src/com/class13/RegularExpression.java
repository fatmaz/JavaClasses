package com.class13;

public class RegularExpression {

	public static void main(String[] args) {
		/*print only text not the numbers
		 * 
		 */
	String str="1423Hel4564";
	System.out.println(str.replaceAll("[^0-9]", ""));
System.out.println(str.replaceAll("[a-zA-Z]", ""));

//replace everything except test
String str2="&%$HI1234";
System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
