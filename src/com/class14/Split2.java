package com.class14;

public class Split2 {

	public static void main(String[] args) {
		
		String str1= "Today is Sunday. It's sunny day. And we are having java class";
		        String [] arr2 = str1.split("\\.");//period is not considered regex
		        for (String string:arr2) {
		            System.out.println(string.trim());
		        }
		            System.out.println("The number of sentences in the"+
		            " given string is:" + arr2.length);
		        }
	}


