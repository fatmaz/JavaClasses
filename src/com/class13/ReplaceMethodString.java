package com.class13;

public class ReplaceMethodString {

	public static void main(String[] args) {
		/*.replace
		 * this method returns a new string reslting
		 * from replacing all occurences of oldChar
		 * int his string with newChar.
		 */
		
		String str="Hello fatma, how are you fatma?";
		
		System.out.println(str.replace('e', 'z'));
		System.out.println(str.replaceFirst("fatma", "alkan"));
	}

}
