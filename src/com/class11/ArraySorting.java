package com.class11;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		String[] actualNames= {"Jhon", "Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","Jhon","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
//
       
        int[] numbers = {78, 54, 5, 8, 1} ;
               Arrays.sort(numbers);
               for (int no:numbers) {
               System.out.print (no + " ");
        }
        
        
     
        	}

	}


