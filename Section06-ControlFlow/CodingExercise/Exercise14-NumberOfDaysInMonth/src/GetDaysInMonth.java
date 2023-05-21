public class GetDaysInMonth {
	public static void main(String[] args) {

		int days = getDaysInMonth(2, 2023);
		System.out.println(days); // Output: 28

		int daysLeapYear = getDaysInMonth(2, 2024);
		System.out.println(daysLeapYear); // Output: 29

		int invalidMonth = getDaysInMonth(13, 2023);
		System.out.println(invalidMonth); // Output: -1

		int invalidYear = getDaysInMonth(5, 10000);
		System.out.println(invalidYear); // Output: -1

	}

	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		}

		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static int getDaysInMonth(int month, int year) {
		if (month < 1 || month > 12) {
			return -1;
		}

		if (year < 1 || year > 9999) {
			return -1;
		}

		switch (month) {
			case 2:
				return isLeapYear(year) ? 29 : 28;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				return 31;
		}
	}
}
