package com.class6;

import java.util.Scanner;

public class Homework {
public static void main(String[] args) {
	/* write a program that will read three inputs of scores(quiz mid term and finla scores and determine the grade based on the following rules.
	 * if the average score.=90
	 * 
	 * 
	 * 
	 */
    Scanner scan;
int quiz, midterm, finalScore, average;
System.out.println("Please enter quiz score");
quiz=scan.nextInt();
System.out.println("Please enter mid term score");
midterm=scan.nextInt();

System.out.println("Please enter final score");
finalScore=scan.nextInt();
average=(quiz+midterm+finalScore)/3;
if(average>=90) {
	System.out.println("A");
}else if(average>=70&&average<90);
	System.out.println("B");
	
}else if(average>=50&&average<70) {
	
}
}


