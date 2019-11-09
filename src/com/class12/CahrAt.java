package com.class12;

public class CahrAt {

	public static void main(String[] args) {
	/*This method returns the character located at the Strings specified index
	 * The string indexes start from zero
	 */
String str7="We might be done early today";
//I dont know index number of the word. not the word looking for the letter

System.out.println(str7.charAt(3));

//this time I will provide the letter it will give me index number

String str8="We might not be done early";
System.out.println(str8.indexOf('e',1));
	}

}
