public class TernaryOperator {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		boolean isAlien = false;
		if (!isAlien) {
			System.out.println("It is not an alien!");
			System.out.println("It's an alien!");
		}

		int topScore = 95;
		if (topScore < 100) {
			System.out.println("You have got the top score!");
		}

		int secondTopScore = 60; // Changing 'secondTopScore to 81',the second statement wouldn't print.
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
		// boolean,unlike a value,doesn't compare numbers but words. => " isCar = true " is the same as
		// " isCar == true ".
		boolean isCar = false;
		if (isCar) {
			System.out.println("This is not supposed to happen!");
			// " if (isCar) { etc.} " is shorthand for the above statement.
		/*
			boolean isCar1 = false;
			if (!isCar1) {
				System.out.println("This is shorthand!");
				// 	" (!isCar1) " means the same as " (isCar1 != true) "
		 */
		}

		String makeOfCar = "Volkswagen";
		boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
	}
}