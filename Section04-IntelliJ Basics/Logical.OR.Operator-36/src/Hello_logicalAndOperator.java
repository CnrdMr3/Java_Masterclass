public class Hello_logicalAndOperator {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not an alien!");
			System.out.println("It's an alien!");
		}

		int topScore = 95;
		if (topScore < 100) {
			System.out.println("You have got the top score!");
		}

		int secondTopScore = 60; // Changing 'secondTopScore to 81',the second statement would't print.
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Second top score is greater than Top score.");
		}

		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("ARGHHHHHHH");
		}

		// Challenge:
		int newValue = 50;
		if (newValue == 50) {
			System.out.println("This is true!");
		}


	}
}
