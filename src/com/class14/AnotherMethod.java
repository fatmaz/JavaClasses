package com.class14;

import java.lang.reflect.Array;

public class AnotherMethod {

	public static void main(String[] args) {
		String str="Welcome to Syntax Technologies";
		//I want to split in 2 or 3
		
		String[] array2=str.split(" ",2);
		System.out.println(array2.length);
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
