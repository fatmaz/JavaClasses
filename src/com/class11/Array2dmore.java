package com.class11;

public class Array2dmore {

	public static void main(String[] args) {
		String[][] names= {
				{"Khan", "Yusuf","Alex", "Zeynep"},
				{"Muhammed", "Ann","Neslihan","Weqas"},
				{"Diago","Asif", "Zubeyr", "Shofoga"},
		
		};
		
		int lengthOfRows=names.length;
		//System.out.println(lengthOfRows);
		
		int lengthOfCols=names[1].length;
		System.out.println(lengthOfCols);
		
		for(String getArrays[]:names) {
			for(String getName:getArrays) {
				System.out.print(getName+" ");
			}System.out.println();
			
		}
		

	}

}
