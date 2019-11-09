package com.class8;

public class breakTask {

	public static void main(String[] args) {
		
		//I want to print nums from 1 to 20 except 5,6,7
		for(int a=1; a<=20; a++) {
			if(a==5||a==6||a==7) {
				break;
			}
			System.out.println(a);
		}
	}
	}
