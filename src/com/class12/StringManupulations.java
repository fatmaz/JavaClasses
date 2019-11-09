package com.class12;

public class StringManupulations {

	public static void main(StringMan[] args) {
		StringMan name="John";
		StringMan name1=new StringMan("John1");
		//There are 2 ways to create string objects
		//String Literal and Creating String with new key word
		System.out.println(name);
	
		StringMan str="Heloo world";
		
		name.length();
		//they can perofrm more operations so system dont put semi colon otomatically.
		//why do you need length 
		
System.out.println(name.length());


/*This method return the length of this string
 * The length is equal the number
 * of 16 bit unicode characters in the string
 */
	int name1Len=name.length();
	System.out.println(name1Len);
	
	}

}
