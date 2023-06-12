import java.util.Scanner;

public class Main {
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