public class NumberOfDaysInMonth {
	public static void main(String[] args) {

		int year = 2023;
		boolean isLeap = isLeapYear(year);
		System.out.println(year + " is a leap year: " + isLeap);
	}

	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		} else {
			return (year % 4 == 0 && year != 100) || (year % 400 == 0);
		}
	}
}