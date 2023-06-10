



public class PalindromeChecker {
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int originalNumber = number;

		// Reverse the number
		while (number != 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number /= 10;
		}

		// Compare the original number with the reverse
		return originalNumber == reverse;
	}
}