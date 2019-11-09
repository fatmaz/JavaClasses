package com.class7;

public class Task1 {

	public static void main(String[] args) {
		/*create a boolean variable workDay and assign true
		 * create int variable day and assign it to 1
		 * As long as it is workDay print "I need a day off" and increase day
		 * Once day is 6 print "I do not need a day off any more
		 */
			boolean workDay=true;
			int day=1;
			while(workDay) {
				System.out.println("I need a day off");
				
				if (day==6) {
					System.out.println("I dont need a day off anymore");
					workDay=false;
					
				}day++;
			}
					
	}

}
