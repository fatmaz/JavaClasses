package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean value fo sale
		 * if no sale --> iam not shopping
		 * if sale --> check the price of the item
		 * based of the amount we will have to calculate the price after discount
		 * if price <20 apply 10%
		 * if price between20-100-->20%
		 * if between-100-500-->30%
		 * if anyhting else-->50%
		 * 
		 * after discount__ the price of the item reduce from__ to __
		 */
		Scanner input=new Scanner(System.in);
	System.out.println("Is there any sale goin on on Tuesday");
	boolean sale=input.nextBoolean();
	double price;
	double discount;
	double finalprice;
	if(!sale) {
		System.out.println("I am not shopping");
	}else {
		System.out.println("what s the actual price");
		price=input.nextDouble();
		if(price<20) {
			discount=price*0.10;
			
		}else if(price>=20&& price<100) {
			discount=price*0.20;
		}else if(price>=100&& price<500) {
			discount=price*0.30;
		}else {
			discount=price*0.50;
		}
		finalprice=price-discount;
		System.out.println("After the discount "+discount+" the price of the item is reduced from "+ price+" to"+ finalprice);
	}
} 
	
}
