package com.class10;

public class random {

	public static void main(String[] args) {
		for (int a=0;a<4;a++) {
	        for(int b=0;b<4;b++) {
	        if (a==0 ||b==0||a==3||b==3) {
	            System.out.print("$");    
	            }else
	            {
	                System.out.print(" ");
	            }
	        }
	    System.out.println();
	}

	}}
