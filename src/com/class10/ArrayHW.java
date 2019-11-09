package com.class10;

public class ArrayHW {

	public static void main(String[] args) {
		//Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
		//Print only values that stored with even index including 0.
int number[]= {45,78,12,67,55,89,23,77,88};
for(int i=0; i<number.length; i+=2) {
	System.out.print(number[i]+" ");
}

	}

}
