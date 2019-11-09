package com.class5;

public class logicalOr {
	public static void main(String[] args) {
		//7 days a week
		//if days is 2 or 4-->SDLC class
		//if day 6 and 7--> Java class
		//id day 1 or 5-->No class
		//id day=3--> review class
	int day=6;
	if(day==2|| day==4) {
		System.out.println("SDLC Class");
	}else if(day==6|| day==7) {
		System.out.println("Java class");
	}else if(day==1|| day==5) {
		System.out.println("No class");
	}else if(day==3) {
		System.out.println("Review class");
	}else {
		System.out.println("Not a valid day");
	}
	
	//7 days a week
	//if days is Tuesday or Thursday-->SDLC class
	//if day is Saturday and Sunday--> JAVA CLASS
	//If day is Monday or Friday-->no class
	//if day is wednesday-->review class
	String weekDay="Sunday";
			if(weekDay.equals("Tuesday")|| weekDay.equals("Thursday")) {
				System.out.println("SDLC class");
			}else if(weekDay.equals("Monday")||weekDay.equals("Friday")){
					
				}else {
					System.out.println("Not a valid day");
				}
			}
	}
	

