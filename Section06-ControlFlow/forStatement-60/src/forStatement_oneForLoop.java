public class forStatement_oneForLoop {
	public static void main(String[] args) {

		for (int counter = 1; counter <=5; counter++) {
			System.out.println(counter);
		}

		System.out.println("10_000 at 2% interest = " + calculateInterest(10_000, 2.0));
		System.out.println("10_000 at 3% interest = " + calculateInterest(10_000, 3.0));
		System.out.println("10_000 at 4% interest = " + calculateInterest(10_000, 4.0));
		System.out.println("10_000 at 5% interest = " + calculateInterest(10_000, 5.0));
	}

	public static double calculateInterest(double amount, double interestRate) {

		return (amount * (interestRate / 100));
	}
}