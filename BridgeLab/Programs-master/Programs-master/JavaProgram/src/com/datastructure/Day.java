package com.datastructure;

public class Day {
	/*
	 * calculate the number of days in the month
	 * calculate year code , month code 
	 */
	static CalendarDisplay c = new CalendarDisplay();
	public static int t = 0;

	static void findday(int year, String month) {
		int y = year % 100;
		// System.out.println(y);
		int yc = 0;
		int aa = year % 400;
		// System.out.println(aa);
		int a = aa / 100;

		if (a == 1) {
			yc = 5;
		} else if (a == 2) {
			yc = 3;
		} else if (a == 3) {
			yc = 1;
		}
		// System.out.println(a);
		// System.out.println(yc);
		y = y - 1;
		// System.out.println(y);
		int yy = y / 4;
		y = y - yy;
		// System.out.println(y);
		// System.out.println(yy);
		yy = yy * 2;
		// System.out.println(yy);
		yc = ((yc + (yy + y) + 1)) % 7;

		// y=((((y/4)*2)+y))%7;
		// System.out.println(y);

		// System.out.println(yc);

		switch (yc) {
		case 0:
			System.out.println("jan" + year + "sunday");
			break;
		case 1:
			System.out.println("jan" + year + "monday");
			break;
		case 2:
			System.out.println("jan" + year + "tuesday");
			break;
		case 3:
			System.out.println("jan" + year + "wednesday");
			break;
		case 4:
			System.out.println("jan" + year + "thusday");
			break;
		case 5:
			System.out.println("jan" + year + "friday");
			break;
		case 6:
			System.out.println("jan" + year + "saturday");
			break;
		}
		int mc = 0;

		switch (month) {
		case "jan":
			mc = yc + 0;
			display(mc, year, 1);
			break;
		case "feb":
			mc = yc + 3;
			display(mc, year, 2);
			break;
		case "mar":
			mc = yc + 3;
			display(mc, year, 3);
			break;
		case "apr":
			mc = yc + 6;
			display(mc, year, 4);
			break;
		case "may":
			mc = yc + 1;
			display(mc, year, 5);
			break;
		case "jun":
			mc = yc + 4;
			display(mc, year, 6);
			break;
		case "jul":
			mc = yc + 6;
			display(mc, year, 7);
			break;
		case "aug":
			mc = yc + 2;
			display(mc, year, 8);
			break;
		case "sep":
			mc = yc + 0;
			display(mc, year, 9);
			break;
		case "oct":
			mc = yc + 5;
			display(mc, year, 10);
			break;
		case "nov":
			mc = yc + 3;
			display(mc, year, 11);
			break;
		case "dec":
			mc = yc + 5;
			display(mc, year, 12);
			break;
		}
	}

	static void display(int mc, int year, int m) {
		int sum = 0;
		int leap;
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			sum = 31;
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			sum = 30;
		}
		if (m == 2) {
			sum = 28;
		}
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			sum = sum + 1;
		}
		mc = mc % 7;
		t = mc;
		c.dis(t, sum);
		int date = 1;
		for (int i = sum; i > 0; i--) {

			switch (mc) {
			case 0:
				System.out.println("sunday" + date);
				break;
			case 1:
				System.out.println("monday" + date);
				break;
			case 2:
				System.out.println("tuesday" + date);
				break;
			case 3:
				System.out.println("wednesday" + date);
				break;
			case 4:
				System.out.println("thusday" + date);
				break;
			case 5:
				System.out.println("friday" + date);
				break;
			case 6:
				System.out.println("saturday" + date);
				break;
			}
			date++;
			mc++;
			mc = mc % 7;
			sum--;

		}

	}

}