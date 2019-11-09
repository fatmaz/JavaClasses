package com.class10;

public class HW3ARRAY {

	public static void main(String[] args) {
		//Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} and 
		//prints all values in one line.
		String sentence[]= {"This", "is", "array", "of", "strings"};
		for(int i=0; i<sentence.length; i++) {
		System.out.print(sentence[i]+" ");
		}
// another way
		
		String[] arr = {"This", "is", "array", "of", "strings"};

		for (int i = 0; i <=arr.length-1; i++) {

			System.out.print(arr[i] +" ");
		}
		
		
		
	}

}
