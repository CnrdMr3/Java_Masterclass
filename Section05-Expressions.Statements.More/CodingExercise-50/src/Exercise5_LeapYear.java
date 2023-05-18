public class Exercise5_LeapYear {
	public static boolean isLeapYear(int year) {
		boolean leapYear = false;
		if (year <= 0 || year > 9999) {
			return leapYear;
		} else if (year % 4 == 0) {
			leapYear = true;
			if (year % 100 == 0 && year % 400 != 0) {
				leapYear = false;
			}
		}
		return leapYear;
	}
}
