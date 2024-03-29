import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// Print the day of the week with both cases, and print the difference between the two case types.
		printDayOfWeek(0);
		printDayOfWeek(1);
		printDayOfWeek(2);
		printDayOfWeek(3);
		printDayOfWeek(4);
		printDayOfWeek(5);
		printDayOfWeek(6);
		printDayOfWeek(7);

		System.out.println();

		printWeekDay(0);
		printWeekDay(1);
		printWeekDay(2);
		printWeekDay(3);
		printWeekDay(4);
		printWeekDay(5);
		printWeekDay(6);
		printWeekDay(7);

	}

	public static void printDayOfWeek(int day) {


		String dayOfWeek = switch (day) {
			case 0 -> { yield "Sunday";}
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid Day mate, FOCUS!";
		};

		System.out.println(day + " stands for " + dayOfWeek);
	}

	public static void printWeekDay(int day) {

		String dayOfWeek = "Invalid Day, FOCUS... 7 isn't a valid option!";
		if (day == 0) {
			dayOfWeek = "Sunday";
		} else if (day == 1) {
			dayOfWeek = "Monday";
		} else if (day == 2) {
			dayOfWeek = "Tuesday";
		} else if (day == 3) {
			dayOfWeek = "Wednesday";
		} else if (day == 4) {
			dayOfWeek = "Thursday";
		} else if (day == 5) {
			dayOfWeek = "Friday";
		} else if (day == 6) {
			dayOfWeek = "Saturday";
		}

		System.out.println(day + " stands for " + dayOfWeek);
	}

	public static class Main {
		public static void inputThenPrintSumAndAverage() {
			Scanner scanner = new Scanner(System.in);

			int sum = 0;
			int count = 0;

			while (true) {
				boolean isInt = scanner.hasNextInt();

				if (isInt) {
					int number = scanner.nextInt();
					sum += number;
					count++;
				} else {
					break;
				}

				scanner.nextLine(); // Clear the newline character from the input
			}

			scanner.close();

			long average = 0;
			if (count > 0) {
				average = Math.round((double) sum / count);
			}

			System.out.println("SUM = " + sum + " AVG = " + average);
		}

		public static void main(String[] args) {
			inputThenPrintSumAndAverage();
		}
	}
}