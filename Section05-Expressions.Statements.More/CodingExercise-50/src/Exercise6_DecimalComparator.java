public class Exercise6_DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces (double a, double b) {

		a = (int) (a * 1000);
		b = (int) (b * 1000);

		if (a == b) {

			return true;

		}
		else {

			return false;
		}
	}
}
