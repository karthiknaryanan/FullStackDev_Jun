package com.training.Qn09;

/*Calculate whether given year as leap or not; 
Sample input: int year = 2020; 
Sample output: boolean isLeapYear = true;*/

public class LeapYearCheck {

	public static void main(String[] args) {
		int year = 2020;
		boolean flag = false;
		if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0)
			flag = true;
		System.out.println(flag);
	}

}
