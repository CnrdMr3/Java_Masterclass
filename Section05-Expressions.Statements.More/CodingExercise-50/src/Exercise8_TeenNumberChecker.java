public class Exercise8_TeenNumberChecker {
	public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
		if ((firstNumber > 12 && firstNumber < 20) || (secondNumber > 12 && secondNumber < 20) || (thirdNumber > 12 && thirdNumber < 20)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isTeen(int firstNumber) {
		if (firstNumber > 12 && firstNumber < 20) {
			return true;
		} else return false;
	}
}
