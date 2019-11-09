package com.class10;

public class Nested69 {

	public static void main(String[] args) {
		//For you to do: 
			//a program to print out the pattern: 
			     //   1
			      // 22 
			     // 333 
			    // 4444 
			    //55555
              //Hint: For loop can have more than one loop nested in it. 
		
		for(int i=1; i<=5; i++) {
			for(int j=i+1; j<=i; j++) {
					System.out.print(j);
			}
		}System.out.println();
	}

}
