package com.class6;

public class ReCap {

	public static void main(String[] args) {
		/*declare the time(0-24)
		 * based on the time identify wether it is morning or afternoon, evening or night
		 * if 1-11-> morning
		 * if 12-3-> afternoon
		 * if 4-8--> evening
		 * if >20--> night
		 */
      
		int time=33
				;
		String timeOfDay=null;
		
		if (time>=1&& time<11) {
			timeOfDay="Morning";
		}else if(time>=12&&time<=15) {
			timeOfDay="Noon";
			
		}else if(time>=16&& time<=20) {
			timeOfDay="evening";
		}else {
			timeOfDay="Invalid";
		}
		System.out.println(timeOfDay);
	}

}
