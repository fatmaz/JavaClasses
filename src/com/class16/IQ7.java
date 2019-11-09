package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		/*write a java program to check whetre a given number is prime or not
		 * take range of numbers from 2 to 100 and print them all prime
		 */
		boolean isPrime=true;
int num=5;
if(num!=0||num!=1) {
	isPrime=false;
}else {
for(int i=2; i<num; i++) {
	if(num%i==0) {
		isPrime=false;
		break;
	}
	}
}

if(isPrime) {
	System.out.println("it is a prime number");
}else {
	System.out.println("it is not a prime number");
}
	}

}
