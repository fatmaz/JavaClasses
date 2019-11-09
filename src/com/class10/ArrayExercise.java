package com.class10;

public class ArrayExercise {

	public static void main(String[] args) {
		String[] countries= {"Turkey", "USA", "Colombia"};
		for(int i=0; i<countries.length; i++) {
			switch(countries[i]) {
			case"Turkey":
				System.out.println("Ankara");
				break;
			case"Colombia":
				System.out.println(" Bogota");
				break;
			case "USA":
				System.out.println("Washington DC");
			}
		}
	}

}
