package com.class6;

public class SwitchStatement {

	public static void main(String[] args) {
		int day = 6;
		String weekDay;
		if (day == 1) {
			weekDay = "Monday";

		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 7) {
			weekDay = "Sunday";
		}

		day = 3;
		switch (day) {
		case 1:
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";

		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
		default:
			weekDay = "invalid";
		}
		System.out.println(weekDay);
	}

}
