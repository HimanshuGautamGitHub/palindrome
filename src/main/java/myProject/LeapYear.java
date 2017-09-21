package myProject;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		boolean isLeapYear;
		isLeapYear = year%4==0 && (year%100 != 0 || year%400 == 0) ;
		return isLeapYear;
	}
}
