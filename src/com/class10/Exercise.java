package com.class10;

public class Exercise {

	public static void main(String[] args) {
		String[]countries= {"USA", "Russia","Turkey","Afganistan", "Colombia"};
		for (int i=0; i<countries.length; i++){
			if(countries[i].equals("USA")) {
				System.out.println("Washington DC");
			}else if(countries[i].contentEquals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries[i].equals("Afganistan")) {
			 System.out.println("Kabul");
			}else if(countries[i].contentEquals("Colombia")) {
				System.out.println("Bogota");
			}
		}

	}

}
