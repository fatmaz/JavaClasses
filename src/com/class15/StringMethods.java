package com.class15;

public class StringMethods {

	public static void main(String[] args) {
		//replace
		String str="Java classes at Syntax is awesome";
		str=str.replace("awesome", "great");
		str=str.replace("a", "@#$%&");
		System.out.println(str);
		
		str=str.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str);
//replaceAll-->specify regular expression
		//lets remove all special characters
		
		//split
		String myString="Java classes at Syntax are awesome";
		String[] array=myString.split("a");
		System.out.println(array.length);
	}

}
