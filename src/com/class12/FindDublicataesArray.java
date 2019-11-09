package com.class12;

import java.lang.reflect.Array;

public class FindDublicataesArray {

	public static void main(StringMan[] args) {
		 int [] array2= {44,55,67};
		 
		 for(int i=0; i<array2.length; i++) {
			 for(int j=i+1; j<array2.length;j++) {
				 System.out.println(array2[j]);
			 }
		 }
	                   
	}

}
