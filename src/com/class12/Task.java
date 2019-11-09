package com.class12;

public class Task {

	public static void main(String[] args) {
		String sentence="I love Java";
		String sen="I love Pragramming";
System.out.println(sentence.contains("love"));
System.out.println(sentence.toLowerCase());

System.out.println(sentence.toUpperCase().contains("JAVA"));

System.out.println(sen.equalsIgnoreCase(sentence));

///
String str2= "It is very hot in the class";
System.out.println("Is this string starts with " + str2.startsWith("It"));
//System.out.println("Is this string starts with " + str2.startsWith("is", 3));
System.out.println("_______________________");
//This method tests if this string ends with the specified suffix
System.out.println("Is this string starts with = " + str2.endsWith("class"));
	}
	
}
