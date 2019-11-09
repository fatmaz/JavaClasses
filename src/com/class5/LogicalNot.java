package com.class5;

public class LogicalNot {
public static void main(String[] args) {
	boolean b1=!true;
	boolean b2=!false;
	System.out.println(b2);
	
	
	boolean traffic=true;
	if(!traffic) {//using! we are revorting condition
		System.out.println("Hello");
		
	}else {
		System.out.println("Bye");
	}
	boolean isRain=false;
	if(!isRain) {
		System.out.println("Take an umbrella");
		
	}else {
		System.out.println("dont take an umbrella");
	}
	int num1=10;
	int num2=10;
	if(!(num1==num2)) {
		System.out.println("numbers are NOT equal");
	}else {
		System.out.println("numbers are equal");
	}
	//if name is not Marry or Anna then you are not my sister
	String name="Mary";
	String name1="Anna";
	
if (!(name.equals("Mary")||name.equals("Anna"))) {
	System.out.println("You are not my sister");
	
}else {
	System.out.println("You are my sister");
}
	
	
}
}
