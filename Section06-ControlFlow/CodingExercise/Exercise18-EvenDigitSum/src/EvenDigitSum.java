public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1; // Invalid value
		}

		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			if (digit % 2 == 0) {
				sum += digit;
			}
			number /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789)); // Output: 20
		System.out.println(getEvenDigitSum(252)); // Output: 4
		System.out.println(getEvenDigitSum(-22)); // Output: -1
	}
}