package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
		//how to seperate commo delimited string.
		
		String str="If you come to class early, you can study more, also you can learn more and you can leave early.";
		String[] array=str.split(",");
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
