package com.class11;

public class ForEach {

	public static void main(String[] args) {
		int[] arr= {2,3,5,7};
		for(int g=0; g<arr.length; g++) {
			System.out.println(arr[g]);
		}
//  
		
		int[] numberlist= {2,3,5,7};
		for(int ar:numberlist);
		
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		//Create an array on integers and calculate the sum of all elements in an array.
		//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		String []cars= {"honda","bmw", "volvo", "mercedes", "tesla", "ford"};
		for(String element:cars) {
			System.out.println(element);
		}//task2
		
		int [] nums = {1,4, 6, 9, 35,78,65};
        int sum = 0;
        
        for (int element : nums) {
            
            System.out.println(element);
            sum = sum+element;
        
        }
        System.out.println("The sum is " + sum);
        
        //task3
        
        String[] countries= {"Turkey", "USA","Germany"," India"};
        for(String element:countries) {
        	switch (element) {
        	case"Turkey":
        		System.out.println("Ankara");
        		break;
        	case"USA":
        		System.out.println("Washingon DC");
        		break;
        	case "Germany":
        		System.out.println("Frankfurt");
        	case "India":
        		System.out.println("New Delhi");
        		
        	
        	}
        	
        }
    }

		
		
		
	}


