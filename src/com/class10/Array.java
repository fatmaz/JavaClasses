package com.class10;

public class Array {

	public static void main(String[] args) {
		//create an array to store 5 double values, print all elements in 1 line.
		double[] number= {1.2 ,2.6 ,3.9 ,4.7 ,5.8};
        int size2=number.length;
        for(int i2=0; i2<size2; i2++) {
            System.out.print(number[i2]+"/ ");
        }
	}

}
