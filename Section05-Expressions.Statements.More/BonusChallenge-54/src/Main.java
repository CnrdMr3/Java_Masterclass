public class Main {
	public static void main(String[] args) {
		System.out.println(getDurationString(-3945)); // This is the first test case.
		System.out.println(getDurationString(-65, 45)); // This is the second test case.
		System.out.println(getDurationString(65, 145)); // This is the second test case.
		System.out.println(getDurationString(65, 45)); // This is the third test case.
		System.out.println(getDurationString(3945)); // This is the fourth test case.
	}

	public static String getDurationString(int seconds) {

		if (seconds < 0) {
			return "Invalid data for seconds dufus[LOL](" + seconds
					+ "),must be a positive integer value";
		} else {


			return getDurationString(seconds / 60, seconds % 60);
		}
	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes < 0) {
			return "Invalid data for minutes (" + minutes
					+ "),must be positive integer value";
		}

		if (seconds <= 0 || seconds >= 59) {
			return "Invalid data for seconds (" + seconds
					+ "),must be a value between 0 and 59.";
		}
		int hours = minutes / 60;

		int remainingMinutes = minutes % 60;

		return hours + "h" + remainingMinutes + "m" + seconds + "s";
	}
}