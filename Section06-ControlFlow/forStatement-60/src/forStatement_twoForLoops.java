public class forStatement_twoForLoops {
	public static void main(String[] args) {

		for (int counter = 1; counter <=5; counter++) {
			System.out.println(counter);
		}

		for (double rate = 2.0; rate <= 5.0; rate++) {
			double interestAmount = calculateInterest(10_000, rate);
			System.out.println("10_000 at " + rate + "% interest = " + interestAmount);
		}
	}

	public static double calculateInterest(double amount, double interestRate) {

		return (amount * (interestRate / 100));
	}
}
