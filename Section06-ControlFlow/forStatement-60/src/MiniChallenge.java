public class MiniChallenge {
	public static void main(String[] args) {
		for (int counter = 1; counter <= 5; counter++) {
			System.out.println(counter);
		}

		for (double rate = 2.0; rate <= 5.0; rate++) {
			double interestAmount = calculateInterest(10_000, rate);
			System.out.println("10_000 at " + rate + "% interest = " + interestAmount);
		}

		for (double i = 7.5; i <= 10; i += 0.25) {
			double interestAmount = calculateInterest(100.00, i);
			System.out.println("$100.00 at " + i + "% interest = $" + interestAmount);
		}
	}

	public static double calculateInterest(double amount, double interestRate) {

		return (amount * (interestRate / 100));
	}
}
