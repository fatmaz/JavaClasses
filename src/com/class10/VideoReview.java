package com.class10;

public class VideoReview {

	public static void main(String[] args) {
	 char[] grade= {'A','B','C', 'D','E', 'F'};
	 int a=2;
	 System.out.println(grade[a]);
//another way
	a+=2;
	System.out.println(grade[a]);
	a-=2;
	System.out.println(grade[a]);
	
	for(int i=0; i<grade.length; i++) {
	System.out.print(grade[i]+" ");
}}
}