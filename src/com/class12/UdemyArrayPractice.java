package com.class12;

public class UdemyArrayPractice {

	public static void main(String[] args) {
		//array is collection of data
		double[] numbers= {5.1,6.1,7.1,8.1};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//finding sum of the arrays
		double sum=0;
		for(int j=0; j<numbers.length; j++) {
			
			sum=sum+numbers[j];
			
		}System.out.println(sum);//ask about using inside and outside of the for
		
		
		//MAX IN ARRAY
		double temp=0;
		for(double value:numbers) {
			
			if(value>temp) {
			temp=value;
		}
			}System.out.println(temp);
			
			//multidimensional arrays
			double[][] numbers1= {
					{5.1,6.1,7.1,8.1},
					{2.1,2.2,2.3,2.4}
			};
			for(int i=0;i<numbers1.length; i++) {
				for(int j=0; j<numbers1[i].length;j++) {
					System.out.println(numbers1[i][j]);
				}
			}
			

	}}


//class Main  REPL QUESTION 88
//{
	//public static void main(String[] args)
	//{
		//int[][] array = {
			//{-5,-2,-3,7},
			//{1,-5,-2, 2},
			//{1,-2, 3,-4}
		//};
 // 	a,1 should print -9

	
 //int column = 1;
 //int sum = 0;
 
 
		//for (int row = 0; row < array.length; row++) {
			//sum += array[row][column];		
		//}
		
		
		//System.out.println( sum );


