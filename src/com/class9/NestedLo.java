package com.class9;

public class NestedLo {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i=1; i<=5; i++) {
			// infitive loop
			
			for(;;) {
				System.out.println("Hello");
			}
		}
	}

}
